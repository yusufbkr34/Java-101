import java.util.Scanner;

public class basitHesapMakinesi {

    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("İşlemin numarasını giriniz: ");
        
        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma:");
        select = input.nextInt();
        System.out.println("Yapmak istediğiniz işlem : " + select);

        switch (select) {
            case 1:
                System.out.println("İşlemin sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("İşlemin sonucu: " + (n1 - n2));
                break;
            case 3:
                if (n2 != 0) {
                    System.out.println("İşlemin sonucu: " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            case 4:
                System.out.println("İşlemin sonucu: " + (n1 * n2));
                break;
            default:
                System.out.println("Yanlış saçim yaptınız. Tekrar deneyiniz!");

        }
    }
}
