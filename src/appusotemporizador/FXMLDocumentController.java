/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusotemporizador;

import componente_madridDaniel.Temporizador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Daniel Madrid
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Temporizador temporizador1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        temporizador1.setTiempoRestante(15);
        temporizador1.iniciarTemporizador();
    }    
    
}
