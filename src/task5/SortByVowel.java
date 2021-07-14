package task5;

public class SortByVowel {

    public  void  sortByVowel(String[] subStr) {
        //Сортировка
        for (int i = 0; i < subStr.length; i++) {
            for (int j = 0; j < subStr.length; j++) {
                if (numberOfVowels(subStr[j]) < numberOfVowels(subStr[i])) {
                    String aj = subStr[j];
                    String ai = subStr[i];
                    subStr[j] = ai;
                    subStr[i] = aj;
                }
            }
        }
    }

    static int numberOfVowels(String s) {
        int cou=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                cou++;
            }
        }
        return cou;
    }

    static String largeVowel(String s) {

        String s2 = "";
        boolean b = true;

        for(int i=0;i<s.length();i++) {

            if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') && b) {
                s2 = s2 + s.substring(i, i+1).toUpperCase();
                b = false;
            } else {
                s2 = s2 + s.substring(i, i+1);
            }
        }
        return s2;
    }

}

