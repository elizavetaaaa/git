package com.company;
import java.util.*;

public class dict  {

    Main myMain = new Main();

    HashMap<Integer, Question> dict = new HashMap<Integer, Question>();
    static List<Integer> keys;
    int maks = 0;
    static int index = 0;
    static Object Question ;
    public Object Answer;

    public dict() {
        dict.put(0, new Question("<html>Год основания города Пишпек?<br>a)1878<br/>b)1880<br/>c)1879<br/>d)1875</html>", "a"));
        dict.put(1, new Question("<html>Интернет домен Кыргызстана?<br/>a)kr<br/>b)kz<br/>c)kg<br/>d)kn</html>", "c"));
        dict.put(2, new Question("<html>Какой писатель является одним из <br/>самых читаемых авторов современности?<br/> <br/>a)Алыкул Осмонов<br/>b)Чынгыз Айтматов<br/>c)Вячеслав Шаповалов<br/>d)Мар Байчиев</html>", "b"));
        dict.put(3, new Question("<html>Где находится гумбез Манаса?<br/> <br/>a)Талас<br/>b)Жалал-Абад<br/>c)Нарын<br/>d)Чуй</html>", "a"));
        dict.put(4, new Question("<html>Главный символ горного Кыргызстана?<br/> <br/>a)марал<br/>b)орел<br/>c)снежный барс<br/>d)цветок Айгуль</html>", "c"));
        dict.put(5, new Question("<html>Единственное месторождение <br/>серебра в Кыргызстане?<br/> <br/>a)Кумтор<br/>b)Солтон-Сары<br/>c)Кызыл-Кия<br/>d)Кумыштаг</html>", "d"));
        dict.put(6, new Question("<html>Суймонкул Чокморов - знаменитый ... ?<br/> <br/>a)врач<br/>b)поэт,драматург<br/>c)актер, художник<br/>d)режиссер</html>", "c"));
        keys = new ArrayList<>(dict.keySet());
        Collections.shuffle(keys);
    }





    public  Question getQuestion(Integer id){
        return dict.get(id);
    }

    public  void quiz(){

        myMain.input.setText("");
        int key = keys.get(index);
        Question q = dict.get(key);
        String question  = q.getQuestion();
        myMain.title.setText(question);
        //index++;
    }

}
