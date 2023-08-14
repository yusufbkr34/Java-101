import java.util.concurrent.TimeUnit;

public class saniyeDakikaCevrimi {
    public static void main(String[] args) {

        long milliseconds = 1000000;

        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        System.out.println(milliseconds + " Milisaniye = " + seconds + " Saniye");

        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
        System.out.println(milliseconds + " Milisaniye = " + minutes + " Dakika");
    }
}

/*
 ******************* Matematiksel Formül Kullanarak Milisaniyeden Saniyeye/Dakikaya  Çevirme****************
 * 
 * 
 * // milisaniyeyi saniyeye çevir
 * Saniye = milisaniye / 1000
 * 
 *  // milisaniyeyi dakikaya çevir
 * dakika = (milisaniye / 1000) / 60
 * 
 * // saniyeyi dakikaya çevir
 * dakika = saniye / 60
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */