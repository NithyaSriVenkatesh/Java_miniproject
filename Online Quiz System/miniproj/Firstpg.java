package Miniproj;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.*;
import java.sql.*;
//import com.mysql.*;
import com.mysql.jdbc.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer.*;
import java.util.Random;
import java.lang.Thread;

class Frontpg extends JFrame
{
    Frontpg()
    {
        JButton b1;
        JButton b2;
        JButton b3;
        JLabel background = null;
        JFrame f = new JFrame();

        f.setTitle("ONLINE QUIZ SYSTEM - HOME PAGE");
        //f.setSize(4000,4000);
        // f.pack();
        f.setVisible(true);
        f.setResizable(false);
        JLabel n=new JLabel("MSEC ");
        n.setFont(new Font("BOLD", Font.PLAIN, 30));
        n.setSize(500, 50);
        n.setLocation(130, 80);

        JLabel n2=new JLabel(" ONLINE");
        n2.setFont(new Font("BOLD", Font.PLAIN, 30));
        n2.setSize(500, 50);
        n2.setLocation(190, 130);

        JLabel n3=new JLabel(" QUIZ ");
        n3.setFont(new Font("BOLD", Font.PLAIN, 30));
        n3.setSize(500, 50);
        n3.setLocation(280, 180);

        JLabel n4=new JLabel("SYSTEM");
        n4.setFont(new Font("BOLD", Font.PLAIN, 30));
        n4.setSize(500, 50);
        n4.setLocation(360, 230);

        JLabel apo=null;
        ImageIcon img1= new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj quiz system\\logo.png");
        apo=new JLabel(img1);
        apo.setBounds(-200,-195,600,600);



        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\logo.png");
        f.setIconImage(icon);
        f.setLayout(null);

        f.setLayout(new BorderLayout());
        ImageIcon img= new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\ho.jpg");
        background=new JLabel(img);
        background.setBounds(0,0,600,300);
        background.setLayout(new FlowLayout());

        f.add(n);
        f.add(n2);
        f.add(n3);
        f.add(n4);
        f.add(apo);
        f.add(background);
        b1 = new JButton("Register");
        //b1.setBounds(40, 150, 95, 30);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                Registerpg();
            }});
        b2 = new JButton("Login");
        //b2.setBounds(80, 150, 95, 30);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                Adminlogin();
            }});
        b3=new JButton("Exit");
        //b3.setBounds(120, 150, 95, 30);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {

                int a=JOptionPane.showConfirmDialog(f,"Are you sure ?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){

                    System.exit(0);
                }
            }});

        background.add(b1);
        background.add(b2);
        background.add(b3);
        f.setBounds(300,90,600, 400);
    }

    void Adminlogin() {
        JLabel l1, l2;
        JButton b;
        String Username;
        String  password;
        JFrame jf = new JFrame("LOGIN PAGE");
        jf.setBounds(300, 90, 900, 600);
        jf.setResizable(false);
        JTextField t1;
        t1 = new JTextField(12);
        t1.setBounds(100, 50, 100, 30);
        JLabel la1 = new JLabel("Username");
        la1.setBounds(20, 50, 80, 30);
        JPasswordField value = new JPasswordField();
        JLabel la2 = new JLabel("Password");
        la2.setBounds(20, 100, 80, 30);
        value.setBounds(100, 100, 100, 30);
        JLabel la3=new JLabel("   ");
        la3.setBounds(100, 130, 80, 30);
        Username=t1.getText();
        System.out.println(Username);
        password=String.valueOf(value.getPassword());
        jf.add(value);
        jf.add(la1);
        jf.add(la2);
        jf.add(la3);
        jf.add(t1);
        jf.setLayout(null);
        jf.setVisible(true);
        b = new JButton("login");
        b.setBounds(40, 180, 95, 30);
        jf.add(b);
        jf.setSize(400, 400);
        JRadioButton r1 = new JRadioButton(" Admin");
        JRadioButton r2 = new JRadioButton(" Student");
        r1.setBounds(30, 20, 75, 30);
        r2.setBounds(130, 20, 75, 30);
        //r1.setBackground(new Color(0,0,0,0));
        //r2.setBackground(new Color(0,0,0,0));

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        jf.add(r1);
        jf.add(r2);
        r1.setOpaque(false);
        r1.setContentAreaFilled(false);
        r1.setBorderPainted(false);
        r2.setOpaque(false);
        r2.setContentAreaFilled(false);
        r2.setBorderPainted(false);
        JCheckBox cb1 = new JCheckBox("Show password", false);
        cb1.setOpaque(false);
        cb1.setContentAreaFilled(false);
        cb1.setBorderPainted(false);

        jf.add(cb1);

        ImageIcon img2=new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\admin1.jpg");
        JLabel bgimg=new JLabel(img2);
        bgimg.setBounds(0, 0, 900, 600);
        jf.add(bgimg);

        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb1.isSelected())
                {
                    la3.setText(String.valueOf(value.getPassword()));
                }
                else {
                    la3.setText("  ");
                }
            }
        });

        cb1.setBounds(230,100, 150,50);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(r2.isSelected()) {
                    Connection con1=null;
                    Statement st1=null;
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");
                        //System.out.println("Creating database...");
                        st1 = con1.createStatement();
                        String sql3 = "USE STUDENT";
                        st1.executeUpdate(sql3);
                        String sq = "SELECT COUNT(*) FROM REGISTER";
                        ResultSet rs = st1.executeQuery(sq);
                        int row_count = 0;
                        while (rs.next()) {
                            row_count = rs.getInt(1  );
                            System.out.println("rs loop" + row_count);
                        }

                        int max_un = 1000 + row_count;
                        //System.out.println("Outsidde rs loop 1");
                        //System.out.println(Username);
                        int us=Integer.parseInt(t1.getText());
                        //System.out.println("Outsidde rs loop 2");
                        System.out.println(us);
                        System.out.println(max_un);
                        if(us>1000&us<=max_un)
                        {
                            int row_no=us-1000;
                            System.out.println("sri");
                            System.out.println(us);
                            String sq1="SELECT PASSWORD FROM REGISTER WHERE USERNAME="+us;
                            ResultSet rs1 = st1.executeQuery(sq1);
                            String ps="";
                            while (rs1.next())
                            {
                                ps=rs1.getString(1);
                                //System.out.println(ps);
                            }
                            if(ps.equals(String.valueOf(value.getPassword())))
                            {
                                jf.setVisible(false);
                                jf.dispose();
                                user2(us);
                            }
                            /*else if (t1.getText().equals("") || String.valueOf(value.getPassword()).equals(""))
                            {
                                JOptionPane.showMessageDialog(jf, "Don't leave the fields empty.Enter the username/password", "Oops", JOptionPane.ERROR_MESSAGE);
                            }*/
                            else {
                                JOptionPane.showMessageDialog(jf, "Invalid Username/Password.Try again with right Username/Password.", "Oops", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        if (t1.getText().equals("") || String.valueOf(value.getPassword()).equals(""))
                        {
                            JOptionPane.showMessageDialog(jf, "Don't leave the fields empty.Enter the username/password", "Oops", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    catch (Exception e2)
                    {
                        System.out.println(e2);
                    }
                }
                else if(r1.isSelected())
                {
                    String admin_ps = "admin";
                    if(admin_ps.equals(String.valueOf(value.getPassword())) & admin_ps.equals(t1.getText()))
                    {
                        jf.setVisible(false);
                        jf.dispose();
                        Adminpg();
                    }
                    else if (t1.getText().equals("") || String.valueOf(value.getPassword()).equals(""))
                    {
                        JOptionPane.showMessageDialog(jf, "Don't leave the fields empty.Enter the username/password", "Oops", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(jf, "Invalid Username/Password.Try again with right Username/Password.", "Oops", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(jf, "Select student / admin", "Oops", JOptionPane.ERROR_MESSAGE);
                }
            }});
    }

    void user2(int us1)
    {
        JLabel l1, l2;
        JButton b;
        String Username;
        String  password;
        JFrame jf2 = new JFrame("USER-2 LOGIN PAGE");
        jf2.setBounds(300, 90, 900, 600);
        jf2.setResizable(false);
        JTextField t1;
        t1 = new JTextField(12);
        t1.setBounds(100, 50, 100, 30);
        JLabel la1 = new JLabel("Username");
        la1.setBounds(20, 50, 80, 30);
        JPasswordField value = new JPasswordField();
        JLabel la2 = new JLabel("Password");
        la2.setBounds(20, 100, 80, 30);
        value.setBounds(100, 100, 100, 30);
        JLabel la3=new JLabel("   ");
        la3.setBounds(100, 130, 80, 30);
        Username=t1.getText();
        System.out.println(Username);
        password=String.valueOf(value.getPassword());
        //System.out.println(password);
        //char result[] = new char[password.length];
        jf2.add(value);
        jf2.add(la1);
        jf2.add(la2);
        jf2.add(t1);
        jf2.add(la3);
        jf2.setLayout(null);
        jf2.setVisible(true);
        b = new JButton("login");
        b.setBounds(40, 180, 95, 30);
        jf2.add(b);
        jf2.setSize(400, 400);

        ButtonGroup bg = new ButtonGroup();

        JCheckBox cb1 = new JCheckBox("Show password", false);
        cb1.setOpaque(false);
        cb1.setContentAreaFilled(false);
        cb1.setBorderPainted(false);
        jf2.add(cb1);

        ImageIcon img2=new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\admin1.jpg");
        JLabel bgimg=new JLabel(img2);
        bgimg.setBounds(0, 0, 900, 600);
        jf2.add(bgimg);

        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb1.isSelected())
                { //value.getPassword().setEchoChar((char)0);
                    la3.setText(String.valueOf(value.getPassword()));
                }
                else {
                    la3.setText("  ");
                }

            }
        });

        cb1.setBounds(230,100, 150,50);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Connection con1=null;
                Statement st1=null;
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");
                    //System.out.println("Creating database...");
                    st1 = con1.createStatement();
                    String sql3 = "USE STUDENT";
                    st1.executeUpdate(sql3);
                    String sq = "SELECT COUNT(*) FROM REGISTER";
                    ResultSet rs = st1.executeQuery(sq);
                    int row_count = 0;
                    while (rs.next()) {
                        row_count = rs.getInt(1  );
                        System.out.println("rs loop" + row_count);
                    }
                    int max_un = 1000 + row_count;
                    //System.out.println("Outsidde rs loop 1");
                    //System.out.println(Username);
                    int us=Integer.parseInt(t1.getText());
                    //System.out.println("Outsidde rs loop 2");
                    System.out.println(us);
                    System.out.println(max_un);
                    if(us>1000&us<=max_un)
                    {
                        int row_no=us-1000;
                        System.out.println("sri");
                        System.out.println(us);
                        String sq1="SELECT PASSWORD FROM REGISTER WHERE USERNAME="+us;
                        ResultSet rs1 = st1.executeQuery(sq1);
                        String ps="";
                        while (rs1.next())
                        {
                            ps=rs1.getString(1);
                            //System.out.println(ps);
                        }
                        if(us1!=us)
                        {
                            if (ps.equals(String.valueOf(value.getPassword()))) {
                                jf2.setVisible(false);
                                jf2.dispose();
                                Studentpg(us1, us,1);
                            }
                            else {
                                JOptionPane.showMessageDialog(jf2, "Invalid Password.Try again with right password.", "Oops", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(jf2, "Enter the correct user name/password.", "Oops", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(jf2, "Invalid Username", "Oops", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (Exception e21)
                {
                    System.out.println(e21);
                }
            }
        });
    }
                /*else
                {
                    Adminpg();
                }*/


    void Studentpg(int us1, int us2,int view)
    {
        JButton bu1,bu2,bu3;
        JLabel l1;
        JFrame  jfr=new JFrame();
        jfr.setVisible(true);
        jfr.setTitle("Student Page");
        jfr.setBounds(150,50, 250,20);
        jfr.setResizable(false);
        jfr.setLayout(null);
        l1=new JLabel("Quiz - " + us1 + " vs " + us2);
        l1.setBounds(50,200,250,100);
        jfr.setSize(400, 400);
        if(view==0)
        {
            bu1 = new JButton("View questions");
        }
        else {
            bu1 = new JButton("START QUIZ");
            jfr.add(l1);
        }
        bu1.setBounds(230,80,130,50);
        jfr.add(bu1);
        ImageIcon img2=new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\stu.jpg");
        JLabel bgimg=new JLabel(img2);
        bgimg.setBounds(0, 0, 400, 400);
        jfr.add(bgimg);


        bu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection con1 = null;
                Statement st1 = null;
                String ques = "";
                String op_a = "";
                String op_b = "";
                String op_c = "";
                String op_d = "";
                String crt_ans = "";
                int user1_score,user2_score;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");
                    //System.out.println("Creating database...");
                    st1 = con1.createStatement();
                    String sql3 = "USE STUDENT";
                    st1.executeUpdate(sql3);
                    String sq = "SELECT COUNT(*) FROM PROBLEMS";
                    ResultSet rs = st1.executeQuery(sq);
                    int row_count = 0;

                    while (rs.next()) {
                        row_count = rs.getInt(1);
                        System.out.println(row_count);
                    }
                    int[] a = new int[row_count];
                    int score[]=new int[2];
                    //Random ran = new Random();
                    int us1_score_fin=0,us2_score_fin=0;
                    for (int i = 0; i < 1; i++) {
                        //    for(int k=0;k<6;k++) {
                        //        a[k] = ran.nextInt(6);
                        //    }

                        ArrayList<Integer> list = new ArrayList<Integer>();
                        if(view==1) {
                            for (int l = 1; l <= row_count; l++) {
                                list.add(l);
                            }
                            Collections.shuffle(list);
                            for (int m = 0; m < 6; m++) {
                                a[m] = list.get(m);
                                System.out.println("Random array" + a[m]);
                            }
                        }
                        else
                        {
                            for (int l = 1; l <= row_count; l++) {
                                //list.add(l);
                                a[l-1] =l;
                            }
                        }

                        String sq1 = "SELECT QUESTION,OPTION_A,OPTION_B,OPTION_C,OPTION_D,CORRECT_ANS FROM PROBLEMS WHERE S_NO=" + a[0];
                        ResultSet rs1 = st1.executeQuery(sq1);

                        while (rs1.next()) {
                            ques = rs1.getString(1);
                            op_a = rs1.getString(2);
                            op_b = rs1.getString(3);
                            op_c = rs1.getString(4);
                            op_d = rs1.getString(5);
                            crt_ans = rs1.getString(6);

                            System.out.println(ques);
                            System.out.println(op_a);
                            System.out.println(op_b);
                            System.out.println(op_c);
                            System.out.println(op_d);
                            System.out.println(crt_ans);
                        }
                        jfr.setVisible(false);
                        jfr.dispose();
                        score = Quizpg(a,ques, op_a, op_b, op_c, op_d, crt_ans, i % 2, us1_score_fin, us2_score_fin,view,row_count);
                        //Thread.sleep(500);
                    }
                    st1.close();
                    con1.close();
                }
                catch (Exception e1)
                {
                    System.out.println(e1);
                }
            }
        });
    }
    public int[] Quizpg(int[] data,String ques,String op_a,String op_b,String op_c,String op_d,String crt_ans,int us_no, int us1_sc, int us2_sc,int view,int row_count) {
        final int[] user1_score = {0};
        final int[] user2_score = { 0 };
        JFrame jfr1=new JFrame();
        ButtonGroup bg = new ButtonGroup();
        JRadioButton r1,r2,r3,r4;
        jfr1.setVisible(true);
        jfr1.setLayout(null);
        jfr1.setSize(1200,600);
        jfr1.setTitle("Quiz Page");
        JLabel l1=new JLabel(ques);
        l1.setBounds(30,20,900,200);
        //JLabel l5=new JLabel("User1's turn");
        JLabel l5 = new JLabel("User 1's turn"); l5.setFont(new Font("Serif", Font.BOLD, 20));
        l5.setBounds(30,500,150,50);
        JLabel l2=new JLabel("User 1 Score: "+us1_sc+" | User 2 Score : "+us2_sc);
        l2.setBounds(800,10,200, 100);
        JLabel l3=new JLabel("Answer : "+crt_ans);
        l3.setBounds(30, 310, 150, 30);
        JLabel l6= new JLabel();
        l6.setBounds(800,500,150,150);
        r1 = new JRadioButton(op_a);
        r2 = new JRadioButton(op_b);
        r3 = new JRadioButton(op_c);
        r4 = new JRadioButton(op_d);
        r1.setBounds(30, 150, 150, 30);
        r2.setBounds(30, 190, 150, 30);
        r3.setBounds(30, 230, 150, 30);
        r4.setBounds(30, 270, 150, 30);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        JButton b1;
        //Shape1 timer = new Shape1();
        //l6.setText(String.valueOf(System.nanoTime()));
        if(view==0) {
            b1 = new JButton("Next");
        }
        else
        {
            b1 = new JButton("Submit");
        }
        b1.setBounds(70,350,80,50);
        ButtonGroup bg1 = new ButtonGroup();
        r1.setOpaque(false);
        r1.setContentAreaFilled(false);
        r1.setBorderPainted(false);
        r2.setOpaque(false);
        r2.setContentAreaFilled(false);
        r2.setBorderPainted(false);
        r3.setOpaque(false);
        r3.setContentAreaFilled(false);
        r3.setBorderPainted(false);
        r4.setOpaque(false);
        r4.setContentAreaFilled(false);
        r4.setBorderPainted(false);

        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        bg1.add(r4);
        jfr1.add(l1);
        jfr1.add(r1);
        if(view==1)
        {
            jfr1.add(l2);
            jfr1.add(l5);
        }

        jfr1.add(r2);
        jfr1.add(r3);
        jfr1.add(r4);
        jfr1.add(b1);
        if(view==0)
        {
            jfr1.add(l3);
        }
        jfr1.add(l6);
        ImageIcon img2=new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\qu.jpg");
        JLabel bgimg=new JLabel(img2);
        bgimg.setBounds(0, 0, 1200, 600);
        jfr1.add(bgimg);
        int[] a=new int[4];
        final int[] ques_no = {0};
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user_ans="";
                if(view==1) {
                    if (r1.isSelected()) {
                        user_ans = "a";

                    } else if (r2.isSelected()) {
                        user_ans = "b";

                    } else if (r3.isSelected()) {
                        user_ans = "c";

                    } else if (r4.isSelected()) {
                        user_ans = "d";

                    } else {
                        JOptionPane.showMessageDialog(jfr1, "Select your answer and submit", "Oops", JOptionPane.ERROR_MESSAGE);
                    }
                }

                bg1.clearSelection();
                //Shape1 timer = new Shape1();



                Statement st4 = null;
                Connection con4 = null;
                String crct_ans="";
                try {
                    System.out.println("Creating database...");
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con4 = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");

                    st4 = con4.createStatement();
                    String sql3 = "USE STUDENT";
                    st4.executeUpdate(sql3);
                    String sq1 = "SELECT QUESTION,OPTION_A,OPTION_B,OPTION_C,OPTION_D,CORRECT_ANS FROM PROBLEMS WHERE S_NO=" + data[ques_no[0]];
                    ResultSet rs1 = st4.executeQuery(sq1);

                    while (rs1.next()) {
                        crct_ans = rs1.getString(6);
                        System.out.println(crct_ans);
                    }

                }
                catch (Exception ae1) {
                    System.out.println(ae1);
                }
                if(view==1) {
                    if (ques_no[0] != 0) {
                        if (crct_ans.equals(user_ans)) {
                            JOptionPane.showMessageDialog(jfr1, "You are right!", "CONGRATS", JOptionPane.INFORMATION_MESSAGE);
                            if (ques_no[0] % 2 == 0) {
                                user1_score[0]++;
                            } else {
                                user2_score[0]++;
                            }
                        } else {
                            JOptionPane.showMessageDialog(jfr1, "You are wrong", "OOPS", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        if (crt_ans.equals(user_ans)) {
                            user1_score[0]++;
                            JOptionPane.showMessageDialog(jfr1, "You are right!", "CONGRATS", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(jfr1, "You are wrong", "OOPS", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    l2.setText("User 1 Score: " + user1_score[0] + " | User 2 Score : " + user2_score[0]);
                }
                ques_no[0] +=1;
                System.out.println(ques_no[0]);

                a[0]+= user1_score[0];
                a[1]+= user2_score[0];

                if((ques_no[0] < 6 & view==1)||(view==0 & ques_no[0]<row_count)) {
                    Statement st1 = null;
                    String ques = "";
                    String op_a = "";
                    String op_b = "";
                    String op_c = "";
                    String op_d = "";
                    String crt_ans = "";
                    Connection con2 = null;
                    Statement st2 = null;
                    try {
                        System.out.println("Creating database...");
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");

                        st2 = con2.createStatement();
                        String sql3 = "USE STUDENT";
                        st2.executeUpdate(sql3);
                        String sq1 = "SELECT QUESTION,OPTION_A,OPTION_B,OPTION_C,OPTION_D,CORRECT_ANS FROM PROBLEMS WHERE S_NO=" + data[ques_no[0]];
                        ResultSet rs1 = st2.executeQuery(sq1);

                        while (rs1.next()) {
                            ques = rs1.getString(1);
                            op_a = rs1.getString(2);
                            op_b = rs1.getString(3);
                            op_c = rs1.getString(4);
                            op_d = rs1.getString(5);
                            crt_ans = rs1.getString(6);

                            System.out.println(ques);
                            System.out.println(op_a);
                            System.out.println(op_b);
                            System.out.println(op_c);
                            System.out.println(op_d);
                            System.out.println(crt_ans);
                        }

                        l1.setText(ques);
                        r1.setText(op_a);
                        r2.setText(op_b);
                        r3.setText(op_c);
                        r4.setText(op_d);
                        if(view==0)
                        {
                            l3.setText("Answer:"+crt_ans);
                        }
                        if (ques_no[0] % 2 == 0) {
                            l5.setText("User 1's turn");
                        } else {
                            l5.setText("User 2's turn");
                        }
                    } catch (Exception ae) {
                        System.out.println(ae);
                    }
                } else if(view==1) {
                    if(user1_score[0] > user2_score[0]) {
                        JOptionPane.showMessageDialog(jfr1, "User 1 Wins the Quiz", "RESULT", JOptionPane.PLAIN_MESSAGE);
                        jfr1.setVisible(false);
                        jfr1.dispose();
                    }
                    else if(user2_score[0] > user1_score[0]) {
                        JOptionPane.showMessageDialog(jfr1, "User 2 Wins the Quiz", "RESULT", JOptionPane.PLAIN_MESSAGE);
                        jfr1.setVisible(false);
                        jfr1.dispose();

                    } else {
                        JOptionPane.showMessageDialog(jfr1, "Well done! It's a draw.", "RESULT", JOptionPane.PLAIN_MESSAGE);
                        jfr1.setVisible(false);
                        jfr1.dispose();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(jfr1, "No more questions available in database .", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                    jfr1.setVisible(false);
                    jfr1.dispose();
                }
            }
        });
        return a;
    }

    void Adminpg()
    {
        JFrame j=new JFrame();
        j.setVisible(true);
        j.setTitle("ADMIN PAGE");
        j.setBounds(300, 90, 900, 600);
        j.setResizable(false);
        j.setLayout(null);
        JButton bt1=new JButton("ADD ");
        bt1.setBounds(150, 100, 95, 30);
        j.add(bt1);
        j.setSize(400, 400);
        JButton bt2=new JButton("VIEW");
        bt2.setBounds(150, 150, 95, 30);
        j.add(bt2);
        j.setSize(400, 400);
        JButton bt3=new JButton(" EXIT");
        bt3.setBounds(150, 200, 95, 30);
        j.add(bt3);
        j.setSize(400, 400);
        ImageIcon img2=new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\lo.jpg");
        JLabel bgimg=new JLabel(img2);
        bgimg.setBounds(0, 0, 1200, 700);
        j.add(bgimg);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addques();
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Studentpg(0,0,0);
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.exit(0);
                j.setVisible(false);
                j.dispose();

            }
        });

    }
    void addques()
    {
        JFrame j1=new JFrame();
        j1.setVisible(true);
        j1.setLayout(null);
        j1.setBounds(100, 50, 1300, 600);
        j1.setSize(1200,700);
        j1.setTitle("ADD QUESTION PAGE");
        JTextField t1,t2,t3,t4,t5,t6;
        t1 = new JTextField(500);
        t1.setBounds(100, 50, 900, 30);
        JLabel l1 = new JLabel("QUESTION");
        l1.setBounds(20, 50, 80, 30);
        t2=new JTextField(300);
        JLabel l2 = new JLabel("OPTION a");
        l2.setBounds(20, 100, 200, 30);
        t2.setBounds(100, 100, 900, 30);
        t3=new JTextField(300);
        JLabel l3 = new JLabel("OPTION b");
        l3.setBounds(20, 150, 200, 30);
        t3.setBounds(100, 150, 900, 30);
        t4=new JTextField(300);
        JLabel l4 = new JLabel("OPTION c");
        l4.setBounds(20, 200, 200, 30);
        t4.setBounds(100, 200, 900, 30);
        t5=new JTextField(300);
        JLabel l5 = new JLabel("OPTION d");
        l5.setBounds(20, 250, 200, 30);
        t5.setBounds(100, 250, 900, 30);
        t6=new JTextField(300);
        JLabel l6 = new JLabel("ANSWER");
        l6.setBounds(20, 300, 300, 30);
        t6.setBounds(100, 300, 900, 30);
        JButton b1=new JButton("SUBMIT");
        b1.setBounds(80,400,80,40);

        //Username=t1.getText();
        j1.add(t1);
        j1.add(l1);
        j1.add(t2);
        j1.add(l2);
        j1.add(t3);
        j1.add(l3);
        j1.add(t4);
        j1.add(l4);
        j1.add(t5);
        j1.add(l5);
        j1.add(t6);
        j1.add(l6);
        j1.add(b1);
        ImageIcon img2=new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\av.jpg");
        JLabel bgimg=new JLabel(img2);
        bgimg.setBounds(0, 0, 1200, 700);
        j1.add(bgimg);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection con1=null;
                Statement st1=null;
                Integer User_name=1000;
                try {
                    System.out.println("hi");
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");
                    //System.out.println("Creating database...");
                    st1 = con1.createStatement();
                    String sql3 = "USE STUDENT";
                    st1.executeUpdate(sql3);
                    String sq="SELECT COUNT(*) FROM PROBLEMS";
                    ResultSet rs=st1.executeQuery(sq);
                    int row_count=0;
                    while (rs.next())
                    {
                        row_count = rs.getInt(1);
                        System.out.println(row_count);
                    }
                    row_count++;
                    //User_name=row_count+1000;

                    String sql2 = "INSERT INTO PROBLEMS " + "VALUES ( "+ row_count + ",'"+t1.getText()+"','" +
                            t2.getText() + "','" +
                            t3.getText() + "','" +
                            t4.getText() + "','" +
                            t5.getText() + "','" +
                            t6.getText() + "')";

                    System.out.println(sql2);
                    st1.executeUpdate(sql2);

                    st1.close();
                    con1.close();

                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");

                }
                catch (Exception e1)
                {
                    System.out.println(e1);
                }
            }
        });
    }

    void viewpg() {
        JFrame jv = new JFrame();
        jv.setVisible(true);
        jv.setBounds(0, 0, 1400, 5000);
        jv.setTitle("View Page");

        JScrollBar s=new JScrollBar();
        s.setBounds(1340,0,20,5000);
        s.setEnabled(true);
        jv.setLayout(null);
        jv.add(s);
        Connection con1 = null;
        Statement st1 = null;
        Integer User_name = 1000;
        JLabel l = null;
        JButton d;
        int y,y1;
        for(y=20;y<5000;y+=80) {
            l= new JLabel(" q");
            l.setBounds(100, y, 900, 50);
            jv.add(l);

       /*   l2 = new JLabel(" a");
          l2.setBounds(100, 100, 150, 50);
          l3 = new JLabel("b ");
          l3.setBounds(100, 180, 150, 50);
          l4 = new JLabel(" c");
          l4.setBounds(100, 260, 150, 50);
          l5 = new JLabel(" d");
          l5.setBounds(100, 340, 150, 50);
          l6 = new JLabel(" ans");
          l6.setBounds(100, 400, 150, 50);*/
        }
        for(int b=400;b<5000;b+=400)
        {
            d=new JButton("Delete");
            d.setBounds(800,b,150,40);
            jv.add(d);
        }
      /*jv.add(l2);
      jv.add(l3);
      jv.add(l4);
      jv.add(l5);
      jv.add(l6);*/
        try {
            System.out.println("hi");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");
            //System.out.println("Creating database...");
            st1 = con1.createStatement();
            String sql3 = "USE STUDENT";
            st1.executeUpdate(sql3);
            String sq = "SELECT COUNT(*) FROM PROBLEMS";
            ResultSet rs = st1.executeQuery(sq);
            int row_count = 0;
            while (rs.next()) {
                row_count = rs.getInt(1);
                System.out.println(row_count);
            }
            row_count++;
            //User_name=row_count+1000;
             /* String sql2 = "INSERT INTO PROBLEMS " + "VALUES ( " + row_count + ",'" + String.valueOf(t1.getText()) + "','" +
                      t2.getText() + "','" +
                      t3.getText() + "','" +
                      t4.getText() + "','" +
                      t5.getText() + "','" +
                      t6.getText() + "')";*/

            //System.out.println(sql2);
            //st1.executeUpdate(sql2);


            st1.close();
            con1.close();
        }
        catch (Exception e1) {
            System.out.println(e1);
        }
    }
    void Registerpg() {
        Container c;
        JLabel title;
        JLabel name, em, user, dob;
        JTextField tname, tem, tuser, tdob;
        JComboBox date;
        JComboBox month;
        JComboBox year;
        String[] dates = {"1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31"};
        String[] months = {"Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec"};
        String[] years = {"1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019"};

        JFrame ja = new JFrame();
        ja.setVisible(true);
        ja.setTitle("Registration Form");
        ja.setBounds(300, 90, 900, 600);
        ja.setResizable(false);
        ja.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        ja.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        ja.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(300, 100);
        ja.add(tname);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 200);
        ja.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(300, 200);
        ja.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(347, 200);
        ja.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(407, 200);
        ja.add(year);

        em = new JLabel("Email ID");
        em.setFont(new Font("Arial", Font.PLAIN, 20));
        em.setSize(100, 20);
        em.setLocation(100, 150);
        ja.add(em);

        tem = new JTextField();
        tem.setFont(new Font("Arial", Font.PLAIN, 15));
        tem.setSize(190, 20);
        tem.setLocation(300, 150);
        ja.add(tem);

      /*user = new JLabel("User Name");
      user.setFont(new Font("Arial", Font.PLAIN, 20));
      user.setSize(190, 20);
      user.setLocation(100, 200);
      ja.add(user);

      tuser = new JTextField();
      tuser.setFont(new Font("Arial", Font.PLAIN, 15));
      tuser.setSize(190, 20);
      tuser.setLocation(300, 200);
      ja.add(tuser);*/


        JLabel lap = new JLabel("Password");
        lap.setFont(new Font("Arial", Font.PLAIN, 20));
        lap.setSize(190, 20);
        lap.setLocation(100, 250);
        ja.add(lap);


        JPasswordField value1 = new JPasswordField();
        value1.setFont(new Font("Arial", Font.PLAIN, 15));
        value1.setSize(190, 20);
        value1.setLocation(300, 250);
        ja.add(value1);

        JLabel lap1 = new JLabel("Re-enter Password");
        lap1.setFont(new Font("Arial", Font.PLAIN, 20));
        lap1.setSize(190, 20);
        lap1.setLocation(100, 300);
        ja.add(lap1);

        JPasswordField value2 = new JPasswordField();
        value2.setFont(new Font("Arial", Font.PLAIN, 15));
        value2.setSize(190, 20);
        value2.setLocation(300, 300);
        ja.add(value2);

        JButton sub = new JButton("Sign up");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(200, 350);
        //sub.addActionListener(this);
        ja.add(sub);

        JButton reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(300, 350);
        ja.add(reset);

        ImageIcon img= new ImageIcon("C:\\Users\\Sridhar\\Desktop\\miniproj\\src\\Miniproj\\admin.jpg");
        JLabel background=new JLabel(img);
        background.setBounds(0,0,900,600);
        //background.setLayout(new FlowLayout());
        //g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        ja.add(background);
        sub.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == sub) {
                    System.out.println("outside loop");
                    if (tname.getText().equals("")  || tem.getText().equals("") ||String.valueOf(value1.getPassword()).equals("") || String.valueOf(value2.getPassword()).equals((""))) {
                        //Error message appears to prompt the user to
                        //complete the form
                        //JOptionPane.showMessageDialog(null, "All fields must be complete to submit.", "Woops", JOptionPane.ERROR_MESSAGE);
                        System.out.println("inside loop");
                        JOptionPane.showMessageDialog(ja,"All fields must be filled completely.","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                }

                if (!String.valueOf(value1.getPassword()).equals(String.valueOf(value2.getPassword())))
                {   System.out.println(value1.getPassword());
                    System.out.println(value2.getPassword());
                    JOptionPane.showMessageDialog(null, "Passwords doesn't match.", "Woops", JOptionPane.ERROR_MESSAGE);
                }

                if(String.valueOf(value1.getPassword())==String.valueOf(value2.getPassword()))
                {
                    Adminlogin();
                }
                Connection con1=null;
                Statement st1=null;
                Integer User_name=1000;
                try {
                    System.out.println("hi");
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");
                    //System.out.println("Creating database...");
                    st1 = con1.createStatement();
                    String sql3 = "USE STUDENT";
                    st1.executeUpdate(sql3);
                    String sq="SELECT COUNT(*) FROM REGISTER";
                    ResultSet rs=st1.executeQuery(sq);
                    Integer row_count=0;
                    while (rs.next())
                    {
                        row_count = rs.getInt(1);
                        System.out.println(row_count);
                    }
                    row_count++;
                    User_name=row_count+1000;

                    String sql2 = "INSERT INTO REGISTER " + "VALUES ( "+ row_count + ","+User_name+",'" +
                            tname.getText() + "','" +
                            tem.getText() + "'," +
                            date.getSelectedItem().toString() + ",'" +
                            month.getSelectedItem().toString() + "'," +
                            year.getSelectedItem().toString() + ",'" +
                            String.valueOf(value1.getPassword()) + "')";

                    System.out.println(sql2);
                    st1.executeUpdate(sql2);

                    st1.close();
                    con1.close();
                }
                catch (Exception e1)
                {
                    System.out.println(e1);
                }
                if (!tname.getText().equals("")  || !tem.getText().equals("") || !String.valueOf(value1.getPassword()).equals("") || !String.valueOf(value2.getPassword()).equals((""))) {
                    System.out.println("hiiii");
                    if (String.valueOf(value1.getPassword()).equals(String.valueOf(value2.getPassword()))) {
                        System.out.println("hello");
                        tname.setText("");
                        tem.setText("");
                        value1.setText("");
                        value2.setText("");
                        JOptionPane.showMessageDialog(null, "Your Username is " + User_name, "Registration Successful!", JOptionPane.INFORMATION_MESSAGE);
                        ja.setVisible(false);
                        ja.dispose();
                    }
                }

            }
        });

        //reset.addActionListener(this);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tname.setText("");
                tem.setText("");
                value1.setText("");
                value2.setText("");
            }
        });
    }
}

