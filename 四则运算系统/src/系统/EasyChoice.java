package 系统;


import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import java.awt.event.ActionEvent;

public class EasyChoice {
    protected static int m_score = 0; //选择题得分
    protected static int m_totalChoice = Settings.m_choiceAmount; //选择题总分

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

    protected static String m_rightOption1;
    protected static String m_rightOption2;
    protected static String m_rightOption3;
    protected static String m_rightOption4;
    protected static String m_rightOption5;
    protected static String m_rightOption6;
    protected static String m_rightOption7;
    protected static String m_rightOption8;
    protected static String m_rightOption9;
    protected static String m_rightOption10;

    public static void doChoice() {

        JFrame f = new JFrame("选择题");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.getContentPane().setLayout(null);
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

        int x10 = random.nextInt(20)%(11) + 10;  //x10为10到20之间的整数
        int times10 = random.nextInt(30)%(21) + 10; //times10代表10到30倍
        int y10 = x10 * times10;  //y10为x10的整数倍
        m_right10 = times10;


        /**************************第一题*********************************/
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 857, 86);
       //panel_1.setBounds(420,120,1000,800);
        f.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        textField_question1 = new JTextField(" " + String.valueOf(x1) + " + " + String.valueOf(y1) + " = ");
        textField_question1.setFont(new Font("宋体", Font.PLAIN, 30));
        textField_question1.setEditable(false);
        textField_question1.setBounds(15, 24, 216, 47);
        panel_1.add(textField_question1);
        textField_question1.setColumns(10);

        JRadioButton radioButton_A1 = new JRadioButton("A. ");
        radioButton_A1.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A1.setBounds(275, 31, 100, 29);
        panel_1.add(radioButton_A1);

        JRadioButton radioButton_B1 = new JRadioButton("B. ");
        radioButton_B1.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B1.setBounds(375, 31, 93, 29);
        panel_1.add(radioButton_B1);

        JRadioButton radioButton_C1 = new JRadioButton("C. ");
        radioButton_C1.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C1.setBounds(475, 31, 93, 29);
        panel_1.add(radioButton_C1);

        JRadioButton radioButton_D1 = new JRadioButton("D. ");
        radioButton_D1.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D1.setBounds(575, 31, 123, 29);
        panel_1.add(radioButton_D1);

        m_rightOption1 = randomSetRight(radioButton_A1, radioButton_B1, radioButton_C1, radioButton_D1, m_right1);

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
        textField_question2.setBounds(15, 24, 216, 47);
        panel_2.add(textField_question2);

        JRadioButton radioButton_A2 = new JRadioButton("A. ");
        radioButton_A2.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A2.setBounds(275, 31, 99, 29);
        panel_2.add(radioButton_A2);

        JRadioButton radioButton_B2 = new JRadioButton("B. ");
        radioButton_B2.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B2.setBounds(375, 31, 104, 29);
        panel_2.add(radioButton_B2);

        JRadioButton radioButton_C2 = new JRadioButton("C. ");
        radioButton_C2.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C2.setBounds(475, 31, 99, 29);
        panel_2.add(radioButton_C2);

        JRadioButton radioButton_D2 = new JRadioButton("D. ");
        radioButton_D2.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D2.setBounds(575, 31, 117, 29);
        panel_2.add(radioButton_D2);

        m_rightOption2 = randomSetRight(radioButton_A2, radioButton_B2, radioButton_C2, radioButton_D2, m_right2);

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
        textField_question3.setBounds(15, 20, 216, 47);
        panel_3.add(textField_question3);

        JRadioButton radioButton_A3 = new JRadioButton("A. ");
        radioButton_A3.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A3.setBounds(275, 31, 100, 29);
        panel_3.add(radioButton_A3);

        JRadioButton radioButton_B3 = new JRadioButton("B. ");
        radioButton_B3.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B3.setBounds(375, 31, 93, 29);
        panel_3.add(radioButton_B3);

