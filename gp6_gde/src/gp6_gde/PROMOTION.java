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
public class PROMOTION {

    /**
     * Groupe de promotion d'étudiant
     */
    public enum groupe {
        L3,
        M1,
        M2
    }
    public String nomGroupe;
    
    /**
     * Constructeur de la promotion
     * @param nomGroupe 
     */
     public PROMOTION(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }
    
}
