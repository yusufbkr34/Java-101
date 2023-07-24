import java.util.Scanner;

public class daireAlanHesaplama {
    public static void main(String[] args) {
          int r;
        double pi = 3.14;


        Scanner daire = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = daire.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;


        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
    }
    
}
