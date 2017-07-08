class MainPuzzle {
    public static void main(String[] args) {
        Puzzle object = new Puzzle();
        System.out.println(object.greaterThan10());
        System.out.println(object.shuffleArr());
        object.shuffleChar();
        System.out.println(object.randArray());
        System.out.println(object.randString());
        object.randString10();
    }
}
