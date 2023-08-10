import java.util.Scanner;

public class basamakSayiBul {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while (sayi > 0) {
            sayi /= 10; 
            sayac++;
        }
        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);
    }
}
