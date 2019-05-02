package com.company;
import java.util.*;

import java.util.HashMap;

public class dict {
    HashMap<Integer, Question> dict = new HashMap<Integer, Question>();

    public dict() {
        dict.put(0, new Question("Capital?", "london"));
        dict.put(1, new Question("Country?", "UK"));
        dict.put(2, new Question("Region?", "ololo"));
        dict.put(3, new Question("Language?", "english"));
    }


    List keys = new ArrayList(dict.keySet());
    Collections.shuffle(keys);
    for (Object o : keys) {
        // Access keys/values in a random order
        dict.get(o);
    }

    public  Question getQuestion(Integer id){
        return dict.get(id);
    }




}
