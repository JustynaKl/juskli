package PDF2;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class zadanie12_18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
       /* System.out.println("Podaj słowo (powietrze, woda lub stal): ");
        String slowo = klawisz.nextLine();
        System.out.println("Podaj odległość jaką ma przebyć: ");
        double odleglosc = klawisz.nextDouble();
        int ilosc = 343;
        int ilosc2 = 1490;
        int ilosc3 = 5100;

        double czas = odleglosc/ilosc; //powietrze
        double czas2 = odleglosc/ilosc2; //woda
        double czas3 = odleglosc/ilosc3; //stal


        if(slowo.equalsIgnoreCase("woda")){
            System.out.println("W wodzie czas na pokonanie czynności wynosi: " + czas2);
        } else if (slowo.equalsIgnoreCase("powietrze")) {
            System.out.println("W powietrzu czas na pokonanie czynności wynosi: " + czas);
        } else if(slowo.equalsIgnoreCase("stal")){
            System.out.println("W stali czas na pokonanie czynności wynosi: " + czas3);
        } else{
            System.out.println("Niepoprawne słowo. Spróbuj jeszcze raz, tym razem czytaj ze zrozumieniem");
        }*/

        //zadanie13
        /*System.out.print("Który pakiet wybierasz? (A, B, C): ");
        String litera = klawisz.nextLine();
        String literka = litera.toUpperCase();

        System.out.println("Ile minut rozmów?: ");
        int minuty = klawisz.nextInt();
        double pakietA = 39.99;
        double pakietB = 59.99;
        double pakietC = 69.99;
        double minuty1;
        double calosc;

        char liter = literka.charAt(0);

        switch (liter) {
            case 'A':
                if (minuty>450){
                     minuty1 = minuty*0.45;
                     calosc = minuty1*pakietA;
                    System.out.println("Łączne opłaty na miesiąc wynoszą: " + calosc);
                }
                break;
            case 'B':
                if (minuty>900){
                    minuty1 = minuty*0.40;
                    calosc = minuty1*pakietB;
                    System.out.println("Łączne opłaty na miesiąc wynoszą: " + calosc);
                }
                break;
            case 'C':
                    System.out.println("Łączne opłaty na miesiąc wynoszą: " + pakietC);
                break;
            default:
                System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
                break;
        }*/

        //zadanie 14

        System.out.print("Który pakiet wybierasz? (A, B, C): ");
        String litera = klawisz.nextLine();
        String literka = litera.toUpperCase();

        System.out.println("Ile minut rozmów?: ");
        int minuty = klawisz.nextInt();
        double pakietA = 39.99;
        double pakietB = 59.99;
        double pakietC = 69.99; //PAKIET C
        double cena;
        double oszczednosc = 0.0;

        //PAKIET A
        double minutyA = (minuty - 450) * 0.45;
        double caloscA = minutyA * pakietA;

        //PAKIET B
        double minutyB = (minuty - 900) * 0.40;
        double caloscB = minutyB * pakietB;


        char liter = literka.charAt(0);

        switch (liter) {
            case 'A':
                if(minuty<450){
                    System.out.println("Łączna opłata wynosi: " + pakietA);
                }
                if (minuty >= 450) {
                    BigDecimal cal = new BigDecimal(caloscA).setScale(3, RoundingMode.HALF_UP);
                    double caloscZao = cal.doubleValue();
                    System.out.println("Łączne opłaty na miesiąc wynoszą: " + caloscZao);

                    if (caloscA >= caloscB) {
                        oszczednosc = caloscA - caloscB;
                        BigDecimal oszcz = new BigDecimal(oszczednosc).setScale(3, RoundingMode.HALF_UP);
                        double oszczeZao = oszcz.doubleValue();
                        System.out.println("Po wybraniu pakietu B cena wynosiłaby " + oszczeZao);
                    } else if (caloscA < caloscB){
                        System.out.println("Nie opłaca się");
                    }
                }
                break;

            case 'B':
                if(minuty<900){
                    System.out.println("Łączna opłata wynosi: " + pakietB);
                }
                if (minuty >= 900) {
                    BigDecimal cal = new BigDecimal(caloscB).setScale(3, RoundingMode.HALF_UP);
                    double caloscZao = cal.doubleValue();
                    System.out.println("Łączne opłaty na miesiąc wynoszą: " + caloscZao);

                    if(caloscB>=pakietC){
                        oszczednosc = caloscB-pakietC;
                        BigDecimal oszcz = new BigDecimal(oszczednosc).setScale(3, RoundingMode.HALF_UP);
                        double oszczeZao = oszcz.doubleValue();
                        System.out.println("Po wybraniu pakietu C cena wynosiłaby " + oszczeZao);
                    } else if(caloscB<pakietB){
                        System.out.println("Nie opłaca się :(");
                    }
                    }
                break;
            case 'C':
                System.out.println("Łączne opłaty na miesiąc wynoszą: " + pakietC);
                break;
            default:
                System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
                 break;
    }


            //zadanie 15

       /* double czekmniej20 = 0.10;
        double czek20_39 = 0.08;
        double czek40_59 = 0.06;
        double czek60 = 0.04;
        int miesiecznie = 10;

        double oplaty;
        System.out.print("Ilość czeków w miesiącu: ");
        int czek = klawisz.nextInt();

        if(czek<20){
            oplaty =miesiecznie+(czekmniej20*czek);
            System.out.println("Opłaty pobrane przez bank, wynoszą: " + oplaty);
        } else if (czek>=20 && czek<40) {
            oplaty = miesiecznie+(czek20_39*czek);
            System.out.println("Opłaty pobrane przez bank, wynoszą: " + oplaty);
        } else if (czek>=40 && czek <60) {
            oplaty = miesiecznie+(czek40_59*czek);
            System.out.println("Opłaty pobrane przez bank, wynoszą: " + oplaty);
        } else if (czek>=60) {
            oplaty = miesiecznie+(czek60*czek);
            System.out.println("Opłaty pobrane przez bank, wynoszą: " + oplaty);
        } else{
            System.out.println("Niepoprawne dane!");
        }*/

        //zadanie 16

        /*int punkt0 = 0;
        int punkt1 = 5;
        int punkt2 = 15;
        int punkt3 = 30;
        int punkt4 = 60;

        System.out.print("Wprowadź liczbę zakupionych książek w miesiącu: ");
        int liczbaKsiazek = klawisz.nextInt();

        if(liczbaKsiazek==punkt0){
            System.out.println("Liczba punktów wynosi: " + punkt0 );
        }else if(liczbaKsiazek==1){
            System.out.println("Liczba punktów wynosi: " + punkt1 );
        } else if (liczbaKsiazek==2) {
            System.out.println("Liczba punktów wynosi: " + punkt2 );
        } else if (liczbaKsiazek==3) {
            System.out.println("Liczba punktów wynosi: " + punkt3 );
        } else if (liczbaKsiazek>=4) {
            System.out.println("Liczba punktów wynosi: " + punkt4 );
        }else{
            System.out.println("Błąd nieznanego pochodzenia");
        }*/

        //zadanie 17

      /*  System.out.print("Czy któraś z osób jest na diecie wegetariańskiej? ");
        String wegetarianska = klawisz.nextLine();

        System.out.print("Czy któraś z osób jest na diecie wegańskiej? ");
        String weganska = klawisz.nextLine();

        System.out.print("Czy któraś z osób jest na diecie bezglutenowej? ");
        String bezglutenowa = klawisz.nextLine();

        if(wegetarianska.equalsIgnoreCase("nie") && weganska.equalsIgnoreCase("nie") && bezglutenowa.equalsIgnoreCase("nie")){
            System.out.println("Do wyboru jest: \nLuksusowe burgery u Jarka");
        }else if(wegetarianska.equalsIgnoreCase("tak") && weganska.equalsIgnoreCase("tak") && bezglutenowa.equalsIgnoreCase("tak")){
            System.out.println("Do wyboru jest: \nKawiarnia na Rogu \nKuchnia u Szefa");
        }else if(wegetarianska.equalsIgnoreCase("tak") && weganska.equalsIgnoreCase("nie") && bezglutenowa.equalsIgnoreCase("tak")){
            System.out.println("Do wyboru jest: \nPizzernia przy Dworcowej \nKawiarnia na Rogu \nKuchnia u Szefa");
        }else if(wegetarianska.equalsIgnoreCase("tak") && weganska.equalsIgnoreCase("tak") && bezglutenowa.equalsIgnoreCase("nie")){
            System.out.println("Do wyboru jest: \nKawiarnia na Rogu \nKuchnia u Szefa");
        }else if(wegetarianska.equalsIgnoreCase("nie") && weganska.equalsIgnoreCase("nie") && bezglutenowa.equalsIgnoreCase("tak")){
            System.out.println("Do wyboru jest: \nPizzernia przy Dworcowej \nKawiarnia na Rogu \nKuchnia u Szefa");
        }else if(wegetarianska.equalsIgnoreCase("nie") && weganska.equalsIgnoreCase("tak") && bezglutenowa.equalsIgnoreCase("tak")){
            System.out.println("Do wyboru jest: \nKawiarnia na Rogu \nKuchnia u Szefa");
        }else if(wegetarianska.equalsIgnoreCase("nie") && weganska.equalsIgnoreCase("tak") && bezglutenowa.equalsIgnoreCase("nie")){
            System.out.println("Do wyboru jest: \nKawiarnia na Rogu \nKuchnia u Szefa");
        }else if(wegetarianska.equalsIgnoreCase("tak") && weganska.equalsIgnoreCase("nie") && bezglutenowa.equalsIgnoreCase("nie")){
            System.out.println("Do wyboru jest: \nPizzernia przy Dworcowej \nKawiarnia na Rogu \nKuchnia u Szefa");
        }else{
            System.out.println("Błędne dane!");
        }*/
    }
}
