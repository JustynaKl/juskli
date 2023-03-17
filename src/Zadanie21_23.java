import java.util.Scanner;

public class Zadanie21_23 {
    public static void main(String[] args) {
        /*Scanner klawisz = new Scanner(System.in);
        System.out.print("Wprowadź kwotę początkowo zdeponowanej kwoty: ");
        double kwota = klawisz.nextDouble();
        System.out.print("Roczna stopa oprocentowania: ");
        double stopaRoczna = klawisz.nextDouble();
        System.out.print("Ile razy w roku odsetki sa kapitalizowane? (kapitalizacja miesięczna - 12, kapitalizacja kwartalna - 4): ");
        int kapitalizacja = klawisz.nextInt();
        System.out.print("Wprowadź liczbę lat: ");
        int Liczbalat = klawisz.nextInt();

        double potega = Math.pow(1+stopaRoczna/kapitalizacja,kapitalizacja*Liczbalat);
        double StanKonta = kwota*potega;

        System.out.print("Kwota zdeponowana: " + kwota + "\nRoczna stopa: " + stopaRoczna + "\nOdsetki kapitalizowane: " + kapitalizacja +
                "\nPrzez liczbę lat: " + Liczbalat + "\n Stan kwota po " + Liczbalat + " wynosi: " + StanKonta);*/

        //Zadanie 22
  /*      int IloscAkcji = 1000;
        double CenazaAkcje = 32.87;
        double cenaakcji = IloscAkcji*CenazaAkcje;

        double Procent = 0.02;
        double CenaBrokerowi = cenaakcji*Procent;


        System.out.print("Kwota zapłacona za Jacka za akcje wynosi:  "+ cenaakcji + "\nCena zapłacona przez Jacka brokerowi: " + CenaBrokerowi);

        double CenaSprzedazy = 33.92;
        double sprzedazAkcji = CenaSprzedazy*IloscAkcji;
        double CenaBrokerowiS = sprzedazAkcji*Procent;

        double akcja = sprzedazAkcji-cenaakcji;

        System.out.print("\nPo dwóch tygodniach: \n Wartość sprzedaży akcji wynosi: " + sprzedazAkcji + "\nCena zapłacona przez Jacka Brokerowi: " +
                CenaBrokerowiS + "\nZapłacenie obu prowizji: " + akcja );*/

        //Zadanie 23

        Scanner klawisz = new Scanner(System.in);
        System.out.print("Wprowadź długość rzędów: ");
        double DlugoscRzedow = klawisz.nextDouble();
        System.out.print("Wprowadź ilość miejsca zamowanego przez okratowanie (metry): ");
        double Iloscmiejsca = klawisz.nextDouble();
        System.out.print("Wprowadź odległość między sadzonkami (metry): ");
        double OdlegloscSadzonki = klawisz.nextDouble();

        double Liczbasadzonek = (DlugoscRzedow-2*Iloscmiejsca)/OdlegloscSadzonki;

        System.out.print("Liczba sadzonek, które mieszką się w rzędzie wynosi: " + Liczbasadzonek);
    }
}
