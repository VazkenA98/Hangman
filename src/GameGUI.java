import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class GameGUI extends JFrame implements ActionListener {

    private JTextField txt1 = new JTextField();
    private JTextField txt2 = new JTextField(1);
    private JButton word = new JButton("new word");
    private JButton check = new JButton("check");

    private Font font = new Font("SansSerif", Font.BOLD, 30);

    private JPanel jPanelM1 =  new JPanel();
    private JPanel jPanelM2 =  new JPanel();

    private JLabel imgLabel = new JLabel(new ImageIcon("images/1.png"));
    private static String[] images = {"images/1.png","images/2.png","images/3.png","images/4.png","images/5.png","images/6.png","images/7.png"};
    private static int count = 0;
    private String generatedWord;
    private char[] letters;



    public GameGUI() {
        setLayout(new GridLayout(1,2));
        jPanelM1.setLayout(new GridLayout(4,1));
        jPanelM2.setLayout(new FlowLayout());

        txt1.setFont(font);
        txt1.setHorizontalAlignment(SwingConstants.CENTER);
        txt1.setEditable(false);

        txt2.setFont(font);
        txt2.setHorizontalAlignment(SwingConstants.CENTER);

        jPanelM1.add(txt1);
        jPanelM1.add(txt2);
        jPanelM1.add(word);
        jPanelM1.add(check);

        jPanelM2.add(imgLabel);

        add(jPanelM1);
        add(jPanelM2);

        word.addActionListener(this);
        check.addActionListener(this);
        getWord();
        setSize(600, 400);
        setVisible(true);
    }
    private void getWord(){
        generatedWord = WordGenerator.filteredWordList.get((int)(Math.random()*WordGenerator.filteredWordList.size())).getName();
        letters = new char[generatedWord.length()];
        Arrays.fill(letters, '*');
        txt1.setText(String.valueOf(letters));
    }

    private void setImages(int count){
        if(count <= 6)
            imgLabel.setIcon(new ImageIcon(images[count]));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == word) {
            getWord();
        }
        if (e.getSource() == check) {
            try {
                String ans = txt2.getText().toLowerCase();
                if(ans.length() != 0) {
                    if (generatedWord.contains(ans)) {
                        char ch = ans.charAt(0);
                        for (int i = 0; i < generatedWord.length(); i++) {
                            if (Character.toLowerCase(generatedWord.charAt(i)) == Character.toLowerCase(ch))
                                letters[i] = generatedWord.toLowerCase().charAt(i);
                        }
                        txt1.setText(String.valueOf(letters));
                        if (!String.valueOf(letters).contains("*"))
                            new MessageGUI("Congrats. You found the word!");
                    } else {
                        count++;
                        setImages(count);
                        if (count == 6) {
                            new MessageGUI("You Lost");
                            this.dispose();
                        }
                    }
                }
            } catch (NullPointerException err) {
                new MessageGUI("Something went wrong");
            } finally {
                txt2.setText("");
            }
        }
    }

}
