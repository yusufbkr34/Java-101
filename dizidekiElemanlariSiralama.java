import java.util.Scanner;

public class dizidekiElemanlariSiralama {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elamanı : ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int tmp;
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        for (int i : arr) { // printer
            System.out.print(i + " ");
        }
    }
}
