import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class List_reversal {


    public static void main(String[] args) {
       ArrayList<String>list1 = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       int n= 5;
       for (int i = 0; i<n; i++){
           list1.add(sc.next());
       }
        Collections.reverse(list1);
        System.out.println(list1);
    }
}
