package com.itheima02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AttenddanceQurey {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setTitle("事件监听机制");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        JLabel dateLable = new JLabel("考勤日期");
        dateLable.setBounds(50, 20, 100, 20);
        jf.add(dateLable);


        JLabel startDateLable = new JLabel("开始时间");
        startDateLable.setBounds(50, 70, 100, 20);
        jf.add(startDateLable);

        DateChooser dateChooser =DateChooser.getINstance("yyyy/MM/dd");
        JLabel timeLable = new JLabel("时间");
        timeLable.setBounds(50, 150, 100, 20);
        jf.add(timeLable);

        JTextField startDateField = new JTextField();
        startDateField.setBounds(50, 100, 100, 20);
        dateChooser.register(startDateField);
        jf.add(startDateField);



        JLabel endTimeLable = new JLabel("结束时间");
        endTimeLable.setBounds(250, 70, 100, 20);
        jf.add(endTimeLable);

        JTextField endDateField = new JTextField();
        endDateField.setBounds(50, 100, 100, 20);
        dateChooser2.register(endDateField);
        jf.add(endDateField);

        JButton comfitButton = new JButton("确定");
        comfitButton.setBounds(250, 180, 60, 20);
        jf.add(comfitButton);

        comfitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
                String startDateString = startDateField.getText();
                String endDateString = endDateField.getText();

                try {
                    Date startDate = sdf.parse(startDateString);
                    Date endDate = sdf.parse(endDateString);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        jf.setVisible(true);
    }
}
