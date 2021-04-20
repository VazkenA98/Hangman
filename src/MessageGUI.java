

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageGUI extends JFrame implements ActionListener {
    private JLabel lab = new JLabel();
    private JButton button1 =  new JButton("Play Again");
    private JButton button2 =  new JButton("Exit");

    public MessageGUI(String s) {
        setLayout(new GridLayout(3,1));
        add(lab);
        lab.setText(s);
        add(button1);
        add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);

        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            MenuGUI menuGUI =  new MenuGUI();
            this.dispose();
        }
        if(e.getSource() == button2){
            System.exit(0);
        }
    }
}