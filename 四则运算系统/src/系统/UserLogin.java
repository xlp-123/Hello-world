package 系统;





import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class UserLogin {

    /**登录跳转方法**/
    public static void login() {


        //插入背景图片
        ImageIcon ph=new ImageIcon("src/wall.jpg");
        JLabel pho=new JLabel(ph);
        pho.setBounds(0,0,ph.getIconWidth(),ph.getIconHeight());

        JFrame f = new JFrame("四则运算自测系统");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口是否可以关闭
        f.setVisible(true);
        //

         //在底层添加label
        f.getLayeredPane().add(pho,new Integer(Integer.MIN_VALUE));
        JPanel panel=new JPanel();
        JPanel panelTop=new JPanel();
        panelTop=(JPanel)f.getContentPane();
        //设置为
        panelTop.setOpaque(false);
        panel.setOpaque(false);
        f.add(panel);
        f.setVisible(true);

        //设置窗口的大小和位置
        //f.setSize(500,316);
        f.setSize(512,512);
        f.setLocation(420,120);
        Container container = f.getContentPane();//获取当前窗口的内容窗格
        container.setLayout(null);

        JLabel label_userName = new JLabel("用户名: ");
        label_userName.setBackground(Color.CYAN);
        label_userName.setFont(new Font("宋体", Font.BOLD, 30));
        label_userName.setBounds(54, 15, 137, 45);
        //label_userName.setBounds(300,100,137,45);
        container.add(label_userName);
        //创建文本域用于用户输入
        JTextField textField_userName = new JTextField();
        textField_userName.setFont(new Font("宋体", Font.HANGING_BASELINE, 26));
        textField_userName.setBounds(195, 21, 223, 29);
        //textField_userName.setBounds(450, 110, 223, 29);
        container.add(textField_userName);

        JLabel label_password = new JLabel("密码 : ");
        label_password.setFont(new Font("宋体", Font.PLAIN, 30));
        //label_password.setBounds(300, 200, 126, 29);
        label_password.setBounds(54,40,137,45);
        container.add(label_password);
         //写入密码
        JPasswordField passwordField_password = new JPasswordField();
        passwordField_password.setFont(new Font("宋体", Font.PLAIN, 26));
        //passwordField_password.setBounds(450, 210, 223, 29);
        passwordField_password.setBounds(195,80,223,29);
        container.add(passwordField_password);



        JButton button_log = new JButton("登录");
        button_log.setFont(new Font("宋体", Font.PLAIN, 26));
        button_log.setBounds(107, 169, 100, 59);
        container.add(button_log);
        button_log.addActionListener(new ActionListener() {



            @Override
            public void actionPerformed(ActionEvent arg0) {
                //用户名或密码为空情况
                if (textField_userName.getText().trim().length() == 0 || new String(passwordField_password.getPassword()).trim().length() == 0) {
                    OptionPane.showMessage("用户名和密码不能为空");
                    return;
                }

                //用户名与密码符合
                if (textField_userName.getText().trim().equals("1")&&new String(passwordField_password.getPassword()).trim().equals("1")) {
                    f.dispose();   //关闭当前登录界面
                    Settings.settings();  //跳转到设置界面
                    return;
                }

                //用户名和密码错误情况
                else {
                    OptionPane.showMessage("用户名或密码错误");
                    return;
                }

            }
        });


        JButton button_reset = new JButton("重置");
        button_reset.setFont(new Font("宋体", Font.PLAIN, 26));
        //button_reset.setBounds(550, 300, 100, 59);
        button_reset.setBounds(292,169,100,59);
        container.add(button_reset);
        button_reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField_userName.setText("");
                passwordField_password.setText("");
            }
        });

    }  //void login

    public static void main(String[] args) {
        login();
    }

}