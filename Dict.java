package com.company;
import java.util.*;

public class Dict  {

    Main myMain = new Main();

    HashMap<Integer, Question> dict = new HashMap<Integer, Question>();//my database
    static List<Integer> keys;
    int maks = 0;
    static int index = 0;
    static Object Question ;
    public Object Answer;



    public Dict() {
        dict.put(0, new Question("<html>Год основания города Пишпек?<br><br/>a)1878<br/>b)1880<br/>c)1879<br/>d)1875</html>", "a"));
        dict.put(1, new Question("<html>Интернет домен Кыргызстана?<br/><br/>a)kr<br/>b)kz<br/>c)kg<br/>d)kn</html>", "c"));
        dict.put(2, new Question("<html>Какой писатель является одним из <br/>самых читаемых авторов современности?<br/> <br/>a)Алыкул Осмонов<br/>b)Чынгыз Айтматов<br/>c)Вячеслав Шаповалов<br/>d)Мар Байчиев</html>", "b"));
        dict.put(3, new Question("<html>Где находится гумбез Манаса?<br/> <br/>a)Талас<br/>b)Жалал-Абад<br/>c)Нарын<br/>d)Чуй</html>", "a"));
        dict.put(4, new Question("<html>Главный символ горного Кыргызстана?<br/> <br/>a)марал<br/>b)орел<br/>c)цветок Айгуль<br/>d)снежный барс</html>", "d"));
        dict.put(5, new Question("<html>Единственное месторождение <br/>серебра в Кыргызстане?<br/> <br/>a)Кумтор<br/>b)Солтон-Сары<br/>c)Кызыл-Кия<br/>d)Кумыштаг</html>", "d"));
        dict.put(6, new Question("<html>Суймонкул Чокморов - знаменитый ... ?<br/> <br/>a)врач<br/>b)поэт,драматург<br/>c)актер, художник<br/>d)режиссер</html>", "c"));
        dict.put(7, new Question("<html>Какой город Кыргызстана носил <br/> имя выдающегося исследователя <br/>Центральной Азии? <br/><br/>a)Бишкек<br/>b)Токмок<br/>c)Балыкчи<br/>d)Каракол</html>", "d"));
        dict.put(8, new Question("<html>Чем разрисованы пещеры Ак-Чункур?<br/> <br/>a)красной охрой<br/>b)черной золой<br/>c)известняком<br/>d)алкидными красками</html>", "a"));
        dict.put(9, new Question("<html>Ключевая точка наркоторговли?<br/> <br/>a)Бишкек<br/>b)Ош<br/>c)Тюп<br/>d)Кадамжай</html>", "b"));
        keys = new ArrayList<>(dict.keySet());
        Collections.shuffle(keys);//mix ids of dict
    }





    public  Question getQuestion(Integer id){
        return dict.get(id);
    }

    void quiz(){//возникновение нового вопроса на title

        Main.input.setText("");
        int key = keys.get(index);
        Question q = dict.get(key);
        String question  = q.getQuestion();
        Main.title.setText(question);
        //index++;
    }

}
