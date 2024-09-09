
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String user_answers[][] = new String[10][1];
    JLabel qno, quation;
    JRadioButton op1, op2, op3, op4;
    JButton submit, next, lifeline;
    ButtonGroup groupOptions;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    String username;

    Quiz(String username) {

        this.username = username;
        // setSize(800, 550);
        // setLocation(270, 90);

        setBounds(90, 10, 1100, 700); // This is also work as setsize() and setlocation mixed.
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg")); // This is add the image in the
                                                                                       // // // Frame.
        JLabel image = new JLabel(i1); // This is the lable for the image
        image.setBounds(0, 0, 1100, 390);
        add(image); // this statement is add the image

        qno = new JLabel();
        qno.setBounds(80, 400, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(qno);

        quation = new JLabel();
        quation.setBounds(130, 400, 900, 30);
        quation.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(quation);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        op1 = new JRadioButton();
        op1.setBounds(130, 440, 700, 25);
        op1.setBackground(Color.WHITE);
        op1.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(op1);

        op2 = new JRadioButton();
        op2.setBounds(130, 480, 700, 25);
        op2.setBackground(Color.WHITE);
        op2.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(op2);

        op3 = new JRadioButton();
        op3.setBounds(130, 520, 700, 25);
        op3.setBackground(Color.WHITE);
        op3.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(op3);

        op4 = new JRadioButton();
        op4.setBounds(130, 560, 700, 25);
        op4.setBackground(Color.WHITE);
        op4.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(op4);

        groupOptions = new ButtonGroup();
        groupOptions.add(op1);
        groupOptions.add(op2);
        groupOptions.add(op3);
        groupOptions.add(op4);

        next = new JButton("Next");
        next.setBounds(850, 450, 200, 30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 100, 230));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50 50 LifeLine");
        lifeline.setBounds(850, 510, 200, 30);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 100, 230));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(850, 570, 200, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 100, 230));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false); // this is make button disable
        submit.addActionListener(this);
        add(submit);

        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            repaint();
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);

            ans_given = 1;

            if (groupOptions.getSelection() == null) {
                user_answers[count][0] = "";
            } else {
                user_answers[count][0] = groupOptions.getSelection().getActionCommand(); // give me user selected option
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
                // count = 0;
            }

            count++;
            start(count);
        } else if (e.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                op2.setEnabled(false);
                op3.setEnabled(false);
            } else {
                op1.setEnabled(false);
                op4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (e.getSource() == submit) {
            ans_given = 1;

            if (groupOptions.getSelection() == null) {
                user_answers[count][0] = "";
            } else {
                user_answers[count][0] = groupOptions.getSelection().getActionCommand(); // give me user selected
                                                                                         // option
            }

            for (int i = 0; i < user_answers.length; i++) {

                if (user_answers[i][0].equals(answers[i][1])) {
                    score += 10;
                }
                // here else for the minous system.
                // else{
                // score -= 5;
                // }
            }
            setVisible(false);
            new Score(username, score);
        }
    }

    // Below methodeic called automatically.
    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time lift - " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 18));

        if (timer > 0) {
            g.drawString(time, 870, 450); // is used to string position x-axis,y-axis,width.
        } else {
            g.drawString("Time Up !!", 870, 450);
        }

        timer--;

        try {
            Thread.sleep(1000);
            repaint(); // this is called paint function after every one secound.
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if (count == 9) {

                if (groupOptions.getSelection() == null) {
                    user_answers[count][0] = "";
                } else {
                    user_answers[count][0] = groupOptions.getSelection().getActionCommand(); // give me user selected
                                                                                             // option
                }

                for (int i = 0; i < user_answers.length; i++) {
                    if (user_answers[i][0].equals(answers[i][1])) {
                        score += 10;
                    }
                    // here else for the minous system.
                    // else{
                    // score -= 5;
                    // }
                }
                setVisible(false);

                new Score(username, score);

            } else {

                if (groupOptions.getSelection() == null) {
                    user_answers[count][0] = "";
                } else {
                    user_answers[count][0] = groupOptions.getSelection().getActionCommand(); // give me user selected
                                                                                             // option
                }
                count++;
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ".");
        quation.setText(questions[count][0]);
        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);

        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);

        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);

        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);

        groupOptions.clearSelection(); // clear all the options.
    }

    public static void main(String[] args) {
        new Quiz("User");
    }
}
