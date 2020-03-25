package 系统;



import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;

public class FeedBack {
    protected static String m_mode = Settings.m_modeOption;  //获得难度模式


    protected static StringBuffer m_choice1  = new StringBuffer("");
    protected static StringBuffer m_choice2  = new StringBuffer("");
    protected static StringBuffer m_choice3  = new StringBuffer("");
    protected static StringBuffer m_choice4  = new StringBuffer("");
    protected static StringBuffer m_choice5  = new StringBuffer("");
    protected static StringBuffer m_choice6  = new StringBuffer("");
    protected static StringBuffer m_choice7  = new StringBuffer("");
    protected static StringBuffer m_choice8  = new StringBuffer("");
    protected static StringBuffer m_choice9  = new StringBuffer("");
    protected static StringBuffer m_choice10 = new StringBuffer("");

    protected static StringBuffer m_judge1  = new StringBuffer("");
    protected static StringBuffer m_judge2  = new StringBuffer("");
    protected static StringBuffer m_judge3  = new StringBuffer("");
    protected static StringBuffer m_judge4  = new StringBuffer("");
    protected static StringBuffer m_judge5  = new StringBuffer("");
    protected static StringBuffer m_judge6  = new StringBuffer("");
    protected static StringBuffer m_judge7  = new StringBuffer("");
    protected static StringBuffer m_judge8  = new StringBuffer("");
    protected static StringBuffer m_judge9  = new StringBuffer("");
    protected static StringBuffer m_judge10 = new StringBuffer("");

    protected static String m_optionContent1;
    protected static String m_optionContent2;
    protected static String m_optionContent3;
    protected static String m_optionContent4;
    protected static String m_optionContent5;
    protected static String m_optionContent6;
    protected static String m_optionContent7;
    protected static String m_optionContent8;
    protected static String m_optionContent9;
    protected static String m_optionContent10;

