
package week11;


import java.util.ArrayList;


public class task2 {
    public static <T extends Comparable> void max(ArrayList<T> a) {
        int n= a.size();
        T max=a.get(0);
        for (int i=1; i<n; i++){
            if ((a.get(i)).compareTo(max) > 0) {
                max = a.get(i);
            }
            
        }
        System.out.println("max =" +max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(58);
        list1.add(-1);
        list1.add(100);
        max(list1);
        
        ArrayList<Character> list2 = new ArrayList<>();
        //list2.add('f');
        list2.add('a');
        list2.add('A');
        max(list2);
        
    }
    
}
