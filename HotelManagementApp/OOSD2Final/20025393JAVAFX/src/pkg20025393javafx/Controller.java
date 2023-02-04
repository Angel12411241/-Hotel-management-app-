/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20025393javafx;

/**
 *
 * @author angel
 */
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable {
    @FXML
    private AnchorPane myAnchor;

    @FXML
    private TableView<hall> myTable;

    @FXML
    private TableColumn<hall, String> leaseNum;

    @FXML
    private TableColumn<hall, String> hallName;

    @FXML
    private TableColumn<hall, String> hallNum;

    @FXML
    private TableColumn<hall, String> roomNum;

    @FXML
    private TableColumn<hall, String> cusName;

    @FXML
    private TableColumn<hall, String> rentRate;

    @FXML
    private Button addButton;

    @FXML
    private TextField textNum1;

    @FXML
    private TextField textHallNum1;

    @FXML
    private TextField textHallName1;

    @FXML
    private TextField textRoomNum1;

    @FXML
    private TextField textRentRate1;

    @FXML
    private TextField textCusName1;

    @FXML
    private TableView<hall> tableView1;

    @FXML
    private TableColumn<hall, String> occupancyStat;

    @FXML
    private TextField textOccup1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        leaseNum.setCellValueFactory(new PropertyValueFactory<>("leasNum"));
        hallName.setCellValueFactory(new PropertyValueFactory<>("hallName"));
        hallNum.setCellValueFactory(new PropertyValueFactory<>("hallNum"));
        roomNum.setCellValueFactory(new PropertyValueFactory<>("roomNum"));
        rentRate.setCellValueFactory(new PropertyValueFactory<>("rentRate"));
        cusName.setCellValueFactory(new PropertyValueFactory<>("cusName"));
        occupancyStat.setCellValueFactory(new PropertyValueFactory<>("occupStatus"));
        myTable.setItems(data);
        myTable.setEditable(true);
        leaseNum.setCellFactory(TextFieldTableCell.forTableColumn());
        hallName.setCellFactory(TextFieldTableCell.forTableColumn());
        hallNum.setCellFactory(TextFieldTableCell.forTableColumn());
        roomNum.setCellFactory(TextFieldTableCell.forTableColumn());
        cusName.setCellFactory(TextFieldTableCell.forTableColumn());
        rentRate.setCellFactory(TextFieldTableCell.forTableColumn());
        occupancyStat.setCellFactory(TextFieldTableCell.forTableColumn());
        
        

    }
        private ObservableList<hall> data = FXCollections.observableArrayList(
                
        new hall("12033", "1", "UWE1", "001", "200", "Jonny Bones", "Occupied"),
        new hall("12034", "1", "UWE1", "002", "350", "Connor Mcgregor", "Occupied"),
        new hall("12035", "1", "UWE1", "003", "340", "Daniel Cormier", "Occupied"),
        new hall("12036", "1", "UWE1", "004", "320", "Israel Adesanya", "Occupied"),
        new hall("NoINFO", "2", "UWE2", "005", "320", "NoINFO", "UnOccupied"),
        new hall("NoINFO", "2", "UWE2", "006", "320", "NoINFO", "UnOccupied")
   
    );
    public void onEditChange(TableColumn.CellEditEvent<hall, String> hallStringCellEditEvent) {
        hall hall= myTable.getSelectionModel().getSelectedItem();
        hall.setHallName(hallStringCellEditEvent.getNewValue());

    }   
    
    public void add(ActionEvent event) {
        data.add(new hall(textNum1.getText(), textHallNum1.getText(), textHallName1.getText(), textRoomNum1.getText(), textRentRate1.getText(), textCusName1.getText(), textOccup1.getText()));
       
    }

    public void buttonDelete(ActionEvent event) {
        ObservableList<hall> allHalls, SingleHall;
        allHalls=myTable.getItems();
        SingleHall=myTable.getSelectionModel().getSelectedItems();
        SingleHall.forEach(allHalls::remove);
    }
}