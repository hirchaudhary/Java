import java.lang.Math;

class MainPythagorean {
    public static void main(String[] args) {
        Pythagorean object = new Pythagorean();
        double squareRoot = object.findHypotenuse(20,10);
        System.out.println(squareRoot);
    }
}
