import java.time.LocalDateTime;

public class currentDateTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        System.out.println("Güncel Tarih ve Saat:: " + current);
    }
}
