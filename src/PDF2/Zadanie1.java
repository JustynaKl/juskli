package PDF2;

import java.util.Scanner;

public class Zadanie1 {
    private static int[] arabskie = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] rzymskie = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
      /*System.out.print("Wprowadź liczbę, którą chcesz zapisać w postaci liczby rzymskiej: ");
        int liczba = klawisz.nextInt();

        String rzymskaliczba = " ";

        for(int i=0; i<arabskie.length; i++){
            while (liczba >=arabskie[i]){
                rzymskaliczba += rzymskie[i];
                liczba -= arabskie[i];
            }
        }
        System.out.print("Liczba w postaci rzymskiej to: " + rzymskaliczba);*/
        System.out.print("Wprowadź liczbę rzymską, którą chcesz zamienić na liczby arabskie: ");
        String rzymskiSystem = klawisz.nextLine();
        String liczbyrzym = rzymskiSystem.toUpperCase();

        int liczbaarabska = 0;
        int Liczbaporuszanie = 0;

        for(int i=0; i< rzymskie.length; i++){
            while (liczbyrzym.startsWith(rzymskie[i], Liczbaporuszanie)){
                liczbaarabska +=arabskie[i];
                Liczbaporuszanie +=rzymskie[i].length();
            }
        }
        System.out.print("Wprowadzona liczba rzymska na arabską wynosi: " + liczbaarabska);
    }
}
