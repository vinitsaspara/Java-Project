
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    JButton back,rules;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg")); // This is add the image in the // Frame.
        JLabel image = new JLabel(i1); // This is the lable for the image
        add(image); // this statement is add the image
        image.setBounds(0, 0, 600, 500);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        add(heading);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        // heading.setForeground(Color.BLUE); // give to heading text --> color
        heading.setForeground(new Color(30, 144, 254)); // give to heading text --> rgb color value

        JLabel name = new JLabel("Enter your name");
        name.setBounds(745, 150, 300, 20);
        add(name);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        // name.setForeground(Color.BLUE); // give to heading text --> color
        name.setForeground(new Color(30, 144, 254)); // give to heading text --> rgb color value

       tfname = new JTextField(); //input type = text in html.
        tfname.setBounds(720,180,200,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(tfname);

        rules = new JButton("Rules"); //Create Botton
        rules.setBounds(700, 220, 100, 25);
        rules.setFont(new Font("Times New Roman", Font.BOLD, 18));
        rules.setBackground(new Color(30,144,230));
        rules.setForeground(Color.WHITE);
        // rules.setBorder(null);
        rules.addActionListener(this); //this is generate the click event
        add(rules);

        back = new JButton("Back"); //Create Botton
        back.setBounds(840, 220, 100, 25);
        back.setFont(new Font("Times New Roman", Font.BOLD, 18));
        back.setBackground(new Color(30,144,230));
        back.setForeground(Color.WHITE);
        back.addActionListener(this); //this is generate the click event
        // rules.setBorder(null);
        add(back);

        setSize(1000, 500);
        setLocation(200, 100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == rules){
            String name = tfname.getText(); // fatch the name from input text.
            setVisible(false);
            new Rules(name);
        }else if(e.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login(); // Anonymous object

    }

}
