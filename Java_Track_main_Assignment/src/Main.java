import java.util.*;
import java.lang.*;
import java.io.*;


class Csv {
    public ArrayList<ArrayList<String>> outer_list = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Csv_List(){
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\praparihar\\IdeaProjects\\Assignment 5\\Java_Track_main_Assignment\\src\\Book1.csv"));
            String line = "";
            line = br.readLine();
            int n = -1;

            ArrayList<String> inner_list = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                n++;
                inner_list.clear();
                System.out.println(inner_list);
                String [] list1 = line.split(",");


                for (int i =0; i<5; i++){
                    inner_list.add(list1[i]);
                }
                System.out.println(inner_list);
                outer_list.add(inner_list);
                System.out.println(outer_list);

            }
            //System.out.println(outer_list);

               } catch ( IOException e) {
                   System.out.println("some error happen");
        }
        return outer_list;
    }

    }

public class Main{
    public static void main(String[] args) {
        Login log = new Login();
        log.check_user("Aditya Kumar");



    }
}

