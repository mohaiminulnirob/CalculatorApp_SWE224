package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorAction extends CalculatorOperations implements ActionListener {
    double number1,number2;
    int calculationType,equal=0;
    CalculatorAction() {
        for(int i=0;i<10;i++){
            digitButtons[i].addActionListener(this);
        }
        buttonOn.addActionListener(this);
        buttonOff.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonInverse.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonLog.addActionListener(this);
        Off();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(textField.getText().equals("Error"))
            textField.setText("");
        if(equal==1 && (source==buttonPlus || source==buttonMinus || source==buttonMul || source==buttonDiv) && !textField.getText().isBlank()){
            number2=Double.parseDouble(textField.getText());
            Binaryoperations(calculationType,number1,number2);
            equal=0;
            if(source==buttonPlus)
                calculationType=1;
            else if(source==buttonMinus)
                calculationType=2;
            else if(source==buttonDiv)
                calculationType=3;
            else calculationType=4;
        }
        if (source == buttonOn) {
            On();
        }
        else if (source == buttonOff) {
            Off();
        }
        else if (source == buttonEqual && !textField.getText().isBlank()) {
            number2=Double.parseDouble(textField.getText());
            Binaryoperations(calculationType,number1,number2);
            equal=0;
        }
        else if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        }
        else if (source == buttonDelete && !textField.getText().isBlank()) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder text= new StringBuilder(textField.getText());
                text.deleteCharAt(number);
                textField.setText(text.toString());

            }
            else if (textField.getText().endsWith(" ")) {
                label.setText("");
            }
        }

        else if (source == digitButtons[0]) {
            if (!textField.getText().equals("0")) {
                textField.setText(textField.getText() + "0");
            }
        }
        else if (source == buttonDot) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }

        }
        else if (source == buttonPlus && !textField.getText().isBlank()) {
            String str = textField.getText();
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculationType = 1;
            equal=1;
        }
        else if (source == buttonMinus) {
            if (!textField.getText().isBlank()) {
                String str = textField.getText();
                number1 = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "-");
                calculationType = 2;
                equal=1;
            }
            else textField.setText(textField.getText()+"-");
        }
        else if (source == buttonMul && !textField.getText().isBlank()) {
            String str = textField.getText();
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculationType = 3;
            equal=1;
        }
        else if (source == buttonDiv && !textField.getText().isBlank()) {
            String str = textField.getText();
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculationType = 4;
            equal=1;
        }
        else if((source==buttonInverse || source==buttonSqrt || source==buttonSquare || source==buttonLog) && !textField.getText().isBlank()){
            number1 = Double.parseDouble(textField.getText());
            if(source==buttonSqrt)
                calculationType=1;
            else if(source==buttonSquare)
                calculationType=2;
            else if(source==buttonInverse)
                calculationType=3;
            else calculationType=4;
            UnaryOperations(calculationType,number1);
        }
        else {
            for(int i=1;i<10;i++){
                if(source==digitButtons[i]){
                    textField.setText(textField.getText() + i);
                    break;
                }
            }
        }
    }
}
