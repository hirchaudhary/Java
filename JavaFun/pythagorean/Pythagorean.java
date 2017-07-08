import java.lang.Math;

class Pythagorean {
    public double findHypotenuse(int legA, int legB){
        double legAB = (legA * legA) + (legB * legB);
        double squareRoot = Math.sqrt(legAB);
        return squareRoot;
    }
}
