package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorComponents extends CalculatorFrame{
    JLabel animatedLabel;
    String text = "Calculator, where math meets simplicity!";
    int textIndex = 0;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton[] digitButtons;
    JButton buttonOn = new JButton("ON");
    JButton buttonOff = new JButton("OFF");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("AC");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x^2");
    JButton buttonInverse = new JButton("1/x");
    JButton buttonSqrt = new JButton("sqrt");
    JButton buttonLog = new JButton("log");
    CalculatorComponents() {
        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
        }
        for(int i=0;i<10;i++){
            int x,y,w=60,h=40;
            if(i%3==0 && i!=0)
                x=150;
            else if(i%3==1)
                x=10;
            else x=80;
            if(i<=3 && i>0)
                y=354;
            else if(i<=6)
                y=298;
            else y=242;
            if(i==0){
                x=10;y=410;
            }
            digitButtons[i].setBounds(x,y,w,h);
            digitButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(digitButtons[i]);
        }
        animatedLabel = new JLabel();
        animatedLabel.setBounds(10, 5, 280, 30);
        animatedLabel.setForeground(Color.white);
        animatedLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        frame.add(animatedLabel);
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateText();
            }
        });
        timer.start();

        label.setBounds(170, 45, 110, 25);
        label.setForeground(Color.black);
        label.setBackground(Color.WHITE);
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        label.setOpaque(true);
        frame.add(label);

        textField.setBounds(10, 75, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 23));
        textField.setForeground(Color.black);
        textField.setBackground(Color.white);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.getContentPane().add(textField);
        frame.validate();
        frame.repaint();

        buttonOn.setBounds(220, 130, 60, 40);
        buttonOn.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonOn);

        buttonOff.setBounds(10, 130, 60, 40);
        buttonOff.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonOff);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonLog.setBounds(80, 410, 60, 40);
        buttonLog.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonLog);

        buttonEqual.setBounds(220, 410, 60, 40);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 186, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 186, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 13));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 242, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 298, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 25));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 354, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 186, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonSquare);

        buttonInverse.setBounds(150, 186, 60, 40);
        buttonInverse.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonInverse);

        buttonDelete.setBounds(150, 130, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonDelete);

        buttonClear.setBounds(80, 130, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonClear);
    }
    private void updateText() {
        textIndex++;
        if (textIndex > text.length()) {
            textIndex = text.length();
        }
        animatedLabel.setText(text.substring(0, textIndex));
    }
}

