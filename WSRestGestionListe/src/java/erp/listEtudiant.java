/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @ Sam
 */
public class listEtudiant {
    private final List<Etudiant> liste = new ArrayList<>();
    
    public void ajoutEtudiantdansListe(Etudiant etudiant) {
        liste.add(etudiant);
    }
    
    public void modifEtudiant(Etudiant etudiant, String nom, String prenom) {
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
    }
    
    public Etudiant ConsultEtudiant(String nom) {
        for (Etudiant etudiant : liste) {
            if (etudiant.getNom().equals(nom)) {
                return etudiant;
            }
        }
        return null;
    }
    
    public List<Etudiant> ConsultListEtudiant() {
        return liste;
    }
    
    public void supprimEtudiant(Etudiant etudiant) {
        liste.remove(etudiant);
    }
}