        JRadioButton radioButton_C3 = new JRadioButton("C. ");
        radioButton_C3.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C3.setBounds(475, 31, 93, 29);
        panel_3.add(radioButton_C3);

        JRadioButton radioButton_D3 = new JRadioButton("D. ");
        radioButton_D3.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D3.setBounds(575, 31, 123, 29);
        panel_3.add(radioButton_D3);

        m_rightOption3 = randomSetRight(radioButton_A3, radioButton_B3, radioButton_C3, radioButton_D3, m_right3);

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
        textField_question4.setBounds(15, 24, 216, 47);
        panel_4.add(textField_question4);

        JRadioButton radioButton_A4 = new JRadioButton("A. ");
        radioButton_A4.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A4.setBounds(275, 31, 100, 29);
        panel_4.add(radioButton_A4);

        JRadioButton radioButton_B4 = new JRadioButton("B. ");
        radioButton_B4.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B4.setBounds(375, 31, 93, 29);
        panel_4.add(radioButton_B4);

        JRadioButton radioButton_C4 = new JRadioButton("C. ");
        radioButton_C4.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C4.setBounds(475, 31, 93, 29);
        panel_4.add(radioButton_C4);

        JRadioButton radioButton_D4 = new JRadioButton("D. ");
        radioButton_D4.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D4.setBounds(575, 31, 123, 29);
        panel_4.add(radioButton_D4);

        m_rightOption4 = randomSetRight(radioButton_A4, radioButton_B4, radioButton_C4, radioButton_D4, m_right4);

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

        textField_question5 = new JTextField(" "  + String.valueOf(x5) + " - " + String.valueOf(y5) + " = ");
        textField_question5.setFont(new Font("宋体", Font.PLAIN, 29));
        textField_question5.setEditable(false);
        textField_question5.setColumns(10);
        textField_question5.setBounds(15, 24, 216, 47);
        panel_5.add(textField_question5);

        JRadioButton radioButton_A5 = new JRadioButton("A. ");
        radioButton_A5.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A5.setBounds(275, 31, 100, 29);
        panel_5.add(radioButton_A5);

        JRadioButton radioButton_B5 = new JRadioButton("B. ");
        radioButton_B5.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B5.setBounds(375, 31, 93, 29);
        panel_5.add(radioButton_B5);

        JRadioButton radioButton_C5 = new JRadioButton("C. ");
        radioButton_C5.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C5.setBounds(475, 31, 93, 29);
        panel_5.add(radioButton_C5);

        JRadioButton radioButton_D5 = new JRadioButton("D. ");
        radioButton_D5.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D5.setBounds(575, 31, 123, 29);
        panel_5.add(radioButton_D5);

        m_rightOption5 = randomSetRight(radioButton_A5, radioButton_B5, radioButton_C5, radioButton_D5, m_right5);

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

        textField_question6 = new JTextField(" " + String.valueOf(x6) + " × " + String.valueOf(y6) + "  = ");
        textField_question6.setFont(new Font("宋体", Font.PLAIN, 29));
        textField_question6.setEditable(false);
        textField_question6.setColumns(10);
        textField_question6.setBounds(15, 24, 216, 47);
        panel_6.add(textField_question6);

        JRadioButton radioButton_A6 = new JRadioButton("A. ");
        radioButton_A6.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A6.setBounds(275, 31, 100, 29);
        panel_6.add(radioButton_A6);

        JRadioButton radioButton_B6 = new JRadioButton("B. ");
        radioButton_B6.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B6.setBounds(375, 31, 93, 29);
        panel_6.add(radioButton_B6);

        JRadioButton radioButton_C6 = new JRadioButton("C. ");
        radioButton_C6.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C6.setBounds(475, 31, 93, 29);
        panel_6.add(radioButton_C6);

        JRadioButton radioButton_D6 = new JRadioButton("D. ");
        radioButton_D6.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D6.setBounds(575, 31, 123, 29);
        panel_6.add(radioButton_D6);

