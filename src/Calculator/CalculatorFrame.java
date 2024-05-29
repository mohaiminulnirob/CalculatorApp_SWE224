package Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame{
    JFrame frame;
    CalculatorFrame() {
        frame = new JFrame();
        frame.setTitle("Simple Calculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
