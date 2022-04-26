/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motherboardkuis;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sistemakademik.db.DBHandler;
import sistemakademik.model.Mahasiswa;


public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Button btnSave;


    @FXML
    private Label label;

    @FXML
    private TextField tfJenis;

    @FXML
    private TextField tfHarga;
    
    @FXML
    private TextField tfPro;

    @FXML
    private TextField tfThn;
    
    @FXML
    private TextField tfBrand;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
//        label.setText("Hello "+tfNama.getText());
        System.out.println(tfJenis.getText());
        System.out.println(tfHarga.getText());
        System.out.println(tfPro.getText());
        System.out.println(tfThn.getText());
        System.out.println(tfBrand.getText());
       
//        Mahasiswa(String npm, String nama, String tanggalLahir, String gender, String prodi)
        Motherboard mtb = new Motherboard(tfJenis.getText(),tfHarga.getText(),tfPro.getText(),tfThn.getText(),tfBrand.getText())
        DBHandler dh = new DBHandler("MYSQL");
        dh.addMotherboard(mtb);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        ArrayList <String> list = new ArrayList<String>();
        list.add("Kuis");
        list.add("Motherboard");
        ObservableList items = FXCollections.observableArrayList(list);
        cbProdi.setItems(items);
    }    
    
}
