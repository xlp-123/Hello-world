package 系统;

import java.awt.Container;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;


public class Settings {
    protected static String m_modeOption;  //难度模式
    protected static int m_blankAmount;    //填空题数
    protected static int m_choiceAmount;   //选择题数
    protected static int m_judgeAmount;    //判断题数
    private static JTextField textField_notice;

    /**设置界面**/
    public static void settings() {
        JFrame f = new JFrame("                                           个性选择界面                        ");
        //美化按键的一段代码
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e) {
            System.out.println(e);
        }


       /* ImageIcon ph=new ImageIcon("src/3.jpg");
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
        f.setVisible(true);*/

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.getContentPane().setLayout(null);
        f.setBounds(420, 120, 800, 800);

        Container container = f.getContentPane();



        JLabel label_mode = new JLabel("难度");
        label_mode.setFont(new Font("宋体", Font.PLAIN, 30));
        label_mode.setBounds(79, 84, 67, 40);
        container.add(label_mode);

        //难度选择
        JComboBox comboBox_mode = new JComboBox();
        comboBox_mode.setFont(new Font("宋体", Font.BOLD, 20));
        String [] modeOption = { " ", "10以内","100以内","带括号"};
        comboBox_mode.setModel(new DefaultComboBoxModel(modeOption));
        comboBox_mode.setBounds(56, 158, 109, 40);
        container.add(comboBox_mode);

        JLabel lable_blank = new JLabel("填空题");
        lable_blank.setFont(new Font("宋体", Font.PLAIN, 25));
        lable_blank.setBounds(495, 105, 81, 21);
        container.add(lable_blank);

        JLabel label_choice = new JLabel("选择题");
        label_choice.setFont(new Font("宋体", Font.PLAIN, 25));
        label_choice.setBounds(495, 216, 81, 21);
        container.add(label_choice);

        JLabel label_judge = new JLabel("判断题");
        label_judge.setFont(new Font("宋体", Font.PLAIN, 25));
        label_judge.setBounds(495, 325, 81, 21);
        container.add(label_judge);

        JLabel label_amount = new JLabel("题目数量");
        label_amount.setFont(new Font("宋体", Font.PLAIN, 25));
        label_amount.setBounds(630, 41, 100, 27);
        container.add(label_amount);

        //题目数量选择
        String [] amountOption = {"0", "1", "2", "3", "4", };
        /******创建下拉链表组件******/
        JComboBox comboBox_balnk = new JComboBox();
        comboBox_balnk.setFont(new Font("宋体", Font.PLAIN, 20));
        comboBox_balnk.setEditable(false);
        comboBox_balnk.setModel(new DefaultComboBoxModel(amountOption));
        comboBox_balnk.setBounds(621, 99, 109, 27);
        container.add(comboBox_balnk);

        JComboBox comboBox_choice = new JComboBox();
        comboBox_choice.setFont(new Font("宋体", Font.PLAIN, 20));
        comboBox_choice.setEditable(false);
        comboBox_choice.setModel(new DefaultComboBoxModel(amountOption));
        comboBox_choice.setBounds(621, 215, 109, 27);
        container.add(comboBox_choice);

        JComboBox comboBox_judge = new JComboBox();
        comboBox_judge.setFont(new Font("宋体", Font.PLAIN, 20));
        comboBox_judge.setEditable(false);
        comboBox_judge.setModel(new DefaultComboBoxModel(amountOption));
        comboBox_judge.setBounds(621, 324, 109, 27);
        container.add(comboBox_judge);

        JButton button_confirm = new JButton("确认");
        button_confirm.setFont(new Font("宋体", Font.PLAIN, 25));
        button_confirm.setBounds(50, 397, 300, 47);
        button_confirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                m_modeOption = (String) comboBox_mode.getSelectedItem();  //获得难度模式
                m_blankAmount = Integer.parseInt(comboBox_balnk.getSelectedItem().toString());  //获得填空题数量
                m_choiceAmount = Integer.parseInt(comboBox_choice.getSelectedItem().toString()); //获得选择题数量
                m_judgeAmount = Integer.parseInt(comboBox_judge.getSelectedItem().toString());  //获得判断题数量
                f.dispose();
                if (comboBox_mode.getSelectedItem().equals("简单")) {
                    EasyFillBlank.doFillBlank();   //跳转至简单填空题页面
                }
                if(comboBox_mode.getSelectedItem().equals("10以内")){
                    TenFillBlank.doFillBlank();
                }
                if(comboBox_mode.getSelectedItem().equals("100以内")){
                    HundredFillBlank.doFillBlank();
                }
                if(comboBox_mode.getSelectedItem().equals("带括号")){
                    DaiFillBlank.doFillBlank();
                }

                return ;
            }
        });
        container.add(button_confirm);

        JButton button_reset = new JButton("重置");
        button_reset.setFont(new Font("宋体", Font.PLAIN, 25));
        button_reset.setBounds(400, 397, 300, 47);
        button_reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox_mode.setSelectedItem(" ");
                comboBox_balnk.setSelectedItem("0");
                comboBox_choice.setSelectedItem("0");
                comboBox_judge.setSelectedItem("0");
            }
        });
        container.add(button_reset);








    } //void settings()




}
