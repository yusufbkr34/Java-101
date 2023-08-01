import java.util.Arrays;

public class diziElemanFrekansi {

    public static void main(String[] args) {
        //  Dizi elemanlarının frekansını bulma 
        int[] numbers = { 12, 3, 23, 23, -5, 32, -43, 23, 86, -43, -76, 0, 86 };
        int counter = 1;

        System.out.println("Dizi : " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sıralı : " + Arrays.toString(numbers));

        System.out.println("Tekrar Sayıları ");

        for (int i = 0; i < numbers.length; i++) {
            // ilk indisi aradan çıkarıyoruz.
            if (i == 0) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        counter++;
                    }
                }
                System.out.println(numbers[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            // Dizi sıralanınca tekrar edenler arka arkaya gelir ve bir önceki ile
            // eşleştirerek gidiyoruz.
            else if (numbers[i] != numbers[i - 1]) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        counter++;
                    }
                }
                System.out.println(numbers[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 1;
        }
    }

}
