package 系统;



import javax.swing.*;
import java.awt.Font;
import java.awt.TextField;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import java.awt.event.ActionEvent;

public class EasyJudge {
    protected static int m_score = 0; //判断题得分
    protected static int m_totalJudge = Settings.m_judgeAmount; //判断题总分

    protected static JTextField textField_question1;
    protected static JTextField textField_question2;
    protected static JTextField textField_judge1;
    protected static JTextField textField_judge2;
    protected static JTextField textField_question3;
    protected static JTextField textField_judge3;
    protected static JTextField textField_question4;
    protected static JTextField textField_judge4;
    protected static JTextField textField_question5;
    protected static JTextField textField_judge5;
    protected static JTextField textField_question6;
    protected static JTextField textField_judge6;
    protected static JTextField textField_question7;
    protected static JTextField textField_judge7;
    protected static JTextField textField_question8;
    protected static JTextField textField_judge8;
    protected static JTextField textField_question9;
    protected static JTextField textField_judge9;
    protected static JTextField textField_question10;
    protected static JTextField textField_judge10;
    protected static JTextField textField_feedback;

    protected static int m_right1;
    protected static int m_right2;
    protected static int m_right3;
    protected static int m_right4;
    protected static int m_right5;
    protected static int m_right6;
    protected static int m_right7;
    protected static int m_right8;
    protected static int m_right9;
    protected static int m_right10;

    protected static String m_rightJudge1;
    protected static String m_rightJudge2;
    protected static String m_rightJudge3;
    protected static String m_rightJudge4;
    protected static String m_rightJudge5;
    protected static String m_rightJudge6;
    protected static String m_rightJudge7;
    protected static String m_rightJudge8;
    protected static String m_rightJudge9;
    protected static String m_rightJudge10;


    public static void doJudge() {

        JFrame f = new JFrame("判断题");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.getContentPane().setLayout(null);
        f.setBounds(420, 120, 1000, 800);
        //设置背景
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
        Random random = new Random();    //int number = random.nextInt(max)%(max-min+1) + min
        int x1 = random.nextInt(10)%(11);  //x1为0到10之间的整数
        int y1 = random.nextInt(10)%(11);  //y1为0到10之间的整数
        m_right1 = x1 + y1;

        int x2 = random.nextInt(10)%(11);  //x2为0到10之间的整数
        int y2 = random.nextInt(10)%(11);  //y2为0到10之间的整数
        m_right2 = x2 + y2;

        int x3 = random.nextInt(10)%(11);  //x3为0到10之间的整数
        int y3 = random.nextInt(10)%(11);  //y3为0到10之间的整数
        m_right3 = x3 + y3;

        int x4 = random.nextInt(20)%(11) + 10;  //x4为10到20之间的整数
        int y4 = random.nextInt(10)%(11);       //y4为0到10之间的整数
        m_right4 = x4 - y4;

        int x5 = random.nextInt(100)%(51) + 50;  //x5为50到100之间的整数
        int y5 = random.nextInt(50)%(31) + 20;  //y5为20到50之间的整数
        m_right5 = x5 - y5;

        int x6 = random.nextInt(10)%(11);  //x6为0到10之间的整数
        int y6 = random.nextInt(10)%(11);  //y6为0到10之间的整数
        m_right6 = x6 * y6;

        int x7 = random.nextInt(10)%(11);  //x7为0到10之间的整数
        int y7 = random.nextInt(10)%(11);  //y7为0到10之间的整数
        m_right7 = x7 * y7;

        int x8 = random.nextInt(10)%(11);  //x8为0到10之间的整数
        int y8 = random.nextInt(10)%(11);  //y8为0到10之间的整数
        m_right8 = x8 * y8;

        int x9 = random.nextInt(10)%(10) + 1;  //x9为1到10之间的整数
        int times9 = random.nextInt(10)%(10) + 1; //times9代表1到10倍
        int y9 = x9 * times9;  //y8为x8的整数倍
        m_right9 = times9;

        int x10 = random.nextInt(10)%(10) + 1;  //x10为1到10之间的整数
        int times10 = random.nextInt(10)%(10) + 1; //times10代表1到10倍
        int y10 = x10 * times10;  //y10为x10的整数倍
        m_right10 = times10;

        /**************************第一题*********************************/
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 857, 86);
        f.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        textField_question1 = new JTextField(" " + String.valueOf(x1) + " + " + String.valueOf(y1) + " = ");
        textField_question1.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_question1.setEditable(false);
        textField_question1.setBounds(15, 24, 414, 47);
        panel_1.add(textField_question1);
        textField_question1.setColumns(10);

