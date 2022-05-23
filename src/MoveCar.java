import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveCar extends JFrame {

    int ing_x = 150;
    int ing_y = 150;
    JButton button;

    public MoveCar(){
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
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch (keycode){
                    case KeyEvent.VK_UP : ing_y -= 10;break;
                    case KeyEvent.VK_DOWN:  ing_y += 10;break;
                    case KeyEvent.VK_LEFT:  ing_x -= 10;break;
                    case KeyEvent.VK_RIGHT:  ing_x += 10;break;
                }
                button.setLocation(ing_x,ing_y);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public  static void main(String[] args){
        new MoveCar();
    }

}
