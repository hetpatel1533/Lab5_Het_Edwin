package ca.durhamcollege.lab5_het_edwin;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController
{
    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private Label lb1;

    @FXML
    private Label lb2;

    public void calculate_BMI()
    {
        if(tf1.getText().trim().isEmpty() || tf2.getText().trim().isEmpty())
        {
            Alert al = new Alert(AlertType.NONE);
            al.setContentText("Please enter the values of height and weight to calculate BMI.");
            al.setAlertType(AlertType.ERROR);
            al.show();
        }
        else
        {
            float height = Float.parseFloat(tf1.getText());
            float weight = Float.parseFloat(tf2.getText());
            float BMI = weight / (height * height);
            lb1.setText("" + BMI);

            if(BMI < 18.5)
            {
                lb2.setText("UnderWeight");
            }
            else if(BMI >= 18.5 && BMI <= 24.9)
            {
                lb2.setText("Normal");
            }
            else if(BMI >= 25 && BMI <= 29.9)
            {
                lb2.setText("OverWeight");
            }
            else
            {
                lb2.setText("Obese");
            }
        }
    }
}