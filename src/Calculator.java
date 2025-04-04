import java.util.ArrayList;

public class Calculator extends BasicCalculator{


    @Override
    public double addition(ArrayList<Double> list) throws InvalidInputException{
        if(list.size()<2){
            throw new InvalidInputException("Please enter atleast two numbers to perform addition.");
        }
        double result = 0;
        for(double n:list){
            result += n;
        }
        return result;
    }

    @Override
    public double substract(ArrayList<Double> list) throws InvalidInputException{

        if(list.size()<2){
            throw new InvalidInputException("Please enter atleast two numbers to perform substraction");
        }
        double result = 0;

        for(double n: list){
            result -= n;
        }

        return result;
    }

    @Override
    public double multiply(ArrayList<Double> list) throws InvalidInputException{

        if(list.size()<2){
            throw new InvalidInputException("Please enter atleast two numbers to perform multiply");
        }
        double result = 0;

        for(double n:list){
            result *= n;
        }
        return result;
    }

    public double divison(ArrayList<Double> list) throws InvalidInputException, NullPointerException{

        if(list.size()<2) {
            throw new InvalidInputException("Please enter atleast two numbers to perform divison");
        }
        double result = 0;

        for(double n: list){
            if(n==0){
                throw new NullPointerException("You can not use a zero value in divison");
            }
            result /= n;
        }
        return result;
    }
}
