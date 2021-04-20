import words.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class MenuGUI extends JFrame implements ActionListener {
    private JButton start_but = new JButton("START");
    private JRadioButton easy_r = new JRadioButton("Easy",true);
    private JRadioButton medium_r = new JRadioButton("Medium");
    private JRadioButton hard_r = new JRadioButton("Hard");

    private JRadioButton country_r = new JRadioButton("Country",true);
    private JRadioButton city_r = new JRadioButton("City");
    private JRadioButton cars_r = new JRadioButton("Cars");
    private JRadioButton animals_r = new JRadioButton("Animals");
    private JRadioButton fruits_r = new JRadioButton("Fruits");

    private ButtonGroup buttonGroup1 =  new ButtonGroup();
    private ButtonGroup buttonGroup2 =  new ButtonGroup();

    private JLabel jLabel1 =  new JLabel("Select the level");
    private JLabel jLabel2 =  new JLabel("Select the category");

    private JPanel jPanel1 =  new JPanel();
    private JPanel jPanel2 =  new JPanel();
    private JPanel jPanel3 =  new JPanel();
    private JPanel jPanel4 =  new JPanel();
    private JPanel jPanel5 =  new JPanel();


    public MenuGUI(){
        setLayout(new GridLayout(5,1));

        buttonGroup1.add(easy_r);
        buttonGroup1.add(medium_r);
        buttonGroup1.add(hard_r);

        buttonGroup2.add(cars_r);
        buttonGroup2.add(city_r);
        buttonGroup2.add(country_r);
        buttonGroup2.add(animals_r);
        buttonGroup2.add(fruits_r);

        jPanel1.add(jLabel1);

        jPanel2.add(easy_r);
        jPanel2.add(medium_r);
        jPanel2.add(hard_r);

        jPanel3.add(jLabel2);

        jPanel4.add(country_r);
        jPanel4.add(city_r);
        jPanel4.add(cars_r);
        jPanel4.add(animals_r);
        jPanel4.add(fruits_r);

        jPanel5.add(start_but);

        add(jPanel1);
        add(jPanel2);
        add(jPanel3);
        add(jPanel4);
        add(jPanel5);

        easy_r.addActionListener(this);
        medium_r.addActionListener(this);
        hard_r.addActionListener(this);
        city_r.addActionListener(this);
        country_r.addActionListener(this);
        animals_r.addActionListener(this);
        cars_r.addActionListener(this);
        fruits_r.addActionListener(this);
        start_but.addActionListener(this);


        setSize(400, 400);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Level level = Level.EASY;
        Word word =  new Car();
        if(easy_r.isSelected()){
            level = Level.EASY;
        }
        if(medium_r.isSelected()){
            level = Level.MEDIUM;
        }
        if(hard_r.isSelected()){
            level = Level.HARD;
        }
        if(cars_r.isSelected()){
            word =  new Car();
        }
        if(city_r.isSelected()){
            word =  new City();
        }
        if(country_r.isSelected()){
            word =  new Country();
        }
        if(animals_r.isSelected()){
            word =  new Animal();
        }
        if(fruits_r.isSelected()){
            word =  new Fruit();
        }
        if(e.getSource() == start_but){
            WordGenerator wordGenerator =  new WordGenerator();
            wordGenerator.Generate(word,level);
            GameGUI gameGUI =  new GameGUI();
            this.dispose();
        }


    }

}
