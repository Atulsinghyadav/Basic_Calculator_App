import java.util.ArrayList;
import java.util.Scanner;

public class BasicCalculatorApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Enter the number of values you want to operate");

        int n = scanner.nextInt();

       // double[] arr = new double[n];
        ArrayList<Double> list = new ArrayList(n);

        System.out.println("Enter the numbers");

        for(int i=0; i<n; i++){
           // arr[i] = scanner.nextDouble();
            list.add(scanner.nextDouble());
        }

        if(list.size()>2){
            System.out.println("Warning: Subtracting more than 2 numbers may result in negative values!");
        }

        System.out.println("Press 1 for addition " +" 2 for substraction " + " 3 for multiply " + " 4 for divison ");

        int input = scanner.nextInt();



        switch(input){

            case 1:
                try {
                    System.out.println("Result:" + calculator.addition(list));
                    break;
                }
                catch (InvalidInputException e){
                    System.out.println("Error: " + e.getMessage() );
                }
            case 2:
                try {
                    System.out.println("Result:" + calculator.substract(list));
                    break;
                }
                catch (InvalidInputException e){
                    System.out.println("Error: "+e.getMessage());
                }
            case 3:
                try{
                    System.out.println("Result: " + calculator.multiply(list));
                }
                catch (InvalidInputException e){
                    System.out.println("Error: " + e.getMessage());
                }
            case 4:
                try{
                    System.out.println("Result: " + calculator.divison(list));
                }
                catch (NullPointerException e){
                    System.out.println("Error: " + e.getMessage());
                }
                catch (InvalidInputException e){
                    System.out.println("Error: " + e.getMessage());
                }
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
