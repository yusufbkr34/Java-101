import java.util.Scanner;

public class faktoriyelHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Faktöriyel hesaplayan program while döngüsü ile

        int n, i = 1;
        int top = 1;

        System.out.print("Bir Sayı Giriniz: ");
        n = input.nextInt();

        while (i <= n) {
            top = top * i;
            i++;
        }

        System.out.print(n + ". Faktöriyel : " + top);

        // Faktöriyel hesaplayan program for döngüsü ile

        /*
         * int n;
         * int top=1;
         * 
         * System.out.print("Bir Sayı Giriniz :");
         * n=input.nextInt();
         * for (int i =1; i<=n; i++){
         * //System.out.println(i);
         * top=top*i;
         * }
         * 
         * System.out.print(n +". Faktöriyel : " + top);
         */

    }

}