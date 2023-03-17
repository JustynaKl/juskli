import java.util.Scanner;

public class Zadanie5_8 {
    public static void main(String[] args) {
        /*int powierzchniabok1 = 3;
        int powierzchniabok2 = 4;
        int powierzchniabok1_2 = 2;

        int pomieszczenie1_2 = (powierzchniabok1*powierzchniabok2);
        int pomieszczenie3 = powierzchniabok1_2*powierzchniabok1;
        int pomieszczenie4 = powierzchniabok1_2*powierzchniabok1_2;

        System.out.println("Powierzchnia pomieszczenia 3x4: " + pomieszczenie1_2 + "\n Powierzchnia pomieszczenia 3x4: " + pomieszczenie1_2 +
                "\n Powierzchnia pomieszczenia 2x3: " + pomieszczenie3 + "\n Powierzchnia pomieszczenia 2x2: " + pomieszczenie4);

        int calkowita = 2 * pomieszczenie1_2 + pomieszczenie3 + pomieszczenie4;
        System.out.println("Powierzchnia całkowita: " + calkowita);*/

        //Zadanie 6

   /*     int powierzchniabok1 = 3;
        int powierzchniabok2 = 4;
        int powierzchniabok1_2 = 2;

        int pomieszczenie1_2 = powierzchniabok1*powierzchniabok2;
        int pomieszczenie3 = powierzchniabok1_2*powierzchniabok1;
        int pomieszczenie4 = powierzchniabok1_2*powierzchniabok1_2;

        System.out.println("Powierzchnia pomieszczenia 3x4 na jedną osobę: " + (pomieszczenie1_2)/4 + "\n Powierzchnia pomieszczenia 3x4 na jedną osobę: " + (pomieszczenie1_2)/4 +
                "\n Powierzchnia pomieszczenia 2x3 na jedną osobę: " + (pomieszczenie3)/4 + "\n Powierzchnia pomieszczenia 2x2 na jedną osobę: " + (pomieszczenie4)/4);

        int calkowita = 2 * pomieszczenie1_2 + pomieszczenie3 + pomieszczenie4;
        System.out.println("Powierzchnia całkowita na jedną osobę: " + (calkowita/4));*/


        //Zadanie 7

     /*   double wartosc = 0.62;
        double produkty = 4600000;
        double sumaProduktow = wartosc * produkty;

        System.out.println("Region mazowiecki wygeneruje: " + sumaProduktow);*/

        //Zadanie 8

        Scanner klawisz = new Scanner(System.in);


        System.out.println("Podaj długość pokoju nr1: ");
        int powierzchniabok1 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr1: ");
        int powierzchniabok2 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj długość pokoju nr 2: ");
        int powierzchniabok3 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr 2: ");
        int powierzchniabok4 = klawisz.nextInt();
        klawisz.nextLine();


        int pomieszczenie1 = powierzchniabok1*powierzchniabok2;
        int pomieszczenie2 = powierzchniabok3*powierzchniabok4;

        System.out.println("Powierzchnia pomieszczenia nr 1 na jedną osobę: " + (pomieszczenie1)/4 + "\n Powierzchnia pomieszczenia nr 2 na jedną osobę: " + (pomieszczenie2)/4);

        int calkowita =  pomieszczenie1 + pomieszczenie2;
        System.out.println("Powierzchnia całkowita na jedną osobę: " + (calkowita/4));


    }
}
