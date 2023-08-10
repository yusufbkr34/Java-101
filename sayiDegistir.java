import java.util.Scanner;

public class sayiDegistir {
    
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int sayi1,sayi2;
        int gecici;
        
        System.out.print("1. Sayıyı giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        sayi2 = scan.nextInt();
        
        System.out.println("Değerler değiştiriliyor..");
        
        gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;
        
        System.out.println("1. Sayi = " + sayi1);
        System.out.println("2. Sayi = " + sayi2);
    }
}
