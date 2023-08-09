
package Que19;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TicTacToe extends JFrame{
//    buttons and matrix for marking and reference
    JButton buttons[][] = new JButton[3][3];
    int arr[][] = new int[3][3];
    
//    labels for current player and reset button
    JLabel label = new JLabel();
    JButton reset = new JButton("RESET");
    
    
    private int player;
    private String choice;
    
    public TicTacToe() {
//        font set for label and button
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 18));
        Font buttonFont = new Font("Arial", Font.BOLD, 20);
        
//        choosing a random player at first
        player = playerChoice();
            if(player==1){
                label.setText("X - turn");
            }
            else{
                label.setText("O - turn");
            }
      
//        adding components to frame    
        JFrame frame = new JFrame("TIC TAC TOE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(315, 400);
        
//        layered pane for matrix to make it into a grid and for fitting reset and label wihtout it
        JLayeredPane matrix = new JLayeredPane();
        
        matrix.setBounds(0, 0, 300, 400);
        matrix.setLayout(new GridLayout(4, 3)); 
        
        reset.addActionListener(e->reset());

//        tic tac toe components arranged and responsive
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            buttons[i][j] = new JButton();
            matrix.add(buttons[i][j]);
            final int row = i;
            final int col = j;
            arr[i][j]=0;
            buttons[i][j].setFont(buttonFont);
            buttons[i][j].addActionListener(e->click(row,col));
        }
       }

        label.setSize(290, 20);
        label.setLocation(125, 280);
        reset.setSize(100,30);
        reset.setLocation(100,310);
        
        frame.add(label);
        frame.add(reset);
        frame.add(matrix);
        frame.setVisible(true);
        
    }
    
    int playerChoice(){
        Random random = new Random();
        int choice = random.nextInt(2)+1;
        return choice;
    }
//  checking empty function     
    boolean isEmpty(int row,int col){
        if(buttons[row][col].getText()==""){
            return true;
        }
        else{
            return false;
        }
    }
//    checking win
    boolean checkwin(int player){
        for(int i=0;i<3;i++){
            if (arr[i][0] == player && arr[i][1] == player && arr[i][2] == player){
                label.setText(choice+" won");
                return true;
            }
            else if(arr[0][i] == player && arr[1][i] == player && arr[2][i] == player){
                label.setText(choice+" won");
                return true;
            }
        }
        if(arr[0][0] == player && arr[1][1] == player && arr[2][2] == player){
            label.setText(choice+" won");
            return true;
        }
        else if(arr[0][2] == player && arr[1][1] == player && arr[2][0] == player){
            label.setText(choice+" won");
            return true;
        }
        return false;
    }
    
void reset(){
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                arr[i][j] = 0;
            }
        }
        player = playerChoice();
        if (player == 1) {
            label.setText("X - turn");
        } else {
            label.setText("O - turn");
        }
} 
    
// tie checking
void checkTie(){
    int flag=0;
    for(int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            if(arr[i][j]!=0){
                flag++;
            }
        }
    }
    if(flag==9){
        label.setText("TIE");
    }
}

void click(int row, int col) {
    
        if (isEmpty(row, col) && !checkwin(player)) {
            if(player==1){
                choice = "X";
            }
            else{
                choice ="O";
            }
            buttons[row][col].setText(choice);
            arr[row][col] = player;
            if (!checkwin(player)) {
                if (player == 1) {
                    player = 2;
                    choice ="O";    
                } else {
                    player = 1;
                    choice = "X";
                }
                label.setText(choice+" - turn");
            }
        }
        checkTie();
    }
  public static void main(String[] args){
    new TicTacToe();
}
