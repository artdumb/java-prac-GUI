import javax.swing.*;
import java.awt.*;

public class DrawImageFrame extends JFrame{
    Image img;
    int pos_x = 100;
    int pos_y = 0;

    public DrawImageFrame(){
        ImageIcon icon = new ImageIcon("car2.png");
        img = icon.getImage();
        setSize(500,200);
        add(new DrawImagePanel(),BorderLayout.CENTER);
        JPanel panel = new JPanel();
        Button b1 = new Button("왼쪽으로 이동");
        Button b2 = new Button("오른쪽으로 이동");
        b1.addActionListener(e->{
            pos_x -=10;
            repaint();
        });
        b2.addActionListener(e->{
            pos_x +=10;
            repaint();
        });
        panel.add(b1);
        panel.add(b2);
        add(panel,BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class DrawImagePanel extends JPanel{

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,pos_x,pos_y,null);

        }
    }

    public static void main(String[] args){
        new DrawImageFrame();
    }
}
