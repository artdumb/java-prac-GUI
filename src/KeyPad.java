import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPad extends JFrame implements ActionListener {
    private JTextField txt;
    private JPanel panel;

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        txt.setText(txt.getText()+actionCommand);
    }

    public KeyPad(){
        txt = new JTextField(20);
        add(txt, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        add(panel,BorderLayout.CENTER);
        for(int i = 1;i<=9;i++){
            JButton btn = new JButton(""+i);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension(100,30));
            panel.add(btn);
        }
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new KeyPad();
    }
}