        m_rightOption6 = randomSetRight(radioButton_A6, radioButton_B6, radioButton_C6, radioButton_D6, m_right6);

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
        textField_question7.setBounds(15, 24, 216, 47);
        panel_7.add(textField_question7);

        JRadioButton radioButton_A7 = new JRadioButton("A. ");
        radioButton_A7.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A7.setBounds(275, 31, 100, 29);
        panel_7.add(radioButton_A7);

        JRadioButton radioButton_B7 = new JRadioButton("B. ");
        radioButton_B7.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B7.setBounds(375, 31, 93, 29);
        panel_7.add(radioButton_B7);

        JRadioButton radioButton_C7 = new JRadioButton("C. ");
        radioButton_C7.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C7.setBounds(475, 31, 93, 29);
        panel_7.add(radioButton_C7);

        JRadioButton radioButton_D7 = new JRadioButton("D. ");
        radioButton_D7.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D7.setBounds(575, 31, 123, 29);
        panel_7.add(radioButton_D7);

        m_rightOption7 = randomSetRight(radioButton_A7, radioButton_B7, radioButton_C7, radioButton_D7, m_right7);

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
        textField_question8.setBounds(15, 24, 216, 47);
        panel_8.add(textField_question8);

        JRadioButton radioButton_A8 = new JRadioButton("A. ");
        radioButton_A8.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A8.setBounds(275, 31, 100, 29);
        panel_8.add(radioButton_A8);

        JRadioButton radioButton_B8 = new JRadioButton("B. ");
        radioButton_B8.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B8.setBounds(375, 31, 93, 29);
        panel_8.add(radioButton_B8);

        JRadioButton radioButton_C8 = new JRadioButton("C. ");
        radioButton_C8.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C8.setBounds(475, 31, 93, 29);
        panel_8.add(radioButton_C8);

        JRadioButton radioButton_D8 = new JRadioButton("D. ");
        radioButton_D8.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D8.setBounds(575, 31, 123, 29);
        panel_8.add(radioButton_D8);

        m_rightOption8 = randomSetRight(radioButton_A8, radioButton_B8, radioButton_C8, radioButton_D8, m_right8);

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
        textField_question9.setBounds(15, 24, 216, 47);
        panel_9.add(textField_question9);

        JRadioButton radioButton_A9 = new JRadioButton("A. ");
        radioButton_A9.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A9.setBounds(275, 31, 100, 29);
        panel_9.add(radioButton_A9);

        JRadioButton radioButton_B9 = new JRadioButton("B. ");
        radioButton_B9.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B9.setBounds(375, 31, 100, 29);
        panel_9.add(radioButton_B9);

        JRadioButton radioButton_C9 = new JRadioButton("C. ");
        radioButton_C9.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C9.setBounds(475, 31, 100, 29);
        panel_9.add(radioButton_C9);

        JRadioButton radioButton_D9 = new JRadioButton("D. ");
        radioButton_D9.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D9.setBounds(575, 31, 123, 29);
        panel_9.add(radioButton_D9);

        m_rightOption9 = randomSetRight(radioButton_A9, radioButton_B9, radioButton_C9, radioButton_D9, m_right9);

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
        textField_question10.setBounds(15, 24, 216, 47);
        panel_10.add(textField_question10);

        JRadioButton radioButton_A10 = new JRadioButton("A. ");
        radioButton_A10.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_A10.setBounds(275, 31, 100, 29);
        panel_10.add(radioButton_A10);

        JRadioButton radioButton_B10 = new JRadioButton("B. ");
        radioButton_B10.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_B10.setBounds(375, 31, 93, 29);
        panel_10.add(radioButton_B10);

        JRadioButton radioButton_C10 = new JRadioButton("C. ");
        radioButton_C10.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_C10.setBounds(475, 31, 93, 29);
        panel_10.add(radioButton_C10);

        JRadioButton radioButton_D10 = new JRadioButton("D. ");
        radioButton_D10.setFont(new Font("宋体", Font.PLAIN, 25));
        radioButton_D10.setBounds(575, 31, 123, 29);
        panel_10.add(radioButton_D10);

