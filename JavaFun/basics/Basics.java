import java.util.ArrayList;
class Basics {
    public void print1To255() {
        for(int i=1; i<256; i++) {
            System.out.println(i);
        }
    }
    public void printOdds() {
        for(int i=1; i<256; i++) {
            if(i%2==1) {
                System.out.println(i);
            }
        }
    }
    public void printSum() {
        int sum = 0;
        for(int i=1; i<256; i++) {
            sum += i;
            System.out.println("New number: " +i+ " Sum: " +sum);
        }
    }
    public void printEachValue(int[] X) {
        for(int val : X) {
            System.out.println("Value is " +val);
        }
    }
    public int findMax(int[] X) {
        int max = X[0];
        for(int val : X) {
            if(max < val) {
                max = val;
            }
        }
        return max;
    }
    public double findAverage(int[] X) {
        double avg = 0;
        int sum = 0;
        for(int val : X) {
            sum += val;
        }
        avg = sum / X.length;
        return avg;
    }
    public void arrayOfOdds() {
        ArrayList y = new ArrayList();
        for(int i = 0; i < 256; i++) {
            if(i%2==1) {
                y.add(i);
            }
        }
        System.out.println(y);
    }
    public int countGreater(int[] X) {
        int y = 3;
        int count = 0;
        for(int val : X) {
            if(val > y) {
                count += 1;
            }
        }
        return count;
    }
    public void squareOfArrayValues(int[] X) {
        System.out.println("Squares: ");
        for(int i=0; i<X.length; i++) {
            X[i] *= X[i];
            System.out.println(X[i] + " ");
        }
    }
    public void removeNegatives(int[] X) {
        System.out.println("Removed Negatives: ");
        for(int i=0; i<X.length; i++) {
            if(X[i] < 0) {
                X[i] = 0;
            }
            System.out.println(X[i] + " ");
        }
    }
    public void findMaxMinAvg(int[] X) {
        int max = X[0];
        int min = X[0];
        int sum = 0;
        int avg = 0;
        ArrayList al = new ArrayList();
        for(int val : X) {
            if(max < val) {
                max = val;
            }
            if(min > val) {
                min = val;
            }
            sum += val;
        }
        avg = sum / X.length;
        al.add(max);
        al.add(min);
        al.add(avg);
        System.out.println("Max, Min and Average " +al);
    }
    public void shifting(int[] X) {
        System.out.println("Shifting values: ");
        for(int i =0; i<X.length-1; i++) {
            X[i] = X[i+1];
        }
        X[X.length-1] = 0;
        for(int i =0; i<X.length; i++) {
            System.out.println(X[i]);
        }
    }
}