        m_rightJudge1 = randomSetRight(textField_question1, m_right1);

        JRadioButton radioButton_true1 = new JRadioButton("√");
        radioButton_true1.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true1.setBounds(440, 31, 100, 29);
        panel_1.add(radioButton_true1);

        JRadioButton radioButton_false1 = new JRadioButton("×");
        radioButton_false1.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false1.setBounds(575, 31, 123, 29);
        panel_1.add(radioButton_false1);

        textField_judge1 = new JTextField();
        textField_judge1.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge1.setEditable(false);
        textField_judge1.setBounds(720, 15, 50, 50);
        panel_1.add(textField_judge1);
        textField_judge1.setColumns(10);

        JLabel lable_number1 = new JLabel("\u2460");
        lable_number1.setFont(new Font("宋体", Font.PLAIN, 30));
        lable_number1.setHorizontalAlignment(SwingConstants.TRAILING);
        lable_number1.setBounds(785, 23, 40, 40);
        panel_1.add(lable_number1);
        /**************************第一题*********************************/

        /**************************第二题*********************************/
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBounds(0, 80, 857, 86);
        f.getContentPane().add(panel_2);

        textField_question2 = new JTextField(" " + String.valueOf(x2) + " + " + String.valueOf(y2) + " = ");
        textField_question2.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_question2.setEditable(false);
        textField_question2.setColumns(10);
        textField_question2.setBounds(15, 24, 414, 47);
        panel_2.add(textField_question2);

        m_rightJudge2 = randomSetRight(textField_question2, m_right2);

        JRadioButton radioButton_true2 = new JRadioButton("\u221A");
        radioButton_true2.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true2.setBounds(440, 31, 99, 29);
        panel_2.add(radioButton_true2);

        JRadioButton radioButton_false2 = new JRadioButton("\u00D7");
        radioButton_false2.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false2.setBounds(575, 31, 117, 29);
        panel_2.add(radioButton_false2);

        textField_judge2 = new JTextField();
        textField_judge2.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge2.setEditable(false);
        textField_judge2.setColumns(10);
        textField_judge2.setBounds(720, 15, 50, 50);
        panel_2.add(textField_judge2);

        JLabel label_number2 = new JLabel("\u2461");
        label_number2.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number2.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number2.setBounds(785, 23, 40, 40);
        panel_2.add(label_number2);
        /**************************第二题*********************************/

        /**************************第三题*********************************/
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBounds(0, 160, 857, 86);
        f.getContentPane().add(panel_3);

        textField_question3 = new JTextField(" " + String.valueOf(x3) + " + " + String.valueOf(y3) + " = ");
        textField_question3.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_question3.setEditable(false);
        textField_question3.setColumns(10);
        textField_question3.setBounds(15, 20, 414, 47);
        panel_3.add(textField_question3);

        m_rightJudge3 = randomSetRight(textField_question3, m_right3);

        JRadioButton radioButton_true3 = new JRadioButton("\u221A");
        radioButton_true3.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true3.setBounds(440, 31, 100, 29);
        panel_3.add(radioButton_true3);

        JRadioButton radioButton_false3 = new JRadioButton("\u00D7");
        radioButton_false3.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false3.setBounds(575, 31, 123, 29);
        panel_3.add(radioButton_false3);

        textField_judge3 = new JTextField();
        textField_judge3.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge3.setEditable(false);
        textField_judge3.setColumns(10);
        textField_judge3.setBounds(720, 15, 50, 50);
        panel_3.add(textField_judge3);

        JLabel label_number3 = new JLabel("\u2462");
        label_number3.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number3.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number3.setBounds(785, 23, 40, 40);
        panel_3.add(label_number3);
        /**************************第三题*********************************/

        /**************************第四题*********************************/
        JPanel panel_4 = new JPanel();
        panel_4.setLayout(null);
        panel_4.setBounds(0, 240, 857, 86);
        f.getContentPane().add(panel_4);