        m_rightOption10 = randomSetRight(radioButton_A10, radioButton_B10, radioButton_C10, radioButton_D10, m_right10);

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
        switch (m_totalChoice) {
            case 0:
                f.dispose();
                EasyJudge.doJudge();
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

                /******第1题判断********/
                switch (m_rightOption1) {
                    case "A":
                        if (radioButton_A1.isSelected() && !radioButton_B1.isSelected() && !radioButton_C1.isSelected() && !radioButton_D1.isSelected()) {
                            m_score ++; textField_judge1.setText("√");
                        }else {textField_judge1.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A1.isSelected() && radioButton_B1.isSelected() && !radioButton_C1.isSelected() && !radioButton_D1.isSelected()) {
                            m_score ++; textField_judge1.setText("√");
                        }else {textField_judge1.setText("×");}
                        break;
                    case"C":
                    if (!radioButton_A1.isSelected() && !radioButton_B1.isSelected() && radioButton_C1.isSelected() && !radioButton_D1.isSelected()) {
                        m_score ++; textField_judge1.setText("√");
                    }else {textField_judge1.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A1.isSelected() && !radioButton_B1.isSelected() && !radioButton_C1.isSelected() && radioButton_D1.isSelected()) {
                            m_score ++; textField_judge1.setText("√");
                        }else {textField_judge1.setText("×");}
                        break;

                    default:
                        textField_judge1.setText("×");
                        break;
                }
                /******第1题判断********/


                /******第2题判断********/
                switch (m_rightOption2) {
                    case "A":
                        if (radioButton_A2.isSelected() && !radioButton_B2.isSelected() && !radioButton_C2.isSelected() && !radioButton_D2.isSelected()) {
                            m_score ++; textField_judge2.setText("√");
                        }else {textField_judge2.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A2.isSelected() && radioButton_B2.isSelected() && !radioButton_C2.isSelected() && !radioButton_D2.isSelected()) {
                            m_score ++; textField_judge2.setText("√");
                        }else {textField_judge2.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A2.isSelected() && !radioButton_B2.isSelected() && radioButton_C2.isSelected() && !radioButton_D2.isSelected()) {
                            m_score ++; textField_judge2.setText("√");
                        }else {textField_judge2.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A2.isSelected() && !radioButton_B2.isSelected() && !radioButton_C2.isSelected() && radioButton_D2.isSelected()) {
                            m_score ++; textField_judge2.setText("√");
                        }else {textField_judge2.setText("×");}
                        break;

                }
                /******第2题判断********/

                /******第3题判断********/
                switch (m_rightOption3) {
                    case "A":
                        if (radioButton_A3.isSelected() && !radioButton_B3.isSelected() && !radioButton_C3.isSelected() && !radioButton_D3.isSelected()) {
                            m_score ++; textField_judge3.setText("√");
                        }else {textField_judge3.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A3.isSelected() && radioButton_B3.isSelected() && !radioButton_C3.isSelected() && !radioButton_D3.isSelected()) {
                            m_score ++; textField_judge3.setText("√");
                        }else {textField_judge3.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A3.isSelected() && !radioButton_B3.isSelected() && radioButton_C3.isSelected() && !radioButton_D3.isSelected()) {
                            m_score ++; textField_judge3.setText("√");
                        }else {textField_judge3.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A3.isSelected() && !radioButton_B3.isSelected() && !radioButton_C3.isSelected() && radioButton_D3.isSelected()) {
                            m_score ++; textField_judge3.setText("√");
                        }else {textField_judge3.setText("×");}
                        break;

                }
                /******第3题判断********/

                /******第4题判断********/
                switch (m_rightOption4) {
                    case "A":
                        if (radioButton_A4.isSelected() && !radioButton_B4.isSelected() && !radioButton_C4.isSelected() && !radioButton_D4.isSelected()) {
                            m_score ++; textField_judge4.setText("√");
                        }else {textField_judge4.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A4.isSelected() && radioButton_B4.isSelected() && !radioButton_C4.isSelected() && !radioButton_D4.isSelected()) {
                            m_score ++; textField_judge4.setText("√");
                        }else {textField_judge4.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A4.isSelected() && !radioButton_B4.isSelected() && radioButton_C4.isSelected() && !radioButton_D4.isSelected()) {
                            m_score ++; textField_judge4.setText("√");
                        }else {textField_judge4.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A4.isSelected() && !radioButton_B4.isSelected() && !radioButton_C4.isSelected() && radioButton_D4.isSelected()) {
                            m_score ++; textField_judge4.setText("√");
                        }else {textField_judge4.setText("×");}
                        break;

                }
                /******第4题判断********/

                /******第5题判断********/
                switch (m_rightOption5) {
                    case "A":
                        if (radioButton_A5.isSelected() && !radioButton_B5.isSelected() && !radioButton_C5.isSelected() && !radioButton_D5.isSelected()) {
                            m_score ++; textField_judge5.setText("√");
                        }else {textField_judge5.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A5.isSelected() && radioButton_B5.isSelected() && !radioButton_C5.isSelected() && !radioButton_D5.isSelected()) {
                            m_score ++; textField_judge5.setText("√");
                        }else {textField_judge5.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A5.isSelected() && !radioButton_B5.isSelected() && radioButton_C5.isSelected() && !radioButton_D5.isSelected()) {
                            m_score ++; textField_judge5.setText("√");
                        }else {textField_judge5.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A5.isSelected() && !radioButton_B5.isSelected() && !radioButton_C5.isSelected() && radioButton_D5.isSelected()) {
                            m_score ++; textField_judge5.setText("√");
                        }else {textField_judge5.setText("×");}
                        break;

                }
                /******第5题判断********/

                /******第6题判断********/
                switch (m_rightOption6) {
                    case "A":
                        if (radioButton_A6.isSelected() && !radioButton_B6.isSelected() && !radioButton_C6.isSelected() && !radioButton_D6.isSelected()) {
                            m_score ++; textField_judge6.setText("√");
                        }else {textField_judge6.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A6.isSelected() && radioButton_B6.isSelected() && !radioButton_C6.isSelected() && !radioButton_D6.isSelected()) {
                            m_score ++; textField_judge6.setText("√");
                        }else {textField_judge6.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A6.isSelected() && !radioButton_B6.isSelected() && radioButton_C6.isSelected() && !radioButton_D6.isSelected()) {
                            m_score ++; textField_judge6.setText("√");
                        }else {textField_judge6.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A6.isSelected() && !radioButton_B6.isSelected() && !radioButton_C6.isSelected() && radioButton_D6.isSelected()) {
                            m_score ++; textField_judge6.setText("√");
                        }else {textField_judge6.setText("×");}
                        break;

                }
                /******第6题判断********/

                /******第7题判断********/
                switch (m_rightOption7) {
                    case "A":
                        if (radioButton_A7.isSelected() && !radioButton_B7.isSelected() && !radioButton_C7.isSelected() && !radioButton_D7.isSelected()) {
                            m_score ++; textField_judge7.setText("√");
                        }else {textField_judge7.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A7.isSelected() && radioButton_B7.isSelected() && !radioButton_C7.isSelected() && !radioButton_D7.isSelected()) {
                            m_score ++; textField_judge7.setText("√");
                        }else {textField_judge7.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A7.isSelected() && !radioButton_B7.isSelected() && radioButton_C7.isSelected() && !radioButton_D7.isSelected()) {
                            m_score ++; textField_judge7.setText("√");
                        }else {textField_judge7.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A7.isSelected() && !radioButton_B7.isSelected() && !radioButton_C7.isSelected() && radioButton_D7.isSelected()) {
                            m_score ++; textField_judge7.setText("√");
                        }else {textField_judge7.setText("×");}
                        break;

                }
                /******第7题判断********/

                /******第8题判断********/
                switch (m_rightOption8) {
                    case "A":
                        if (radioButton_A8.isSelected() && !radioButton_B8.isSelected() && !radioButton_C8.isSelected() && !radioButton_D8.isSelected()) {
                            m_score ++; textField_judge8.setText("√");
                        }else {textField_judge8.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A8.isSelected() && radioButton_B8.isSelected() && !radioButton_C8.isSelected() && !radioButton_D8.isSelected()) {
                            m_score ++; textField_judge8.setText("√");
                        }else {textField_judge8.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A8.isSelected() && !radioButton_B8.isSelected() && radioButton_C8.isSelected() && !radioButton_D8.isSelected()) {
                            m_score ++; textField_judge8.setText("√");
                        }else {textField_judge8.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A8.isSelected() && !radioButton_B8.isSelected() && !radioButton_C8.isSelected() && radioButton_D8.isSelected()) {
                            m_score ++; textField_judge8.setText("√");
                        }else {textField_judge8.setText("×");}
                        break;

                }
                /******第8题判断********/

                /******第9题判断********/
                switch (m_rightOption9) {
                    case "A":
                        if (radioButton_A9.isSelected() && !radioButton_B9.isSelected() && !radioButton_C9.isSelected() && !radioButton_D9.isSelected()) {
                            m_score ++; textField_judge9.setText("√");
                        }else {textField_judge9.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A9.isSelected() && radioButton_B9.isSelected() && !radioButton_C9.isSelected() && !radioButton_D9.isSelected()) {
                            m_score ++; textField_judge9.setText("√");
                        }else {textField_judge9.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A9.isSelected() && !radioButton_B9.isSelected() && radioButton_C9.isSelected() && !radioButton_D9.isSelected()) {
                            m_score ++; textField_judge9.setText("√");
                        }else {textField_judge9.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A9.isSelected() && !radioButton_B9.isSelected() && !radioButton_C9.isSelected() && radioButton_D9.isSelected()) {
                            m_score ++; textField_judge9.setText("√");
                        }else {textField_judge9.setText("×");}
                        break;

                }
                /******第9题判断********/

                /******第10题判断********/
                switch (m_rightOption10) {
                    case "A":
                        if (radioButton_A10.isSelected() && !radioButton_B10.isSelected() && !radioButton_C10.isSelected() && !radioButton_D10.isSelected()) {
                            m_score ++; textField_judge10.setText("√");
                        }else {textField_judge10.setText("×");}
                        break;

                    case "B":
                        if (!radioButton_A10.isSelected() && radioButton_B10.isSelected() && !radioButton_C10.isSelected() && !radioButton_D10.isSelected()) {
                            m_score ++; textField_judge10.setText("√");
                        }else {textField_judge10.setText("×");}
                        break;

                    case "C":
                        if (!radioButton_A10.isSelected() && !radioButton_B10.isSelected() && radioButton_C10.isSelected() && !radioButton_D10.isSelected()) {
                            m_score ++; textField_judge10.setText("√");
                        }else {textField_judge10.setText("×");}
                        break;

                    case "D":
                        if (!radioButton_A10.isSelected() && !radioButton_B10.isSelected() && !radioButton_C10.isSelected() && radioButton_D10.isSelected()) {
                            m_score ++; textField_judge10.setText("√");
                        }else {textField_judge10.setText("×");}
                        break;

                }
                /******第10题判断********/

                double temp1 = (double)m_score / (double)m_totalChoice * 100;
                DecimalFormat df = new DecimalFormat("#.00");  //正确率只保留小数点后两位
                String accuracy = df.format(temp1);
                textField_feedback.setText(" 选择题正确率： " + accuracy + "%");

            }
        });
        button_submit.setFont(new Font("宋体", Font.PLAIN, 30));
        button_submit.setBounds(63, 880, 123, 57);
        f.getContentPane().add(button_submit);

        JButton button_next = new JButton("下一题");
        button_next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton_A1.isSelected()) {FeedBack.m_choice1.append(" A");}
                if (radioButton_B1.isSelected()) {FeedBack.m_choice1.append(" B");}
                if (radioButton_C1.isSelected()) {FeedBack.m_choice1.append(" C");}
                if (radioButton_D1.isSelected()) {FeedBack.m_choice1.append(" D");}

                if (radioButton_A2.isSelected()) {FeedBack.m_choice2.append(" A");}
                if (radioButton_B2.isSelected()) {FeedBack.m_choice2.append(" B");}
                if (radioButton_C2.isSelected()) {FeedBack.m_choice2.append(" C");}
                if (radioButton_D2.isSelected()) {FeedBack.m_choice2.append(" D");}

                if (radioButton_A3.isSelected()) {FeedBack.m_choice3.append(" A");}
                if (radioButton_B3.isSelected()) {FeedBack.m_choice3.append(" B");}
                if (radioButton_C3.isSelected()) {FeedBack.m_choice3.append(" C");}
                if (radioButton_D3.isSelected()) {FeedBack.m_choice3.append(" D");}

                if (radioButton_A4.isSelected()) {FeedBack.m_choice4.append(" A");}
                if (radioButton_B4.isSelected()) {FeedBack.m_choice4.append(" B");}
                if (radioButton_C4.isSelected()) {FeedBack.m_choice4.append(" C");}
                if (radioButton_D4.isSelected()) {FeedBack.m_choice4.append(" D");}

                if (radioButton_A5.isSelected()) {FeedBack.m_choice5.append(" A");}
                if (radioButton_B5.isSelected()) {FeedBack.m_choice5.append(" B");}
                if (radioButton_C5.isSelected()) {FeedBack.m_choice5.append(" C");}
                if (radioButton_D5.isSelected()) {FeedBack.m_choice5.append(" D");}

                if (radioButton_A6.isSelected()) {FeedBack.m_choice6.append(" A");}
                if (radioButton_B6.isSelected()) {FeedBack.m_choice6.append(" B");}
                if (radioButton_C6.isSelected()) {FeedBack.m_choice6.append(" C");}
                if (radioButton_D6.isSelected()) {FeedBack.m_choice6.append(" D");}

                if (radioButton_A7.isSelected()) {FeedBack.m_choice7.append(" A");}
                if (radioButton_B7.isSelected()) {FeedBack.m_choice7.append(" B");}
                if (radioButton_C7.isSelected()) {FeedBack.m_choice7.append(" C");}
                if (radioButton_D7.isSelected()) {FeedBack.m_choice7.append(" D");}

                if (radioButton_A8.isSelected()) {FeedBack.m_choice8.append(" A");}
                if (radioButton_B8.isSelected()) {FeedBack.m_choice8.append(" B");}
                if (radioButton_C8.isSelected()) {FeedBack.m_choice8.append(" C");}
                if (radioButton_D8.isSelected()) {FeedBack.m_choice8.append(" D");}

                if (radioButton_A9.isSelected()) {FeedBack.m_choice9.append(" A");}
                if (radioButton_B9.isSelected()) {FeedBack.m_choice9.append(" B");}
                if (radioButton_C9.isSelected()) {FeedBack.m_choice9.append(" C");}
                if (radioButton_D9.isSelected()) {FeedBack.m_choice9.append(" D");}

                if (radioButton_A10.isSelected()) {FeedBack.m_choice10.append(" A");}
                if (radioButton_B10.isSelected()) {FeedBack.m_choice10.append(" B");}
                if (radioButton_C10.isSelected()) {FeedBack.m_choice10.append(" C");}
                if (radioButton_D10.isSelected()) {FeedBack.m_choice10.append(" D");}

                FeedBack.m_optionContent1  = getOptionContent(radioButton_A1, radioButton_B1, radioButton_C1, radioButton_D1);
                FeedBack.m_optionContent2  = getOptionContent(radioButton_A2, radioButton_B2, radioButton_C2, radioButton_D2);
                FeedBack.m_optionContent3  = getOptionContent(radioButton_A3, radioButton_B3, radioButton_C3, radioButton_D3);
                FeedBack.m_optionContent4  = getOptionContent(radioButton_A4, radioButton_B4, radioButton_C4, radioButton_D4);
                FeedBack.m_optionContent5  = getOptionContent(radioButton_A5, radioButton_B5, radioButton_C5, radioButton_D5);
                FeedBack.m_optionContent6  = getOptionContent(radioButton_A6, radioButton_B6, radioButton_C6, radioButton_D6);
                FeedBack.m_optionContent7  = getOptionContent(radioButton_A7, radioButton_B7, radioButton_C7, radioButton_D7);
                FeedBack.m_optionContent8  = getOptionContent(radioButton_A8, radioButton_B8, radioButton_C8, radioButton_D8);
                FeedBack.m_optionContent9  = getOptionContent(radioButton_A9, radioButton_B9, radioButton_C9, radioButton_D9);
                FeedBack.m_optionContent10 = getOptionContent(radioButton_A10, radioButton_B10, radioButton_C10, radioButton_D10);



                f.dispose();
                EasyJudge.doJudge();
            }
        });
        button_next.setFont(new Font("宋体", Font.PLAIN, 30));
        button_next.setBounds(225, 880, 150, 57);
        f.getContentPane().add(button_next);
        f.setBounds(50, 50, 879, 1047);



    } //doChoice



    /**随机指定一个选项为正确选项**/
    public static String randomSetRight(JRadioButton buttonA, JRadioButton buttonB, JRadioButton buttonC, JRadioButton buttonD, int right) {
        Random random = new Random();    //int number = random.nextInt(max)%(max-min+1) + min
        /*干扰选项用数*/
        int disturb1 = random.nextInt(10)%(10) + 1;  //disturb1为1到10之间的整数
        int disturb2 = random.nextInt(10)%(10) + 1;  //disturb2为1到10之间的整数
        int disturb3 = random.nextInt(10)%(10) + 1;  //disturb3为1到10之间的整数

        int randomSet = random.nextInt(4)%(4) + 1;  //randomSet为1到4之间的整数

        switch (randomSet) {
            case 1:
                buttonA.setText("A. " + String.valueOf(right));
                buttonB.setText("B. " + String.valueOf(right + disturb1));
                buttonC.setText("C. " + String.valueOf(right - disturb2));
                buttonD.setText("D. " + String.valueOf(right + disturb3));
                return "A";  //返回正确选项

            case 2:
                buttonA.setText("A. " + String.valueOf(right + disturb1));
                buttonB.setText("B. " + String.valueOf(right));
                buttonC.setText("C. " + String.valueOf(right - disturb2));
                buttonD.setText("D. " + String.valueOf(right + disturb3));
                return "B";  //返回正确选项

            case 3:
                buttonA.setText("A. " + String.valueOf(right + disturb1));
                buttonB.setText("B. " + String.valueOf(right - disturb2));
                buttonC.setText("C. " + String.valueOf(right));
                buttonD.setText("D. " + String.valueOf(right + disturb3));
                return "C";  //返回正确选项

            case 4:
                buttonA.setText("A. " + String.valueOf(right + disturb1));
                buttonB.setText("B. " + String.valueOf(right - disturb2));
                buttonC.setText("C. " + String.valueOf(right + disturb3));
                buttonD.setText("D. " + String.valueOf(right));
                return "D";  //返回正确选项

        }
        return null;


    } //randomSetRight

    /**得到选项内容**/
    public static String getOptionContent(JRadioButton buttonA, JRadioButton buttonB, JRadioButton buttonC, JRadioButton buttonD) {
        String content = "\t" + buttonA.getText() + "\t" + buttonB.getText() + "\t" + buttonC.getText() + "\t" + buttonD.getText();
        return content;
    }

}