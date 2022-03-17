import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 =  sc.next();
        String str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<Character>list1 = new ArrayList<>();
        ArrayList<Character>list2 = new ArrayList<>();
        if (str1.length() != str2.length()){
            System.out.println("not a anagram ");
        }else{
        for(int i= 0; i< str1.length(); i++){
            list1.add(str1.charAt(i));
            list2.add(str2.charAt(i));
        } Collections.sort(list1);
            Collections.sort(list2);

        if (list1.equals(list2)){
            System.out.println("Anagram");
        }}

    }
}