        textField_question4 = new JTextField(" " + String.valueOf(x4) + " - " + String.valueOf(y4) + " = ");
        textField_question4.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_question4.setEditable(false);
        textField_question4.setColumns(10);
        textField_question4.setBounds(15, 24, 414, 47);
        panel_4.add(textField_question4);

        m_rightJudge4 = randomSetRight(textField_question4, m_right4);

        JRadioButton radioButton_true4 = new JRadioButton("\u221A");
        radioButton_true4.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true4.setBounds(440, 30, 100, 29);
        panel_4.add(radioButton_true4);

        JRadioButton radioButton_false4 = new JRadioButton("\u00D7");
        radioButton_false4.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false4.setBounds(575, 31, 123, 29);
        panel_4.add(radioButton_false4);

        textField_judge4 = new JTextField();
        textField_judge4.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge4.setEditable(false);
        textField_judge4.setColumns(10);
        textField_judge4.setBounds(720, 15, 50, 50);
        panel_4.add(textField_judge4);

        JLabel label_number4 = new JLabel("\u2463");
        label_number4.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number4.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number4.setBounds(785, 23, 40, 40);
        panel_4.add(label_number4);
        /**************************第四题*********************************/

        /**************************第五题*********************************/
        JPanel panel_5 = new JPanel();
        panel_5.setLayout(null);
        panel_5.setBounds(0, 320, 857, 86);
        f.getContentPane().add(panel_5);

        textField_question5 = new JTextField(" " + String.valueOf(x5) + " - " + String.valueOf(y5) + " = ");
        textField_question5.setFont(new Font("宋体", Font.PLAIN, 29));
        textField_question5.setEditable(false);
        textField_question5.setColumns(10);
        textField_question5.setBounds(15, 24, 414, 47);
        panel_5.add(textField_question5);

        m_rightJudge5 = randomSetRight(textField_question5, m_right5);

        JRadioButton radioButton_true5 = new JRadioButton("\u221A");
        radioButton_true5.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true5.setBounds(440, 31, 100, 29);
        panel_5.add(radioButton_true5);

        JRadioButton radioButton_false5 = new JRadioButton("\u00D7");
        radioButton_false5.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false5.setBounds(575, 31, 123, 29);
        panel_5.add(radioButton_false5);

        textField_judge5 = new JTextField();
        textField_judge5.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge5.setEditable(false);
        textField_judge5.setColumns(10);
        textField_judge5.setBounds(720, 15, 50, 50);
        panel_5.add(textField_judge5);

        JLabel label_number5 = new JLabel("\u2464");
        label_number5.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number5.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number5.setBounds(785, 23, 40, 40);
        panel_5.add(label_number5);
        /**************************第五题*********************************/

        /**************************第六题*********************************/
        JPanel panel_6 = new JPanel();
        panel_6.setLayout(null);
        panel_6.setBounds(0, 400, 857, 86);
        f.getContentPane().add(panel_6);

        textField_question6 = new JTextField(" " + String.valueOf(x6) + " × " + String.valueOf(y6) +  "  = " );
        textField_question6.setFont(new Font("宋体", Font.PLAIN, 29));
        textField_question6.setEditable(false);
        textField_question6.setColumns(10);
        textField_question6.setBounds(15, 24, 414, 47);
        panel_6.add(textField_question6);

        m_rightJudge6 = randomSetRight(textField_question6, m_right6);

        JRadioButton radioButton_true6 = new JRadioButton("\u221A");
        radioButton_true6.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true6.setBounds(440, 31, 100, 29);
        panel_6.add(radioButton_true6);

        JRadioButton radioButton_false6 = new JRadioButton("\u00D7");
        radioButton_false6.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false6.setBounds(575, 31, 123, 29);
        panel_6.add(radioButton_false6);

        textField_judge6 = new JTextField();
        textField_judge6.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge6.setEditable(false);
        textField_judge6.setColumns(10);
        textField_judge6.setBounds(720, 15, 50, 50);
        panel_6.add(textField_judge6);

        JLabel label_number6 = new JLabel("\u2465");
        label_number6.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number6.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number6.setBounds(785, 23, 40, 40);
        panel_6.add(label_number6);
        /**************************第六题*********************************/

        /**************************第七题*********************************/
        JPanel panel_7 = new JPanel();
        panel_7.setLayout(null);
        panel_7.setBounds(0, 480, 857, 86);
        f.getContentPane().add(panel_7);

