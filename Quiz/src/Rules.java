
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton back,start;

    Rules(String name) {

        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        add(heading);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        // heading.setForeground(Color.BLUE); // give to heading text --> color
        heading.setForeground(new Color(30, 144, 254)); // give to heading text --> rgb color value
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            rules.setText(
                    "<html>"+
                            "1.No registration is required to participate in the quiz." + "<br><br>" +
                            "2. The quiz consists of 10 questions in total." + "<br><br>" +
                            "3. Each question is worth 10 point for a correct answer." + "<br><br>" +
                            "4. No points are deducted for incorrect answers." + "<br><br>" +
                            "5. Players have 15 seconds to answer each question." + "<br><br>" +
                            "6. No use of mobile phones, books, or external help is allowed." + "<br><br>" +
                            "7. If a player fails to answer within the time limit, the question is forfeited." + "<br><br>" +
                            "Best Of Luck" + "<br><br>" +
                            "<html>");
        add(rules);
        
        back = new JButton("Back"); //Create Botton
        back.setBounds(280, 450, 100, 25);
        back.setFont(new Font("Times New Roman", Font.BOLD, 18));
        back.setBackground(new Color(30,144,230));
        back.setForeground(Color.WHITE);
        // rules.setBorder(null);
        back.addActionListener(this); //this is generate the click event
        add(back);

        start = new JButton("Start"); //Create Botton
        start.setBounds(430, 450, 100, 25);
        start.setFont(new Font("Times New Roman", Font.BOLD, 18));
        start.setBackground(new Color(30,144,230));
        start.setForeground(Color.WHITE);
        // rules.setBorder(null);
        start.addActionListener(this); //this is generate the click event
        add(start);


        setSize(800, 550);
        setLocation(270, 90);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");

    }
}
