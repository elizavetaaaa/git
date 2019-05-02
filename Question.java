package com.company;

public class Question {
    private String Question;
    private String Answer;


    public Question( String question, String answer) {
        Question = question;
        Answer = answer;

    }

    public String getQuestion() {
        return Question;
    }
    public String getAnswer() {
        return Answer;
    }



    @Override
    public String toString() {
        return "Question :\n"+ Question +
                "\nAnswer : \n" + Answer ;
    }
}