        textField_question7 = new JTextField(" " + String.valueOf(x7) + " × " + String.valueOf(y7) + " = ");
        textField_question7.setFont(new Font("宋体", Font.PLAIN, 29));
        textField_question7.setEditable(false);
        textField_question7.setColumns(10);
        textField_question7.setBounds(15, 24, 414, 47);
        panel_7.add(textField_question7);

        m_rightJudge7 = randomSetRight(textField_question7, m_right7);

        JRadioButton radioButton_true7 = new JRadioButton("\u221A");
        radioButton_true7.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true7.setBounds(440, 31, 100, 29);
        panel_7.add(radioButton_true7);

        JRadioButton radioButton_false7 = new JRadioButton("\u00D7");
        radioButton_false7.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false7.setBounds(575, 31, 123, 29);
        panel_7.add(radioButton_false7);

        textField_judge7 = new JTextField();
        textField_judge7.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge7.setEditable(false);
        textField_judge7.setColumns(10);
        textField_judge7.setBounds(720, 15, 50, 50);
        panel_7.add(textField_judge7);

        JLabel label_number7 = new JLabel("\u2466");
        label_number7.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number7.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number7.setBounds(785, 23, 40, 40);
        panel_7.add(label_number7);
        /**************************第七题*********************************/

        /**************************第八题*********************************/
        JPanel panel_8 = new JPanel();
        panel_8.setLayout(null);
        panel_8.setBounds(0, 560, 857, 86);
        f.getContentPane().add(panel_8);

        textField_question8 = new JTextField(" " + String.valueOf(x8) + " × " + String.valueOf(y8) + " = ");
        textField_question8.setFont(new Font("宋体", Font.PLAIN, 29));
        textField_question8.setEditable(false);
        textField_question8.setColumns(10);
        textField_question8.setBounds(15, 24, 414, 47);
        panel_8.add(textField_question8);

        m_rightJudge8 = randomSetRight(textField_question8, m_right8);

        JRadioButton radioButton_true8 = new JRadioButton("\u221A");
        radioButton_true8.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true8.setBounds(440, 31, 100, 29);
        panel_8.add(radioButton_true8);

        JRadioButton radioButton_false8 = new JRadioButton("\u00D7");
        radioButton_false8.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false8.setBounds(575, 31, 123, 29);
        panel_8.add(radioButton_false8);

        textField_judge8 = new JTextField();
        textField_judge8.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge8.setEditable(false);
        textField_judge8.setColumns(10);
        textField_judge8.setBounds(720, 15, 50, 50);
        panel_8.add(textField_judge8);

        JLabel label_number8 = new JLabel("\u2467");
        label_number8.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number8.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number8.setBounds(785, 23, 40, 40);
        panel_8.add(label_number8);
        /**************************第八题*********************************/

        /**************************第九题*********************************/
        JPanel panel_9 = new JPanel();
        panel_9.setLayout(null);
        panel_9.setBounds(0, 640, 857, 86);
        f.getContentPane().add(panel_9);

        textField_question9 = new JTextField(" " + String.valueOf(y9) + " ÷ " + String.valueOf(x9) + " = ");
        textField_question9.setFont(new Font("宋体", Font.PLAIN, 28));
        textField_question9.setEditable(false);
        textField_question9.setColumns(10);
        textField_question9.setBounds(15, 24, 414, 47);
        panel_9.add(textField_question9);

        m_rightJudge9 = randomSetRight(textField_question9, m_right9);

        JRadioButton radioButton_true9 = new JRadioButton("\u221A");
        radioButton_true9.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true9.setBounds(440, 31, 100, 29);
        panel_9.add(radioButton_true9);

        JRadioButton radioButton_false9 = new JRadioButton("\u00D7");
        radioButton_false9.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false9.setBounds(575, 31, 123, 29);
        panel_9.add(radioButton_false9);

        textField_judge9 = new JTextField();
        textField_judge9.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge9.setEditable(false);
        textField_judge9.setColumns(10);
        textField_judge9.setBounds(720, 15, 50, 50);
        panel_9.add(textField_judge9);

        JLabel label_number9 = new JLabel("\u2468");
        label_number9.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number9.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number9.setBounds(785, 23, 40, 40);
        panel_9.add(label_number9);
        /**************************第九题*********************************/

