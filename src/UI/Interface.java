package UI;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Interface implements Initializable {

    public TextField txtFName;
    public TextField txtLName;
    public ComboBox<String> cbFlightNum;
    public ComboBox<String> cbClass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbFlightNum.getItems().addAll("310", "320");
        cbClass.getItems().addAll("Economy", "Business", "First-Class");


    }

    public void reserveUnitedTicket(ActionEvent actionEvent) {
    }

    public void Display(ActionEvent actionEvent) {

    }

    public void seatType(MouseEvent mouseEvent) {
        
    }

    public void snackType(MouseEvent mouseEvent) {
    }

    public void freeTaxi(ActionEvent actionEvent) {
    }
}
