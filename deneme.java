public class deneme {

    public boolean Anagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] ch = word1.toCharArray();
        char[] ch1 = word2.toCharArray();

        int sum_ascii = 0;
        for (int i = 0; i < ch.length; i++) {

            sum_ascii = sum_ascii + (int) ch[i];
        }

        int sum_ascii1 = 0;
        for (int i = 0; i < ch1.length; i++) {

            sum_ascii1 = sum_ascii1 + (int) ch1[i];
        }

        if (sum_ascii == sum_ascii1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        deneme an = new deneme();
        System.out.println(an.Anagram("enerjik", "jenerik"));
    }

}