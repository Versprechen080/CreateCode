package com.arijeta.Exercise;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;

public class myPassWord {
    private  static void placeComponents(JPanel panel)
    {
        panel.setLayout(null);

        //创建文本域用于显示随机生成的密码
        JTextField code=new JTextField(20);
        code.setBounds(120,40,120,30);
        panel.add(code);

        //创建生成随机密码按钮
        JButton createCode=new JButton("生成随机密码");
        createCode.setBounds(120,120,120,30);
        createCode.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ffcode=createCode(8);
                code.setText(ffcode);
                //code.setBackground(Color.cyan);
            }
        });
        panel.add(createCode);



    }

    //随机生成密码
    public static String createCode(int n)
    {
        String code=" ";
        Random r=new Random();
        for(int i=0;i<n;i++)
        {
            int type=r.nextInt(3);
            switch(type)
            {
                case 0:
                    char ch=(char)(r.nextInt(26)+65);
                    code+=ch;
                    break;
                case 1:
                    char ch1=(char)(r.nextInt(26)+97);
                    code+=ch1;
                    break;
                case 2:
                    code+=r.nextInt(10);
                    break;

            }
        }
        return code;
    }

    public static void main(String[] args)
    {
        //创建JFrame实例
        JFrame frame=new JFrame("iPassword Generator");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //创建面板
        JPanel panel=new JPanel();

        //添加面板
        frame.add(panel);

        //调用用户定义的方法并添加组件到面板
        placeComponents(panel);

        //设置界面可见
        frame.setVisible(true);


    }
}
