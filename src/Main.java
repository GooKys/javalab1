import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte bajt = 1;
        short szort = 30000;
        int integer = 2000000;
        long longg = 999999999;
        float flot = 2.324f;
        double doble = 129000.32;
        boolean bul = true;
        char kar = 'c';
        String lancuch = "zdanie i zdanie.";









        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        int liczbaA = 2;
        int liczbaB = 4;
        double liczbaX = 2.5;
        double liczbaY = 1.5;

        System.out.println((liczbaA + liczbaB - liczbaX) * liczbaY % 5);



    }
}
