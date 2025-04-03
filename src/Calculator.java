public class Calculator extends BasicCalculator{


    @Override
    public double addition(double... nums) {
        double result = 0;
        for(double n:nums){
            result += n;
        }
        return result;
    }

    @Override
    public double substract(double... nums) {
        double result = 0;

        for(double n: nums){
            result -= n;
        }

        return result;
    }
}
