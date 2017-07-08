import java.util.*;
import java.util.Arrays;

class Puzzle {
    public ArrayList greaterThan10() {
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList al = new ArrayList();
        for(int val : arr) {
            if(val > 10) {
                al.add(val);
            }
        }
        return al;
    }
    public ArrayList shuffleArr(){
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList arrList = new ArrayList();
        ArrayList name = new ArrayList();
        for(int i=0; i<names.length; i++){
            name.add(names[i]);
        }
        Collections.shuffle(name);
        System.out.println("Shuffle The list: " +name);
        for(int i=0; i<names.length; i++){
            if(names[i].length() > 5){
                arrList.add(names[i]);
            }
        }
        return arrList;
    }

    public void shuffleChar() {
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Collections.shuffle(Arrays.asList(alphabet));
        System.out.println("Shuffled Chars: " +Arrays.toString(alphabet));
        String first = alphabet[0];
        String[] wovel = {"A","E","I","O","U"};
        for(String val : wovel){
            if(first == val){
                System.out.println(first+ " is wovel letter");
            }
        }
        System.out.println("First Char: " +first);
        System.out.println("Last Char: " +alphabet[alphabet.length-1]);
    }

    public ArrayList randArray() {
        ArrayList al = new ArrayList();
        Random rnd = new Random();
        for(int i = 1; i<10; i++) {
            int rndNum = rnd.nextInt(45) +55;
            al.add(rndNum);
        }
        Collections.sort(al);
        System.out.println("Minimum: " +al.get(0));
        System.out.println("Maximum: " +al.get(al.size()-1));
        return al;
    }
    public String randString() {
        String str = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String result = new String();
        Random r = new Random();

        for (int i=1; i<=5; i++) {
            result = result + str.charAt(r.nextInt(str.length()));
        }
        return result;
    }
    public void randString10() {
        String str = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String result = new String();
        Random r = new Random();
        ArrayList al = new ArrayList();
        for (int i=1; i<=10; i++) {
            result = "";
            for (int j=1; j<=5; j++) {
                result = result + str.charAt(r.nextInt(str.length()));
            }
            al.add(result);
        }
        System.out.println(al);
    }
}
