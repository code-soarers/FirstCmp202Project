
package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.geom.RoundRectangle2D;

public class ProjectGui {
    JFrame frame = new JFrame("CALCULATOR HOME");

    JLabel label1 = new JLabel(new ImageIcon("src/UI/"));
    JLabel text1 = new JLabel(" Welcome to Code");
    JLabel text2 = new JLabel(" Soarers Physics ");
    JLabel text3 = new JLabel(" Energy");
    JLabel text4 = new JLabel(" Calculator GUI");
    JButton button1 = new JButton("Click to Continue");

    public void mainUI() {

        frame.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame.setSize(350, 600);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        text1.setFont(new Font("Gill Sans", Font.BOLD, 25));
        text1.setForeground(Color.darkGray);

        text2.setFont(new Font("Gill Sans", Font.BOLD, 25));
        text2.setForeground(Color.darkGray);

        text3.setFont(new Font("Gill Sans", Font.BOLD, 25));
        text3.setForeground(Color.darkGray);

        text4.setFont(new Font("Gill Sans", Font.BOLD, 25));
        text4.setForeground(Color.darkGray);

        button1.setFont(new Font("Gill Sans", Font.PLAIN, 17));
        button1.setForeground(Color.darkGray);


        GridBagConstraints gridConstraints = new GridBagConstraints();

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 1;
        gridConstraints.gridheight = 1;
        gridConstraints.anchor = GridBagConstraints.CENTER;
        gridConstraints.insets = new Insets(25, 15, 15, 15);


        GridBagConstraints textConstraint = new GridBagConstraints();

        textConstraint.gridx = 0;
        textConstraint.gridy = 1;
        textConstraint.gridwidth = 1;
        textConstraint.gridheight = 1;
        textConstraint.fill = GridBagConstraints.NONE;
        textConstraint.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints textConstraint1 = new GridBagConstraints();

        textConstraint1.gridx = 0;
        textConstraint1.gridy = 2;
        textConstraint1.gridwidth = 1;
        textConstraint1.gridheight = 1;
        textConstraint1.fill = GridBagConstraints.NONE;
        textConstraint1.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints textConstraint2 = new GridBagConstraints();

        textConstraint2.gridx = 0;
        textConstraint2.gridy = 3;
        textConstraint2.gridwidth = 1;
        textConstraint2.gridheight = 1;
        textConstraint2.fill = GridBagConstraints.NONE;
        textConstraint2.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints textConstraint3 = new GridBagConstraints();

        textConstraint3.gridx = 0;
        textConstraint3.gridy = 4;
        textConstraint3.gridwidth = 1;
        textConstraint3.gridheight = 1;
        textConstraint3.fill = GridBagConstraints.NONE;
        textConstraint3.insets = new Insets(15, 15, 15, 15);


        GridBagConstraints gridConstraints3 = new GridBagConstraints();
        gridConstraints3.gridx = 0;
        gridConstraints3.gridy = 5;
        gridConstraints3.fill = GridBagConstraints.NONE;

//        gridConstraints3.anchor = GridBagConstraints.LINE_END;

        gridConstraints3.weightx = 1.0;
        gridConstraints3.weighty = 1.0;


// Add the button to a panel and add the panel to the frame
        JPanel buttonPanel = new JPanel();
//        buttonPanel.setBackground(new Color(4, 51, 255, 194));
        buttonPanel.setBackground(Color.white);
        buttonPanel.add(button1);
        frame.add(buttonPanel, gridConstraints3);


        frame.add(label1, gridConstraints);
        frame.add(text1, textConstraint);
        frame.add(text2, textConstraint1);
        frame.add(text3, textConstraint2);
        frame.add(text4, textConstraint3);
        frame.setVisible(true);

        frame.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {

            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {
                frame.setShape(new RoundRectangle2D.Float(0, 0, frame.getWidth(), frame.getHeight(), 20, 20));
            }

            @Override
            public void componentHidden(ComponentEvent e) {

            }
            // other componentListener methods
        });


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondFrame();
            }
        });


    }

    JFrame frame2 = new JFrame("HOME PAGE");
    JLabel label3 = new JLabel("Choose a Formula:");
    JButton potentialEnergyBtn = new JButton("Potential Energy");
    JButton HeatEnergyBtn = new JButton("Heat Energy");

    JButton backBtn = new JButton("Back");


    public void secondFrame() {
        frame2.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame2.setSize(295, 449);
        frame2.setLayout(new GridBagLayout());
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
//        frame2.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));

        label3.setFont(new Font("Gill Sans", Font.BOLD, 20));
        label3.setForeground(Color.darkGray);

        backBtn.setFont(new Font("Gill Sans", Font.PLAIN, 17));
        backBtn.setForeground(Color.darkGray);

        potentialEnergyBtn.setBorderPainted(false);
        HeatEnergyBtn.setBorderPainted(false);


        GridBagConstraints gridConstraints = new GridBagConstraints();

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 1;
        gridConstraints.gridheight = 1;
        gridConstraints.anchor = GridBagConstraints.CENTER;
        gridConstraints.insets = new Insets(25, 15, 15, 15);


        GridBagConstraints gridConstraints2 = new GridBagConstraints();

        gridConstraints2.gridx = 0;
        gridConstraints2.gridy = 1;
        gridConstraints2.gridwidth = 3;
        gridConstraints2.gridheight = 1;
        gridConstraints2.anchor = GridBagConstraints.CENTER;
        gridConstraints2.ipadx = 50;
        gridConstraints2.ipady = 30;
        gridConstraints2.insets = new Insets(25, 15, 15, 15);

        GridBagConstraints gridConstraints3 = new GridBagConstraints();

        gridConstraints3.gridx = 0;
        gridConstraints3.gridy = 3;
        gridConstraints3.gridwidth = 1;
        gridConstraints3.gridheight = 1;
        gridConstraints3.anchor = GridBagConstraints.SOUTHWEST;
        gridConstraints3.insets = new Insets(25, 15, 15, 15);

        GridBagConstraints gridConstraints4 = new GridBagConstraints();

        gridConstraints4.gridx = 0;
        gridConstraints4.gridy = 2;
        gridConstraints4.gridwidth = 3;
        gridConstraints4.gridheight = 1;
        gridConstraints4.ipadx = 70;
        gridConstraints4.ipady = 30;
        gridConstraints4.anchor = GridBagConstraints.SOUTHWEST;
        gridConstraints4.insets = new Insets(25, 15, 15, 15);


        frame2.add(label3, gridConstraints);
        frame2.add(potentialEnergyBtn, gridConstraints2);
        frame2.add(HeatEnergyBtn, gridConstraints4);


        JPanel buttonPanel2 = new JPanel();
//        buttonPanel.setBackground(new Color(4, 51, 255, 194));
        buttonPanel2.setBackground(Color.white);
        buttonPanel2.add(backBtn);
        frame2.add(buttonPanel2, gridConstraints3);


        potentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                thirdFrame();
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        HeatEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourthFrame();

            }
        });
    }

    JFrame frame3 = new JFrame("INPUT POTENTIAL ENERGY");
    JLabel headingLabel = new JLabel("Enter the Details:");
    JLabel label4 = new JLabel("Enter Mass:");
    JTextField mass = new JTextField();

    JLabel label5 = new JLabel("Enter Height:");
    JTextField height = new JTextField();

    JButton calculatebtn = new JButton("CALCULATE");

    public void thirdFrame() {
        frame3.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame3.setSize(351, 457);
        frame3.setLayout(new GridBagLayout());
        frame3.setLocationRelativeTo(null);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
//        frame3.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));

        label4.setFont(new Font("Gill Sans", Font.BOLD, 24));
        label4.setForeground(Color.darkGray);

        headingLabel.setFont(new Font("Gill Sans", Font.BOLD, 24));
        headingLabel.setForeground(Color.darkGray);

        label5.setFont(new Font("Gill Sans", Font.BOLD, 24));
        label5.setForeground(Color.darkGray);

        calculatebtn.setFont(new Font("Gill Sans", Font.PLAIN, 17));
        calculatebtn.setForeground(Color.darkGray);


        GridBagConstraints gridConstraints = new GridBagConstraints();

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 3;
        gridConstraints.gridheight = 1;
        gridConstraints.anchor = GridBagConstraints.CENTER;
        gridConstraints.insets = new Insets(5, 15, 20, 15);


        GridBagConstraints gridConstraints2 = new GridBagConstraints();

        gridConstraints2.gridx = 0;
        gridConstraints2.gridy = 1;
        gridConstraints2.gridwidth = 3;
        gridConstraints2.gridheight = 1;
        gridConstraints2.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints2.insets = new Insets(5, 15, 10, 15);

        GridBagConstraints gridConstraints3 = new GridBagConstraints();

        gridConstraints3.gridx = 0;
        gridConstraints3.gridy = 2;
        gridConstraints3.gridwidth = 3;
        gridConstraints3.gridheight = 1;
        gridConstraints3.ipadx = 270;
        gridConstraints3.ipady = 20;
        gridConstraints3.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints3.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints gridConstraints4 = new GridBagConstraints();

        gridConstraints4.gridx = 0;
        gridConstraints4.gridy = 3;
        gridConstraints4.gridwidth = 1;
        gridConstraints4.gridheight = 1;
        gridConstraints4.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints4.insets = new Insets(5, 15, 5, 15);

        GridBagConstraints gridConstraints5 = new GridBagConstraints();

        gridConstraints5.gridx = 0;
        gridConstraints5.gridy = 4;
        gridConstraints5.gridwidth = 3;
        gridConstraints5.gridheight = 1;
        gridConstraints5.ipadx = 270;
        gridConstraints5.ipady = 20;

        gridConstraints5.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints5.insets = new Insets(5, 15, 15, 15);


        GridBagConstraints gridConstraints6 = new GridBagConstraints();

        gridConstraints6.gridx = 0;
        gridConstraints6.gridy = 5;
        gridConstraints6.gridwidth = 1;
        gridConstraints6.gridheight = 1;
        gridConstraints6.ipadx = 150;
        gridConstraints6.ipady = 40;
        gridConstraints6.anchor = GridBagConstraints.CENTER;
        gridConstraints6.insets = new Insets(5, 15, 5, 15);

        frame3.add(headingLabel, gridConstraints);
        frame3.add(label4, gridConstraints2);
        frame3.add(mass, gridConstraints3);
        frame3.add(label5, gridConstraints4);
        frame3.add(height, gridConstraints5);
        frame3.add(calculatebtn, gridConstraints6);

        calculatebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                potentialEnergy();
            }
        });


    }

    JFrame frame4 = new JFrame("SOLUTION");
    JLabel label6 = new JLabel("Potential Energy");


    public void potentialEnergy() {
        frame4.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame4.setSize(400, 449);
        frame4.setLayout(new GridBagLayout());
        frame4.setLocationRelativeTo(null);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setVisible(true);

        label6.setFont(new Font("Gill Sans", Font.BOLD, 24));
        label6.setForeground(Color.darkGray);

        JPanel panel = new JPanel();

        JPanel panel2 = new JPanel();

        GridBagConstraints gridConstraints = new GridBagConstraints();

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.gridwidth = 1;
        gridConstraints.gridheight = 1;
        gridConstraints.ipadx = 150;
        gridConstraints.ipady = 50;
        gridConstraints.anchor = GridBagConstraints.CENTER;
        gridConstraints.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints gridConstraints2 = new GridBagConstraints();

        gridConstraints2.gridx = 0;
        gridConstraints2.gridy = 2;
        gridConstraints2.gridwidth = 1;
        gridConstraints2.gridheight = 1;
        gridConstraints2.ipadx = 80;
        gridConstraints2.ipady = 30;
        gridConstraints2.anchor = GridBagConstraints.CENTER;
        gridConstraints2.insets = new Insets(35, 15, 15, 15);


        frame4.add(panel, gridConstraints);

        panel.add(label6, gridConstraints);


        Energy energy = new Energy();
        try {
            float area = energy.potentialEnergy(Float.parseFloat(mass.getText()), Float.parseFloat(height.getText()));
            JLabel label7 = new JLabel("Answer=" + area + "J");
            label7.setFont(new Font("Gill Sans", Font.BOLD, 24));
            label7.setForeground(Color.darkGray);

            frame4.add(panel2, gridConstraints2);
            panel2.add(label7, gridConstraints2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }

    }

    JFrame frame5 = new JFrame("INPUT HEAT ENERGY");
    JLabel headingLabel2 = new JLabel("Enter the Details:");
    JLabel label8 = new JLabel("Enter Mass:");
    JLabel label9 = new JLabel("Enter Initial Temperature:");
    JLabel label10 = new JLabel("Enter Final Temperature:");
    JTextField mass2 = new JTextField();
    JTextField initialTemperature = new JTextField();
    JTextField finalTemperature = new JTextField();


    JButton calculatebtn2 = new JButton("CALCULATE");

    public void fourthFrame() {
        frame5.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame5.setSize(650, 590);
        frame5.setLayout(new GridBagLayout());
        frame5.setLocationRelativeTo(null);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setVisible(true);
//        frame5.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));

        headingLabel2.setFont(new Font("Gill Sans", Font.BOLD, 20));
        headingLabel2.setForeground(Color.darkGray);

        label8.setFont(new Font("Gill Sans", Font.BOLD, 20));
        label8.setForeground(Color.darkGray);

        label9.setFont(new Font("Gill Sans", Font.BOLD, 20));
        label9.setForeground(Color.darkGray);

        label10.setFont(new Font("Gill Sans", Font.BOLD, 20));
        label10.setForeground(Color.darkGray);

        calculatebtn2.setFont(new Font("Gill Sans", Font.PLAIN, 17));
        calculatebtn2.setForeground(Color.darkGray);


        GridBagConstraints gridConstraints7 = new GridBagConstraints();

        gridConstraints7.gridx = 0;
        gridConstraints7.gridy = 0;
        gridConstraints7.gridwidth = 3;
        gridConstraints7.gridheight = 1;
        gridConstraints7.anchor = GridBagConstraints.CENTER;
        gridConstraints7.insets = new Insets(5, 15, 20, 15);


        GridBagConstraints gridConstraints8 = new GridBagConstraints();

        gridConstraints8.gridx = 0;
        gridConstraints8.gridy = 1;
        gridConstraints8.gridwidth = 3;
        gridConstraints8.gridheight = 1;
        gridConstraints8.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints8.insets = new Insets(5, 15, 10, 15);

        GridBagConstraints gridConstraints9 = new GridBagConstraints();

        gridConstraints9.gridx = 0;
        gridConstraints9.gridy = 2;
        gridConstraints9.gridwidth = 3;
        gridConstraints9.gridheight = 1;
        gridConstraints9.ipadx = 270;
        gridConstraints9.ipady = 20;
        gridConstraints9.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints9.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints gridConstraints10 = new GridBagConstraints();

        gridConstraints10.gridx = 0;
        gridConstraints10.gridy = 3;
        gridConstraints10.gridwidth = 3;
        gridConstraints10.gridheight = 1;
        gridConstraints10.ipadx = 270;
        gridConstraints10.ipady = 20;
        gridConstraints10.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints10.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints gridConstraints11 = new GridBagConstraints();

        gridConstraints11.gridx = 0;
        gridConstraints11.gridy = 4;
        gridConstraints11.gridwidth = 3;
        gridConstraints11.gridheight = 1;
        gridConstraints11.ipadx = 270;
        gridConstraints11.ipady = 20;
        gridConstraints11.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints11.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints gridConstraints12 = new GridBagConstraints();

        gridConstraints12.gridx = 0;
        gridConstraints12.gridy = 5;
        gridConstraints12.gridwidth = 1;
        gridConstraints12.gridheight = 1;
        gridConstraints12.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints12.insets = new Insets(5, 15, 5, 15);

        GridBagConstraints gridConstraints13 = new GridBagConstraints();

        gridConstraints13.gridx = 0;
        gridConstraints13.gridy = 6;
        gridConstraints13.gridwidth = 3;
        gridConstraints13.gridheight = 1;
        gridConstraints13.ipadx = 270;
        gridConstraints13.ipady = 20;

        gridConstraints13.anchor = GridBagConstraints.NORTHWEST;
        gridConstraints13.insets = new Insets(5, 15, 15, 15);


        GridBagConstraints gridConstraints14 = new GridBagConstraints();

        gridConstraints14.gridx = 0;
        gridConstraints14.gridy = 7;
        gridConstraints14.gridwidth = 1;
        gridConstraints14.gridheight = 1;
        gridConstraints14.ipadx = 150;
        gridConstraints14.ipady = 40;
        gridConstraints14.anchor = GridBagConstraints.CENTER;
        gridConstraints14.insets = new Insets(5, 15, 5, 15);

        frame5.add(headingLabel2, gridConstraints7);
        frame5.add(label8, gridConstraints8);
        frame5.add(mass2, gridConstraints9);
        frame5.add(label9, gridConstraints10);
        frame5.add(initialTemperature, gridConstraints11);
        frame5.add(label10, gridConstraints12);
        frame5.add(finalTemperature, gridConstraints13);
        frame5.add(calculatebtn2, gridConstraints14);

        calculatebtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeatEnergy();
            }
        });

    }

    JFrame frame6 = new JFrame("SOLUTION");
    JLabel label11 = new JLabel("Heat Energy");


    public void HeatEnergy() {
        frame6.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame6.setSize(400, 449);
        frame6.setLayout(new GridBagLayout());
        frame6.setLocationRelativeTo(null);
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setVisible(true);

        label11.setFont(new Font("Gill Sans", Font.BOLD, 24));
        label11.setForeground(Color.darkGray);

        JPanel panel3 = new JPanel();

        JPanel panel4 = new JPanel();

        GridBagConstraints gridConstraints15 = new GridBagConstraints();

        gridConstraints15.gridx = 0;
        gridConstraints15.gridy = 1;
        gridConstraints15.gridwidth = 1;
        gridConstraints15.gridheight = 1;
        gridConstraints15.ipadx = 150;
        gridConstraints15.ipady = 50;
        gridConstraints15.anchor = GridBagConstraints.CENTER;
        gridConstraints15.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints gridConstraints16 = new GridBagConstraints();

        gridConstraints16.gridx = 0;
        gridConstraints16.gridy = 2;
        gridConstraints16.gridwidth = 1;
        gridConstraints16.gridheight = 1;
        gridConstraints16.ipadx = 80;
        gridConstraints16.ipady = 30;
        gridConstraints16.anchor = GridBagConstraints.CENTER;
        gridConstraints16.insets = new Insets(35, 15, 15, 15);


        frame6.add(panel3, gridConstraints15);

        panel3.add(label11, gridConstraints15);


        Energy energy = new Energy();
        try {
            float area2 = energy.heatEnergy(Float.parseFloat(mass2.getText()), Float.parseFloat(initialTemperature.getText()), Float.parseFloat(finalTemperature.getText()));
            JLabel label12 = new JLabel("Answer=" + area2 + "J");
            label12.setFont(new Font("Gill Sans", Font.BOLD, 24));
            label12.setForeground(Color.darkGray);

            frame6.add(panel4, gridConstraints16);
            panel4.add(label12, gridConstraints16);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }


    }
}



