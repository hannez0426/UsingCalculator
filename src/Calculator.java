import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton btnback;
    private JButton btnCancel;
    private JButton btnDivide;
    private JButton btnCE;
    private JButton btn7;
    private JButton btn9;
    private JButton btn4;
    private JButton btn6;
    private JButton btnMultiply;
    private JButton btnSubtract;
    private JButton btn8;
    private JButton btn5;
    private JButton btn3;
    private JButton btnDecimal;
    private JButton btnSum;
    private JButton btnEquals;
    private JButton btn2;
    private JButton btn1;
    private JButton btn0;

public Calculator() {
    btnEquals.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}

public void equal(){
    try{

        JButton btnEquals = new JButton();
    }
}

    public static void main(String[] args) {
       Calculator calc = new Calculator();
       calc.setVisible(true);
       calc.setSize(300, 400);



    }
    
}
