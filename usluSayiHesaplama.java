import java.util.Scanner;

public class usluSayiHesaplama {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        int n, r;
        System.out.print("Taban sayıyı giriniz : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        r = input.nextInt();
        int total=1;
        for (int i =1; i<=r;i++){
            total*=n;
        }
        System.out.println("Sonuc : " +total);
    }
}
