package ihmprojet;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Classe controleur du fichier FXML MENU
 * @author Antoine
 */
public class FXMLMenuController implements Initializable {
    
    @FXML    private Button page_ajout_bouton;
    @FXML    private Button page_visu_bouton;
    
    /**
     * Methode qui dirige la scene vers la page (scene) Ajout.fxml
     * @param event
     * @throws IOException 
     */
    public void changeScreenButtonPushedAjout(ActionEvent event) throws IOException
    {
        Parent ajoutParent = FXMLLoader.load(getClass().getResource("Ajout.fxml"));
        Scene ajoutScene = new Scene(ajoutParent);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(ajoutScene);
        window.show();
    }

    /**
     * Methode qui dirige la scene vers la page (scene) visualisation.fxml
     * @param event
     * @throws IOException 
     */
    public void changeScreenButtonPushedVisu(ActionEvent event) throws IOException
    {
        Parent ajoutParent = FXMLLoader.load(getClass().getResource("Visualisation.fxml"));
        Scene ajoutScene = new Scene(ajoutParent);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(ajoutScene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
