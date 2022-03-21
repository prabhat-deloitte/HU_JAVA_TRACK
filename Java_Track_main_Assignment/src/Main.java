import java.util.*;
import java.lang.*;
import java.io.*;


class Csv {
    public ArrayList<ArrayList<String>> outer_list = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Csv_List(){
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\praparihar\\IdeaProjects\\Assignment 5\\HU_JAVA_TRACK\\Java_Track_main_Assignment\\src\\Book1.csv"));
            String line = "";
            line = br.readLine();
            int n = -1;

            ArrayList<String> inner_list = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                n++;
                inner_list = new ArrayList<>();

                String [] list1 = line.split(",");


                for (int i =0; i<5; i++){

                    inner_list.add(list1[i]);
                }

                outer_list.add(inner_list);


            }

               } catch ( IOException e) {
                   System.out.println("some error happen");
        }
        return outer_list;
    }

    }

public class Main{
    public static void main(String[] args) {

        System.out.println("1.Login \n 2.registration");
        Scanner scn = new Scanner(System.in);
        String username,re_enter_pass, password;
        System.out.println("Enter User name");
        username = scn.next();
        String validity = "Invalid";
        while(validity == "Invalid"){
        System.out.println("Enter password •\tPassword should be in a range of 5 to 10 characters with below combination  \n" +
                "\t     At least one Uppercase alphabet  \n" +
                "\t     At least one Lowercase alphabet  \n" +
                "\t     At least one special characters “@ #  &  % * ! ”  \n" +
                "\t     At least one digit 1,2,3,…. \n");
        password = scn.next();
        Password pass = new Password();
        try {
            if (Password.validatePassword(password).equals("Valid password")){
                validity = "Valid";
            }
        }
        catch(Password.PasswordException e){
            System.out.println(e);
        }

        Login log = new Login();
        System.out.println(log.check_user("RIYA SINGH"));

    }
}}

