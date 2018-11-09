package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
/////////////

package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {
    public static String readContentFromFile(String path) {
        
        File file = new File(path);
        try (Scanner sc = new Scanner(file)) {
            
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch(IOException e) {
            e.printStackTrace();
           // return null;
        }
         return "";
    }
    public static void writeContentToFile(String path)  {
      File file = new File(path);
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello");
            pw.println("Hello");
      pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Co loi");
        }
    }
      public static String writeContentFromFile2(String path) {
        File file = new File(path);
        try (Writer fw = new FileWriter(file, true);
                PrintWriter pw = new PrintWriter(new BufferedWriter(fw))) {
            pw.println("Hi");
        } catch (Exception e) {
        }
        return "";
    }
     public static File findFileByName(String folder, String fileName){
        File file = new File(folder + "\\" + fileName);
        if(file.exists()) {
                return file.getAbsoluteFile();
         } 
        return null;
     }
    public static void main(String[] args) {
       //writeContentToFile("C:\\task9\\File.txt");
        //writeContentFromFile2("C:\\task9\\File.txt");
        //System.out.println(readContentFromFile("C:\\\\task9\\\\File.txt"));
        System.out.println(  findFileByName("C:\\task9","File.txt"));
    }
    
}

