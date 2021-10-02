import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:

         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("podaj imie ");
        String name = scan.next();


        System.out.print("podaj nazwisko ");
        String surname = scan.next();

        System.out.print("podaj wiek ");
        int age = scan.nextInt();


        System.out.print("podaj nr indeksu ");
        int index = scan.nextInt();

        System.out.println("to twoje dane:");

        System.out.printf("imie: %s \nnazwisko: %s \nwiek: %d \nindeks: %d \n", name, surname, age, index);





        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        int number1 = 2;
        int number2 = 5;

        System.out.println(" a + b = " + (number1 + number2));


        System.out.println(" a - b = " + (number1 - number2));

        System.out.println(" a * b = " + (number1 * number2));

        System.out.println(" a / b = " + (number1 / number2));

        System.out.println(" a % b = " + (number1 % number2));


        int result = number1 + number2 - number1 * number1 / number2 % number1;
        System.out.println(result);


    }
}
