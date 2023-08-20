package Que15;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JTextField textfield;
    private JButton[] numberButtons= new JButton[10];
    private JButton[] functionButtons= new JButton[8];
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton;
    private JPanel myPanel;
    private JPanel numPanel;
    private double num1=0, num2=0, result=0;
    private Font myFont= new Font("Courier",Font.BOLD,25);
    private char operator;
    public Calculator(){
        initComponents();
    }

    private void initComponents(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(420,550);
        this.setLocation(550, 200);
        this.setTitle("Calculator");
        this.setLayout(new BorderLayout());

        textfield =new JTextField("0");
        textfield.setBounds(50,25,300,50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        addButton= new JButton("+");
        addButton.addActionListener(ae->
        {
            num1=Double.parseDouble(textfield.getText());
            operator='+';
            textfield.setText("");
        });

        subButton= new JButton("-");
        subButton.addActionListener(ae->
        {
            num1=Double.parseDouble(textfield.getText());
            operator='-';
            textfield.setText("");
        });

        mulButton= new JButton("*");
        mulButton.addActionListener(ae->
        {
            num1=Double.parseDouble(textfield.getText());
            operator='*';
            textfield.setText("");
        });

        divButton= new JButton("/");
        divButton.addActionListener(ae->
        {
            num1=Double.parseDouble(textfield.getText());
            operator='/';
            textfield.setText("");
        });

        decButton= new JButton(".");
        decButton.addActionListener( ae->
        {

            textfield.setText(textfield.getText()+".");
        });

        equButton= new JButton("=");
        equButton.addActionListener(ae->
        {
            num2=Double.parseDouble(textfield.getText());
            switch (operator){
                case '+' -> result=num1+num2;
                case '-' -> result=num1-num2;
                case '*' -> result=num1*num2;
                case '/' -> result=num1/num2;
            }
            textfield.setText(String.valueOf(result));
            num1=result;
        });

        delButton= new JButton("Delete");
        delButton.addActionListener(ae->
        {
            String st=textfield.getText();
            textfield.setText("");
            for (int i = 0; i < st.length()-1; i++) {
                textfield.setText(textfield.getText()+st.charAt(i));
            }
        });

        clrButton= new JButton("Clear");
        clrButton.addActionListener(ae->
        {
            textfield.setText("");
        });

        functionButtons[0]= addButton;
        functionButtons[1]= subButton;
        functionButtons[2]= mulButton;
        functionButtons[3]= divButton;
        functionButtons[4]= decButton;
        functionButtons[5]= equButton;
        functionButtons[6]= delButton;
        functionButtons[7]= clrButton;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i]=new JButton(String.valueOf(i));
            int finalI = i;
            numberButtons[i].addActionListener(ae->
            {
                textfield.setText(textfield.getText()+String.valueOf(finalI));
            });
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }


        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(203,430,145,50);


        numPanel=new JPanel();
        numPanel.setBounds(50,100,300,300);
        numPanel.setLayout(new GridLayout(4,4,10,10));
        numPanel.add(numberButtons[1]);
        numPanel.add(numberButtons[2]);
        numPanel.add(numberButtons[3]);
        numPanel.add(addButton);
        numPanel.add(numberButtons[4]);
        numPanel.add(numberButtons[5]);
        numPanel.add(numberButtons[6]);
        numPanel.add(subButton);
        numPanel.add(numberButtons[7]);
        numPanel.add(numberButtons[8]);
        numPanel.add(numberButtons[9]);
        numPanel.add(mulButton);
        numPanel.add(decButton);
        numPanel.add(numberButtons[0]);
        numPanel.add(equButton);
        numPanel.add(divButton);


        myPanel=new JPanel(null);
        myPanel.setBackground(Color.white);

        myPanel.add(textfield);
        myPanel.add(numPanel);
        myPanel.add(delButton);
        myPanel.add(clrButton);

        this.add(myPanel);
        this.setVisible(true);
    }
}
