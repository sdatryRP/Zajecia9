import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class ZadaniaStosKolejka {


    public HashMap<String,String> zad3(LinkedList<String> chlopy, LinkedList<String> baby){

        HashMap<String, String> parki = new HashMap<>();
while(true) {
    if (chlopy.peek() != null && baby.peek() != null)
        parki.put(chlopy.poll(), baby.poll());
    else {
        break;
    }
}
        System.out.println("Dostepne parki: ");
        for(Map.Entry<String,String> pareczka: parki.entrySet()){
            System.out.println(pareczka.getKey()+" --> "+pareczka.getValue());
        }
        System.out.println("Lista frajerów bez kobiety: ");
        System.out.println(chlopy);
        return parki;
    }





    public void zad2(String czyPalindrom){

        String nowyText = this.zad1(czyPalindrom);
        if(nowyText.equals(czyPalindrom))
        System.out.println("To słowo jest Palindromem: "+czyPalindrom);
        else {
            System.out.println("To słowo NIE jest Palindromem: "+czyPalindrom);
        }


    }




    public String zad1(String odwrocGO){

        Stack<Character> mojStosik = new Stack<>();

        for(int i=0; i<odwrocGO.length(); i++) {
            mojStosik.push(odwrocGO.charAt(i));
        }
        StringBuilder budujeStringa = new StringBuilder();
        for(int j=0; j<odwrocGO.length(); j++){


            budujeStringa.append(mojStosik.pop());

        }
        String nazwaodwrocona = budujeStringa.toString();
        return nazwaodwrocona;


    }


}
