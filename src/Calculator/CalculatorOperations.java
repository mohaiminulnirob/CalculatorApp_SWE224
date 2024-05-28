package Calculator;

public  class CalculatorOperations extends CalculatorComponents {
    double ans;
    public void UnaryOperations(int type,double x) {
        try {
            if (type == 1) {
                if (x < 0)
                    throw new ArithmeticException();
                else ans = Math.sqrt(x);
            } else if (type == 2) {
                ans = x * x;
            } else if (type == 3) {
                if (x == 0)
                    throw new ArithmeticException();
                else ans = 1 / x;
            } else {
                if (x <= 0)
                    throw new ArithmeticException();
                else ans = Math.log10(x);
            }
            if (Double.toString(ans).endsWith(".0")) {
                textField.setText(Double.toString(ans).replace(".0", ""));
            }
            else {
                textField.setText(Double.toString(ans));
            }
            label.setText("");

        }
        catch(ArithmeticException e){
            textField.setText("Error");
            label.setText("");
        }

    }
    public void Binaryoperations(int type,double x,double y){
        try {
            if (type == 1)
                ans = x + y;
            else if (type == 2)
                ans = x - y;
            else if (type == 3)
                ans = x * y;
            else {
                if(y==0)
                    throw new ArithmeticException();
                ans = x / y;
            }
            if (Double.toString(ans).endsWith(".0")) {
                textField.setText(Double.toString(ans).replace(".0", ""));
            }
            else {
                textField.setText(Double.toString(ans));
            }
            label.setText("");
        }
        catch(ArithmeticException e){
            textField.setText("Error");
            label.setText("");
        }

    }

    public void On() {
        for(int i=0;i<10;i++) {
            digitButtons[i].setEnabled(true);
        }
        buttonOn.setEnabled(false);
        buttonOff.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonInverse.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonLog.setEnabled(true);
    }

    public void Off() {
        for(int i=0;i<10;i++) {
            digitButtons[i].setEnabled(false);
        }
        buttonOn.setEnabled(false);
        buttonOn.setEnabled(true);
        buttonOff.setEnabled(false);
        textField.setText("");
        label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonInverse.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonLog.setEnabled(false);
    }
}

