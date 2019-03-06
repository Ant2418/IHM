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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * Classe controleur du fichier FXML Visualisation
 * @author Antoine
 */
public class FXMLVisualisationController implements Initializable {
    @FXML    private Button retour_bouton;
    @FXML    private Button supp_bouton;

    @FXML    private TableView<?> table_etu_visu;
    @FXML    private TableColumn<?, ?> col_nom;
    @FXML    private TableColumn<?, ?> col_prénom;
    @FXML    private TableColumn<?, ?> col_an;
    @FXML    private TableColumn<?, ?> col_promo;
    
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
    public void initialize(URL url, ResourceBundle rb) {

    }
    
}
