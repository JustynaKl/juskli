package PDF1;

import java.util.Scanner;

public class Zadanie9_12 {
    public static void main(String[] args) {
        /*String name = "Justyna Klimek";
        int age = 18;
        double annualPay = 100000;

        System.out.print("Nazywam się " + name + ", mam " + age + "lat" + "\ni chcę zarabiać " + annualPay + " złotych rocznych");*/

        //Zadanie 10

        /*Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String firstName = klawisz.nextLine();

        System.out.print("Podaj drugie imię: ");
        String middleName = klawisz.nextLine();

        System.out.print("Podaj nazwisko: ");
        String lastName = klawisz.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.print("Pierwszę imię: " + firstName + " Drugie imię: " + middleName + " Nazwisko: " + lastName);

        System.out.print("\n Inicjał pierwszego imienia: " + firstInitial + "\nInicjał drugiego imienia: " + middleInitial + "\nJuInicjał nazwiska: " + lastInitial);*/

        //Zadanie 11

        /*Scanner klawisz = new Scanner(System.in);
        System.out.print("Cena produktu wynosi: ");
        double cenaProduktu = klawisz.nextDouble();
        klawisz.nextLine();

        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        double ProduktStan = cenaProduktu*podatekStanowy;
        double ProduktLok = cenaProduktu*podatekLokalny;

        double wartosc = ProduktStan + ProduktLok + cenaProduktu;

        System.out.println("Wartość (wraz z podatkami) wynosi: " + wartosc);*/

        //Zadanie 12
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Liczba przejechanych kilometrów wynosi: ");
        double Przejechanekm = klawisz.nextDouble();

        System.out.print("Ile zużyto litrów paliwa: ");
        double litryPaliwa = klawisz.nextDouble();

        double kilometryNaLitrze = Przejechanekm/litryPaliwa;
        System.out.println("Liczba kilometrów przejechanych na litrze:  " + kilometryNaLitrze);

    }
}
