package erp;


/**
 * REST Web Service
 *
 * @author Mohamed Selim Maazouz
 */
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/etudiants")
public class EtudiantService {
    private static listEtudiant liste = new listEtudiant();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Etudiant> getListeEtudiants() {
        return liste.ConsultListEtudiant();
    }

    @GET
    @Path("/{nom}")
    @Produces(MediaType.APPLICATION_JSON)
    public Etudiant getEtudiant(@PathParam("nom") String nom) {
        return liste.ConsultEtudiant(nom);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Etudiant ajoutEtudiant(Etudiant etudiant) {
        liste.ajoutEtudiantdansListe(etudiant);
        return etudiant;
    }

    @PUT
    @Path("/{nom}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Etudiant modifEtudiant(@PathParam("nom") String nom, Etudiant etudiant) {
        Etudiant e = liste.ConsultEtudiant(nom);
        if (e != null) {
            liste.modifEtudiant(e, etudiant.getNom(), etudiant.getPrenom());
        }
        return etudiant;
    }

    @DELETE
    @Path("/{nom}")
    @Produces(MediaType.APPLICATION_JSON)
    public void supprimEtudiant(@PathParam("nom") String nom) {
        Etudiant e = liste.ConsultEtudiant(nom);
        if (e != null) {
            liste.supprimEtudiant(e);
        }
    }
}
