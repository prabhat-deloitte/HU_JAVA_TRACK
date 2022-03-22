import java.io.*;
import java.util.Scanner;

public class Registration {

    static void register () throws IOException{
        try {
            String username,re_enter_pass, password;
            System.out.println("Enter User name");
            Scanner scn = new Scanner(System.in);
            username = scn.next();
            String validity = "Invalid";
            String pswrd;
            while(validity == "Invalid"){
                System.out.println("Enter password •\tPassword should be in a range of 5 to 10 characters with below combination  \n" +
                        "\t     At least one Uppercase alphabet  \n" +
                        "\t     At least one Lowercase alphabet  \n" +
                        "\t     At least one special characters “@ #  &  % * ! ”  \n" +
                        "\t     At least one digit 1,2,3,…. \n");
                pswrd = scn.next();
                Password pass = new Password();
                try {
                    if (Password.validatePassword(pswrd).equals("Valid password")){
                        password = pswrd;
                        FileWriter fileWriter =new FileWriter("C:\\Users\\praparihar\\IdeaProjects\\Assignment 5\\HU_JAVA_TRACK\\Java_Track_main_Assignment\\src\\Book1.csv", true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        StringBuilder sb = new StringBuilder();
                        sb.append(username);
                        sb.append(',');
                        sb.append(password);
                        sb.append('\n');
                        bufferedWriter.write(sb.toString());
                        bufferedWriter.close();
                        password = pswrd;
                        validity = "Valid";
                    }
                }
                catch(Password.PasswordException e){
                    System.out.println(e);
                }}


        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}



