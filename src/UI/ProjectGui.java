
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
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

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

    JButton HeatEnergyBtn = new JButton("Heat Energy");
    JButton workDoneBtn=new JButton("Workdone");
    JButton nuclearEnergyBtn=new JButton("Nuclear Energy");
    JButton backBtn=new JButton("Back");


    public void secondFrame(){
        frame2.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame2.setSize(295, 550);
        frame2.setLayout(new GridBagLayout());
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
//        frame2.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));

        label3.setFont(new Font("Gill Sans",Font.BOLD,20));
        label3.setForeground(Color.darkGray);

        backBtn.setFont(new Font("Gill Sans",Font.PLAIN,17));
        backBtn.setForeground(Color.darkGray);

        potentialEnergyBtn.setBackground(Color.blue);
        kineticEnergyBtn.setBackground(Color.blue);
        HeatEnergyBtn.setBackground(Color.blue);
        workDoneBtn.setBackground(Color.blue);
        nuclearEnergyBtn.setBackground(Color.blue);

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
        gridConstraints4.ipadx=60;
        gridConstraints4.ipady=30;
        gridConstraints4.insets = new Insets(25, 15, 15, 15);

        GridBagConstraints gridConstraints5=new GridBagConstraints();

        gridConstraints5.gridx=0;
        gridConstraints5.gridy=3;
        gridConstraints5.gridwidth=3;
        gridConstraints5.gridheight=1;
        gridConstraints5.anchor=GridBagConstraints.CENTER;
        gridConstraints5.ipadx=70;
        gridConstraints5.ipady=30;
        gridConstraints5.insets = new Insets(25, 15, 15, 15);
        //

        GridBagConstraints gridConstraints3=new GridBagConstraints();

        gridConstraints3.gridx=0;
        gridConstraints3.gridy=5;
        gridConstraints3.gridwidth=1;
        gridConstraints3.gridheight=1;
        gridConstraints3.anchor=GridBagConstraints.SOUTHWEST;
        gridConstraints3.insets = new Insets(25, 15, 15, 15);

        GridBagConstraints gridConstraints7=new GridBagConstraints();

        gridConstraints7.gridx=0;
        gridConstraints7.gridy=4;
        gridConstraints7.gridwidth=3;
        gridConstraints7.gridheight=1;
        gridConstraints7.anchor=GridBagConstraints.CENTER;
        gridConstraints7.ipadx=80;
        gridConstraints7.ipady=30;
        gridConstraints7.insets = new Insets(25, 15, 15, 15);

        GridBagConstraints gridConstraints8=new GridBagConstraints();

        gridConstraints8.gridx=0;
        gridConstraints8.gridy=5;
        gridConstraints8.gridwidth=3;
        gridConstraints8.gridheight=1;
        gridConstraints8.anchor=GridBagConstraints.CENTER;
        gridConstraints8.ipadx=80;
        gridConstraints8.ipady=30;
        gridConstraints8.insets = new Insets(25, 15, 15, 15);


        frame2.add(label3,gridConstraints);
        frame2.add(potentialEnergyBtn,gridConstraints2);
        frame2.add(kineticEnergyBtn, gridConstraints4);
        frame2.add(HeatEnergyBtn, gridConstraints5);
        frame2.add(workDoneBtn,gridConstraints7);
        frame2.add(nuclearEnergyBtn,gridConstraints8);


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

        HeatEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourthFrame();

            }
        });

        workDoneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sixthFrame();
            }
        });

        nuclearEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seventhFrameFrame();
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
    JButton exitBtnOne=new JButton("exit");

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


        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx=0;
        gridBagConstraints7.gridy=6;
        gridBagConstraints7.gridwidth=1;
        gridBagConstraints7.gridheight=1;
        gridBagConstraints7.ipadx=30;
        gridBagConstraints7.ipady=20;
        gridBagConstraints7.anchor=GridBagConstraints.NORTHWEST;
        gridBagConstraints7.insets = new Insets(5, 15, 5, 15);

        frame3.add(headingLabel,gridConstraints);
        frame3.add(label4,gridConstraints2);
        frame3.add(mass,gridConstraints3);
        frame3.add(label5,gridConstraints4);
        frame3.add(height,gridConstraints5);
        frame3.add(calculatebtn,gridConstraints6);
        frame3.add(exitBtnOne,gridBagConstraints7);

        calculatebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                potentialEnergy();
            }
        });
