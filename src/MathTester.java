public class MathTester {

    public static void main(String[] args){
        String firstWord;
        String secondWord;
        int firstNumber,secondNumber, total;




        firstWord = "dog";
        secondWord= "house";

        firstNumber = 5;
        secondNumber = 10;
        total = firstNumber+secondNumber;
        System.out.println(total);
        total = total + 10;
        System.out.println(total);

        /* BMI = kg/m*m
        m = one inch *(0.0254meters/1inch)
        one inch = m*(1/0.0254)

        What is your height (only feet)? 5
        feet = their input
        what is your height (only inches)? 9
        inches = their input
        inches = inches + (feet * 12)

        What is your height in inches? 69
        inches = their input*/

        System.out.println(firstWord+secondWord);
        System.out.println(firstWord+(firstNumber+secondNumber));
        System.out.println("firstNumber + secondNumber is "+ (firstNumber+secondNumber));
        System.out.println("firstNumber - secondNumber is "+ (firstNumber-secondNumber));
        System.out.println("secondNumber / firstNumber is "+ (secondNumber/firstNumber));
        System.out.println("firstNumber * secondNumber is "+ (firstNumber*secondNumber));
        System.out.println("The modulus of the secondNumber by the firstNumber" +
                " is "+ (secondNumber%firstNumber));






    }
}
