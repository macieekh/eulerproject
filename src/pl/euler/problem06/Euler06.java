package pl.euler.problem06;

public class Euler06 {

    public double findDiff(double number) {

        return squareOfSum(number)-sumoOfSquares(number);
    }

    public double sumoOfSquares(double number){
        double sum = 0;

        for (int i=1; i<=number; i++) {
            sum += Math.pow(i,2);
        }

        return sum;
    }

    public double squareOfSum (double number) {
        double sum = 0;

        for (int i=1; i<=number; i++) {
            sum += i;
        }

        return Math.pow(sum, 2);
    }

}
