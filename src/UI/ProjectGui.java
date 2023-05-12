
package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.geom.RoundRectangle2D;

public class ProjectGui{
    JFrame frame = new JFrame("CALCULATOR HOME");

    JLabel label1 = new JLabel(new ImageIcon("src/UI/physics.png"));//physics.png
    JLabel text1=new JLabel(" Welcome to Code");
    JLabel text2=new JLabel(" Soarers Physics ");
    JLabel text3=new JLabel(" Energy");
    JLabel text4=new JLabel(" Calculator GUI");
    JButton button1 = new JButton("Click to Continue");

    public void mainUI(){

        frame.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame.setSize(350,600);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        label1.setPreferredSize(new Dimension(200,200)); //////////////////////////////


        text1.setFont(new Font("Gill Sans",Font.BOLD,25));
        text1.setForeground(Color.darkGray);

        text2.setFont(new Font("Gill Sans",Font.BOLD,25));
        text2.setForeground(Color.darkGray);

        text3.setFont(new Font("Gill Sans",Font.BOLD,25));
        text3.setForeground(Color.darkGray);

        text4.setFont(new Font("Gill Sans",Font.BOLD,25));
        text4.setForeground(Color.darkGray);

        button1.setFont(new Font("Gill Sans",Font.PLAIN,17));
        button1.setForeground(Color.darkGray);


        GridBagConstraints gridConstraints=new GridBagConstraints();

        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        gridConstraints.gridwidth=1;
        gridConstraints.gridheight=1;
        gridConstraints.anchor=GridBagConstraints.CENTER;
        gridConstraints.insets = new Insets(25, 15, 15, 15);


        GridBagConstraints textConstraint=new GridBagConstraints();

        textConstraint.gridx=0;
        textConstraint.gridy=1;
        textConstraint.gridwidth=1;
        textConstraint.gridheight=1;
        textConstraint.fill = GridBagConstraints.NONE;
        textConstraint.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints textConstraint1=new GridBagConstraints();

        textConstraint1.gridx=0;
        textConstraint1.gridy=2;
        textConstraint1.gridwidth=1;
        textConstraint1.gridheight=1;
        textConstraint1.fill = GridBagConstraints.NONE;
        textConstraint1.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints textConstraint2=new GridBagConstraints();

        textConstraint2.gridx=0;
        textConstraint2.gridy=3;
        textConstraint2.gridwidth=1;
        textConstraint2.gridheight=1;
        textConstraint2.fill = GridBagConstraints.NONE;
        textConstraint2.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints textConstraint3=new GridBagConstraints();

        textConstraint3.gridx=0;
        textConstraint3.gridy=4;
        textConstraint3.gridwidth=1;
        textConstraint3.gridheight=1;
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





        frame.add(label1,gridConstraints);
        frame.add(text1,textConstraint);
        frame.add(text2,textConstraint1);
        frame.add(text3,textConstraint2);
        frame.add(text4,textConstraint3);
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

    JFrame frame2=new JFrame("HOME PAGE");
    JLabel label3=new JLabel("Choose a Formula:");
    JButton potentialEnergyBtn=new JButton("Potential Energy");
    JButton kineticEnergyBtn=new JButton("Kinetic Energy");

    JButton backBtn=new JButton("Back");


    public void secondFrame(){
        frame2.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame2.setSize(295, 449);
        frame2.setLayout(new GridBagLayout());
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
//        frame2.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));

        label3.setFont(new Font("Gill Sans",Font.BOLD,20));
        label3.setForeground(Color.darkGray);

        backBtn.setFont(new Font("Gill Sans",Font.PLAIN,17));
        backBtn.setForeground(Color.darkGray);

        potentialEnergyBtn.setBorderPainted(false);

        GridBagConstraints gridConstraints=new GridBagConstraints();

        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        gridConstraints.gridwidth=1;
        gridConstraints.gridheight=1;
        gridConstraints.anchor=GridBagConstraints.CENTER;
        gridConstraints.insets = new Insets(25, 15, 15, 15);


        GridBagConstraints gridConstraints2=new GridBagConstraints();

        gridConstraints2.gridx=0;
        gridConstraints2.gridy=1;
        gridConstraints2.gridwidth=3;
        gridConstraints2.gridheight=1;
        gridConstraints2.anchor=GridBagConstraints.CENTER;
        gridConstraints2.ipadx=50;
        gridConstraints2.ipady=30;
        gridConstraints2.insets = new Insets(25, 15, 15, 15);


        //
        GridBagConstraints gridConstraints4=new GridBagConstraints();

        gridConstraints4.gridx=0;
        gridConstraints4.gridy=2;
        gridConstraints4.gridwidth=3;
        gridConstraints4.gridheight=1;
        gridConstraints4.anchor=GridBagConstraints.CENTER;
        gridConstraints4.ipadx=50;
        gridConstraints4.ipady=30;
        gridConstraints2.insets = new Insets(25, 15, 15, 15);
        //

        GridBagConstraints gridConstraints3=new GridBagConstraints();

        gridConstraints3.gridx=0;
        gridConstraints3.gridy=3;
        gridConstraints3.gridwidth=1;
        gridConstraints3.gridheight=1;
        gridConstraints3.anchor=GridBagConstraints.SOUTHWEST;
        gridConstraints3.insets = new Insets(25, 15, 15, 15);


        frame2.add(label3,gridConstraints);
        frame2.add(potentialEnergyBtn,gridConstraints2);
        frame2.add(kineticEnergyBtn, gridConstraints4);


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


        kineticEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forthFrame();
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
            }
        });
    }


    // POTENTIAL ENERGY HERE
    //
    //
    //


    JFrame frame3=new JFrame("INPUT POTENTIAL ENERGY");
    JLabel headingLabel=new JLabel("Enter the Details:");
    JLabel label4=new JLabel("Enter Mass:");
    JTextField mass=new JTextField();

    JLabel label5=new JLabel("Enter Height:");
    JTextField height=new JTextField();

    JButton calculatebtn=new JButton("CALCULATE");
    public void thirdFrame(){
        frame3.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame3.setSize(351, 457);
        frame3.setLayout(new GridBagLayout());
        frame3.setLocationRelativeTo(null);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
//        frame3.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));

        label4.setFont(new Font("Gill Sans",Font.BOLD,24));
        label4.setForeground(Color.darkGray);

        headingLabel.setFont(new Font("Gill Sans",Font.BOLD,24));
        headingLabel.setForeground(Color.darkGray);

        label5.setFont(new Font("Gill Sans",Font.BOLD,24));
        label5.setForeground(Color.darkGray);

        calculatebtn.setFont(new Font("Gill Sans",Font.PLAIN,17));
        calculatebtn.setForeground(Color.darkGray);



        GridBagConstraints gridConstraints=new GridBagConstraints();

        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        gridConstraints.gridwidth=3;
        gridConstraints.gridheight=1;
        gridConstraints.anchor=GridBagConstraints.CENTER;
        gridConstraints.insets = new Insets(5, 15, 20, 15);


        GridBagConstraints gridConstraints2=new GridBagConstraints();

        gridConstraints2.gridx=0;
        gridConstraints2.gridy=1;
        gridConstraints2.gridwidth=3;
        gridConstraints2.gridheight=1;
        gridConstraints2.anchor=GridBagConstraints.NORTHWEST;
        gridConstraints2.insets = new Insets(5, 15, 10, 15);

        GridBagConstraints gridConstraints3=new GridBagConstraints();

        gridConstraints3.gridx=0;
        gridConstraints3.gridy=2;
        gridConstraints3.gridwidth=3;
        gridConstraints3.gridheight=1;
        gridConstraints3.ipadx=270;
        gridConstraints3.ipady=20;
        gridConstraints3.anchor=GridBagConstraints.NORTHWEST;
        gridConstraints3.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints gridConstraints4=new GridBagConstraints();

        gridConstraints4.gridx=0;
        gridConstraints4.gridy=3;
        gridConstraints4.gridwidth=1;
        gridConstraints4.gridheight=1;
        gridConstraints4.anchor=GridBagConstraints.NORTHWEST;
        gridConstraints4.insets = new Insets(5, 15, 5, 15);

        GridBagConstraints gridConstraints5=new GridBagConstraints();

        gridConstraints5.gridx=0;
        gridConstraints5.gridy=4;
        gridConstraints5.gridwidth=3;
        gridConstraints5.gridheight=1;
        gridConstraints5.ipadx=270;
        gridConstraints5.ipady=20;

        gridConstraints5.anchor=GridBagConstraints.NORTHWEST;
        gridConstraints5.insets = new Insets(5, 15, 15, 15);


        GridBagConstraints gridConstraints6=new GridBagConstraints();

        gridConstraints6.gridx=0;
        gridConstraints6.gridy=5;
        gridConstraints6.gridwidth=1;
        gridConstraints6.gridheight=1;
        gridConstraints6.ipadx=150;
        gridConstraints6.ipady=40;
        gridConstraints6.anchor=GridBagConstraints.CENTER;
        gridConstraints6.insets = new Insets(5, 15, 5, 15);

        frame3.add(headingLabel,gridConstraints);
        frame3.add(label4,gridConstraints2);
        frame3.add(mass,gridConstraints3);
        frame3.add(label5,gridConstraints4);
        frame3.add(height,gridConstraints5);
        frame3.add(calculatebtn,gridConstraints6);

        calculatebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                potentialEnergy();
            }
        });
    }

    JFrame frame4=new JFrame("SOLUTION");
    JLabel label6=new JLabel("Potential Energy");



    public void potentialEnergy(){
        frame4.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame4.setSize(400, 449);
        frame4.setLayout(new GridBagLayout());
        frame4.setLocationRelativeTo(null);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setVisible(true);

        label6.setFont(new Font("Gill Sans",Font.BOLD,24));
        label6.setForeground(Color.darkGray);

        JPanel panel=new JPanel();

        JPanel panel2=new JPanel();

        GridBagConstraints gridConstraints=new GridBagConstraints();

        gridConstraints.gridx=0;
        gridConstraints.gridy=1;
        gridConstraints.gridwidth=1;
        gridConstraints.gridheight=1;
        gridConstraints.ipadx=150;
        gridConstraints.ipady=50;
        gridConstraints.anchor=GridBagConstraints.CENTER;
        gridConstraints.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints gridConstraints2=new GridBagConstraints();

        gridConstraints2.gridx=0;
        gridConstraints2.gridy=2;
        gridConstraints2.gridwidth=1;
        gridConstraints2.gridheight=1;
        gridConstraints2.ipadx=80;
        gridConstraints2.ipady=30;
        gridConstraints2.anchor=GridBagConstraints.CENTER;
        gridConstraints2.insets = new Insets(35, 15, 15, 15);


        frame4.add(panel,gridConstraints);

        panel.add(label6,gridConstraints);


        Energy energy=new Energy();
        try{
            float area=energy.potentialEnergy(Float.parseFloat(mass.getText()),Float.parseFloat(height.getText()));
            JLabel label7=new JLabel("Answer="+area+"J");
            label7.setFont(new Font("Gill Sans",Font.BOLD,24));
            label7.setForeground(Color.darkGray);

            frame4.add(panel2,gridConstraints2);
            panel2.add(label7,gridConstraints2);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"ERROR!");
        }



    }















    // KINETIC ENERGY HERE
    //
    //


    JFrame Kframe3=new JFrame("INPUT KINETIC ENERGY");
    JLabel KheadingLabel=new JLabel("Enter the Details:");
    JLabel Klabel4=new JLabel("Enter Mass:");
    JTextField Kmass=new JTextField();

    JLabel Klabel5=new JLabel("Enter velocity:");
    JTextField velocity=new JTextField();

    JButton Kcalculatebtn=new JButton("CALCULATE");
    public void forthFrame(){
        Kframe3.getContentPane().setBackground(new Color(4, 51, 255, 194));
        Kframe3.setSize(351, 457);
        Kframe3.setLayout(new GridBagLayout());
        Kframe3.setLocationRelativeTo(null);
        Kframe3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Kframe3.setVisible(true);
//        frame3.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));

        Klabel4.setFont(new Font("Gill Sans",Font.BOLD,24));
        Klabel4.setForeground(Color.darkGray);

        KheadingLabel.setFont(new Font("Gill Sans",Font.BOLD,24));
        KheadingLabel.setForeground(Color.darkGray);

        Klabel5.setFont(new Font("Gill Sans",Font.BOLD,24));
        Klabel5.setForeground(Color.darkGray);

        Kcalculatebtn.setFont(new Font("Gill Sans",Font.PLAIN,17));
        Kcalculatebtn.setForeground(Color.darkGray);



        GridBagConstraints KgridConstraints=new GridBagConstraints();

        KgridConstraints.gridx=0;
        KgridConstraints.gridy=0;
        KgridConstraints.gridwidth=3;
        KgridConstraints.gridheight=1;
        KgridConstraints.anchor=GridBagConstraints.CENTER;
        KgridConstraints.insets = new Insets(5, 15, 20, 15);


        GridBagConstraints KgridConstraints2=new GridBagConstraints();

        KgridConstraints2.gridx=0;
        KgridConstraints2.gridy=1;
        KgridConstraints2.gridwidth=3;
        KgridConstraints2.gridheight=1;
        KgridConstraints2.anchor=GridBagConstraints.NORTHWEST;
        KgridConstraints2.insets = new Insets(5, 15, 10, 15);

        GridBagConstraints KgridConstraints3=new GridBagConstraints();

        KgridConstraints3.gridx=0;
        KgridConstraints3.gridy=2;
        KgridConstraints3.gridwidth=3;
        KgridConstraints3.gridheight=1;
        KgridConstraints3.ipadx=270;
        KgridConstraints3.ipady=20;
        KgridConstraints3.anchor=GridBagConstraints.NORTHWEST;
        KgridConstraints3.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints KgridConstraints4=new GridBagConstraints();

        KgridConstraints4.gridx=0;
        KgridConstraints4.gridy=3;
        KgridConstraints4.gridwidth=1;
        KgridConstraints4.gridheight=1;
        KgridConstraints4.anchor=GridBagConstraints.NORTHWEST;
        KgridConstraints4.insets = new Insets(5, 15, 5, 15);

        GridBagConstraints KgridConstraints5=new GridBagConstraints();

        KgridConstraints5.gridx=0;
        KgridConstraints5.gridy=4;
        KgridConstraints5.gridwidth=3;
        KgridConstraints5.gridheight=1;
        KgridConstraints5.ipadx=270;
        KgridConstraints5.ipady=20;

        KgridConstraints5.anchor=GridBagConstraints.NORTHWEST;
        KgridConstraints5.insets = new Insets(5, 15, 15, 15);


        GridBagConstraints KgridConstraints6=new GridBagConstraints();

        KgridConstraints6.gridx=0;
        KgridConstraints6.gridy=5;
        KgridConstraints6.gridwidth=1;
        KgridConstraints6.gridheight=1;
        KgridConstraints6.ipadx=150;
        KgridConstraints6.ipady=40;
        KgridConstraints6.anchor=GridBagConstraints.CENTER;
        KgridConstraints6.insets = new Insets(5, 15, 5, 15);

        Kframe3.add(KheadingLabel,KgridConstraints);
        Kframe3.add(Klabel4,KgridConstraints2);
        Kframe3.add(Kmass,KgridConstraints3);
        Kframe3.add(Klabel5,KgridConstraints4);
        Kframe3.add(velocity,KgridConstraints5);
        Kframe3.add(Kcalculatebtn,KgridConstraints6);

        Kcalculatebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kineticEnergy();
            }
        });
    }

    JFrame Kframe4=new JFrame("SOLUTION");
    JLabel Klabel6=new JLabel("kinetic Energy");



    public void kineticEnergy(){
        Kframe4.getContentPane().setBackground(new Color(4, 51, 255, 194));
        Kframe4.setSize(400, 449);
        Kframe4.setLayout(new GridBagLayout());
        Kframe4.setLocationRelativeTo(null);
        Kframe4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Kframe4.setVisible(true);

        Klabel6.setFont(new Font("Gill Sans",Font.BOLD,24));
        Klabel6.setForeground(Color.darkGray);

        JPanel Kpanel = new JPanel();

        JPanel Kpanel2 = new JPanel();

        GridBagConstraints AgridConstraints=new GridBagConstraints();

        AgridConstraints.gridx=0;
        AgridConstraints.gridy=1;
        AgridConstraints.gridwidth=1;
        AgridConstraints.gridheight=1;
        AgridConstraints.ipadx=150;
        AgridConstraints.ipady=50;
        AgridConstraints.anchor=GridBagConstraints.CENTER;
        AgridConstraints.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints AgridConstraints2=new GridBagConstraints();

        AgridConstraints2.gridx=0;
        AgridConstraints2.gridy=2;
        AgridConstraints2.gridwidth=1;
        AgridConstraints2.gridheight=1;
        AgridConstraints2.ipadx=80;
        AgridConstraints2.ipady=30;
        AgridConstraints2.anchor=GridBagConstraints.CENTER;
        AgridConstraints2.insets = new Insets(35, 15, 15, 15);


        Kframe4.add(Kpanel,AgridConstraints);

        Kpanel.add(Klabel6,AgridConstraints);


        Energy energy=new Energy();
        try{
            float area=energy.kineticEnergy(Float.parseFloat(Kmass.getText()),Float.parseFloat(velocity.getText()));
            JLabel Klabel7=new JLabel("Answer="+area+"J");
            Klabel7.setFont(new Font("Gill Sans",Font.BOLD,24));
            Klabel7.setForeground(Color.darkGray);

            Kframe4.add(Kpanel2,AgridConstraints2);
            Kpanel2.add(Klabel7,AgridConstraints2);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"ERROR!");
        }



    }



}



