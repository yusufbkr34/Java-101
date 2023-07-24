import java.util.Scanner;

public class ortalamaHesaplama {
    public  static void main(String[] args) { 
 
 
        int mat, fizik, kimya, tarih, muzik, turkce;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Ders Notunu Giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Ders Notunu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Ders Notunu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih Ders Notunu Giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Ders Notunu Giriniz : ");
        muzik = inp.nextInt();

        System.out.print("Türkçe Ders Notunu Giriniz : ");
        turkce = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik + turkce);
        double sonuc = (toplam / 6.0);

        System.out.println("Ders Ortalamanız: " + sonuc);
        System.out.println(sonuc < 60 ? "Dersi Geçemediniz :(" : "Tebrikler Geçtiniz.");

    }
}