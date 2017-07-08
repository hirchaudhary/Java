class MainBasics {
    public static void main(String[] args) {
        Basics object = new Basics();
        int[] X = {4,6,-7,2,3};
        object.print1To255();
        object.printOdds();
        object.printSum();
        object.printEachValue(X);
        System.out.println("Maixmum number: " +object.findMax(X));
        System.out.println("Average: " +object.findAverage(X));
        object.arrayOfOdds();
        System.out.println("Number of elements that are greater than y " +object.countGreater(X));
        object.removeNegatives(X);
        object.squareOfArrayValues(X);
        object.findMaxMinAvg(X);
        object.shifting(X);
    }
}
