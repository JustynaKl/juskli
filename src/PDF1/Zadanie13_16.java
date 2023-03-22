package PDF1;

import java.util.Scanner;

public class Zadanie13_16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Liczba zjedzonych ciasteczek: ");
        int Liczbaciasteczek = klawisz.nextInt();
        int pudelko= 40;
        int PorcjawP = 10;
        int porcjakcal = 300;
        int Sumakcal = (porcjakcal /pudelko);
        double ciasteczka = pudelko*Sumakcal;
        System.out.print("Zjadłś " + ciasteczka + " kcal");

        //Zadanie 14

     /*   Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj wynik testu 1: ");
        float wynik1 = klawisz.nextFloat();
        System.out.print("Podaj wynik testu 2: ");
        float wynik2 = klawisz.nextFloat();
        System.out.print("Podaj wynik testu 3: ");
        float wynik3 = klawisz.nextFloat();

        System.out.println("Wynik testu 1 wynosi: " + wynik1 + "\n Wynik testu 2 wynosi: " + wynik2 + "\n Wynik testu 3 wynosi: " + wynik3);
        float srednia = (wynik1+wynik2+wynik3)/3;
        System.out.println("Średnia wszystkich wyników wynosi: " + srednia);*/

        //Zadanie 15
        /*Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj cenę detaliczną płytkl: ");
        float cenaPlytki = klawisz.nextFloat();

        double zysk = (cenaPlytki * 0.4);
        System.out.println("Zysk za sprzedaż płytki wynosi: " + zysk);*/

        //Zadanie 16
        /*Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj swoje ulubione miasto: ");
        String nazwaMiato = klawisz.nextLine();

        int dlugosc = nazwaMiato.length();
       String duze = nazwaMiato.toUpperCase();
       String male = nazwaMiato.toLowerCase();

       char pierwszyZnak = nazwaMiato.charAt(0);

        System.out.println("Długość nazwy: " +  dlugosc + "\n" + duze + "\n" + male + "\n" + pierwszyZnak);*/
    }
}
