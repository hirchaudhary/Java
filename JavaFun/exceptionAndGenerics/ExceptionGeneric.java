import java.util.ArrayList;
class ExceptionGeneric {
    public void exceptionGeneric() {
        ArrayList myList = new ArrayList();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        try{
            for(int i = 0; i < myList.size(); i++){
                int castedValue = (Integer)myList.get(i);
            }
            System.out.println(myList);
        }catch (ClassCastException e) {
            System.out.println("Got exception");
        }
    }
    public void generic() {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(13);
        myList.add(48);
        System.out.println(myList);
    }
}
