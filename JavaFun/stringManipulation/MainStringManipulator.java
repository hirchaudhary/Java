class MainStringManipulator {
    public static void main(String[] args) {
        StringManipulator object = new StringManipulator();
        System.out.println("trimAndConcat(String, String) --->" +object.trimAndConcat("He ","llo"));
        System.out.println("getIndexOrNull(String, char) --->" +object.getIndexOrNull("Coding",'a'));
        System.out.println("getIndexOrNull(String, String) --->" +object.getIndexOrNull("Hello! Welcome.", "come"));
        System.out.println("concatSubstring(String, int, int, String) --->" +object.concatSubstring("Hello", 1, 2, "World"));
    }
}