        /**************************第十题*********************************/
        JPanel panel_10 = new JPanel();
        panel_10.setLayout(null);
        panel_10.setBounds(0, 720, 857, 86);
        f.getContentPane().add(panel_10);

        textField_question10 = new JTextField(" " + String.valueOf(y10) + " ÷ " + String.valueOf(x10) + " = ");
        textField_question10.setFont(new Font("宋体", Font.PLAIN, 28));
        textField_question10.setEditable(false);
        textField_question10.setColumns(10);
        textField_question10.setBounds(15, 24, 411, 47);
        panel_10.add(textField_question10);

        m_rightJudge10 = randomSetRight(textField_question10, m_right10);

        JRadioButton radioButton_true10 = new JRadioButton("\u221A");
        radioButton_true10.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_true10.setBounds(437, 34, 100, 29);
        panel_10.add(radioButton_true10);

        JRadioButton radioButton_false10 = new JRadioButton("\u00D7");
        radioButton_false10.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_false10.setBounds(575, 31, 123, 29);
        panel_10.add(radioButton_false10);

        textField_judge10 = new JTextField();
        textField_judge10.setFont(new Font("宋体", Font.PLAIN, 40));
        textField_judge10.setEditable(false);
        textField_judge10.setColumns(10);
        textField_judge10.setBounds(720, 15, 50, 50);
        panel_10.add(textField_judge10);

        JLabel label_number10 = new JLabel("\u2469");
        label_number10.setHorizontalAlignment(SwingConstants.TRAILING);
        label_number10.setFont(new Font("宋体", Font.PLAIN, 30));
        label_number10.setBounds(785, 23, 40, 40);
        panel_10.add(label_number10);
        /**************************第十题*********************************/

        textField_feedback = new JTextField();
        textField_feedback.setEditable(false);
        textField_feedback.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_feedback.setBounds(443, 851, 376, 125);
        f.getContentPane().add(textField_feedback);
        textField_feedback.setColumns(10);

        /*根据题数隐藏相应题目*/
        switch (m_totalJudge) {
            case 0:
                f.dispose();
                FeedBack.giveFeedback();
                break;

            case 1:
                panel_10.setVisible(false);
                panel_9.setVisible(false);
                panel_8.setVisible(false);
                panel_7.setVisible(false);
                panel_6.setVisible(false);
                panel_5.setVisible(false);
                panel_4.setVisible(false);
                panel_3.setVisible(false);
                panel_2.setVisible(false);
                break;

            case 2:
                panel_10.setVisible(false);
                panel_9.setVisible(false);
                panel_8.setVisible(false);
                panel_7.setVisible(false);
                panel_6.setVisible(false);
                panel_5.setVisible(false);
                panel_4.setVisible(false);
                panel_3.setVisible(false);
                break;

            case 3:
                panel_10.setVisible(false);
                panel_9.setVisible(false);
                panel_8.setVisible(false);
                panel_7.setVisible(false);
                panel_6.setVisible(false);
                panel_5.setVisible(false);
                panel_4.setVisible(false);
                break;

            case 4:
                panel_10.setVisible(false);
                panel_9.setVisible(false);
                panel_8.setVisible(false);
                panel_7.setVisible(false);
                panel_6.setVisible(false);
                panel_5.setVisible(false);
                break;

            case 5:
                panel_10.setVisible(false);
                panel_9.setVisible(false);
                panel_8.setVisible(false);
                panel_7.setVisible(false);
                panel_6.setVisible(false);
                break;

            case 6:
                panel_10.setVisible(false);
                panel_9.setVisible(false);
                panel_8.setVisible(false);
                panel_7.setVisible(false);
                break;

            case 7:
                panel_10.setVisible(false);
                panel_9.setVisible(false);
                panel_8.setVisible(false);
                break;

            case 8:
                panel_10.setVisible(false);
                panel_9.setVisible(false);
                break;

            case 9:
                panel_10.setVisible(false);
                break;

            case 10:
                break;

        }

        //对了则分数加一分且判断框中显示“√”，错了则不加分且判断框中显示“×”
        JButton button_submit = new JButton("提交");
        button_submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m_score = 0;   //便于反复提交，每次提交则得分先清零然后再统计新的得分，避免正确率累加

