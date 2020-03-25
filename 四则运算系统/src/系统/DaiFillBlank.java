package 系统;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DecimalFormat;
import java.util.Random;


public class DaiFillBlank {
    protected static int m_score = 0; //填空题得分
    protected static int m_totalBlank = Settings.m_blankAmount; //填空题总分

    protected static JTextField textField_question0;
    protected static JTextField textField_answer0;
    protected static JTextField textField_question1;
    protected static JTextField textField_answer1;
    protected static JTextField textField_question2;
    protected static JTextField textField_answer2;
    protected static JTextField textField_question3;
    protected static JTextField textField_answer3;
    protected static JTextField textField_question4;
    protected static JTextField textField_answer4;
    protected static JTextField textField_question5;
    protected static JTextField textField_answer5;
    protected static JTextField textField_question6;
    protected static JTextField textField_answer6;
    protected static JTextField textField_question7;
    protected static JTextField textField_answer7;
    protected static JTextField textField_question8;
    protected static JTextField textField_answer8;
    protected static JTextField textField_question9;
    protected static JTextField textField_answer9;
    protected static JButton button_submit;
    protected static JButton button_redo;
    protected static JTextField textField_feedback;
    protected static JTextField textField_judge0;
    protected static JTextField textField_judge1;
    protected static JTextField textField_judge2;
    protected static JTextField textField_judge3;
    protected static JTextField textField_judge4;
    protected static JTextField textField_judge5;
    protected static JTextField textField_judge6;
    protected static JTextField textField_judge7;
    protected static JTextField textField_judge8;
    protected static JTextField textField_judge9;
    protected static JButton button_next;

    protected static int m_right0;
    protected static int m_right1;
    protected static int m_right2;
    protected static int m_right3;
    protected static int m_right4;
    protected static int m_right5;
    protected static int m_right6;
    protected static int m_right7;
    protected static int m_right8;
    protected static int m_right9;

