package task2;

public class SumOfNumbers {

    static int sumOfNumbers(String str){
        int sum = 0;
        for(int i = 0; i < str.length() ; i++){
            if(Character.isDigit(str.charAt(i))){
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }
}
