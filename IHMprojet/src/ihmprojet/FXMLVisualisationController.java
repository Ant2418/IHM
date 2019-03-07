/**
 * Aide pour le developpement du programme
 * https://o7planning.org/en/11079/javafx-tableview-tutorial#a3624400
 * https://github.com/JaretWright/GuiDemo
 */
package ihmprojet;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * Classe controleur du fichier FXML Visualisation
 * @author Antoine
 */
public class FXMLVisualisationController implements Initializable {
    // =========================================================================
    // ATTRIBUTS
    // =========================================================================
    @FXML    private Button retour_bouton;
    @FXML    private Button supp_bouton;

    @FXML    private TableView<ETUDIANT> tableViewEtu;
    @FXML    private TableColumn<ETUDIANT, String> colNom;
    @FXML    private TableColumn<ETUDIANT, String> colPrenom;
    @FXML    private TableColumn<ETUDIANT, Integer> colAnnee;
    @FXML    private TableColumn<ETUDIANT, String> colPromo;
    
    
    // =========================================================================
    // MODIFICATION
    // =========================================================================
    
    /**
     * Cette méthode permet à l'utilisateur de double-cliquer sur une cellule 
     * et de la mettre à jour le NOM de l'étudiant
     * @param edittedCell 
     */
    public void changeNomCellEvent(CellEditEvent editedCell){
        ETUDIANT etuSelected =  tableViewEtu.getSelectionModel().getSelectedItem();
        etuSelected.setNom(editedCell.getNewValue().toString());
    }
    
    /**
     * Cette méthode permet à l'utilisateur de double-cliquer sur une cellule 
     * et de la mettre à jour le PRENOM de l'étudiant
     * @param edittedCell 
     */
    public void changePrenomCellEvent(CellEditEvent editedCell){
        ETUDIANT etuSelected =  tableViewEtu.getSelectionModel().getSelectedItem();
        etuSelected.setPrenom(editedCell.getNewValue().toString());
    }
    
    /**
     * Cette méthode permet à l'utilisateur de double-cliquer sur une cellule 
     * et de la mettre à jour le PRENOM de l'étudiant
     * @param edittedCell 
     */
//    public void changeAnneeCellEvent(CellEditEvent editedCell){
//        ETUDIANT etuSelected =  tableViewEtu.getSelectionModel().getSelectedItem();
//        etuSelected.setAnnee(editedCell.getNewValue());
//    }
    
    // =========================================================================
    // ASPECT GRAPHIQUE
    // =========================================================================
    
    /**
     * Cette méthode permet d'activer le bouton 'supprimer' une fois 
     * qu'une ligne du tableau est sélectionnée.
     */
    public void userClickedOnTable(){
        this.supp_bouton.setDisable(false);
    }
    
    /**
     * Methode qui dirige la scene vers la page (scene) Menu.fxml
     * @param event
     * @throws IOException 
     */
    public void changeScreenButtonPushedMenu(ActionEvent event) throws IOException
    {
        Parent ajoutParent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene ajoutScene = new Scene(ajoutParent);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(ajoutScene);
        window.show();
    }
    
    
    
    @Override
    /**
     * Initialisation de la classe controlleur
     */
    public void initialize(URL url, ResourceBundle rb) {
        // Permet d'éditer les champs ?
        tableViewEtu.setEditable(true);
        
        //configuration des colonnes du tableau
        colNom.setCellValueFactory(new PropertyValueFactory<ETUDIANT, String>("Nom"));
        colPrenom.setCellValueFactory(new PropertyValueFactory<ETUDIANT, String>("Prenom"));
        colAnnee.setCellValueFactory(new PropertyValueFactory<ETUDIANT, Integer>("Annee"));
        colPromo.setCellValueFactory(new PropertyValueFactory<ETUDIANT, String>("Promo"));
        
        // Charger les donnees
        tableViewEtu.setItems(getEtudiantList()); 
        
        
        
        
        // Permet la selection de plusieurs lignes du tableView
        tableViewEtu.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        //Cache le bouton supp_bouton jusqu'à ce qu'une ligne soit sélectionnée.
        this.supp_bouton.setDisable(true);
        
    }
    
    /**
     * Supprime les étudiants selectionnes
     */
    public void supprimerEtudiant(){
        ObservableList<ETUDIANT> ligneSelected, allEtudiant;
        allEtudiant = tableViewEtu.getItems();
        
        // Quand une ou plusieurs ligne sont selectionnees
        ligneSelected = tableViewEtu.getSelectionModel().getSelectedItems();
        
        // suppression des objets etudiants pour chaque ligne selectionnee
        for (ETUDIANT etu : ligneSelected){
            allEtudiant.remove(etu);
            
        }
    }
    
    /**
     * Ajout de plusieurs etudiant dans une liste 
     * @return ObservableList<ETUDIANT>
     */
    public ObservableList<ETUDIANT> getEtudiantList(){
        ObservableList<ETUDIANT> etuList = FXCollections.observableArrayList();
            etuList.add(new ETUDIANT("MARK", "Juliette", 1994, PROMOTION.L3.getCode()));
            etuList.add(new ETUDIANT("DUPONT", "Catherine", 1996, PROMOTION.M1.getCode()));
            etuList.add(new ETUDIANT("SMITH", "Williams", 1995, PROMOTION.M2.getCode()));
            etuList.add(new ETUDIANT("BROWN", "Jones", 1995, PROMOTION.M2.getCode()));
            etuList.add(new ETUDIANT("DURANT", "Benoit", 1997, PROMOTION.L3.getCode()));            
        return etuList;
    }
    
}
