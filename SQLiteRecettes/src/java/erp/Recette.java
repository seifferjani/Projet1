package erp;

import java.io.Serializable;

/**
 * @author Mohamed Selim Maazouz
 */
public class Recette implements Serializable {
 private String titre ;
 private String description ;
 
 
 public String getTitre() {
 return titre ;
 }
 
 public void setTitre(String titre ) {
 this.titre= titre ;
 }

 
 public String getDescription() {
 return description ;
 } 
 
 public void setDescription(String description ) {
 this.description= description ;
 }

 
 
 
 
 
 
 
 
}