    public static void giveFeedback() {
        JFrame f = new JFrame("总结");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.getContentPane().setLayout(null);
        f.setBounds(420, 120, 1000, 800);




        /******************************恭喜完成测试**********************************/
        JLabel label_congratulation = new JLabel("恭喜完成测试！");
        label_congratulation.setFont(new Font("宋体", Font.PLAIN, 30));
        label_congratulation.setBounds(270, 31, 210, 38);
        f.getContentPane().add(label_congratulation);
        /******************************恭喜完成测试**********************************/


        /*******************************主反馈区***********************************/
         //文本域创建
        JTextArea textArea_mainFeedback = new JTextArea();
        textArea_mainFeedback.setEditable(false);


        /*******************************填空题反馈区***********************************/
        if (m_mode.equals("简单")) {
            textArea_mainFeedback.append("填空题情况: \n");
            textArea_mainFeedback.append(" 一共 " + EasyFillBlank.m_totalBlank + " 题\n");
            textArea_mainFeedback.append(" 答对 " + EasyFillBlank.m_score + " 题\n");


            switch(Settings.m_blankAmount) {
                case 0:
                    break;

                case 1:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    break;

                case 2:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    break;

                case 3:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right1) + "; 您的答案: " + EasyFillBlank.textField_answer1.getText() + "\n");
                    break;

                case 4:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right1) + "; 您的答案: " + EasyFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right6) + "; 您的答案: " + EasyFillBlank.textField_answer6.getText() + "\n");
                    break;

                case 5:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right1) + "; 您的答案: " + EasyFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right6) + "; 您的答案: " + EasyFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right2) + "; 您的答案: " + EasyFillBlank.textField_answer2.getText() + "\n");
                    break;

                case 6:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right1) + "; 您的答案: " + EasyFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right6) + "; 您的答案: " + EasyFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right2) + "; 您的答案: " + EasyFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right7) + "; 您的答案: " + EasyFillBlank.textField_answer7.getText() + "\n");
                    break;

                case 7:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right1) + "; 您的答案: " + EasyFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right6) + "; 您的答案: " + EasyFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right2) + "; 您的答案: " + EasyFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right7) + "; 您的答案: " + EasyFillBlank.textField_answer7.getText() + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyFillBlank.textField_question3.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right3) + "; 您的答案: " + EasyFillBlank.textField_answer3.getText() + "\n");
                    break;

                case 8:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right1) + "; 您的答案: " + EasyFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right6) + "; 您的答案: " + EasyFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right2) + "; 您的答案: " + EasyFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right7) + "; 您的答案: " + EasyFillBlank.textField_answer7.getText() + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyFillBlank.textField_question3.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right3) + "; 您的答案: " + EasyFillBlank.textField_answer3.getText() + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyFillBlank.textField_question8.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right8) + "; 您的答案: " + EasyFillBlank.textField_answer8.getText() + "\n");
                    break;

                case 9:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right1) + "; 您的答案: " + EasyFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right6) + "; 您的答案: " + EasyFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right2) + "; 您的答案: " + EasyFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right7) + "; 您的答案: " + EasyFillBlank.textField_answer7.getText() + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyFillBlank.textField_question3.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right3) + "; 您的答案: " + EasyFillBlank.textField_answer3.getText() + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyFillBlank.textField_question8.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right8) + "; 您的答案: " + EasyFillBlank.textField_answer8.getText() + "\n");
                    textArea_mainFeedback.append("  第九题: " + EasyFillBlank.textField_question4.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right4) + "; 您的答案: " + EasyFillBlank.textField_answer4.getText() + "\n");
                    break;

                case 10:
                    textArea_mainFeedback.append("  第一题: " + EasyFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right0) + "; 您的答案: " + EasyFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right5) + "; 您的答案: " + EasyFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right1) + "; 您的答案: " + EasyFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right6) + "; 您的答案: " + EasyFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right2) + "; 您的答案: " + EasyFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right7) + "; 您的答案: " + EasyFillBlank.textField_answer7.getText() + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyFillBlank.textField_question3.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right3) + "; 您的答案: " + EasyFillBlank.textField_answer3.getText() + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyFillBlank.textField_question8.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right8) + "; 您的答案: " + EasyFillBlank.textField_answer8.getText() + "\n");
                    textArea_mainFeedback.append("  第九题: " + EasyFillBlank.textField_question4.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right4) + "; 您的答案: " + EasyFillBlank.textField_answer4.getText() + "\n");
                    textArea_mainFeedback.append("  第十题: " + EasyFillBlank.textField_question9.getText() + "\t正确答案: " + String.valueOf(EasyFillBlank.m_right9) + "; 您的答案: " + EasyFillBlank.textField_answer9.getText() + "\n");
                    break;
            }

            textArea_mainFeedback.append(EasyFillBlank.textField_feedback.getText() + "\n\n\n"); //正确率
            /***************************************************填空题反馈区*****************************************************/

            /***************************************************选择题反馈区*****************************************************/

            textArea_mainFeedback.append("选择题情况: \n");
            textArea_mainFeedback.append(" 一共 " + EasyChoice.m_totalChoice + " 题\n");
            textArea_mainFeedback.append(" 答对 " + EasyChoice.m_score + " 题\n");
            switch (Settings.m_choiceAmount) {
                case 1:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    break;
                case 2:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    break;
                case 3:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + EasyChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    break;
                case 4:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + EasyChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + EasyChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    break;
                case 5:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + EasyChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + EasyChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + EasyChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    break;
                case 6:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + EasyChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + EasyChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + EasyChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + EasyChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    break;
                case 7:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + EasyChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + EasyChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + EasyChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + EasyChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyChoice.textField_question7.getText() + m_optionContent7 + "\t正确答案:" + EasyChoice.m_rightOption7 + "\t您的答案:" + FeedBack.m_choice7 + "\n");
                    break;
                case 8:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + EasyChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + EasyChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + EasyChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + EasyChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyChoice.textField_question7.getText() + m_optionContent7 + "\t正确答案:" + EasyChoice.m_rightOption7 + "\t您的答案:" + FeedBack.m_choice7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyChoice.textField_question8.getText() + m_optionContent8 + "\t正确答案:" + EasyChoice.m_rightOption8 + "\t您的答案:" + FeedBack.m_choice8 + "\n");
                    break;
                case 9:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + EasyChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + EasyChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + EasyChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + EasyChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyChoice.textField_question7.getText() + m_optionContent7 + "\t正确答案:" + EasyChoice.m_rightOption7 + "\t您的答案:" + FeedBack.m_choice7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyChoice.textField_question8.getText() + m_optionContent8 + "\t正确答案:" + EasyChoice.m_rightOption8 + "\t您的答案:" + FeedBack.m_choice8 + "\n");
                    textArea_mainFeedback.append("  第九题: " + EasyChoice.textField_question9.getText() + m_optionContent9 + "\t正确答案:" + EasyChoice.m_rightOption9 + "\t您的答案:" + FeedBack.m_choice9 + "\n");
                    break;
                case 10:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + EasyChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + EasyChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + EasyChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + EasyChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + EasyChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + EasyChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyChoice.textField_question7.getText() + m_optionContent7 + "\t正确答案:" + EasyChoice.m_rightOption7 + "\t您的答案:" + FeedBack.m_choice7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyChoice.textField_question8.getText() + m_optionContent8 + "\t正确答案:" + EasyChoice.m_rightOption8 + "\t您的答案:" + FeedBack.m_choice8 + "\n");
                    textArea_mainFeedback.append("  第九题: " + EasyChoice.textField_question9.getText() + m_optionContent9 + "\t正确答案:" + EasyChoice.m_rightOption9 + "\t您的答案:" + FeedBack.m_choice9 + "\n");
                    textArea_mainFeedback.append("  第十题: " + EasyChoice.textField_question10.getText() + m_optionContent10 + "\t正确答案:" + EasyChoice.m_rightOption10 + "\t您的答案:" + FeedBack.m_choice10 + "\n");
                    break;

                default:
                    break;
            }

            textArea_mainFeedback.append(EasyChoice.textField_feedback.getText() + "\n\n\n"); //正确率

            /***************************************************选择题反馈区*****************************************************/

            /***************************************************判断题反馈区*****************************************************/

            textArea_mainFeedback.append("判断题情况: \n");
            textArea_mainFeedback.append(" 一共 " + EasyJudge.m_totalJudge + " 题\n");
            textArea_mainFeedback.append(" 答对 " + EasyJudge.m_score + " 题\n");
            switch(Settings.m_judgeAmount) {
                case 1:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    break;
                case 2:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    break;
                case 3:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyJudge.textField_question3.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    break;
                case 4:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyJudge.textField_question3.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyJudge.textField_question4.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    break;
                case 5:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyJudge.textField_question3.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyJudge.textField_question4.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyJudge.textField_question5.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    break;
                case 6:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyJudge.textField_question3.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyJudge.textField_question4.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyJudge.textField_question5.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyJudge.textField_question6.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    break;
                case 7:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyJudge.textField_question3.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyJudge.textField_question4.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyJudge.textField_question5.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyJudge.textField_question6.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyJudge.textField_question7.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge7 + "您的答案:" + FeedBack.m_judge7 + "\n");
                    break;
                case 8:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyJudge.textField_question3.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyJudge.textField_question4.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyJudge.textField_question5.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyJudge.textField_question6.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyJudge.textField_question7.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge7 + "您的答案:" + FeedBack.m_judge7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyJudge.textField_question8.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge8 + "您的答案:" + FeedBack.m_judge8 + "\n");
                    break;
                case 9:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyJudge.textField_question3.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyJudge.textField_question4.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyJudge.textField_question5.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyJudge.textField_question6.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyJudge.textField_question7.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge7 + "您的答案:" + FeedBack.m_judge7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyJudge.textField_question8.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge8 + "您的答案:" + FeedBack.m_judge8 + "\n");
                    textArea_mainFeedback.append("  第九题: " + EasyJudge.textField_question9.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge9 + "您的答案:" + FeedBack.m_judge9 + "\n");
                    break;
                case 10:
                    textArea_mainFeedback.append("  第一题: " + EasyJudge.textField_question1.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyJudge.textField_question2.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyJudge.textField_question3.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyJudge.textField_question4.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyJudge.textField_question5.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyJudge.textField_question6.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyJudge.textField_question7.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge7 + "您的答案:" + FeedBack.m_judge7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyJudge.textField_question8.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge8 + "您的答案:" + FeedBack.m_judge8 + "\n");
                    textArea_mainFeedback.append("  第九题: " + EasyJudge.textField_question9.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge9 + "您的答案:" + FeedBack.m_judge9 + "\n");
                    textArea_mainFeedback.append("  第十题: " + EasyJudge.textField_question10.getText() + "\t\t正确答案:" + EasyJudge.m_rightJudge10 + "您的答案:" + FeedBack.m_judge10 + "\n");
                    break;

                default:
                    break;
            } //switch


            textArea_mainFeedback.append(EasyJudge.textField_feedback.getText() + "\n\n\n"); //正确率

            /***************************************************判断题反馈区*****************************************************/

        }   //if
        if (m_mode.equals("10以内")) {
            textArea_mainFeedback.append("填空题情况: \n");
            textArea_mainFeedback.append(" 一共 " + TenFillBlank.m_totalBlank + " 题\n");
            textArea_mainFeedback.append(" 答对 " + TenFillBlank.m_score + " 题\n");


            switch (Settings.m_blankAmount) {
                case 0:
                    break;

                case 1:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    break;

                case 2:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    break;

                case 3:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right1) + "; 您的答案: " + TenFillBlank.textField_answer1.getText() + "\n");
                    break;

                case 4:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right1) + "; 您的答案: " + TenFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right6) + "; 您的答案: " + TenFillBlank.textField_answer6.getText() + "\n");
                    break;

                case 5:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right1) + "; 您的答案: " + TenFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right6) + "; 您的答案: " + TenFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right2) + "; 您的答案: " + TenFillBlank.textField_answer2.getText() + "\n");
                    break;

                case 6:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right1) + "; 您的答案: " + TenFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right6) + "; 您的答案: " + TenFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right2) + "; 您的答案: " + TenFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right7) + "; 您的答案: " + TenFillBlank.textField_answer7.getText() + "\n");
                    break;

                case 7:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right1) + "; 您的答案: " + TenFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right6) + "; 您的答案: " + TenFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right2) + "; 您的答案: " + TenFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right7) + "; 您的答案: " + TenFillBlank.textField_answer7.getText() + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenFillBlank.textField_question3.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right3) + "; 您的答案: " + TenFillBlank.textField_answer3.getText() + "\n");
                    break;

                case 8:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right1) + "; 您的答案: " + TenFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right6) + "; 您的答案: " + TenFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right2) + "; 您的答案: " + TenFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right7) + "; 您的答案: " + TenFillBlank.textField_answer7.getText() + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenFillBlank.textField_question3.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right3) + "; 您的答案: " + TenFillBlank.textField_answer3.getText() + "\n");
                    textArea_mainFeedback.append("  第八题: " + TenFillBlank.textField_question8.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right8) + "; 您的答案: " + TenFillBlank.textField_answer8.getText() + "\n");
                    break;

                case 9:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right1) + "; 您的答案: " + TenFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right6) + "; 您的答案: " + TenFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right2) + "; 您的答案: " + TenFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right7) + "; 您的答案: " + TenFillBlank.textField_answer7.getText() + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenFillBlank.textField_question3.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right3) + "; 您的答案: " + TenFillBlank.textField_answer3.getText() + "\n");
                    textArea_mainFeedback.append("  第八题: " + TenFillBlank.textField_question8.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right8) + "; 您的答案: " + TenFillBlank.textField_answer8.getText() + "\n");
                    textArea_mainFeedback.append("  第九题: " + TenFillBlank.textField_question4.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right4) + "; 您的答案: " + TenFillBlank.textField_answer4.getText() + "\n");
                    break;

                case 10:
                    textArea_mainFeedback.append("  第一题: " + TenFillBlank.textField_question0.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right0) + "; 您的答案: " + TenFillBlank.textField_answer0.getText() + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenFillBlank.textField_question5.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right5) + "; 您的答案: " + TenFillBlank.textField_answer5.getText() + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenFillBlank.textField_question1.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right1) + "; 您的答案: " + TenFillBlank.textField_answer1.getText() + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenFillBlank.textField_question6.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right6) + "; 您的答案: " +TenFillBlank.textField_answer6.getText() + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenFillBlank.textField_question2.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right2) + "; 您的答案: " + TenFillBlank.textField_answer2.getText() + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenFillBlank.textField_question7.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right7) + "; 您的答案: " + TenFillBlank.textField_answer7.getText() + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenFillBlank.textField_question3.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right3) + "; 您的答案: " + TenFillBlank.textField_answer3.getText() + "\n");
                    textArea_mainFeedback.append("  第八题: " + TenFillBlank.textField_question8.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right8) + "; 您的答案: " + TenFillBlank.textField_answer8.getText() + "\n");
                    textArea_mainFeedback.append("  第九题: " + TenFillBlank.textField_question4.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right4) + "; 您的答案: " + TenFillBlank.textField_answer4.getText() + "\n");
                    textArea_mainFeedback.append("  第十题: " + TenFillBlank.textField_question9.getText() + "\t正确答案: " + String.valueOf(TenFillBlank.m_right9) + "; 您的答案: " + TenFillBlank.textField_answer9.getText() + "\n");
                    break;
            }

            textArea_mainFeedback.append(TenFillBlank.textField_feedback.getText() + "\n\n\n"); //正确率
            /***************************************************填空题反馈区*****************************************************/

            /***************************************************选择题反馈区*****************************************************/

            textArea_mainFeedback.append("选择题情况: \n");
            textArea_mainFeedback.append(" 一共 " + TenChoice.m_totalChoice + " 题\n");
            textArea_mainFeedback.append(" 答对 " + TenChoice.m_score + " 题\n");
            switch (Settings.m_choiceAmount) {
                case 1:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    break;
                case 2:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    break;
                case 3:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + TenChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    break;
                case 4:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + TenChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + TenChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    break;
                case 5:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + TenChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + TenChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + TenChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    break;
                case 6:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + TenChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + TenChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + TenChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + TenChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    break;
                case 7:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + TenChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + TenChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + TenChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + TenChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenChoice.textField_question7.getText() + m_optionContent7 + "\t正确答案:" + TenChoice.m_rightOption7 + "\t您的答案:" + FeedBack.m_choice7 + "\n");
                    break;
                case 8:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + TenChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + TenChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + TenChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + TenChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenChoice.textField_question7.getText() + m_optionContent7 + "\t正确答案:" + TenChoice.m_rightOption7 + "\t您的答案:" + FeedBack.m_choice7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + TenChoice.textField_question8.getText() + m_optionContent8 + "\t正确答案:" + TenChoice.m_rightOption8 + "\t您的答案:" + FeedBack.m_choice8 + "\n");
                    break;
                case 9:
                    textArea_mainFeedback.append("  第一题: " + TenChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + TenChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + TenChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + TenChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + TenChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyChoice.textField_question7.getText() + m_optionContent7 + "\t正确答案:" + TenChoice.m_rightOption7 + "\t您的答案:" + FeedBack.m_choice7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyChoice.textField_question8.getText() + m_optionContent8 + "\t正确答案:" + TenChoice.m_rightOption8 + "\t您的答案:" + FeedBack.m_choice8 + "\n");
                    textArea_mainFeedback.append("  第九题: " + EasyChoice.textField_question9.getText() + m_optionContent9 + "\t正确答案:" + TenChoice.m_rightOption9 + "\t您的答案:" + FeedBack.m_choice9 + "\n");
                    break;
                case 10:
                    textArea_mainFeedback.append("  第一题: " + EasyChoice.textField_question1.getText() + m_optionContent1 + "\t正确答案:" + TenChoice.m_rightOption1 + "\t您的答案:" + FeedBack.m_choice1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + EasyChoice.textField_question2.getText() + m_optionContent2 + "\t正确答案:" + TenChoice.m_rightOption2 + "\t您的答案:" + FeedBack.m_choice2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + EasyChoice.textField_question3.getText() + m_optionContent3 + "\t正确答案:" + TenChoice.m_rightOption3 + "\t您的答案:" + FeedBack.m_choice3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + EasyChoice.textField_question4.getText() + m_optionContent4 + "\t正确答案:" + TenChoice.m_rightOption4 + "\t您的答案:" + FeedBack.m_choice4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + EasyChoice.textField_question5.getText() + m_optionContent5 + "\t正确答案:" + TenChoice.m_rightOption5 + "\t您的答案:" + FeedBack.m_choice5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + EasyChoice.textField_question6.getText() + m_optionContent6 + "\t正确答案:" + TenChoice.m_rightOption6 + "\t您的答案:" + FeedBack.m_choice6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + EasyChoice.textField_question7.getText() + m_optionContent7 + "\t正确答案:" + TenChoice.m_rightOption7 + "\t您的答案:" + FeedBack.m_choice7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + EasyChoice.textField_question8.getText() + m_optionContent8 + "\t正确答案:" + TenChoice.m_rightOption8 + "\t您的答案:" + FeedBack.m_choice8 + "\n");
                    textArea_mainFeedback.append("  第九题: " + EasyChoice.textField_question9.getText() + m_optionContent9 + "\t正确答案:" + TenChoice.m_rightOption9 + "\t您的答案:" + FeedBack.m_choice9 + "\n");
                    textArea_mainFeedback.append("  第十题: " + EasyChoice.textField_question10.getText() + m_optionContent10 + "\t正确答案:" + TenChoice.m_rightOption10 + "\t您的答案:" + FeedBack.m_choice10 + "\n");
                    break;

                default:
                    break;
            }

            textArea_mainFeedback.append(TenChoice.textField_feedback.getText() + "\n\n\n"); //正确率

            /***************************************************选择题反馈区*****************************************************/

            /***************************************************判断题反馈区*****************************************************/

            textArea_mainFeedback.append("判断题情况: \n");
            textArea_mainFeedback.append(" 一共 " + TenJudge.m_totalJudge + " 题\n");
            textArea_mainFeedback.append(" 答对 " + TenJudge.m_score + " 题\n");
            switch (Settings.m_judgeAmount) {
                case 1:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    break;
                case 2:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    break;
                case 3:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenJudge.textField_question3.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    break;
                case 4:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenJudge.textField_question3.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenJudge.textField_question4.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    break;
                case 5:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenJudge.textField_question3.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenJudge.textField_question4.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenJudge.textField_question5.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    break;
                case 6:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenJudge.textField_question3.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenJudge.textField_question4.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenJudge.textField_question5.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenJudge.textField_question6.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    break;
                case 7:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenJudge.textField_question3.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenJudge.textField_question4.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenJudge.textField_question5.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenJudge.textField_question6.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenJudge.textField_question7.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge7 + "您的答案:" + FeedBack.m_judge7 + "\n");
                    break;
                case 8:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenJudge.textField_question3.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenJudge.textField_question4.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenJudge.textField_question5.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenJudge.textField_question6.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenJudge.textField_question7.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge7 + "您的答案:" + FeedBack.m_judge7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + TenJudge.textField_question8.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge8 + "您的答案:" + FeedBack.m_judge8 + "\n");
                    break;
                case 9:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenJudge.textField_question3.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenJudge.textField_question4.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenJudge.textField_question5.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenJudge.textField_question6.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenJudge.textField_question7.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge7 + "您的答案:" + FeedBack.m_judge7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + TenJudge.textField_question8.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge8 + "您的答案:" + FeedBack.m_judge8 + "\n");
                    textArea_mainFeedback.append("  第九题: " + TenJudge.textField_question9.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge9 + "您的答案:" + FeedBack.m_judge9 + "\n");
                    break;
                case 10:
                    textArea_mainFeedback.append("  第一题: " + TenJudge.textField_question1.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge1 + "您的答案:" + FeedBack.m_judge1 + "\n");
                    textArea_mainFeedback.append("  第二题: " + TenJudge.textField_question2.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge2 + "您的答案:" + FeedBack.m_judge2 + "\n");
                    textArea_mainFeedback.append("  第三题: " + TenJudge.textField_question3.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge3 + "您的答案:" + FeedBack.m_judge3 + "\n");
                    textArea_mainFeedback.append("  第四题: " + TenJudge.textField_question4.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge4 + "您的答案:" + FeedBack.m_judge4 + "\n");
                    textArea_mainFeedback.append("  第五题: " + TenJudge.textField_question5.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge5 + "您的答案:" + FeedBack.m_judge5 + "\n");
                    textArea_mainFeedback.append("  第六题: " + TenJudge.textField_question6.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge6 + "您的答案:" + FeedBack.m_judge6 + "\n");
                    textArea_mainFeedback.append("  第七题: " + TenJudge.textField_question7.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge7 + "您的答案:" + FeedBack.m_judge7 + "\n");
                    textArea_mainFeedback.append("  第八题: " + TenJudge.textField_question8.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge8 + "您的答案:" + FeedBack.m_judge8 + "\n");
                    textArea_mainFeedback.append("  第九题: " + TenJudge.textField_question9.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge9 + "您的答案:" + FeedBack.m_judge9 + "\n");
                    textArea_mainFeedback.append("  第十题: " + TenJudge.textField_question10.getText() + "\t\t正确答案:" + TenJudge.m_rightJudge10 + "您的答案:" + FeedBack.m_judge10 + "\n");
                    break;

                default:
                    break;
            }
        }





        textArea_mainFeedback.setFont(new Font("Monospaced", Font.PLAIN, 22));
        textArea_mainFeedback.setBackground(Color.lightGray);
        textArea_mainFeedback.setBounds(20, 80, 800, 600);
        //使滚动条一开始出现在顶部，默认状态为出现在底部
        textArea_mainFeedback.setSelectionStart(0);
        textArea_mainFeedback.setSelectionEnd(0);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 80, 750, 524);
        f.getContentPane().add(scrollPane);
        scrollPane.setViewportView(textArea_mainFeedback);


        /******************************导出结果按钮**********************************/

        JButton button_exportResult = new JButton("生成结果");  //导出的.txt文档存在D盘根目录下边
        button_exportResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                /***********导出结果**********/
                File file_feedback = new File("D:/生成的成绩文本.txt");

                try {
                    FileOutputStream out = new FileOutputStream(file_feedback);
                    try {
                        byte[] fileContent = textArea_mainFeedback.getText().replaceAll("\n", "\r\n").getBytes();
                        out.write(fileContent);
                    } catch (IOException e) {

                        e.printStackTrace();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }


            }
        });
        button_exportResult.setFont(new Font("宋体", Font.PLAIN, 25));
        button_exportResult.setBounds(86, 627, 140, 50);
        f.getContentPane().add(button_exportResult);

        /******************************导出结果按钮**********************************/

        /******************************退出程序按钮**********************************/

        JButton button_exit = new JButton("退出程序");
        button_exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose(); //关闭当前页面

            }
        });
        button_exit.setFont(new Font("宋体", Font.PLAIN, 25));
        button_exit.setBounds(508, 627, 140, 50);
        f.getContentPane().add(button_exit);


    }



}