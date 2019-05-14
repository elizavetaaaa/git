package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Main {
   static JLabel title, title1;
   static  JTextField input;
   static int number;
   //static JButton ok;
   static JDialog result;

    public static void main(String[] args) {



        dict mydict = new dict();//new object of dict class
        number = 1;
        //here I will use:
        JPanel p, p1, p2;
        JButton inputButton;

        //Defining my frame
        final JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new BorderLayout() );
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

            //adding components to panels
            p.add(title1);
            p1.add(title);
            p2.add(input);
            p2.add(inputButton);



            myFrame.setVisible(true);

        //изменяет содержимое label title при нажатии кнопки
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (number < 10) number++;//7
                int key = mydict.keys.get(mydict.index);
                String a = input.getText();
                title1.setText("Вопрос "+ number);

                if (a.equals(mydict.getQuestion(key).getAnswer())){
                    System.out.println("true");//check is answer correct or not
                    mydict.maks ++; }

                if (mydict.index <9){//6
                    mydict.index++;
                    mydict.quiz();
                    }
                else {//appears when all questions are answered
                    JPanel pan=new JPanel();
                    pan.add(new JLabel("Ваш балл " + mydict.maks + "/10"));//7
                    pan.add(new JLabel("Хотите пройти тест еще раз?", SwingConstants.CENTER));

                    JButton ok = new JButton("да");
                    pan.add(ok);
                    JButton cancel =  new JButton("выход");
                    pan.add(cancel);

                    cancel.addActionListener(new ActionListener() {//disposing everything in click case
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            myFrame.dispose();
                        }
                    });


                    ok.addActionListener(new ActionListener() {//play quiz again in clck case
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            result.setVisible(false);
                            mydict.index=0;//обновление переменной
                            number=1;//обновление переменной
                            mydict.maks=0;//обновление переменной

                            dict mydict = new dict();//новый словарь чтобы изменить порядок вопросов
                            mydict.quiz();

                            title1.setText("Вопрос "+ number);
                            myFrame.repaint();//создаем фрейм заново
                        }});

                    pan.setLayout(new FlowLayout());
                    pan.setSize(300,300);

                    //creting a msg appears in case test is finished
                    result = new JDialog(myFrame);
                    result.setSize(300,200);
                    result.setLocationRelativeTo(myFrame);
                    result.add(pan);
                    result.setVisible(true);
                    System.out.println(mydict.maks);//prints score to console
                    
                }}

        });
        mydict.quiz();//первый вызов метода при запуске прг
    }}












