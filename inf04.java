import java.util.Random;
import java.util.Scanner;

public class Inf {


    public static void main(String[] args) {
        Random losuj = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = 50;
        int[] tablica = new int[n+1];



        for(int i = 0; i < n; i++){
            tablica[i] = losuj.nextInt(100) + 1;
        }

        System.out.println("Podaj liczbe: ");
        int szukaj = scanner.nextInt();
        tablica[n] = szukaj;

        int i = 0;
        while (tablica[i] != szukaj){
            i++;
        }

        if (i == n){
            System.out.println("Nie znaleziono liczby w tablicy");
        } else {
            System.out.println("Znaleziono liczbe w tablicy");
            System.out.println("Indeks: " + 1);
        }

        System.out.println("Zawartosc tablicy: ");

        for (int j = 0; j < n; j++){
            System.out.println(tablica[j] + "");
        }

        scanner.close();
    }
}
