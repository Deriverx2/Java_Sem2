
//Create a swing program to implement a simple calculator (without drag and drop).
package Que15;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Calculator extends JFrame{
    
    private JTextField num1,num2,result;
    private JLabel num1Label,num2Label,resultLabel;
    private JButton add,subtract,divide,multiply,clear;
    
    
    
    public Calculator(){
        this.setTitle("Calculator ");
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500,300);
              
        this.setLayout(null);
        
//        TExt field and labels
        this.num1 = new JTextField();
        this.num1Label = new JLabel("Enter number 1 ");
        num1Label.setBounds(50,-30,100,100);
        num1.setBounds(50,30,200,30);
        this.add(num1);
        this.add(num1Label);
        
        this.num2 = new JTextField();
        this.num2Label = new JLabel("Enter number 2 ");
        num2Label.setBounds(50,30,100,100);
        num2.setBounds(50,90,200,30);
        this.add(num2);
        this.add(num2Label);
        
        this.result = new JTextField();
        this.resultLabel = new JLabel("Result");
        result.setBounds(50,150,200,30);
        resultLabel.setBounds(50,90,100,100);
        this.add(resultLabel);
        this.add(result);
        
        
//        Buttons
        this.add = new JButton("+");
        add.setBounds(70,200,70,50);
        this.add(add);
        
        
        this.subtract = new JButton("-");
        subtract.setBounds(150,200,70,50);
        this.add(subtract);
        
        
        this.multiply = new JButton("x");
        multiply.setBounds(70,260,70,50);
        this.add(multiply);
        
        
        this.divide = new JButton("/");
        divide.setBounds(150,260,70,50);
        this.add(divide);
        
        this.clear = new JButton("CLEAR");
        clear.setBounds(50,330,200,60);
        this.add(clear);
        
        
//        Event listeners
        add.addActionListener(e->operate('+'));
        subtract.addActionListener(e->operate('-'));
        divide.addActionListener(e->operate('/'));
        multiply.addActionListener(e->operate('x'));
        
        clear.addActionListener(e->clear());
        this.setVisible(true);
    }
    
    void operate(char operator){
        double answer,number1,number2;
        if("".equals(num1.getText()) || "".equals(num2.getText())){
            JOptionPane.showMessageDialog(rootPane, "Enter Both Numbers ");
            return;
        }
        number1 = Double.parseDouble(num1.getText());
        number2 = Double.parseDouble(num2.getText());
            switch(operator){
                case '+' -> {
                    answer = number1+number2;
                    result.setText(Double.toString(answer));
            }
                case '-' -> {
                    answer = number1-number2;
                    result.setText(Double.toString(answer));
            }
                case 'x' -> {
                    answer = number1*number2;
                    result.setText(Double.toString(answer));
            }
                case '/' -> {
                    if(number2==0){
                        JOptionPane.showMessageDialog(rootPane, "Can't divide by zero ");
                        return;
                    }
                    answer = number1/number2;
                    result.setText(Double.toString(answer));
            }
            }
        }
    
    void clear(){
        num1.setText("");
        num2.setText("");
        result.setText("");
    }

  public static void main(String[] args){ new Calculator(); }
}
