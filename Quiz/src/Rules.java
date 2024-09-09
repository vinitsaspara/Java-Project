
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
                    "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                    "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                    "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                    "4. Crying is allowed but please do so quietly." + "<br><br>" +
                    "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                    "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                    "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                    "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
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
