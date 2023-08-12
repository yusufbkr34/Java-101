public class randomSayiToplami {
    public static void main(String args[])
    {
        int randomSayi = (int)(Math.random()*(1000)); //0 ile 1000 arasında random sayı ürettik.
        System.out.println("Random sayı : " + randomSayi); //üretilen sayıyı konsola yazdırdık.

        int birler = randomSayi %10; //birler basamağı

        randomSayi = randomSayi /10; 
        int onlar = randomSayi %10;   //onlar basamağı
        
        int yuzler = randomSayi /10;  //yüzler basamağı

        System.out.println("Toplamları ="+(birler+onlar+yuzler));


    }
}
