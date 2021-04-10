import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameGUI extends JFrame implements ActionListener {

    private JTextField txt1 = new JTextField(10);
    private JTextField txt2 = new JTextField(2);
    private JButton word = new JButton("new word");
    private JButton check = new JButton("check");

    private JPanel jPanelM1 =  new JPanel();
    private JPanel jPanelM2 =  new JPanel();

    private JLabel imgLabel = new JLabel(new ImageIcon("images/88.png"));


    public GameGUI() {
        setLayout(new GridLayout(1,2));
        jPanelM1.setLayout(new GridLayout(4,1));
        jPanelM2.setLayout(new FlowLayout());

        jPanelM1.add(txt1);
        jPanelM1.add(txt2);
        jPanelM1.add(word);
        jPanelM1.add(check);

        jPanelM2.add(imgLabel);

        add(jPanelM1);
        add(jPanelM2);

        word.addActionListener(this);
        check.addActionListener(this);
        setSize(600, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
