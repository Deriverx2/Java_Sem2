package Que19;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame {

    private final Random rand = new Random();
    private final JPanel title_panel =new JPanel();
    private final JPanel button_panel =new JPanel();
    private final JLabel text_field =new JLabel();
    private final JButton[] buttons= new JButton[9];
    private boolean player1_turn;
    public TicTacToe(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setLocation(355, 0);
        this.getContentPane().setBackground(new Color(50,50,50));
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setTitle("TicTacToe");

        text_field.setBackground((new Color(25,25,25)));
        text_field.setForeground((new Color(25,255,0)));
        text_field.setFont(new Font("Ink Free",Font.BOLD,75));
        text_field.setHorizontalAlignment(JLabel.CENTER);
        text_field.setText("Tic-Tac-Toe");
        text_field.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,800);
//
        button_panel.setLayout(new GridLayout(3,3,5,5));
        button_panel.setBackground(new Color(0,150,150));
//
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Ink Free", Font.BOLD, 100));
            buttons[i].setFocusable(false);
            buttons[i].setBackground(new Color(0, 0, 0));
            int finalI = i;
            buttons[i].addActionListener(ae -> {
                if (player1_turn) {
                    if (buttons[finalI].getText() == "") {
                        buttons[finalI].setText("X");
                        buttons[finalI].setForeground(new Color(255, 0, 0));
                        player1_turn = false;
                        text_field.setText("O turn");
                        check();
                    }
                } else if (buttons[finalI].getText() == "") {
                    buttons[finalI].setText("O");
                    buttons[finalI].setForeground(new Color(0, 0, 255));
                    player1_turn = true;
                    text_field.setText("X turn");
                    check();
                }
            });
        }
//
//
        title_panel.add(text_field);
        this.add(title_panel,BorderLayout.NORTH);
        this.add(button_panel);

        firstTurn();
    }

    public void firstTurn()  {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (rand.nextInt(2)==0) {
            player1_turn=true;
            text_field.setText("X turn");
        } else {
            player1_turn=false;
            text_field.setText("O turn");
        }

    }



    public void check(){
        //check if X wins
        if ((buttons[0].getText()=="X") &&
            (buttons[1].getText()=="X") &&
            (buttons[2].getText()=="X")){
            xWins(0,1,2);
        }
        if ((buttons[3].getText()=="X") &&
            (buttons[4].getText()=="X") &&
            (buttons[5].getText()=="X")){
            xWins(3,4,5);
        }
        if ((buttons[6].getText()=="X") &&
            (buttons[7].getText()=="X") &&
            (buttons[8].getText()=="X")){
            xWins(6,7,8);
        }
        if ((buttons[1].getText()=="X") &&
                (buttons[4].getText()=="X") &&
                (buttons[7].getText()=="X")){
            xWins(1,4,7);
        }
        if ((buttons[2].getText()=="X") &&
            (buttons[5].getText()=="X") &&
            (buttons[8].getText()=="X")){
            xWins(2,5,8);
        }
        if ((buttons[0].getText()=="X") &&
            (buttons[4].getText()=="X") &&
            (buttons[8].getText()=="X")){
            xWins(0,4,8);
        }
        if ((buttons[2].getText()=="X") &&
            (buttons[4].getText()=="X") &&
            (buttons[6].getText()=="X")){
            xWins(2,4,6);
        }


        //check if O wins
        if ((buttons[0].getText()=="O") &&
            (buttons[1].getText()=="O") &&
            (buttons[2].getText()=="O")) {
            oWins(0, 1, 2);
        }
        if ((buttons[3].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[5].getText()=="O")){
            oWins(3,4,5);
        }
        if ((buttons[6].getText()=="O") &&
                (buttons[7].getText()=="O") &&
                (buttons[8].getText()=="O")){
            oWins(6,7,8);
        }
        if ((buttons[1].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[7].getText()=="O")){
            oWins(1,4,7);
        }
        if ((buttons[2].getText()=="O") &&
                (buttons[5].getText()=="O") &&
                (buttons[8].getText()=="O")){
            oWins(2,5,8);
        }
        if ((buttons[0].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[8].getText()=="O")){
            oWins(0,4,8);
        }
        if ((buttons[2].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[6].getText()=="O")){
            oWins(2,4,6);
        }
    }

    public void xWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        text_field.setText("X WINS");
    }

    public void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        text_field.setText("O WINS");

    }


}