                /********************第1题********************/
                switch (m_rightJudge1) {
                    case "√":
                        if (radioButton_true1.isSelected() && !radioButton_false1.isSelected()) {
                            m_score ++; textField_judge1.setText("√");
                        }else {textField_judge1.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true1.isSelected() && radioButton_false1.isSelected()) {
                            m_score ++; textField_judge1.setText("√");
                        }else {textField_judge1.setText("×");}
                        break;

                    default:
                        textField_judge1.setText("×");
                        break;
                }
                /********************第1题********************/

                /********************第2题********************/
                switch (m_rightJudge2) {
                    case "√":
                        if (radioButton_true2.isSelected() && !radioButton_false2.isSelected()) {
                            m_score ++; textField_judge2.setText("√");
                        }else {textField_judge2.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true2.isSelected() && radioButton_false2.isSelected()) {
                            m_score ++; textField_judge2.setText("√");
                        }else {textField_judge2.setText("×");}
                        break;

                    default:
                        textField_judge2.setText("×");
                        break;
                }
                /********************第2题********************/

                /********************第3题********************/
                switch (m_rightJudge3) {
                    case "√":
                        if (radioButton_true3.isSelected() && !radioButton_false3.isSelected()) {
                            m_score ++; textField_judge3.setText("√");
                        }else {textField_judge3.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true3.isSelected() && radioButton_false3.isSelected()) {
                            m_score ++; textField_judge3.setText("√");
                        }else {textField_judge3.setText("×");}
                        break;

                    default:
                        textField_judge3.setText("×");
                        break;
                }
                /********************第3题********************/

                /********************第4题********************/
                switch (m_rightJudge4) {
                    case "√":
                        if (radioButton_true4.isSelected() && !radioButton_false4.isSelected()) {
                            m_score ++; textField_judge4.setText("√");
                        }else {textField_judge4.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true4.isSelected() && radioButton_false4.isSelected()) {
                            m_score ++; textField_judge4.setText("√");
                        }else {textField_judge4.setText("×");}
                        break;

                    default:
                        textField_judge4.setText("×");
                        break;
                }
                /********************第4题********************/

                /********************第5题********************/
                switch (m_rightJudge5) {
                    case "√":
                        if (radioButton_true5.isSelected() && !radioButton_false5.isSelected()) {
                            m_score ++; textField_judge5.setText("√");
                        }else {textField_judge5.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true5.isSelected() && radioButton_false5.isSelected()) {
                            m_score ++; textField_judge5.setText("√");
                        }else {textField_judge5.setText("×");}
                        break;

                    default:
                        textField_judge5.setText("×");
                        break;
                }
                /********************第5题********************/

                /********************第6题********************/
                switch (m_rightJudge6) {
                    case "√":
                        if (radioButton_true6.isSelected() && !radioButton_false6.isSelected()) {
                            m_score ++; textField_judge6.setText("√");
                        }else {textField_judge6.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true6.isSelected() && radioButton_false6.isSelected()) {
                            m_score ++; textField_judge6.setText("√");
                        }else {textField_judge6.setText("×");}
                        break;

                    default:
                        textField_judge6.setText("×");
                        break;
                }
                /********************第6题********************/

                /********************第7题********************/
                switch (m_rightJudge7) {
                    case "√":
                        if (radioButton_true7.isSelected() && !radioButton_false7.isSelected()) {
                            m_score ++; textField_judge7.setText("√");
                        }else {textField_judge7.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true7.isSelected() && radioButton_false7.isSelected()) {
                            m_score ++; textField_judge7.setText("√");
                        }else {textField_judge7.setText("×");}
                        break;

                    default:
                        textField_judge7.setText("×");
                        break;
                }
                /********************第7题********************/

                /********************第8题********************/
                switch (m_rightJudge8) {
                    case "√":
                        if (radioButton_true8.isSelected() && !radioButton_false8.isSelected()) {
                            m_score ++; textField_judge8.setText("√");
                        }else {textField_judge8.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true8.isSelected() && radioButton_false8.isSelected()) {
                            m_score ++; textField_judge8.setText("√");
                        }else {textField_judge8.setText("×");}
                        break;

                    default:
                        textField_judge8.setText("×");
                        break;
                }
                /********************第8题********************/

                /********************第9题********************/
                switch (m_rightJudge9) {
                    case "√":
                        if (radioButton_true9.isSelected() && !radioButton_false9.isSelected()) {
                            m_score ++; textField_judge9.setText("√");
                        }else {textField_judge9.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true9.isSelected() && radioButton_false9.isSelected()) {
                            m_score ++; textField_judge9.setText("√");
                        }else {textField_judge9.setText("×");}
                        break;

                    default:
                        textField_judge9.setText("×");
                        break;
                }
                /********************第9题********************/

