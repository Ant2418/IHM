/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp6_gde;

/**
 *
 * @author Antoine
 */
public class ETUDIANT {
    public String nom;
    public String prenom;
    public int annee;

     /**
     * Creation d'un etudiant
     * @param nom
     * @param prenom
     * @param annee 
     */
    public ETUDIANT(String nom, String prenom, int annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
    }
    
    /**
     * Recupere le nom de l'etudiant
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de l'etudiant
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Recupere le prenom de l'etudiant
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifie le prenom de l'etudiant
     * @param prenom 
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Recupere l'annee de naissance de l'etudiant
     * @return annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * modifie l'annee de naissance de l'etudiant
     * @param annee 
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
}
