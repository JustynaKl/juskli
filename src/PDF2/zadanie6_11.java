package PDF2;

import java.util.Scanner;

public class zadanie6_11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
       /* System.out.print("Podaj liczbę sekund: ");
        int sekundy = klawisz.nextInt();
        int minuty = 0;
        int godziny = 0;
        int dzien = 0;

        while(sekundy>0){
            if(sekundy>=86400){
                dzien++;
                sekundy -=86400;
            }
            if(sekundy>=3600){
                godziny++;
                sekundy -=3600;
            }
            if (sekundy>=60){
                minuty++;
                sekundy -=60;
            }
            sekundy--;
        }
        System.out.println(dzien + " dni " + godziny + " godzin " + minuty + " minut");*/

        //zadanie 7

        System.out.print("Podaj imię do posortowania: ");
        String imie1 = klawisz.nextLine();
        System.out.print("Podaj drugie imię do posortowania: ");
        String imie2 = klawisz.nextLine();
        System.out.print("Podaj trzecię imię do posortowania: ");
        String imie3 = klawisz.nextLine();

        if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) <0) {
            System.out.println(imie1);
            if(imie2.compareToIgnoreCase(imie3)<0){
                System.out.println(imie2);
                System.out.println(imie3);
            } else if (imie2.compareToIgnoreCase(imie3)>0) {
                System.out.println(imie3);
                System.out.println(imie2);
            }}else if(imie2.compareToIgnoreCase(imie1) < 0 && imie2.compareToIgnoreCase(imie3)<0){
                System.out.println(imie2);
                if(imie1.compareToIgnoreCase(imie3)<0){
                    System.out.println(imie1);
                    System.out.println(imie3);
                } else if (imie1.compareToIgnoreCase(imie3)>0) {
                    System.out.println(imie3);
                    System.out.println(imie1);
            }} else if (imie3.compareToIgnoreCase(imie1)<0 && imie3.compareToIgnoreCase(imie2) <0 ) {
                    System.out.println(imie3);
                    if (imie1.compareToIgnoreCase(imie2) < 0) {
                        System.out.println(imie1);
                        System.out.println(imie2);
                    } else if (imie1.compareToIgnoreCase(imie2) > 0) {
                        System.out.println(imie2);
                        System.out.println(imie1);
                    } else {
                        System.out.println("Niepoprawne dane");
                    }
                }

        //zadanie 8

       /* System.out.print("Podaj liczbę zakupioonych pakietów: ");
        int liczbaZP = klawisz.nextInt();
        int CenaDetaliczna = 99;
        double calosc;
        double cena = liczbaZP*CenaDetaliczna;

        if(liczbaZP>=10 && liczbaZP<20){
            calosc = cena*0.2;
            System.out.print("Cena wynosi (wraz z rabatem -> 20%): " + calosc);
        } else if (liczbaZP>=20 && liczbaZP<50) {
            calosc = cena*0.3;
            System.out.print("Cena wynosi (wraz z rabatem -> 30%): " + calosc);
        } else if (liczbaZP>=50 && liczbaZP<100) {
            calosc = cena*0.4;
            System.out.print("Cena wynosi (wraz z rabatem -> 40%): " + calosc);
        } else if (liczbaZP>=100) {
            calosc = cena*0.5;
            System.out.print("Cena wynosi (wraz z rabatem -> 50%): " + calosc);
        } else{
            System.out.print("Cena wynosi (bez rabatu): " + cena);
        }*/

        //zadanie 9
       /* double MnijlubKg = 1.10;
        double kg3kg = 2.20;
        double k3g5kg = 3.70;
        double Pow5kg = 8.80;
        double km = 500;
        double cena;

        System.out.print("Podaj wagę przesyłki: ");
        double waga = klawisz.nextDouble();
        System.out.print("Podaj odległość: ");
        double odleglosc = klawisz.nextDouble();

        if(odleglosc<=km && waga<=1){
            System.out.print("Cena wynosi: " + MnijlubKg);
        } else if (odleglosc<=km && waga<=3) {
            System.out.print("Cena wynosi: " + kg3kg);
        }else if (odleglosc<=km && waga<=5) {
            System.out.print("Cena wynosi: " + k3g5kg);
        }else if (odleglosc<=km && waga>5) {
            System.out.print("Cena wynosi: " + Pow5kg);
        }else if(odleglosc>km && waga<=1){
            cena = MnijlubKg*2;
            System.out.print("Cena wynosi: " + cena);
        } else if (odleglosc>km && waga<=3) {
            cena = kg3kg*2;
            System.out.print("Cena wynosi: " + cena);
        }else if (odleglosc>km && waga<=5) {
            cena = k3g5kg*2;
            System.out.print("Cena wynosi: " + cena);
        }else if (odleglosc>km && waga>5) {
            cena = Pow5kg*2;
            System.out.print("Cena wynosi: " + cena);
        }*/

        //zadanie 10
        /*System.out.print("Podaj liczbę kalorii: ");
        double kalorie = klawisz.nextDouble();
        System.out.print("Podaj liczbę gramów: ");
        double gramy = klawisz.nextDouble();
        double kalorieTluszcz = gramy*9;

        double kalorie2 = kalorieTluszcz/kalorie;

        if(kalorieTluszcz>kalorie){
            System.out.println("Kalori jest więcej w tłuszczu niż w produkcie. Popraw dane -> " + kalorie2*100 + "%");
        } else if(kalorieTluszcz<=0.3){
            System.out.println("Produkt jest niskotłuszczowy -> " + kalorie2*100 + "%");
        } else if(kalorieTluszcz<kalorie && kalorieTluszcz>0.3){
            System.out.println("Produkt ma tyle kalorii z tłuszczu: " + kalorie2*100 + "%");
        }*/

        //zadanie 11
       /* System.out.println("Imię pierwszego zawodnika: ");
        String imie1 = klawisz.nextLine();
        System.out.println("Czas biegacza " + imie1);
        double czas1 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Imię drugiego zawodnika: ");
        String imie2 = klawisz.nextLine();
        System.out.println("Czas biegacza " + imie2);
        double czas2 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Imię trzeciego zawodnika: ");
        String imie3 = klawisz.nextLine();
        System.out.println("Czas biegacza " + imie3);
        double czas3 = klawisz.nextDouble();
        klawisz.nextLine();

        if(czas1<czas2 && czas1<czas3){
            System.out.println(imie1);
            if(czas2>czas3){
                System.out.println(imie3);
                System.out.println(imie2);
            } else if (czas2<czas3) {
                System.out.println(imie2);
                System.out.println(imie3);
            }
        }else if(czas2<czas1 && czas2<czas3) {
            System.out.println(imie2);
            if (czas1 > czas3) {
                System.out.println(imie3);
                System.out.println(imie1);
            } else if (czas1 < czas3) {
                System.out.println(imie1);
                System.out.println(imie3);
            }
        }else if (czas3 < czas1 && czas3 < czas2) {
                System.out.println(imie3);
                if (czas2 > czas1) {
                    System.out.println(imie1);
                    System.out.println(imie2);
                } else if (czas2 < czas1) {
                    System.out.println(imie2);
                    System.out.println(imie1);
                }

            }*/
        }
}
