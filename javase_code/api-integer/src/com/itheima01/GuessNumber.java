package com.itheima01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setTitle("猜数字");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        //提示信息
        Random r=new Random();
        int number=r.nextInt(100)+1;
        JLabel messageArea = new JLabel("系统产生了一个1-100之间的数字，请猜一猜");
        messageArea.setBounds(70, 50, 350, 20);
        jf.add(messageArea);

        //输入要猜的数字
        JTextField numberField = new JTextField();
        numberField.setBounds(120, 100, 150, 20);
        jf.add(numberField);
        //猜数字的按钮
        JButton guessButton = new JButton("猜一猜");
        guessButton.setBounds(150, 150, 100, 20);
        jf.add(guessButton);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringNumber = numberField.getText().trim();
                if (stringNumber.equals("")){
                    JOptionPane.showMessageDialog(jf,"猜的数字不能为空");
                }
                int guessNumber = Integer.parseInt(stringNumber);
                if (guessNumber>number){
                    JOptionPane.showMessageDialog(jf,"猜大了");
                    numberField.setText("");
                } else if (guessNumber<number) {
                    JOptionPane.showMessageDialog(jf,"猜小了");
                    numberField.setText("");
                }else {
                    JOptionPane.showMessageDialog(jf,"恭喜你猜中了");
                }
            }
        });
        jf.setVisible(true);
    }
}