                /********************第10题********************/
                switch (m_rightJudge10) {
                    case "√":
                        if (radioButton_true10.isSelected() && !radioButton_false10.isSelected()) {
                            m_score ++; textField_judge10.setText("√");
                        }else {textField_judge10.setText("×");}
                        break;

                    case "×":
                        if (!radioButton_true10.isSelected() && radioButton_false10.isSelected()) {
                            m_score ++; textField_judge10.setText("√");
                        }else {textField_judge10.setText("×");}
                        break;

                    default:
                        textField_judge10.setText("×");
                        break;
                }
                /********************第10题********************/

                double temp1 = (double)m_score / (double)m_totalJudge * 100;
                DecimalFormat df = new DecimalFormat("#.00");  //正确率只保留小数点后两位
                String accuracy = df.format(temp1);
                textField_feedback.setText(" 判断题正确率： " + accuracy + "%");

            }
        });
        button_submit.setFont(new Font("宋体", Font.PLAIN, 30));
        button_submit.setBounds(63, 880, 123, 57);
        f.getContentPane().add(button_submit);

        JButton button_next = new JButton("总结");
        button_next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(radioButton_true1.isSelected() ) {FeedBack.m_judge1.append(" √");}
                if(radioButton_false1.isSelected()) {FeedBack.m_judge1.append(" ×");}

                if(radioButton_true2.isSelected() ) {FeedBack.m_judge2.append(" √");}
                if(radioButton_false2.isSelected()) {FeedBack.m_judge2.append(" ×");}

                if(radioButton_true3.isSelected() ) {FeedBack.m_judge3.append(" √");}
                if(radioButton_false3.isSelected()) {FeedBack.m_judge3.append(" ×");}

                if(radioButton_true4.isSelected() ) {FeedBack.m_judge4.append(" √");}
                if(radioButton_false4.isSelected()) {FeedBack.m_judge4.append(" ×");}

                if(radioButton_true5.isSelected() ) {FeedBack.m_judge5.append(" √");}
                if(radioButton_false5.isSelected()) {FeedBack.m_judge5.append(" ×");}

                if(radioButton_true6.isSelected() ) {FeedBack.m_judge6.append(" √");}
                if(radioButton_false6.isSelected()) {FeedBack.m_judge6.append(" ×");}

                if(radioButton_true7.isSelected() ) {FeedBack.m_judge7.append(" √");}
                if(radioButton_false7.isSelected()) {FeedBack.m_judge7.append(" ×");}

                if(radioButton_true8.isSelected() ) {FeedBack.m_judge8.append(" √");}
                if(radioButton_false8.isSelected()) {FeedBack.m_judge8.append(" ×");}

                if(radioButton_true9.isSelected() ) {FeedBack.m_judge9.append(" √");}
                if(radioButton_false9.isSelected()) {FeedBack.m_judge9.append(" ×");}

                if(radioButton_true10.isSelected() ) {FeedBack.m_judge10.append(" √");}
                if(radioButton_false10.isSelected()) {FeedBack.m_judge10.append(" ×");}

                f.dispose();
                FeedBack.giveFeedback

                        ();
            }
        });
        button_next.setFont(new Font("宋体", Font.PLAIN, 30));
        button_next.setBounds(225, 880, 150, 57);
        f.getContentPane().add(button_next);
        f.setBounds(50, 50, 879, 1047);



    } //doJudge

    /**随机指定一个选项为正确选项**/
    public static String randomSetRight(JTextField textField_question12, int right) {
        Random random = new Random();    //int number = random.nextInt(max)%(max-min+1) + min
        int disturb = random.nextInt(10)%(10) + 1;  //disturb1为1到10之间的整数
        int randomSet = random.nextInt(2)%(2) + 1;  //randomSet为1到2之间的整数

        switch (randomSet) {
            case 1:
                textField_question12.setText(textField_question12.getText() + String.valueOf(right));
                return "√";  //返回正确选项

            case 2:
                textField_question12.setText(textField_question12.getText() + String.valueOf(right + disturb));
                return "×";  //返回正确选项

        }
        return null;


    } //randomSetRight

}