import java.util.Scanner;

public class nElamanDiziOrtalamasi {
    public static void main(String[] args) {

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
       
}