//        exitBtnOne.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame3.dispose();
//            }
//        });
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
    JButton exitBtnTwo=new JButton("exit");
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


        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx=0;
        gridBagConstraints7.gridy=6;
        gridBagConstraints7.gridwidth=1;
        gridBagConstraints7.gridheight=1;
        gridBagConstraints7.ipadx=30;
        gridBagConstraints7.ipady=20;
        gridBagConstraints7.anchor=GridBagConstraints.NORTHWEST;
        gridBagConstraints7.insets = new Insets(5, 15, 5, 15);

        Kframe3.add(KheadingLabel,KgridConstraints);
        Kframe3.add(Klabel4,KgridConstraints2);
        Kframe3.add(Kmass,KgridConstraints3);
        Kframe3.add(Klabel5,KgridConstraints4);
        Kframe3.add(velocity,KgridConstraints5);
        Kframe3.add(Kcalculatebtn,KgridConstraints6);
        Kframe3.add(exitBtnTwo,gridBagConstraints7);

        Kcalculatebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kineticEnergy();
            }
        });
    }

    JFrame Kframe4=new JFrame("SOLUTION");
    JLabel Klabel6=new JLabel("KINETIC ENERGY");



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
    JFrame frame5 = new JFrame("INPUT HEAT ENERGY");
    JLabel headingLabel2 = new JLabel("Enter the Details:");
    JLabel label8 = new JLabel("Enter Mass:");
    JLabel label9 = new JLabel("Enter Initial Temperature:");
    JLabel label10 = new JLabel("Enter Final Temperature:");
    JTextField mass2 = new JTextField();
    JTextField initialTemperature = new JTextField();
    JTextField finalTemperature = new JTextField();
    JButton calculatebtn2 = new JButton("CALCULATE");
    JButton exitBtnThree=new JButton("exit");
    public void fourthFrame() {
        frame5.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame5.setSize(700, 600);
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
        gridConstraints10.gridwidth = 1;
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
        gridConstraints12.gridwidth = 3;
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
        gridConstraints14.gridwidth = 3;
        gridConstraints14.gridheight = 1;
        gridConstraints14.ipadx = 150;
        gridConstraints14.ipady = 40;
        gridConstraints14.anchor = GridBagConstraints.CENTER;
        gridConstraints14.insets = new Insets(5, 15, 5, 15);


        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx=0;
        gridBagConstraints7.gridy=9;
        gridBagConstraints7.gridwidth=1;
        gridBagConstraints7.gridheight=1;
        gridBagConstraints7.ipadx=30;
        gridBagConstraints7.ipady=20;
        gridBagConstraints7.anchor=GridBagConstraints.NORTHWEST;
        gridBagConstraints7.insets = new Insets(5, 15, 5, 15);



        frame5.add(headingLabel2, gridConstraints7);
        frame5.add(label8, gridConstraints8);
        frame5.add(mass2, gridConstraints9);
        frame5.add(label9, gridConstraints10);
        frame5.add(initialTemperature, gridConstraints11);
        frame5.add(label10, gridConstraints12);
        frame5.add(finalTemperature, gridConstraints13);
        frame5.add(calculatebtn2, gridConstraints14);
        frame5.add(exitBtnThree,gridBagConstraints7);

        calculatebtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeatEnergy();
            }
        });

    }

    JFrame frame6 = new JFrame("SOLUTION");
    JLabel label11 = new JLabel("HEAT ENERGY");


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
    JFrame frame7=new JFrame("INPUT WORKDONE");
    JLabel headLabel = new JLabel("Enter the Details:");
    JLabel label2=new JLabel("Enter force:");
    JTextField force=new JTextField();

    JLabel label0=new JLabel("Enter distane:");
    JTextField distance=new JTextField();

    JButton solvebtn=new JButton("CALCULATE");
    JButton exitBtnFour = new JButton("exit");
    public void sixthFrame(){
        frame7.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame7.setSize(351, 457);
        frame7.setLayout(new GridBagLayout());
        frame7.setLocationRelativeTo(null);
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame7.setVisible(true);
//        frame3.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));

        label0.setFont(new Font("Gill Sans",Font.BOLD,24));
        label0.setForeground(Color.darkGray);

        headLabel.setFont(new Font("Gill Sans",Font.BOLD,24));
        headLabel.setForeground(Color.darkGray);

        label2.setFont(new Font("Gill Sans",Font.BOLD,24));
        label2.setForeground(Color.darkGray);

        solvebtn.setFont(new Font("Gill Sans",Font.PLAIN,17));
        solvebtn.setForeground(Color.darkGray);



        GridBagConstraints lgridConstraints=new GridBagConstraints();

        lgridConstraints.gridx=0;
        lgridConstraints.gridy=0;
        lgridConstraints.gridwidth=3;
        lgridConstraints.gridheight=1;
        lgridConstraints.anchor=GridBagConstraints.CENTER;
        lgridConstraints.insets = new Insets(5, 15, 20, 15);


        GridBagConstraints lgridConstraints2=new GridBagConstraints();

        lgridConstraints2.gridx=0;
        lgridConstraints2.gridy=1;
        lgridConstraints2.gridwidth=3;
        lgridConstraints2.gridheight=1;
        lgridConstraints2.anchor=GridBagConstraints.NORTHWEST;
        lgridConstraints2.insets = new Insets(5, 15, 10, 15);

        GridBagConstraints lgridConstraints3=new GridBagConstraints();

        lgridConstraints3.gridx=0;
        lgridConstraints3.gridy=2;
        lgridConstraints3.gridwidth=3;
        lgridConstraints3.gridheight=1;
        lgridConstraints3.ipadx=270;
        lgridConstraints3.ipady=20;
        lgridConstraints3.anchor=GridBagConstraints.NORTHWEST;
        lgridConstraints3.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints lgridConstraints4=new GridBagConstraints();

        lgridConstraints4.gridx=0;
        lgridConstraints4.gridy=3;
        lgridConstraints4.gridwidth=1;
        lgridConstraints4.gridheight=1;
        lgridConstraints4.anchor=GridBagConstraints.NORTHWEST;
        lgridConstraints4.insets = new Insets(5, 15, 5, 15);

        GridBagConstraints lgridConstraints5=new GridBagConstraints();

        lgridConstraints5.gridx=0;
        lgridConstraints5.gridy=4;
        lgridConstraints5.gridwidth=3;
        lgridConstraints5.gridheight=1;
        lgridConstraints5.ipadx=270;
        lgridConstraints5.ipady=20;

        lgridConstraints5.anchor=GridBagConstraints.NORTHWEST;
        lgridConstraints5.insets = new Insets(5, 15, 15, 15);


        GridBagConstraints lgridConstraints6=new GridBagConstraints();

        lgridConstraints6.gridx=0;
        lgridConstraints6.gridy=5;
        lgridConstraints6.gridwidth=1;
        lgridConstraints6.gridheight=1;
        lgridConstraints6.ipadx=150;
        lgridConstraints6.ipady=40;
        lgridConstraints6.anchor=GridBagConstraints.CENTER;
        lgridConstraints6.insets = new Insets(5, 15, 5, 15);


        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx=0;
        gridBagConstraints7.gridy=6;
        gridBagConstraints7.gridwidth=1;
        gridBagConstraints7.gridheight=1;
        gridBagConstraints7.ipadx=30;
        gridBagConstraints7.ipady=20;
        gridBagConstraints7.anchor=GridBagConstraints.NORTHWEST;
        gridBagConstraints7.insets = new Insets(5, 15, 5, 15);

        frame7.add(headLabel,lgridConstraints);
        frame7.add(label0,lgridConstraints2);
        frame7.add(force,lgridConstraints3);
        frame7.add(label2,lgridConstraints4);
        frame7.add(distance,lgridConstraints5);
        frame7.add(solvebtn,lgridConstraints6);
        frame7.add(exitBtnFour, gridBagConstraints7);

        solvebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                workDone();
            }
        });
    }

    JFrame frame0=new JFrame("SOLUTION");
    JLabel label=new JLabel("workdone");



    public void workDone() {
        frame0.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame0.setSize(400, 449);
        frame0.setLayout(new GridBagLayout());
        frame0.setLocationRelativeTo(null);
        frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame0.setVisible(true);

        label.setFont(new Font("Gill Sans", Font.BOLD, 24));
        label.setForeground(Color.darkGray);

        JPanel panel = new JPanel();

        JPanel panel2 = new JPanel();

        GridBagConstraints lgridConstraints = new GridBagConstraints();

        lgridConstraints.gridx = 0;
        lgridConstraints.gridy = 1;
        lgridConstraints.gridwidth = 1;
        lgridConstraints.gridheight = 1;
        lgridConstraints.ipadx = 150;
        lgridConstraints.ipady = 50;
        lgridConstraints.anchor = GridBagConstraints.CENTER;
        lgridConstraints.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints lgridConstraints2 = new GridBagConstraints();

        lgridConstraints2.gridx = 0;
        lgridConstraints2.gridy = 2;
        lgridConstraints2.gridwidth = 1;
        lgridConstraints2.gridheight = 1;
        lgridConstraints2.ipadx = 80;
        lgridConstraints2.ipady = 30;
        lgridConstraints2.anchor = GridBagConstraints.CENTER;
        lgridConstraints2.insets = new Insets(35, 15, 15, 15);


        frame0.add(panel, lgridConstraints);

        panel.add(label, lgridConstraints);


        Energy energy = new Energy();
        try {
            float area = energy.workDone(Float.parseFloat(force.getText()), Float.parseFloat(distance.getText()));
            JLabel label = new JLabel("Answer=" + area + "J");
            label.setFont(new Font("Gill Sans", Font.BOLD, 24));
            label.setForeground(Color.darkGray);

            frame0.add(panel2, lgridConstraints2);
            panel2.add(label, lgridConstraints2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }
    JFrame frame8=new JFrame("INPUT Nuclear Energy:");
    JLabel headLabel2 = new JLabel("Enter the Details:");
    JLabel newLabel=new JLabel("Enter MASS:");
    JTextField newTextField=new JTextField();
    JButton exitBtnFive = new JButton("exit");

    JButton nuclEngsolvebtn=new JButton("CALCULATE");
    public void seventhFrameFrame(){
        frame8.getContentPane().setBackground(new Color(4, 51, 255, 194));
        frame8.setSize(351, 457);
        frame8.setLayout(new GridBagLayout());
        frame8.setLocationRelativeTo(null);
        frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame8.setVisible(true);
//        frame3.setShape(new RoundRectangle2D.Float(0, 0, frame2.getWidth(), frame2.getHeight(), 20, 20));


        headLabel2.setFont(new Font("Gill Sans",Font.BOLD,24));
        headLabel2.setForeground(Color.darkGray);

        label2.setFont(new Font("Gill Sans",Font.BOLD,24));
        label2.setForeground(Color.darkGray);

        solvebtn.setFont(new Font("Gill Sans",Font.PLAIN,17));
        solvebtn.setForeground(Color.darkGray);



        GridBagConstraints lgridConstraints=new GridBagConstraints();

        lgridConstraints.gridx=0;
        lgridConstraints.gridy=0;
        lgridConstraints.gridwidth=3;
        lgridConstraints.gridheight=1;
        lgridConstraints.anchor=GridBagConstraints.CENTER;
        lgridConstraints.insets = new Insets(5, 15, 20, 15);


        GridBagConstraints lgridConstraints2=new GridBagConstraints();

        lgridConstraints2.gridx=0;
        lgridConstraints2.gridy=1;
        lgridConstraints2.gridwidth=3;
        lgridConstraints2.gridheight=1;
        lgridConstraints2.anchor=GridBagConstraints.NORTHWEST;
        lgridConstraints2.insets = new Insets(5, 15, 10, 15);

        GridBagConstraints lgridConstraints3=new GridBagConstraints();

        lgridConstraints3.gridx=0;
        lgridConstraints3.gridy=2;
        lgridConstraints3.gridwidth=3;
        lgridConstraints3.gridheight=1;
        lgridConstraints3.ipadx=270;
        lgridConstraints3.ipady=20;
        lgridConstraints3.anchor=GridBagConstraints.NORTHWEST;
        lgridConstraints3.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints lgridConstraints4=new GridBagConstraints();

        lgridConstraints4.gridx=0;
        lgridConstraints4.gridy=3;
        lgridConstraints4.gridwidth=1;
        lgridConstraints4.gridheight=1;
        lgridConstraints4.anchor=GridBagConstraints.NORTHWEST;
        lgridConstraints4.insets = new Insets(5, 15, 5, 15);

        GridBagConstraints lgridConstraints5=new GridBagConstraints();

        lgridConstraints5.gridx=0;
        lgridConstraints5.gridy=4;
        lgridConstraints5.gridwidth=3;
        lgridConstraints5.gridheight=1;
        lgridConstraints5.ipadx=270;
        lgridConstraints5.ipady=20;

        lgridConstraints5.anchor=GridBagConstraints.NORTHWEST;
        lgridConstraints5.insets = new Insets(5, 15, 15, 15);


        GridBagConstraints lgridConstraints6=new GridBagConstraints();

        lgridConstraints6.gridx=0;
        lgridConstraints6.gridy=5;
        lgridConstraints6.gridwidth=1;
        lgridConstraints6.gridheight=1;
        lgridConstraints6.ipadx=150;
        lgridConstraints6.ipady=40;
        lgridConstraints6.anchor=GridBagConstraints.CENTER;
        lgridConstraints6.insets = new Insets(5, 15, 5, 15);

        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx=0;
        gridBagConstraints7.gridy=6;
        gridBagConstraints7.gridwidth=1;
        gridBagConstraints7.gridheight=1;
        gridBagConstraints7.ipadx=30;
        gridBagConstraints7.ipady=20;
        gridBagConstraints7.anchor=GridBagConstraints.NORTHWEST;
        gridBagConstraints7.insets = new Insets(5, 15, 5, 15);

        frame8.add(headLabel2,lgridConstraints);
        frame8.add(newLabel,lgridConstraints4);
        frame8.add(solvebtn,lgridConstraints6);
        frame8.add(newTextField,lgridConstraints5);
        frame8.add(exitBtnFive, gridBagConstraints7);

        solvebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nuclearEnergy();
            }
        });
    }

    JFrame nuclEngFrame=new JFrame("SOLUTION");
    JLabel nuclEngLabel=new JLabel("Nuclear Energy");



    public void nuclearEnergy() {
        nuclEngFrame.getContentPane().setBackground(new Color(4, 51, 255, 194));
        nuclEngFrame.setSize(400, 449);
        nuclEngFrame.setLayout(new GridBagLayout());
        nuclEngFrame.setLocationRelativeTo(null);
        nuclEngFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nuclEngFrame.setVisible(true);

        nuclEngLabel.setFont(new Font("Gill Sans", Font.BOLD, 24));
        nuclEngLabel.setForeground(Color.darkGray);

        JPanel panel = new JPanel();

        JPanel panel2 = new JPanel();

        GridBagConstraints lgridConstraints = new GridBagConstraints();

        lgridConstraints.gridx = 0;
        lgridConstraints.gridy = 1;
        lgridConstraints.gridwidth = 1;
        lgridConstraints.gridheight = 1;
        lgridConstraints.ipadx = 150;
        lgridConstraints.ipady = 50;
        lgridConstraints.anchor = GridBagConstraints.CENTER;
        lgridConstraints.insets = new Insets(5, 15, 20, 15);

        GridBagConstraints lgridConstraints2 = new GridBagConstraints();

        lgridConstraints2.gridx = 0;
        lgridConstraints2.gridy = 2;
        lgridConstraints2.gridwidth = 1;
        lgridConstraints2.gridheight = 1;
        lgridConstraints2.ipadx = 80;
        lgridConstraints2.ipady = 30;
        lgridConstraints2.anchor = GridBagConstraints.CENTER;
        lgridConstraints2.insets = new Insets(35, 15, 15, 15);


        nuclEngFrame.add(panel, lgridConstraints);

        panel.add(nuclEngLabel, lgridConstraints);


        Energy energy = new Energy();
        try {
            double area = energy.nuclearEnergy(Float.parseFloat(newTextField.getText()));
            JLabel label = new JLabel("Answer=" + area + "J");
            label.setFont(new Font("Gill Sans", Font.BOLD, 24));
            label.setForeground(Color.darkGray);

            nuclEngFrame.add(panel2, lgridConstraints2);
            panel2.add(label, lgridConstraints2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }
    }



