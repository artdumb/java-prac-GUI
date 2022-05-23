import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvent extends JFrame implements MouseListener, MouseMotionListener {

    public MouseEvent(){
        setTitle("MOUSE EVENT");
        setSize(300,200);

        JPanel panel = new JPanel();
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        display("Moise clicked"+e.getClickCount(),e);
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        display("Moise pressed"+e.getClickCount(),e);
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        display("Moise release"+e.getClickCount(),e);
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        display("Moise entered",e);
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        display("Moise exited",e);
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        display("Moise dragged",e);
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        display("Moise moved",e);
    }

    public void display(String s,java.awt.event.MouseEvent e){
        System.out.println(s+"X="+e.getX()+"Y="+e.getY());
    }

    public static void main(String[] args){
        new MouseEvent();
    }
}
