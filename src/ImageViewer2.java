import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageViewer2 extends JFrame implements ActionListener {
    private JLabel label;
    private JMenuItem open, exit;

    public ImageViewer2(){
        setTitle("이미지뷰어");
        setSize(350,200);

        JMenuBar mbar = new JMenuBar();
        JMenu m = new JMenu("FILE");
        open = new JMenuItem("OPEN");
        open.addActionListener(this);
        m.add(open);
        exit = new JMenuItem("EXIT");
        exit.addActionListener(this);
        m.add(exit);
        mbar.add(m);
        setJMenuBar(mbar);

        label = new JLabel();
        JPanel panel = new JPanel();
        panel.add(label,"Center");
        add(panel);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == open){
            JFileChooser chooser = new JFileChooser();
            int r = chooser.showOpenDialog(this);
            if (r == JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getAbsolutePath();
                label.setIcon(new ImageIcon(name));
            }

        }else if (source == exit){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new ImageViewer();
    }
}
