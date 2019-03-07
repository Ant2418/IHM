package ihmprojet;

/**
 * Classe d'enumeration des promotions d'etudiants
 * @author Antoine
 */
public enum PROMOTION {
    L3("L3", "Licence 3"), M1("M1", "Master 1"), M2("M2", "Master 2");

    private String code;
    private String text;
 
    private PROMOTION(String code, String text) {
       this.code = code;
       this.text = text;
   }
 
    public String getCode() {
       return code;
    }
 
   public String getText() {
       return text;
    }
 
    public static PROMOTION getByCode(String promoCode) {
        for (PROMOTION p : PROMOTION.values()) {
            if (p.code.equals(promoCode)) {
               return p;
           }
        }
       return null;
    }
 
    @Override
    public String toString() {
        return this.text;
    }
    
}