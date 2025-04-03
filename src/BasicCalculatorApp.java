import java.util.Scanner;

public class BasicCalculatorApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Enter the number of values you want to operate");

        int n = scanner.nextInt();

        double[] arr = new double[n];

        System.out.println("Enter the numbers");

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextDouble();
        }

        System.out.println("Press 1 for addition or 2 for substraction");

        int input = scanner.nextInt();

        switch(input){

            case 1:
                System.out.println("Result:" + calculator.addition(arr));
                break;
            case 2:
                System.out.println("Result:" + calculator.substract(arr));
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
