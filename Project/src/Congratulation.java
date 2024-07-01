
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Congratulation extends JFrame {
    JButton MainButoon;
    JLabel conlabel, resultlabel;
    static int screenWidth, screenHeight;

    public Congratulation(int n, int m) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = (int) screenSize.getWidth();
        screenHeight = (int) screenSize.getHeight();
        ImageIcon originalIcon = new ImageIcon("BackButton.png");

        Image originalImage = originalIcon.getImage();

        int width = 100;
        int height = 100;
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        ImageIcon icon = new ImageIcon(scaledImage);
        ImageIcon imageIcon = new ImageIcon("BackgroundBallon3.png");
        MainButoon = new JButton("Back to the Main Menu.", icon);
        if (n == 0) {
            conlabel = new JLabel("Sorry!!!");
            resultlabel = new JLabel("You have not  solved any  problems .");

        } else if (m == -1) {
            conlabel = new JLabel("Congratulation!!!");
            if(n==1)
            resultlabel = new JLabel("You have solved " + n + " problem in Easy Version.");
            else  resultlabel = new JLabel("You have solved " + n + " problems in Easy Version.");

        } else if (m == 0) {
            conlabel = new JLabel("Congratulation!!!");
            if(n==1)
                resultlabel = new JLabel("You have solved " + n + " problem in Easy Version.");
            else  resultlabel = new JLabel("You have solved " + n + " problems in Easy Version.");
        } else if (m == 1) {
            conlabel = new JLabel("Congratulation!!!");
            if(n==1)
                resultlabel = new JLabel("You have solved " + n + " problem in Easy Version.");
            else  resultlabel = new JLabel("You have solved " + n + " problems in Easy Version.");

        }
        conlabel.setFont(conlabel.getFont().deriveFont(40f));
        this.getContentPane().add(conlabel);
        conlabel.setForeground(Color.red);
        resultlabel.setFont(resultlabel.getFont().deriveFont(24f));
        this.getContentPane().add(resultlabel);
        resultlabel.setForeground(Color.black);

        conlabel.setBounds(700, 100, 500, 50);

        MainButoon.setBounds(1050, 600, 300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(screenWidth, screenHeight);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        setLayout(null);
        this.add(conlabel);
        this.add(MainButoon);
        this.add(resultlabel);
        this.setTitle("Congratulation Frame");

        Image image = imageIcon.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        JLabel backgroundLabel = new JLabel(imageIcon);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(backgroundLabel, BorderLayout.CENTER);
        resultlabel.setBounds(550, 50, 900, 350);
        MainButoon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == MainButoon) {
                    setVisible(false);
                    new MyFrame();
                }
            }
        });

    }

}