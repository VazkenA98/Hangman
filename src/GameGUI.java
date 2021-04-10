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
      /*  if (e.getSource() == word) {
            s = names[(int)(Math.random()*names.length)];
            letters = new char[s.length()];
            Arrays.fill(letters, '*');
            txt1.setText(String.valueOf(letters));
        }
        if (e.getSource() == check) {
            try {
                String ans = txt2.getText();
                if (s.contains(ans)) {
                    char ch = ans.charAt(0);
                    for (int i = 0; i < s.length(); i++) {
                        if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(ch))
                            letters[i] = s.charAt(i);
                    }
                    txt1.setText(String.valueOf(letters));
                    if (!String.valueOf(letters).contains("*"))
                        new MyError("Congrats. You found the word!");
                } else
                    new MyError("You entered wrong key");
            } catch (NullPointerException err) {
                new MyError("You must enter a letter");
            } finally {
                txt2.setText("");
            }
        }*/
    }
}
