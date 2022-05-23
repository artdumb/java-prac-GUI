import javax.swing.*;
import java.awt.*;

class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension d = getSize();
        int gWidth = d.width/7;
        int gHeight = d.height/7;

        int x = 5;
        int y = 5;
        int width = gWidth - 10;
        int height = gHeight - 10;

        g.drawLine(x,y+height-1,x+width,y);
        x += gWidth;

        g.setColor(Color.black);
        g.drawRect(x,y,width,height);

        x+=gWidth;

        g.setColor(Color.lightGray);
        g.draw3DRect(x,y,width,height,true);
        x+=gWidth;
        g.setColor(Color.black);

        g.drawRoundRect(x,y,width,height,20,20);
        x+=gWidth;

        g.drawRoundRect(x,y,width,height,20,20);
        x+=gWidth;

        g.drawArc(x,y,width,height,80,150);
        x+=gWidth;

        int xp[] = {x,x+30,x+80,x+90};
        int yp[] = {y,y+80,y+30,y+50};
        g.drawPolygon(xp,yp,xp.length);
    }
}


public class DrawFrame extends JFrame {
    public DrawFrame(){
        setSize(700,180);
        setTitle("Font Test");
        JPanel panel = new DrawPanel();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new DrawFrame();
    }

}
