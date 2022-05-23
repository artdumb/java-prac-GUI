import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;

public class TicTacToe extends JFrame {

    public TicTacToe(){


        String turn = "X";
        setTitle("그것");
        setSize(400,150);
        JPanel panel = new JPanel();
        JButton[][] btn = new JButton[3][3];
        panel.setLayout(new GridLayout(3,3));

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<3;i++){
                    for (int j=0;j<3;j++){
                        if(e.getSource()==btn[i][j] && btn[i][j].getText().equals(" ")==true){
                            //todo :d
                        }
                    }
                }
            }
        };


        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                btn[i][j] = new JButton(" ");
                panel.add(btn[i][j]);
            }
        }

        add(panel);
        setVisible(true);
    }
    public static void main(String[] args){
        new TicTacToe();
    }

}
