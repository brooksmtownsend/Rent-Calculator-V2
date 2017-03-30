package sample;

import javafx.fxml.*;
import javafx.scene.control.TextField;

public class Controller {
    private double _rentCostNum, _waterCostNum;
    @FXML
    private TextField _rentCost;
    @FXML
    private TextField _waterCost;
    @FXML
    private TextField _bradCost;
    @FXML
    private TextField _griffinCost;
    @FXML
    private TextField _mattCost;
    @FXML
    private TextField _brooksCost;

    @FXML
    public void calculate(){
        if(_rentCost.getText() == "" || _waterCost.getText() == ""){
            return;//Catching dumb error
        }
        _waterCostNum = Double.parseDouble(_waterCost.getText());
        System.out.println(_waterCostNum);
        _rentCostNum = Double.parseDouble(_rentCost.getText());

        double waterDivided = _waterCostNum / 4;
        double brooks = _rentCostNum * 0.20 + waterDivided;
        double brad = _rentCostNum * 0.28 + waterDivided;
        double griffin = _rentCostNum * 0.26 + waterDivided;
        double matt = _rentCostNum * 0.26 + waterDivided;

        _brooksCost.setText((""+brooks).substring(0, 6));
        _mattCost.setText((""+matt).substring(0, 6));
        _griffinCost.setText((""+griffin).substring(0, 6));
        _bradCost.setText((""+brad).substring(0, 6));
    }
}
