import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ZadaniaKolekcje zadania = new ZadaniaKolekcje();
        System.out.println(new Float(Math.random()*100));
        zadania.zadanie1();
        HashMap<String,String> listaPracownikow = new HashMap<>();
        listaPracownikow.put("aaaA113", "Rafal Kowalski");
        listaPracownikow.put("bxbx113", "Bartlomiej Kowalski");
        listaPracownikow.put("BBx113", "Bogdan Kowalski");
        listaPracownikow.put("Cddx113", "Michal Kowalski");

        System.out.println(zadania.zadanie2(listaPracownikow,"AAAA113"));










        ZadaniaStosKolejka zd = new ZadaniaStosKolejka();
        LinkedList<String> chlopy = new LinkedList<>(Arrays.asList("Jacek","Wacek","Gienek","Ludwik","Marcinek"));
        LinkedList<String> baby = new LinkedList<>(Arrays.asList("Mariolka","Daneczka","Michalinda"));
        //zd.zad3(chlopy,baby);







       //         System.out.println(zd.zad1("abcdefg"));
      //  zd.zad2("jatutaj");

        //trojkatrownoramienny(21);

    }


    static void trojkatrownoramienny(int width){


        char znak = '*';
        char spacja = ' ';
        int height = width/2;
        int pniaczek;
        if(((width/3)%2)!=0){
            pniaczek = width/3;
        }else{
            pniaczek = width/3+1;
        }

        for (int i=0; i<height+1; i++){

            for (int j =0; j<height-i; j++){
                System.out.print(spacja);
            }
            for (int k =0; k<(2*i+1); k++){
                System.out.print(znak);
            }

            System.out.println();
        }

        for(int d = 0; d<((width-pniaczek)/2)/2; d++){

            for(int h=0; h<((width-pniaczek)/2);h++){
                System.out.print(spacja);
            }
            for(int hh=0; hh<pniaczek;hh++){
                System.out.print(znak);
            }

            System.out.println();

        }



    }




    static void trojkatprostokatny(int ile){

        char znak = '*';
        char spacja = ' ';

        for(int i=0; i<ile; i++){

            for(int j=0; j<i+1; j++){

                System.out.print(znak);


            }


            System.out.println();
        }



    }



    static void kwadrat(int ile) {

        char znak = '*';
        char spacja = ' ';

        for (int i = 0; i < ile; i++) {

            for (int j = 0; j < ile; j++) {
                if (i == 0) {
                    System.out.print(znak);
                } else if (i == ile - 1) {
                    System.out.print(znak);
                } else {
                    if (j == 0)
                        System.out.print(znak);
                    else if (j == ile - 1)
                        System.out.print(znak);
                    else {
                        System.out.print(spacja);
                    }
                }
            }
            System.out.println();
        }

    }


}
