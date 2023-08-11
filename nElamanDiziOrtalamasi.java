import java.util.Scanner;

public class nElamanDiziOrtalamasi {
    public static void main(String[] args) {

       // Java N Elemanlı Dizi Oluşturup Ortalamasını Bulan Program

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = scan.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            toplam += dizi[i];
        }
        System.out.println("Dizinin ortalaması = " + (toplam / boyut));
        // System.out.println("Dizinin ortalaması = " + (toplam / dizi.length));
    }
}
