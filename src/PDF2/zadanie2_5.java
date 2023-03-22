package PDF2;

import java.util.Scanner;

public class zadanie2_5 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        /*System.out.print("Podaj dzień: ");
        int dzien = klawisz.nextInt();
        System.out.print("Podaj miesiąc (w formie liczby!): ");
        int miesiac = klawisz.nextInt();
        System.out.print("Podaj dwie ostatnie cyfry roku: ");
        int rok = klawisz.nextInt();

        int iloczyn = dzien*miesiac;

        if(iloczyn==rok){
            System.out.println("Data jest magiczna!");
        } else{
            System.out.println("Niestety, data nie jest magiczna :( ");
        }*/

        //zadanie 3
        /*System.out.print("Podaj swoją wagę: ");
        double waga = klawisz.nextDouble();
        System.out.print("Podaj swój wzrost w metrach: ");
        double wzrost = klawisz.nextDouble();
        double ponizej = 18.5;
        double powyzej = 25;

        double bmi = waga/Math.pow(wzrost,2);

        if(bmi<ponizej){
            System.out.print("Masz niedowagę!");
        } else if(bmi>=ponizej && bmi<=powyzej){
            System.out.print("Twoje bmi jest prawidłowe");
        } else{
            System.out.print("Masz dobry indeks BMI");
        }*/

        //zadanie 4

        /*System.out.print("Podaj pierwszą ocenę (w procentach): ");
        int ocena1 = klawisz.nextInt();
        System.out.print("Podaj drugą ocenę (w procentach): ");
        int ocena2 = klawisz.nextInt();
        System.out.print("Podaj trzecią ocenę (w procentach): ");
        int ocena3 = klawisz.nextInt();
        int iloscOcen = 3;

        double srednia = (ocena1+ocena2+ocena3)/iloscOcen;

        if(srednia>=90){
            System.out.print("Udało się. Masz 5!");
        } else if(srednia>=80){
            System.out.print("Świetnie, jest 4");
        } else if(srednia>=70){
            System.out.print("Okej, jest 3");
        } else if (srednia>=60) {
            System.out.print("No kiepsko, jest 2");
        } else if (srednia<60) {
            System.out.print("Trzeba poprawić, jest 1 :(");
        } else {
            System.out.print("Niepoprawne wartości. Popraw");
        }*/

        //zadanie 5

        System.out.print("Podaj masę obiektu: ");
        double masa = klawisz.nextDouble();
        double iloczyn = 9.8;

        double ciezar = masa*iloczyn;

        if(ciezar>1000){
            System.out.println("Obiekt jest zbyt ciężki " + ciezar);
        } else if(ciezar<10){
            System.out.print("Obiekt jest zbyt lekki: " + ciezar);
        }else if(ciezar<=1000 && ciezar>=10){
            System.out.print("Obiekt ma poprawną wartość: " + ciezar);
        }

    }
}
