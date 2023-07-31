public class diziOrtalamasi {
    public static void main(String[] args) {
        double[] list = {2, 3, 4, 5, 6, 7,};
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println(sum / list.length);
    }
}
