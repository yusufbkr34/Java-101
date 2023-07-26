import java.util.Scanner;

public class recursiveAsalSayi {
    public static boolean asalMi(int sayi, int bolen) {
        if (sayi < 2) { // 2'den kücük sayılar asal değil.
            return false;
        }
        if (sayi == 2) { // 2 asal bir sayıdır.
            return true;
        }
        if (sayi % bolen == 0) { // Eğer sayı bölündüyse asal değildir.
            return false;
        }
        if (bolen * bolen > sayi) { // Sayının karekokunden büyük sayılara bölünmezse asaldır.
            return true;
        }
        return asalMi(sayi, bolen + 1); // Boleni arttırarak fonksiyonu tekrar çağırır.
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girinizi :");
        int sayi = inp.nextInt();

        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }

    }
}
