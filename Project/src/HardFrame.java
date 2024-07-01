
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class HardFrame extends JPanel implements ActionListener {
    private JFrame frame;
    JLabel sucess;
    JLabel life;

    int n = 3, i = 0;
    String s, s2, s3, s4, s5;
    int a, b, b2, a2, b3, b4, b5;

    char c;
    int px = 10;
    static int x, y = 750, x2, y2 = 750, x3, x4, x5, y3 = 750, y4 = 750, y5 = 750;
    JTextField lifetextField;;
    JTextField textField;
    JTextField successtextField;

    int width = 100;
    int height = 50;
    int stepsize;
    int y2stepsize = 3;
    int ystepsize = 4;
    int y3stepsize = 2;
    int y4stepsize = 3;
    int y5stepsize = 2;

    int w, h;
    BufferedImage resizedImage, resizedImage2;
    BufferedImage resizedImage3, resizedImage4;
    BufferedImage resizedImage5;

    int[] array = new int[13];
    boolean[] BoolArray = new boolean[13];

    int position, position2, position3, position4, position5;

    public HardFrame() {
        array[0] = 100;
        BoolArray[0] = true;
        for (int it = 1; it < 13; it++) {
            array[it] = array[it - 1] + 100;
            BoolArray[it] = true;

        }
        position = (int) (Math.random() * 100) % 13;
        position2 = (int) (Math.random() * 100) % 13;
        position3 = (int) (Math.random() * 100) % 13;
        position4 = (int) (Math.random() * 100) % 13;
        position5 = (int) (Math.random() * 100) % 13;
        x = array[position];

        BoolArray[position] = false;
        while (BoolArray[position2] != true) {
            position2 = (int) (Math.random() * 100) % 13;
        }
        x2 = array[position2];

        BoolArray[position2] = false;
        while (BoolArray[position3] != true) {
            position3 = (int) (Math.random() * 100) % 13;
        }
        x3 = array[position3];

        BoolArray[position3] = false;
        while (BoolArray[position4] != true) {
            position4 = (int) (Math.random() * 100) % 13;
        }
        x4 = array[position4];

        BoolArray[position4] = false;
        while (BoolArray[position5] != true) {
            position5 = (int) (Math.random() * 100) % 13;
        }
        x5 = array[position5];
        BoolArray[position5] = false;

        a = (int) (Math.random() * 100);
        a = a % 10;
        b = (int) (Math.random() * 100);
        b = b % 10;
        if (a % 3 == 0) {
            c = '+';
            s = b + " " + c + " " + a;
            b = a + b;
        }

        else if (a % 3 == 1) {
            c = '-';
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            s = a + " " + c + " " + b;
            b = a - b;
        } else {
            c = '*';
            s = b + " " + c + " " + a;
            b = a * b;

        }

        a2 = (int) (Math.random() * 100);
        a2 = a2 % 10;
        b2 = (int) (Math.random() * 100);
        b2 = b2 % 10;

        if (a2 % 3 == 0) {
            c = '+';
            s2 = b2 + " " + c + " " + a2;
            b2 = a2 + b2;
        }

        else if (a2 % 3 == 1) {
            c = '-';
            if (a2 < b2) {
                int temp = a2;
                a2 = b2;
                b2 = temp;
            }
            s2 = a2 + " " + c + " " + b2;
            b2 = a2 - b2;
        } else {
            c = '*';
            s2 = b2 + " " + c + " " + a2;
            b2 = a2 * b2;

        }
        a = (int) (Math.random() * 100);
        a = a % 10;
        b3 = (int) (Math.random() * 100);
        b3 = b3 % 10;
        if (a % 3 == 0) {
            c = '+';
            s3 = b3 + " " + c + " " + a;
            b3 = b3 + a;
        }

        else if (a % 3 == 1) {
            c = '-';
            if (a < b3) {
                int temp = a;
                a = b3;
                b3 = temp;
            }
            s3 = a + " " + c + " " + b3;
            b3 = a - b3;
        } else {
            c = '*';
            s3 = b3 + " " + c + " " + a;
            b3 = b3 * a;

        }
        a = (int) (Math.random() * 100);
        a = a % 10;
        b4 = (int) (Math.random() * 100);
        b4 = b4 % 10;
        if (a % 3 == 0) {
            c = '+';
            s4 = b4 + " " + c + " " + a;
            b4 = a + b4;
        }

        else if (a % 3 == 1) {
            c = '-';
            if (a < b4) {
                int temp = a;
                a = b4;
                b4 = temp;
            }
            s4 = a + " " + c + " " + b4;
            b4 = a - b4;
        } else {
            c = '*';
            s4 = b4 + " " + c + " " + a;
            b4 = a * b4;

        }
        a = (int) (Math.random() * 100);
        a = a % 10;
        b5 = (int) (Math.random() * 100);
        b5 = b5 % 10;
        if (a % 3 == 0) {
            c = '+';
            s5 = b5 + " " + c + " " + a;
            b5 = a + b5;
        }

        else if (a % 3 == 1) {
            c = '-';
            if (a < b5) {
                int temp = a;
                a = b5;
                b5 = temp;
            }
            s5 = a + " " + c + " " + b5;
            b5 = a - b5;
        } else {
            c = '*';
            s5 = b5 + " " + c + " " + a;
            b5 = a * b5;

        }

        frame = new JFrame("Hard Frame");

        // Set the panel as the content pane of the frame
        frame.setContentPane(this);
        this.setBackground(Color.BLACK);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        frame.setSize(screenWidth, screenHeight);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        textField = new JTextField();
        successtextField = new JTextField();
        lifetextField = new JTextField();
        textField.setBounds(1400, 750, 100, 30);
        successtextField.setBounds(140, 10, 40, 30);

        lifetextField.setBounds(1430, 10, 30, 30);

        successtextField.setText(Integer.toString(i));
        lifetextField.setText(Integer.toString(n));
        frame.add(textField);
        sucess = new JLabel("Success:-- ");
        life = new JLabel("Life:--  ");
        sucess.setForeground(Color.green);
        life.setForeground(Color.red);
        frame.add(sucess);
        frame.add(successtextField);
        frame.add(life);
        frame.add(lifetextField);
        sucess.setBounds(10, 10, 130, 30);
        sucess.setFont(sucess.getFont().deriveFont(Font.BOLD, 24));

        frame.setLayout(null);
        life.setBounds(1350, 10, 100, 30);
        life.setFont(life.getFont().deriveFont(Font.BOLD, 24));

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String input = textField.getText();
                textField.setText("");
                int intinput;
                intinput = Integer.parseInt(input);

                try {

                    if (intinput == b) {
                        stepsize = (int) (Math.random() * 100) % 3;
                        if (stepsize == 0)
                            ystepsize = 2;
                        else if (stepsize == 1)
                            ystepsize = 3;
                        else if (stepsize == 2)
                            ystepsize = 4;

                        BoolArray[position] = true;
                        position = (int) (Math.random() * 100) % 13;
                        while (BoolArray[position] != true) {
                            position = (int) (Math.random() * 100) % 13;
                        }
                        x = array[position];
                        BoolArray[position] = false;

                        y = 750;

                        a = (int) (Math.random() * 100);
                        a = a % 10;
                        b = (int) (Math.random() * 100);
                        b = b % 10;
                        if (a % 3 == 0) {
                            c = '+';
                            s = b + " " + c + " " + a;
                            b = a + b;
                        }

                        else if (a % 3 == 1) {
                            c = '-';
                            if (a < b) {
                                int temp = a;
                                a = b;
                                b = temp;
                            }
                            s = a + " " + c + " " + b;
                            b = a - b;
                        } else {
                            c = '*';
                            s = b + " " + c + " " + a;
                            b = a * b;

                        }

                        ++i;
                        successtextField.setText(Integer.toString(i));
                        lifetextField.setText(Integer.toString(n));
                    }
                    if (intinput == b2) {
                        stepsize = (int) (Math.random() * 100) % 3;
                        if (stepsize == 0)
                            y2stepsize = 2;
                        else if (stepsize == 1)
                            y2stepsize = 3;
                        else if (stepsize == 2)
                            y2stepsize = 4;

                        BoolArray[position2] = true;
                        position2 = (int) (Math.random() * 100) % 13;
                        while (BoolArray[position2] != true) {
                            position2 = (int) (Math.random() * 100) % 13;
                        }
                        x2 = array[position2];
                        BoolArray[position2] = false;

                        y2 = 750;

                        a = (int) (Math.random() * 100);
                        a = a % 10;
                        b2 = (int) (Math.random() * 100);
                        b2 = b2 % 10;
                        if (a % 3 == 0) {
                            c = '+';
                            s2 = b2 + " " + c + " " + a;
                            b2 = a + b2;
                        }

                        else if (a % 3 == 1) {
                            c = '-';
                            if (a < b2) {
                                int temp = a;
                                a = b2;
                                b2 = temp;
                            }
                            s2 = a + " " + c + " " + b2;
                            b2 = a - b2;
                        } else {
                            c = '*';
                            s2 = b2 + " " + c + " " + a;
                            b2 = a * b2;

                        }

                        ++i;
                        successtextField.setText(Integer.toString(i));
                        lifetextField.setText(Integer.toString(n));
                    }
                    if (intinput == b3) {
                        stepsize = (int) (Math.random() * 100) % 3;
                        if (stepsize == 0)
                            y3stepsize = 2;
                        else if (stepsize == 1)
                            y3stepsize = 3;
                        else if (stepsize == 2)
                            y3stepsize = 4;

                        BoolArray[position3] = true;
                        position3 = (int) (Math.random() * 100) % 13;
                        while (BoolArray[position3] != true) {
                            position3 = (int) (Math.random() * 100) % 13;
                        }

                        x3 = array[position3];
                        BoolArray[position3] = false;

                        y3 = 900;

                        a = (int) (Math.random() * 100);
                        a = a % 10;
                        b3 = (int) (Math.random() * 100);
                        b3 = b3 % 10;
                        if (a % 3 == 0) {
                            c = '+';
                            s3 = b3 + " " + c + " " + a;
                            b3 = a + b3;
                        }

                        else if (a % 3 == 1) {
                            c = '-';
                            if (a < b3) {
                                int temp = a;
                                a = b3;
                                b3 = temp;
                            }
                            s3 = a + " " + c + " " + b3;
                            b3 = a - b3;
                        } else {
                            c = '*';
                            s3 = b3 + " " + c + " " + a;
                            b3 = a * b3;

                        }

                        ++i;
                        successtextField.setText(Integer.toString(i));
                        lifetextField.setText(Integer.toString(n));
                    }
                    if (intinput == b4) {
                        stepsize = (int) (Math.random() * 100) % 3;
                        if (stepsize == 0)
                            y4stepsize = 2;
                        else if (stepsize == 1)
                            y4stepsize = 3;
                        else if (stepsize == 2)
                            y4stepsize = 4;

                        BoolArray[position4] = true;
                        position4 = (int) (Math.random() * 100) % 13;
                        while (BoolArray[position4] != true) {
                            position4 = (int) (Math.random() * 100) % 13;
                        }

                        x4 = array[position4];
                        BoolArray[position4] = false;

                        y4 = 1000;

                        a = (int) (Math.random() * 100);
                        a = a % 10;
                        b4 = (int) (Math.random() * 100);
                        b4 = b4 % 10;
                        if (a % 3 == 0) {
                            c = '+';
                            s4 = b4 + " " + c + " " + a;
                            b4 = a + b4;
                        }

                        else if (a % 3 == 1) {
                            c = '-';
                            if (a < b4) {
                                int temp = a;
                                a = b4;
                                b4 = temp;
                            }
                            s4 = a + " " + c + " " + b4;
                            b4 = a - b4;
                        } else {
                            c = '*';
                            s4 = b4 + " " + c + " " + a;
                            b4 = a * b4;

                        }

                        ++i;
                        successtextField.setText(Integer.toString(i));
                        lifetextField.setText(Integer.toString(n));
                    }
                    if (intinput == b5) {
                        stepsize = (int) (Math.random() * 100) % 3;
                        if (stepsize == 0)
                            y5stepsize = 2;
                        else if (stepsize == 1)
                            y5stepsize = 3;
                        else if (stepsize == 2)
                            y5stepsize = 4;

                        BoolArray[position5] = true;
                        position5 = (int) (Math.random() * 100) % 13;
                        while (BoolArray[position5] != true) {
                            position5 = (int) (Math.random() * 100) % 13;
                        }

                        x5 = array[position5];
                        BoolArray[position5] = false;

                        y5 = 1100;

                        a = (int) (Math.random() * 100);
                        a = a % 10;
                        b5 = (int) (Math.random() * 100);
                        b5 = b5 % 10;
                        if (a % 3 == 0) {
                            c = '+';
                            s5 = b5 + " " + c + " " + a;
                            b5 = a + b5;
                        }

                        else if (a % 3 == 1) {
                            c = '-';
                            if (a < b5) {
                                int temp = a;
                                a = b5;
                                b5 = temp;
                            }
                            s5 = a + " " + c + " " + b5;
                            b5 = a - b5;
                        } else {
                            c = '*';
                            s5 = b5 + " " + c + " " + a;
                            b5 = a * b5;

                        }

                        ++i;
                        successtextField.setText(Integer.toString(i));
                        lifetextField.setText(Integer.toString(n));
                    }

                } catch (Exception a) {
                    // setVisible(false);
                    // new test(n, i, 500, 750, 700, 750);
                    System.out.println(a);

                }

            }
        });
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        repaint();

        ImageIcon originalIcon = new ImageIcon("BlueBallon.png");
        int newWidth = 100;
        int newHeight = 100;
        Image originalImage = originalIcon.getImage();
        resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
        g2d.dispose();
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.drawImage(resizedImage, x, y, null);
        g.setColor(Color.BLACK);
        g.drawString(s, x + 28, 20 + y + height / 2);

        ImageIcon originalIcon2 = new ImageIcon("GreenBallon.png");
        Image originalImage2 = originalIcon2.getImage();
        resizedImage2 = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d2 = resizedImage2.createGraphics();
        g2d2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d2.drawImage(originalImage2, 0, 00, newWidth, newHeight, null);
        g2d2.dispose();
        g.drawImage(resizedImage2, x2, y2, null);
        g.drawString(s2, x2 + 28, 20 + y2 + height / 2);

        ImageIcon originalIcon3 = new ImageIcon("YellowBallon.png");
        Image originalImage3 = originalIcon3.getImage();
        resizedImage3 = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d3 = resizedImage3.createGraphics();
        g2d3.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d3.drawImage(originalImage3, 0, 0, newWidth, newHeight, null);
        g2d3.dispose();
        g.drawImage(resizedImage3, x3, y3, null);

        g.drawString(s3, x3 + 28, 20 + y3 + height / 2);
        ImageIcon originalIcon4 = new ImageIcon("PurpleBallon.png");
        Image originalImage4 = originalIcon4.getImage();
        resizedImage4 = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d4 = resizedImage4.createGraphics();
        g2d4.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d4.drawImage(originalImage4, 0, 0, newWidth, newHeight, null);
        g2d4.dispose();
        g.drawImage(resizedImage4, x4, y4, null);

        g.drawString(s4, x4 + 28, 20 + y4 + height / 2);
        ImageIcon originalIcon5 = new ImageIcon("RedBallon.png");
        Image originalImage5 = originalIcon5.getImage();
        resizedImage5 = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d5 = resizedImage5.createGraphics();
        g2d5.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d5.drawImage(originalImage5, 0, 0, newWidth, newHeight, null);
        g2d5.dispose();
        g.drawImage(resizedImage5, x5, y5, null);

        g.drawString(s5, x5 + 28, 20 + y5 + height / 2);

        if (y <= 0) {

            if (n - 1 == 0) {
                frame.setVisible(false);
                new Congratulation(i, 1);

            } else {
                y = 750;
                n--;
                lifetextField.setText(Integer.toString(n));

            }

        }
        if (y2 <= 0) {
            if (n - 1 == 0) {
                frame.setVisible(false);
                new Congratulation(i, 1);

            }

            else {
                y2 = 750;

                n--;
                lifetextField.setText(Integer.toString(n));
            }

        }
        if (y3 <= 0) {
            if (n - 1 == 0) {
                frame.setVisible(false);
                new Congratulation(i, 1);

            }

            else {
                y3 = 750;
                n--;
                lifetextField.setText(Integer.toString(n));
            }

        }
        if (y4 <= 0) {
            if (n - 1 == 0) {
                frame.setVisible(false);
                new Congratulation(i, 1);

            }

            else {
                y4 = 750;

                n--;
                lifetextField.setText(Integer.toString(n));
            }

        }
        if (y5 <= 0) {
            if (n - 1 == 0) {
                frame.setVisible(false);
                new Congratulation(i, 1);

            }

            else {
                y5 = 750;
                n--;
                lifetextField.setText(Integer.toString(n));
            }

        }
        y = y - ystepsize;
        y2 = y2 - y2stepsize;
        y3 = y3 - y3stepsize;
        y4 = y4 - y4stepsize;
        y5 = y5 - y5stepsize;

        try {
            Thread.sleep(20);
        } catch (Exception e) {

        }

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == textField) {
            // repaint(); // Repaint the panel
        }

    }

}
