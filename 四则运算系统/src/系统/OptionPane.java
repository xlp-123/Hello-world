package 系统;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPane {


    public static void showMessage(String message) {
        JFrame f = new JFrame("出错信息");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.getContentPane().setLayout(null);

        JLabel label_message = new JLabel(message);
        label_message.setFont(new Font("宋体", Font.PLAIN, 30));
        label_message.setBounds(82, 75, 445, 92);
        f.getContentPane().add(label_message);

        JButton button_confirm = new JButton("确认");
        button_confirm.setFont(new Font("宋体", Font.PLAIN, 40));
        button_confirm.setBounds(-12, 220, 609, 84);
        f.getContentPane().add(button_confirm);
        f.setBounds(50, 50, 608, 360);
        button_confirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();

            }
        });


    }

}

