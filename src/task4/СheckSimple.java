package task4;

public class СheckSimple {

    public  void  checkSimple(double input){
        if (input % 1 == 0) {

            double sqrt = Math.sqrt(input);
            double currentValue = input;
            int multiplier = 2;
            while (currentValue > 1 && multiplier <= sqrt)
            {
                if (currentValue % multiplier == 0)
                {
                    System.out.println(multiplier + " ");
                    currentValue /= multiplier;
                }
                else if (multiplier == 2)
                {
                    multiplier++;
                }
                else
                {
                    multiplier += 2;
                }
            }
            if (currentValue != 1)
            {
                System.out.println(currentValue);
            }

        }else {
            throw new ExceptionInput("Введено не целое число!");
        }
    }
}
