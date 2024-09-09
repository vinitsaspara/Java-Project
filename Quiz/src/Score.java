
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    public String username;
    public int score;

    Score(String username, int score) {
        this.username = username;
        this.score = score;

        setBounds(200, 100, 1000, 500); // This is also work as setsize() and setlocation mixed.
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png")); // This is add the image in the
                                                                                        // // // // Frame.

        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3); // This is the lable for the image
        image.setBounds(0, 100, 300, 250);
        add(image); // this statement is add the image

        JLabel heading = new JLabel("Thank you " + username + " for playing Simple Minds");
        heading.setBounds(45, 30, 900, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your Score is " + score);
        lblscore.setBounds(400, 200, 900, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(400, 270, 200, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 100, 230));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
