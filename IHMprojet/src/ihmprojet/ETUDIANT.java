package ihmprojet;

/**
 * Classe Etudiant qui est caracterise par 
 *  - son nom
 *  - son prenom
 *  - son annee de naissance
 *  - sa promotion
 * 
 * @author Antoine
 */
public class ETUDIANT {
    public String nom;
    public String prenom;
    public int annee;
    public String promo;
    
     /**
     * Creation d'un etudiant
     * @param nom
     * @param prenom
     * @param annee 
     * @param laPromo 
     */
    public ETUDIANT(String nom, String prenom, int annee, String laPromo) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
        this.promo = laPromo;
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
    
    /**
     * Recupere la promotion de l'etudiant
     * @return promo
     */
    public String getPromo() {
        return promo;
    }
    
    /**
     * Modifie la promotion de l'etudiant
     * @param promo 
     */
    public void setPromo(String promo) {
        this.promo = promo;
    }

    
}
