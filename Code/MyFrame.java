
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button1, button2, button3, Exit;
    ImageIcon ii;
    JLabel l;
    BufferedImage resizedImage, resizedImage2;
    static int screenWidth, screenHeight;

    public MyFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = (int) screenSize.getWidth();
        screenHeight = (int) screenSize.getHeight();
        JLabel label = new JLabel("Choice Your Level");
        JLabel welcomelabel = new JLabel("Welcome to Kid's Ballon Game...");

        button1 = new JButton("Easy");
        button2 = new JButton("Midium");
        button3 = new JButton("Hard");
        Exit = new JButton("Exit");
        button1.setBounds((screenWidth - 50) / 2, 200, 100, 50);
        button2.setBounds((screenWidth - 50) / 2, 275, 100, 50);
        button3.setBounds((screenWidth - 50) / 2, 350, 100, 50);
        Exit.setBounds(1350, 650, 100, 50);

        label.setFont(label.getFont().deriveFont(24f));
        welcomelabel.setFont(label.getFont().deriveFont(45f));

        this.getContentPane().add(label);
        this.getContentPane().add(welcomelabel);

        label.setForeground(Color.black);
        welcomelabel.setForeground(Color.RED);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(screenWidth, screenHeight);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        setLayout(null);

        this.add(label);
        this.add(button1);

        this.add(button2);

        this.add(button3);
        this.add(Exit);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        Exit.addActionListener(this);
        setTitle("Myframe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.setBackground(Color.green);
        button2.setBackground(Color.yellow);
        button3.setBackground(Color.blue);
        Exit.setBackground(Color.RED);

        this.setSize(screenWidth, screenHeight);

        ImageIcon imageIcon = new ImageIcon("MyFrame.png");
        Image image = imageIcon.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        JLabel backgroundLabel = new JLabel(imageIcon);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(backgroundLabel, BorderLayout.CENTER);
        label.setBounds((screenWidth - 180) / 2, 10, 800, 300);
        welcomelabel.setBounds((screenWidth - 600) / 2, 10, 800, 100);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {

            new EasyFrame();
            setVisible(false);

        }
        if (e.getSource() == button2) {
            new MidiumFrame();
            setVisible(false);
        }
        if (e.getSource() == button3) {
            new HardFrame();
            setVisible(false);
        }

        if (e.getSource() == Exit) {
            setVisible(false);
            new Exit();

        }

    }

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }

}
