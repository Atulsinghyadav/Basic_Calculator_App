import java.util.ArrayList;

public abstract class BasicCalculator {

    public abstract double addition(ArrayList<Double> list) throws InvalidInputException;
    public abstract double substract(ArrayList<Double> list) throws InvalidInputException;
    public abstract double multiply(ArrayList<Double> list) throws InvalidInputException;
    public abstract double divison(ArrayList<Double> list) throws InvalidInputException;
}
