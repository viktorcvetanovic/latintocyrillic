import java.util.HashMap;
import java.util.Map;

public class Translator {

    private static final Map<String, String> map = new HashMap<>();


    public Translator() {
        map.put("a", "а");
        map.put("b", "б");
        map.put("c", "ц");
        map.put("lj", "љ");
        map.put("nj", "њ");
        map.put("e", "e");
        map.put("r", "р");
        map.put("t", "т");
        map.put("z", "з");
        map.put("u", "у");
        map.put("i", "и");
        map.put("o", "o");
        map.put("p", "п");
        map.put("s", "с");
        map.put("d", "д");
        map.put("f", "ф");
        map.put("g", "г");
        map.put("h", "х");
        map.put("j", "j");
        map.put("k", "k");
        map.put("l", "л");
        map.put("č", "ч");
        map.put("ć", "ћ");
        map.put("š", "ш");
        map.put("đ", "ђ");
        map.put("dj", "ђ");
        map.put("dž", "џ");
        map.put("v", "в");
        map.put("n", "н");
        map.put("m", "м");
    }



    public String translate(String text){
        StringBuilder stringBuilder=new StringBuilder();
        StringIterator stringIterator=new StringIterator(text);

        while (stringIterator.hasNext()){
            var character=stringIterator.next();
            System.out.println(character);
            if(character.equals("l")){
                if(stringIterator.peek().equals("j")){
                    stringBuilder.append(map.get("lj"));
                    stringIterator.next();
                }
            }
            else if(character.equals("n")){
                if(stringIterator.peek().equals("j")){
                    stringBuilder.append(map.get("nj"));
                    stringIterator.next();
                }
            }
            else if(character.equals("d")){
                if(stringIterator.peek().equals("j")){
                    stringBuilder.append(map.get("dj"));
                    stringIterator.next();
                }else if(stringIterator.peek().equals("ž")){
                    stringBuilder.append(map.get("dž"));
                    stringIterator.next();
                }
            }
            else {
               if(map.get(character)!=null){
                   stringBuilder.append(map.get(character));
               }else{
                   stringBuilder.append(character);
               }
            }
        }
        return stringBuilder.toString();
    }



}