    public static void doFillBlank() {

        JFrame f = new JFrame("填空题");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(420, 120, 1000, 800);
        f.setVisible(true);
        f.getContentPane().setLayout(null);

        //进行背景的设置
        ImageIcon ph=new ImageIcon("src/3.jpg");
        JLabel pho=new JLabel(ph);
        pho.setBounds(0,0,ph.getIconWidth(),ph.getIconHeight());
        f.getLayeredPane().add(pho,new Integer(Integer.MIN_VALUE));
        JPanel panel=new JPanel();
        JPanel panelTop=new JPanel();
        panelTop=(JPanel)f.getContentPane();
        //设置为
        panelTop.setOpaque(false);
        panel.setOpaque(false);
        f.add(panel);
        f.setVisible(true);


        /************************ 题干所用随机数  *******************************/
        /*定义多个数来随机****/
        Random random = new Random();    //int number = random.nextInt(max)%(max-min+1) + min
        int x0 = random.nextInt(10)%(11);  //x0为0到10之间的整数
        int y0 = random.nextInt(10)%(11);  //y0为0到1s0之间的整数

        int x1 = random.nextInt(100)%(81) + 20;  //x1为20到100之间的整数
        int y1 = random.nextInt(100)%(81) + 20;  //y1为20到100之间的整数

        int x2 = random.nextInt(1000)%(901) + 100;  //x2为100到1000之间的整数
        int y2 = random.nextInt(1000)%(901) + 100;  //y2为100到1000之间的整数

        int x3 = random.nextInt(20)%(11) + 10;  //x3为10到20之间的整数
        int y3 = random.nextInt(10)%(11);       //y3为0到10之间的整数

        int x4 = random.nextInt(50)%(51) + 50;  //x4为50到100之间的整数
        int y4 = random.nextInt(30)%(31) + 20;  //y4为20到50之间的整数

        int x5 = random.nextInt(10)%(11);  //x5为0到10之间的整数
        int y5 = random.nextInt(10)%(11);  //y5为0到10之间的整数

        int x6 = random.nextInt(100)%(81) + 20 - 1;  //x6为20到99之间的整数
        int y6 = random.nextInt(100)%(81) + 20 - 1;  //y6为20到99之间的整数

        int x7 = random.nextInt(100)%(81) + 20 - 1;  //x7为20到99之间的整数
        int y7 = random.nextInt(100)%(81) + 20 - 1;  //y7为20到99之间的整数

        int x8 = random.nextInt(10)%(10) + 1;  //x8为1到10之间的整数
        int times8 = random.nextInt(10)%(10) + 1; //times8代表1到10倍
        int y8 = (x7-x8) * times8;  //y8为x8的整数倍

        int x9 = random.nextInt(20)%(11) + 10;  //x9为10到20之间的整数
        int times9 = random.nextInt(30)%(21) + 10; //times9代表10到30倍
        int y9 = (x9+x9) * times9;  //y9为x9的整数倍
        /************************ 问题栏  *******************************/
        textField_question0 = new JTextField();
        textField_question0.setText(" (" + String.valueOf(x0) + " + " + String.valueOf(y0) +")"+ "-"+String.valueOf(x1)+"  = ");
        textField_question0.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question0.setEditable(false);
        textField_question0.setBounds(15, 45, 171, 41);
        textField_question0.setColumns(1);
        f.getContentPane().add(textField_question0);

        textField_question1 = new JTextField();
        textField_question1.setText("("+String.valueOf(x1) + " + " +String.valueOf(y1)+")"+"-"+String.valueOf(x2) + " = ");
        textField_question1.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question1.setEditable(false);
        textField_question1.setColumns(1);
        textField_question1.setBounds(15, 115, 171, 41);
        f.getContentPane().add(textField_question1);

        textField_question2 = new JTextField();
        textField_question2.setText("("+String.valueOf(x2) + "+" + String.valueOf(y2)+")"+"*"+String.valueOf(y2) + " = ");
        textField_question2.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question2.setEditable(false);
        textField_question2.setColumns(1);
        textField_question2.setBounds(15, 185, 171, 41);
        f.getContentPane().add(textField_question2);

        textField_question3 = new JTextField();
        textField_question3.setText("("+String.valueOf(x3) + "-" + String.valueOf(y3)+")"+"*"+String.valueOf(y3) + " = ");
        textField_question3.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question3.setEditable(false);
        textField_question3.setColumns(1);
        textField_question3.setBounds(15, 255, 171, 41);
        f.getContentPane().add(textField_question3);

        textField_question4 = new JTextField();
        textField_question4.setText("("+String.valueOf(x4) + "-" + String.valueOf(y4)+")"+"*"+String.valueOf(x4) + " = ");
        textField_question4.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question4.setEditable(false);
        textField_question4.setColumns(1);
        textField_question4.setBounds(15, 325, 171, 41);
        f.getContentPane().add(textField_question4);

        textField_question5 = new JTextField();
        textField_question5.setText(" " + String.valueOf(x5) + " × " + "("+String.valueOf(y5) +"+"+String.valueOf(x5)+")"+ "  = ");
        textField_question5.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question5.setEditable(false);
        textField_question5.setColumns(1);
        textField_question5.setBounds(414, 45, 171, 41);
        f.getContentPane().add(textField_question5);

        textField_question6 = new JTextField();
        textField_question6.setText(String.valueOf(x6) + " × " +"("+ String.valueOf(y6)+"-"+String.valueOf(x6)+")" + " = ");
        textField_question6.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question6.setEditable(false);
        textField_question6.setColumns(1);
        textField_question6.setBounds(414, 115, 171, 41);
        f.getContentPane().add(textField_question6);

        textField_question7 = new JTextField();
        textField_question7.setText(" "+String.valueOf(x7) + " × " +"("+ String.valueOf(y7)+"+"+String.valueOf(x7)+")" + " = ");
        textField_question7.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question7.setEditable(false);
        textField_question7.setColumns(1);
        textField_question7.setBounds(414, 185, 171, 41);
        f.getContentPane().add(textField_question7);

        textField_question8 = new JTextField();
        textField_question8.setText(" " + String.valueOf(y8) + " ÷ " + "("+ String.valueOf(x7)+"-"+String.valueOf(x8)+")" + " = ");
        textField_question8.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question8.setEditable(false);
        textField_question8.setColumns(1);
        textField_question8.setBounds(414, 255, 171, 41);
        f.getContentPane().add(textField_question8);

        textField_question9 = new JTextField();
        textField_question9.setText(" " + String.valueOf(y9) + "÷" +"("+ String.valueOf(x9)+"+"+String.valueOf(x9)+")" + " = ");
        textField_question9.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_question9.setEditable(false);
        textField_question9.setColumns(1);
        textField_question9.setBounds(414, 325, 171, 41);
        f.getContentPane().add(textField_question9);
        /************************ 问题栏  *******************************/

        /************************ 答题栏  *******************************/
        textField_answer0 = new JTextField();
        textField_answer0.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer0.setBounds(184, 45, 141, 41);
        f.getContentPane().add(textField_answer0);
        textField_answer0.setColumns(1);

        textField_answer1 = new JTextField();
        textField_answer1.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer1.setColumns(1);
        textField_answer1.setBounds(184, 115, 141, 41);
        f.getContentPane().add(textField_answer1);

        textField_answer2 = new JTextField();
        textField_answer2.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer2.setColumns(1);
        textField_answer2.setBounds(184, 185, 141, 41);
        f.getContentPane().add(textField_answer2);

        textField_answer3 = new JTextField();
        textField_answer3.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer3.setColumns(1);
        textField_answer3.setBounds(184, 255, 141, 41);
        f.getContentPane().add(textField_answer3);

        textField_answer4 = new JTextField();
        textField_answer4.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer4.setColumns(1);
        textField_answer4.setBounds(184, 325, 141, 41);
        f.getContentPane().add(textField_answer4);

        textField_answer5 = new JTextField();
        textField_answer5.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer5.setColumns(1);
        textField_answer5.setBounds(583, 45, 141, 41);
        f.getContentPane().add(textField_answer5);

        textField_answer6 = new JTextField();
        textField_answer6.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer6.setColumns(1);
        textField_answer6.setBounds(583, 115, 141, 41);
        f.getContentPane().add(textField_answer6);

        textField_answer7 = new JTextField();
        textField_answer7.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer7.setColumns(1);
        textField_answer7.setBounds(583, 185, 141, 41);
        f.getContentPane().add(textField_answer7);

        textField_answer8 = new JTextField();
        textField_answer8.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer8.setColumns(1);
        textField_answer8.setBounds(583, 255, 141, 41);
        f.getContentPane().add(textField_answer8);

        textField_answer9 = new JTextField();
        textField_answer9.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_answer9.setColumns(1);
        textField_answer9.setBounds(583, 325, 141, 41);
        f.getContentPane().add(textField_answer9);
        /************************ 答题栏  *******************************/

        /************************ 判断框  *******************************/
        textField_judge0 = new JTextField();
        textField_judge0.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge0.setEditable(false);
        textField_judge0.setBounds(324, 45, 41, 41);
        f.getContentPane().add(textField_judge0);
        textField_judge0.setColumns(10);

        textField_judge1 = new JTextField();
        textField_judge1.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge1.setEditable(false);
        textField_judge1.setColumns(10);
        textField_judge1.setBounds(324, 115, 41, 41);
        f.getContentPane().add(textField_judge1);

        textField_judge2 = new JTextField();
        textField_judge2.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge2.setEditable(false);
        textField_judge2.setColumns(10);
        textField_judge2.setBounds(324, 185, 41, 41);
        f.getContentPane().add(textField_judge2);

        textField_judge3 = new JTextField();
        textField_judge3.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge3.setEditable(false);
        textField_judge3.setColumns(10);
        textField_judge3.setBounds(324, 255, 41, 41);
        f.getContentPane().add(textField_judge3);

        textField_judge4 = new JTextField();
        textField_judge4.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge4.setEditable(false);
        textField_judge4.setColumns(10);
        textField_judge4.setBounds(324, 325, 41, 41);
        f.getContentPane().add(textField_judge4);

        textField_judge5 = new JTextField();
        textField_judge5.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge5.setEditable(false);
        textField_judge5.setColumns(10);
        textField_judge5.setBounds(723, 45, 41, 41);
        f.getContentPane().add(textField_judge5);

        textField_judge6 = new JTextField();
        textField_judge6.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge6.setEditable(false);
        textField_judge6.setColumns(10);
        textField_judge6.setBounds(723, 115, 41, 41);
        f.getContentPane().add(textField_judge6);

        textField_judge7 = new JTextField();
        textField_judge7.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge7.setEditable(false);
        textField_judge7.setColumns(10);
        textField_judge7.setBounds(723, 185, 41, 41);
        f.getContentPane().add(textField_judge7);

        textField_judge8 = new JTextField();
        textField_judge8.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge8.setEditable(false);
        textField_judge8.setColumns(10);
        textField_judge8.setBounds(723, 255, 41, 41);
        f.getContentPane().add(textField_judge8);

        textField_judge9 = new JTextField();
        textField_judge9.setFont(new Font("宋体", Font.PLAIN, 25));
        textField_judge9.setEditable(false);
        textField_judge9.setColumns(10);
        textField_judge9.setBounds(723, 325, 41, 41);
        f.getContentPane().add(textField_judge9);
        /************************ 判断框  *******************************/

        /**根据题量掩盖一定题目**/
        switch (m_totalBlank) {
            case 0:
                f.dispose();
                EasyChoice.doChoice();
                break;
            case 1:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                textField_question8.setVisible(false);
                textField_answer8.setVisible(false);
                textField_judge8.setVisible(false);
                textField_question7.setVisible(false);
                textField_answer7.setVisible(false);
                textField_judge7.setVisible(false);
                textField_question6.setVisible(false);
                textField_answer6.setVisible(false);
                textField_judge6.setVisible(false);
                textField_question5.setVisible(false);
                textField_answer5.setVisible(false);
                textField_judge5.setVisible(false);
                textField_question4.setVisible(false);
                textField_answer4.setVisible(false);
                textField_judge4.setVisible(false);
                textField_question3.setVisible(false);
                textField_answer3.setVisible(false);
                textField_judge3.setVisible(false);
                textField_question2.setVisible(false);
                textField_answer2.setVisible(false);
                textField_judge2.setVisible(false);
                textField_question1.setVisible(false);
                textField_answer1.setVisible(false);
                textField_judge1.setVisible(false);
                break;

            case 2:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                textField_question8.setVisible(false);
                textField_answer8.setVisible(false);
                textField_judge8.setVisible(false);
                textField_question7.setVisible(false);
                textField_answer7.setVisible(false);
                textField_judge7.setVisible(false);
                textField_question6.setVisible(false);
                textField_answer6.setVisible(false);
                textField_judge6.setVisible(false);
                textField_question4.setVisible(false);
                textField_answer4.setVisible(false);
                textField_judge4.setVisible(false);
                textField_question3.setVisible(false);
                textField_answer3.setVisible(false);
                textField_judge3.setVisible(false);
                textField_question2.setVisible(false);
                textField_answer2.setVisible(false);
                textField_judge2.setVisible(false);
                textField_question1.setVisible(false);
                textField_answer1.setVisible(false);
                textField_judge1.setVisible(false);
                break;

            case 3:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                textField_question8.setVisible(false);
                textField_answer8.setVisible(false);
                textField_judge8.setVisible(false);
                textField_question7.setVisible(false);
                textField_answer7.setVisible(false);
                textField_judge7.setVisible(false);
                textField_question6.setVisible(false);
                textField_answer6.setVisible(false);
                textField_judge6.setVisible(false);
                textField_question4.setVisible(false);
                textField_answer4.setVisible(false);
                textField_judge4.setVisible(false);
                textField_question3.setVisible(false);
                textField_answer3.setVisible(false);
                textField_judge3.setVisible(false);
                textField_question2.setVisible(false);
                textField_answer2.setVisible(false);
                textField_judge2.setVisible(false);
                break;

            case 4:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                textField_question8.setVisible(false);
                textField_answer8.setVisible(false);
                textField_judge8.setVisible(false);
                textField_question7.setVisible(false);
                textField_answer7.setVisible(false);
                textField_judge7.setVisible(false);
                textField_question4.setVisible(false);
                textField_answer4.setVisible(false);
                textField_judge4.setVisible(false);
                textField_question3.setVisible(false);
                textField_answer3.setVisible(false);
                textField_judge3.setVisible(false);
                textField_question2.setVisible(false);
                textField_answer2.setVisible(false);
                textField_judge2.setVisible(false);
                break;

            case 5:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                textField_question8.setVisible(false);
                textField_answer8.setVisible(false);
                textField_judge8.setVisible(false);
                textField_question7.setVisible(false);
                textField_answer7.setVisible(false);
                textField_judge7.setVisible(false);
                textField_question4.setVisible(false);
                textField_answer4.setVisible(false);
                textField_judge4.setVisible(false);
                textField_question3.setVisible(false);
                textField_answer3.setVisible(false);
                textField_judge3.setVisible(false);
                break;

            case 6:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                textField_question8.setVisible(false);
                textField_answer8.setVisible(false);
                textField_judge8.setVisible(false);
                textField_question4.setVisible(false);
                textField_answer4.setVisible(false);
                textField_judge4.setVisible(false);
                textField_question3.setVisible(false);
                textField_answer3.setVisible(false);
                textField_judge3.setVisible(false);
                break;

            case 7:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                textField_question8.setVisible(false);
                textField_answer8.setVisible(false);
                textField_judge8.setVisible(false);
                textField_question4.setVisible(false);
                textField_answer4.setVisible(false);
                textField_judge4.setVisible(false);
                break;

            case 8:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                textField_question4.setVisible(false);
                textField_answer4.setVisible(false);
                textField_judge4.setVisible(false);
                break;

            case 9:
                textField_question9.setVisible(false);
                textField_answer9.setVisible(false);
                textField_judge9.setVisible(false);
                break;


            case 10:
                break;
        }

        //提交并判定分数
        button_submit = new JButton("提交");
        button_submit.setBackground(Color.GREEN);
        button_submit.setFont(new Font("宋体", Font.PLAIN, 30));
        button_submit.setBounds(25, 385, 102, 48);
        button_submit.addActionListener(new ActionListener() {

            //对了则分数加一分且判断框中显示“对”，错了则不加分且判断框中显示“错”
            @Override
            public void actionPerformed(ActionEvent e) {
                m_score = 0;  //便于反复提交，每次提交则得分先清零然后再统计新的得分，避免正确率累加

                if (textField_answer0.getText().equals(String.valueOf((x0+y0)-x1))) {m_score ++; textField_judge0.setText("√"); }
                else {textField_judge0.setText("×");}
                m_right0 = (x0 + y0)-x1;

                if (textField_answer1.getText().equals(String.valueOf((x1+y1)-x2))) {m_score ++; textField_judge1.setText("√"); }
                else {textField_judge1.setText("×");}
                m_right1 = (x1 + y1)-x2;

                if (textField_answer2.getText().equals(String.valueOf((x2+y2)*y2))) {m_score ++; textField_judge2.setText("√"); }
                else {textField_judge2.setText("×");}
                m_right2 = (x2 + y2)*y2;

                if (textField_answer3.getText().equals(String.valueOf((x3-y3)*y3))) {m_score ++; textField_judge3.setText("√"); }
                else {textField_judge3.setText("×");}
                m_right3 = (x3-y3)*y3;

                if (textField_answer4.getText().equals(String.valueOf((x4-y4)*x4))) {m_score ++; textField_judge4.setText("√"); }
                else {textField_judge4.setText("×");}
                m_right4 = (x4- y4)*x4;

                if (textField_answer5.getText().equals(String.valueOf(x5*(y5+x5)))) {m_score ++; textField_judge5.setText("√"); }
                else {textField_judge5.setText("×");}
                m_right5 = x5 *( y5+x5);

                if (textField_answer6.getText().equals(String.valueOf(x6*(y6-x6)))) {m_score ++; textField_judge6.setText("√"); }
                else {textField_judge6.setText("×");}
                m_right6 = x6 * (y6-x6);

                if (textField_answer7.getText().equals(String.valueOf(x7*(y7+x7)))) {m_score ++; textField_judge7.setText("√"); }
                else {textField_judge7.setText("×");}
                m_right7 = x7 * (y7+x7);

                if (textField_answer8.getText().equals(String.valueOf(times8))) {m_score ++; textField_judge8.setText("√"); }
                else {textField_judge8.setText("×");}
                m_right8 = times8;

                if (textField_answer9.getText().equals(String.valueOf(times9))) {m_score ++; textField_judge9.setText("√"); }
                else {textField_judge9.setText("×");}
                m_right9 = times9;

                double temp1 = (double)m_score / (double)m_totalBlank * 100;
                DecimalFormat df = new DecimalFormat("#.00");  //正确率只保留小数点后两位
                String accuracy = df.format(temp1);
                textField_feedback.setText(" 填空题正确率： " + accuracy + "%");

            }
        });
        f.getContentPane().add(button_submit);

        //重写操作
        button_redo = new JButton("重做");
        button_redo.setFont(new Font("宋体", Font.PLAIN, 30));
        button_redo.setBounds(153, 385, 102, 48);
        button_redo.addActionListener(new ActionListener() {

            @Override  //所有答题区域和判断区域清空
            public void actionPerformed(ActionEvent e) {
                textField_answer0.setText("");
                textField_answer1.setText("");
                textField_answer2.setText("");
                textField_answer3.setText("");
                textField_answer4.setText("");
                textField_answer5.setText("");
                textField_answer6.setText("");
                textField_answer7.setText("");
                textField_answer8.setText("");
                textField_answer9.setText("");
                textField_judge0.setText("");
                textField_judge1.setText("");
                textField_judge2.setText("");
                textField_judge3.setText("");
                textField_judge4.setText("");
                textField_judge5.setText("");
                textField_judge6.setText("");
                textField_judge7.setText("");
                textField_judge8.setText("");
                textField_judge9.setText("");
                textField_feedback.setText("");
                m_score = 0;  //得分归零
            }
        });
        f.getContentPane().add(button_redo);

        textField_feedback = new JTextField();
        textField_feedback.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_feedback.setBounds(440, 385, 381, 64);
        textField_feedback.setEditable(false);
        f.getContentPane().add(textField_feedback);
        textField_feedback.setColumns(1);



        //点击进入选择题
        button_next = new JButton("下一题");
        button_next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                EasyChoice.doChoice();
            }
        });
        button_next.setFont(new Font("宋体", Font.PLAIN, 30));
        button_next.setBounds(284, 385, 141, 48);
        f.getContentPane().add(button_next);


    } //doFillBlank


}