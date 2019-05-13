package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.awt.event.*;
import java.util.List;


public class Main {
   static JLabel title, title1;
   static  JTextField input;
   static int number;
   //static JButton ok;
   static JDialog result;

    public static void main(String[] args) {


       //final dict mydict = new dict();
        dict mydict = new dict();
        number = 1;
        //here I will use:
        JPanel p, p1, p2;
        JButton inputButton;

        //Defining my frame
        final JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new BorderLayout() );
        //myFrame = new JFrame("Quiz game");
        myFrame.setBounds(0, 0, 300, 200);

        //Defining panels
        p = new JPanel();
        myFrame.add(p, BorderLayout.NORTH);

        p1 = new JPanel();
        myFrame.add(p1, BorderLayout.CENTER);

        p2= new JPanel();
        myFrame.add(p2, BorderLayout.SOUTH);



        //Defining Label for question
            title1 = new JLabel("Вопрос 1:");//label for 1 panel
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


            p.add(title1);
            p1.add(title);
            p2.add(input);
            p2.add(inputButton);



            myFrame.setVisible(true);

        //изменяет содержимое label title при нажатии кнопки
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (number < 7) number++;
                int key = mydict.keys.get(mydict.index);
                String a = input.getText();
                title1.setText("Вопрос "+ number);

                if (a.equals(mydict.getQuestion(key).getAnswer())){
                    System.out.println("true");
                    mydict.maks ++; }

                if (mydict.index <6){
                    mydict.index++;
                    mydict.quiz();
                    }


                else {
                    //myFrame.setVisible(false);
                    JPanel pan=new JPanel();
                    pan.add(new JLabel("Ваш балл " + mydict.maks + "/7"));
                    pan.add(new JLabel("Хотите пройти тест еще раз?", SwingConstants.CENTER));

                    JButton ok = new JButton("да");
                    pan.add(ok);
                    JButton cancel =  new JButton("выход");
                    pan.add(cancel);
                    cancel.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            myFrame.dispose();
                        }
                    });


                    ok.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            result.setVisible(false);
                          //  myFrame.setVisible(false);
                            mydict.index=0;
                            number=1;//
                            mydict.maks=0;

                            dict mydict = new dict();//новый словарь чтоб все смешать
                            mydict.quiz();
                           // myFrame.setVisible(true);

                            title1.setText("Вопрос "+ number);
                            myFrame.repaint();
                        }});

                    pan.setLayout(new FlowLayout());
                    pan.setSize(300,300);
                    //pan.setVisible(true);


                    result = new JDialog(myFrame);
                    result.setSize(300,200);
                    result.setLocationRelativeTo(myFrame);
                    result.add(pan);
                    result.setVisible(true);
                    System.out.println(mydict.maks);
                    
                }}

        });
        mydict.quiz();
    }}