public class Firstpg {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");
            System.out.println("Creating database...");
            stmt = conn.createStatement();
            ResultSet resultSet = conn.getMetaData().getCatalogs();
            int db_exists=0;
//iterate each catalog in the ResultSet
            while (resultSet.next()) {
                // Get the database name, which is at position 1
                String databaseName = resultSet.getString(1);
                //System.out.println(databaseName);
                if(databaseName.equals("student"))
                {
                    db_exists=1;
                }
                //System.out.println(db_exists);
            }
            resultSet.close();
            if(db_exists==0) {
                String sql = "CREATE DATABASE STUDENT";
                stmt.executeUpdate(sql);
                System.out.println("Database created successfully...");
                System.out.println("Creating table in given database...");
                stmt = conn.createStatement();

                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306", "root", "");
                System.out.println("Creating database...");
                stmt = conn.createStatement();
                String sql3 = "USE STUDENT";
                stmt.executeUpdate(sql3);
                String sql2 = "CREATE TABLE REGISTER" +
                        "(S_NO INTEGER," +
                        "USERNAME INTEGER," +
                        "NAME VARCHAR(255)," +
                        "EMAIL_ID VARCHAR(255)," +
                        "DATE INTEGER," +
                        "MONTH VARCHAR(255)," +
                        "YEAR INTEGER," +
                        "PASSWORD VARCHAR(255))";

                stmt.executeUpdate(sql2);
                String sql4="CREATE TABLE PROBLEMS"+
                        "(S_NO INTEGER,"+
                        "QUESTION VARCHAR(255),"+
                        "OPTION_A VARCHAR(255),"+
                        "OPTION_B VARCHAR(255),"+
                        "OPTION_C VARCHAR(255),"+
                        "OPTION_D VARCHAR(255),"+
                        "CORRECT_ANS VARCHAR(255))";
                stmt.executeUpdate(sql4);
                stmt.close();
                conn.close();
            }
            if (!conn.isClosed()) {
                System.out.println("Bye");
            }

        }
        catch(Exception ie)
        {
            System.out.println(ie);
        }
        Frontpg f1 = new Frontpg();
    }
}
    /*public static Connection getConnection()throws Exception
    {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/db","root","");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }*/

