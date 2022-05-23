import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MoveCarMouse extends JFrame {
    int ing_x = 150;
    int ing_y = 150;
    JButton button;

    public MoveCarMouse(){
        setSize(600,300);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("car2.png");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(ing_x,ing_y);
        button.setSize(200,100);
        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ing_x = e.getX();
                ing_y = e.getY();
                button.setLocation(ing_x,ing_y);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public  static void main(String[] args){
        new MoveCarMouse();
    }
}
