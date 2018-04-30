/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author TOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label instructieslabel;
    @FXML
    private Button instructies;
    @FXML
    private Button start;

    
    //initialiseren
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       instructieslabel.setVisible(false);
       System.out.println("initialiseren"); 
       }  

    /**
     * instructies weergeven op het label
     */
    
    @FXML
    private void instructiesWeergeven(ActionEvent event) {
       instructieslabel.setVisible(true);
       instructieslabel.setText("instructies: pijltje omhoog voor omhoog te gaan pijltje naar links voor naar links te gaan pijltje naar onder voor naar onder te gaan ");
       System.out.println("instructies weergeven"); 
    }
    
    
    

        
}
