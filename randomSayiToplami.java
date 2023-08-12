public class randomSayiToplami {
    public static void main(String args[])
    {
        int randomSayi = (int)(Math.random()*(1000)); 
        System.out.println("Random sayı : " + randomSayi); 

        int birler = randomSayi %10; 

        randomSayi = randomSayi /10; 
        int onlar = randomSayi %10;   
        
        int yuzler = randomSayi /10;  

        System.out.println("Toplamları ="+(birler+onlar+yuzler));


    }
}
