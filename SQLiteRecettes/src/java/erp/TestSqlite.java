package erp;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


/**
 * @author Mohamed Selim Maazouz
 */
@WebService(serviceName= "TestSqlite")
public class TestSqlite {

static {
    try {
        Class.forName("org.sqlite.JDBC");
    }
    catch (ClassNotFoundException e)
    {
}
   
}

    /**
     * Web service operation
     * @param ingredient
     * @return 
     */
    @WebMethod(operationName = "rechercheParIngredient")
    public List<Recette> rechercheParIngredient(@WebParam(name= "ingredient") String ingredient) {
        URL ch = getClass().getResource("/recette");
        String chemin = ch.getPath();
        try {
            Connection cnx =DriverManager.getConnection("jdbc:sqlite:" + chemin);
            Statement st = cnx.createStatement();
            
            ResultSet rs = st.executeQuery("Select titre, description from recettes"
            +"inner join RecetteIngredient on RecetteIngredient.idRecette=Recette.idRecette "
            +"inner join Ingredient on ingredient.idIngredient=recetteIngredient.idIngredient "
            +"where nom like '%" + ingredient + "'"
            );
            
        List<Recette> resultat = new ArrayList<>();
        while (rs.next()) {
        String titre = rs.getString("Titre");
        String description = rs.getString("Description");
        Recette r = new Recette();
        r.setDescription(description);
        r.setTitre(titre);
        resultat.add(r);
        }
        return resultat ;
        } catch (SQLException e) {
            return null ;
        }
    }
}