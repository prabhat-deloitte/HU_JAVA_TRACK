package Java_Track_main_Assignment.src;
import java.util.Scanner;

public class Login {

    String check_user(String username) {
        Csv k = new Csv();
        int n = k.Csv_List().size();
        for (int i=0; i<n;i++) {
            if (username.equals(k.Csv_List().get(i).get(0))) {
                return "User_found";
            }
        }
        return "User_not _found";
    }
    int check_password(String username){
        Csv k = new Csv();
        int n = k.Csv_List().size();
        for (int i=0; i<n;i++) {
            if (username.equals(k.Csv_List().get(i).get(0))){

                 return i;
            }
        }return 0;
    }
    String login(){
        Csv k = new Csv();
        System.out.println("enter username");
        String pass;
        String username;
        Scanner scn = new Scanner(System.in);
        username = scn.next();
        System.out.println("Eneter Password");
        pass = scn.next();
       if (check_user(username).equals("User_found")){
           if (pass.equals(k.Csv_List().get(check_password(username)).get(1))){
               System.out.println("login_sucessful");
               return "login Sucesfull";
           }

       }
        System.out.println("Invalid credential");
       return "Invalid Credentials";
    }
}