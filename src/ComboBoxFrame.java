import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxFrame extends JFrame implements ActionListener {
    JLabel label;
    public ComboBoxFrame() {
        setTitle("콤보박스");
        setSize(400,200);

        String[] items = {"그림1","그림2","차"};
        JComboBox itemlist = new JComboBox(items);
        itemlist.setSelectedIndex(0);
        itemlist.addActionListener(this);

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        changePicture(items[itemlist.getSelectedIndex()]);
        add(itemlist, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String name = (String) cb.getSelectedItem();
        changePicture(name);
    }

    protected void changePicture(String name){
        ImageIcon icon = new ImageIcon(name+".png");
        label.setIcon(icon);
        if (icon != null){
            label.setText(null);
        }else{
            label.setText("이미지가 발견되지 않습니다.");
        }
    }
    public static void main(String[] args){
        new ComboBoxFrame();
    }
}
