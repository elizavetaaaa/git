package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {

        dict mydict = new dict();
        //Question myquestion = new Question();

        //here I will use:
        JPanel p, p1, p2;
        JLabel title, title1;
        JTextField input;
        JButton inputButton;

        //Defining my frame
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new BorderLayout() );
        myFrame = new JFrame("Quiz game");
        myFrame.setBounds(0, 0, 300, 200);


        //Defining panels
        p = new JPanel();
        myFrame.add(p, BorderLayout.NORTH);

        p1 = new JPanel();
        myFrame.add(p1, BorderLayout.CENTER);

        p2= new JPanel();
        myFrame.add(p2, BorderLayout.SOUTH);



        //Defining Label for question
            title1 = new JLabel("Question:");//label for 1 panel
            title1.setForeground(Color.BLUE);
            title = new JLabel("Here wiil be the question!");//label for 2 panel
            title.setBounds(60, 7, 200, 30);

        // Defining input for answer
            input = new JTextField("write here",SwingConstants.CENTER);
            input.setForeground(Color.GRAY);
            input.setPreferredSize(new Dimension(100,25));

        //очищение инпута при касании курсором
            input.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                input.setText("");
            }
        });








        //Defining inputButton Button
            inputButton = new JButton("submit");
            inputButton.setBounds(210, 50, 80, 30);


         //изменяет содержимое label title при нажатии кнопки
            inputButton.addActionListener(new ActionListener() {
                @Override
            public void actionPerformed(ActionEvent e) {
                String a = input.getText();
                //String b = toString();
                title.setText(mydict.getQuestion(0).getQuestion());
                input.setText("");
                if (a.equals("london"))
                    System.out.println("true");
                else
                    System.out.println("false");
            }
        });





            p.add(title1);
            p1.add(title);
            p2.add(input);
            p2.add(inputButton);

        System.out.println(mydict.getQuestion(0));

            myFrame.setVisible(true);


        }


}



