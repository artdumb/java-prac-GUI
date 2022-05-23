import javax.swing.*;
import java.awt.*;

class SnowManFrame extends JFrame{
    class SnowManPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.YELLOW);
            g.fillOval(20,30,200,200);
            g.setColor(Color.BLUE);
            g.drawArc(60,80,50,50,180,-180);
            g.drawArc(150,80,50,50,180,-180);
            g.drawArc(70,130,100,70,180,180);
        }
    }

    public SnowManFrame(){
        setSize(300,300);
        setTitle("눈사람 얼굴");

        add(new SnowManPanel());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new SnowManFrame();
    }
}
