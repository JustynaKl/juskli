import java.util.Scanner;

public class Zadanie17_20 {
    public static void main(String[] args) {
        /*Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadź cenę posiłku: ");
        double cenaPosilku = klawisz.nextDouble();
        double podatek = (cenaPosilku * 0.675);
        double napiwek = (cenaPosilku+podatek)*0.2;
        double kwota = cenaPosilku + podatek + napiwek;

        System.out.println("Cena posiłku: " + cenaPosilku + "\n Wartość podatku: " + podatek + "\nWysokość napiwku: " + napiwek + "\nŁączna kwota: " + kwota);*/

        //Zadanie 18
      /*  int Iloscakcji = 600;
        double CenaZaAkcje = 21.77;
        double CenaAkcji = Iloscakcji*CenaZaAkcje;
    double prowizjaB = 0.02;
        double ProwizaZaAkcje = prowizjaB * CenaZaAkcje;
        double cena = CenaAkcji * ProwizaZaAkcje;
        System.out.print("Cena za wszystkie akcje (bez prowizji wynosi): " + CenaAkcji + "\nWysokość prowizji za jedną akcję: " + ProwizaZaAkcje +
                "\nŁączna kwota(cena akcji i prowizja): " + cena);*/

        //Zadanie 19
   /*     int IloscAnkietowanych = 12467;
        double JedenTygodniowo = 0.14;
        double cytrusySmak = 0.64;
        double IloscTygodniowo = IloscAnkietowanych*JedenTygodniowo;
        double IloscCytrusy = IloscAnkietowanych*cytrusySmak;


        System.out.println("Liczba ankietowanych, którzy preferują jeden napój energtetyczny (tygodniowo): " + IloscTygodniowo +
                "\nLiczba ankietowanych, którzy wolą smak cytrusowy: " + IloscCytrusy) ;*/


        //Zadanie 20
        int ciasteczka = 48;
        double Ilosccukru = 1.5/ciasteczka;
        double Iloscmasla = 1.0/ciasteczka;
        double Iloscmaki = 2.75/ciasteczka;

        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj ilość ciasteczek, które planujesz zrobić: ");
        int Iloscciasteczek = klawisz.nextInt();

        double Sumacukru = Ilosccukru*Iloscciasteczek;
        double Sumamasla = Iloscmasla*Iloscciasteczek;
        double Sumamaki = Iloscmaki*Iloscciasteczek;

        System.out.print("Aby przygotować " + Iloscciasteczek + " ciasteczek potrzebujemy: \n" + Sumacukru + " szklanek cukru \n" +
                Sumamasla + " szklanek masła\n" + Sumamaki + " szklanek mąki" );
    }
}

