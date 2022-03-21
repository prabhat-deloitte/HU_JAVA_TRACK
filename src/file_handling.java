import java.io.File;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.Scanner;
public class file_handling {
    public static void main(String[] args) throws Exception {
//parsing a CSV file into Scanner class constructor
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\praparihar\\IdeaProjects\\Assignment 5\\HU_JAVA_TRACK\\Book1.csv"));
        String line = "";
        line = br.readLine();
        line = br.readLine();
        String[] newarr = line.split(",");

        System.out.println(newarr);

        ArrayList<ArrayList<String>> list2 = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(newarr[0]);

        list2.add(0,list1);
        System.out.println(list2.get(0));
       /* list2.get(1).add(1,"reg-no- 10");
        list2.get(2).add(2,"name2");
        list2.get(3).add(3,"reg-no- 1000");
        //System.out.println(list2.get(0).get(0));
*/

        for(int i =0; i<list2.size(); i++)
        {
            for (int j= 0; j<list2.get(i).size(); j++){
                System.out.println(list2.get(i).get(j));

            }
        }
    }
}

        /*while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] cols = line.split(",");

            //String [] list3 = line.split(",");
            System.out.println(cols[1]);

            //System.out.println(line);
        }*/
        //System.out.println(list1);

