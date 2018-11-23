
package week11;


public class task1 {
     public static <T > void printArray(T[] arr) {
        for(T elm : arr) {
            System.out.print(elm + " ");
        }
    }
    public static <T extends Comparable<T>> void sort (T[] arr) {
         int n = arr.length;    
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1].compareTo(5) > 0){  
                                 T temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
    }
    public static void main(String[] args) {
         System.out.println("Integer :");
        Integer[] arr =  { -3, -5, 2, 9, 6 };
        sort(arr);   

        printArray(arr);
        
        System.out.println("\nDouble :");
        Double[] arr1 = { -1.5d, -6d, 3.2d, -12d, 5d };
        sort(arr1);
        printArray(arr1);
        
        System.out.println("\nCharacter :");
        Character[] charArr = {'a', 'g', 'd', 'l', 'k'};
        sort(charArr);
        printArray(charArr);
        
        System.out.println("\nLong :");
        Long[] longArr =  {12l, 30l, -25l, 44l};
        sort(longArr);
        printArray(longArr);
        
        System.out.println("\nShort :");
        Short[] shortArr =  {1, 9, 12, -41};
        sort(shortArr);
        printArray(shortArr);
        
        System.out.println("\nFloat :");
        Float[] floatArr = {1f, 2.5f, 9f, 12f};
        sort(floatArr);
        printArray(floatArr);
        
        System.out.println("\nByte :");
        Byte[] byteArr = {1, 5, 6 , 9};
        sort(byteArr);
        printArray(byteArr);
    }
}
