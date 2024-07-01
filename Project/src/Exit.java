
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exit extends JFrame {
    JButton YES, NO;

    Exit() {
        setTitle("Exit");
        YES = new JButton("OK");
        NO = new JButton("NO");
        YES.setBounds(150, 200, 80, 50);
        NO.setBounds(270, 200, 80, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        setLayout(null);
        this.add(YES);
        this.add(NO);
        YES.setBackground(Color.red);
        NO.setBackground(Color.green);
        JLabel label = new JLabel("Do You Want To Exit???");
        label.setFont(label.getFont().deriveFont(24f));
        this.getContentPane().add(label);
        label.setForeground(Color.blue);

        this.add(label);
        ImageIcon imageIcon = new ImageIcon("Exit.png");
        Image image = imageIcon.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        JLabel backgroundLabel = new JLabel(imageIcon);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(backgroundLabel, BorderLayout.CENTER);
        label.setBounds(120, 30, 500, 200);
        YES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        NO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyFrame();
            }

        });

    }

    public static void main(String[] args) {

        Exit frame = new Exit();
        frame.setVisible(true);
    }
}