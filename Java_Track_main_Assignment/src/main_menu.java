package Java_Track_main_Assignment.src;
import java.util.Scanner;

public class main_menu {
      void menu(){
          System.out.println("******Welcome to User Database******* \n"+
          "1. Add User Data \n"+
          "2.List User Data \n"+
          "3.Update User Data\n"+
          "4.Delete User Data\n"+
          "5.Exit");
          Scanner sc = new Scanner(System.in);
          int choice = sc.nextInt();
          if (choice == 1){
              Add_user_data add_user_data = new Add_user_data();
              add_user_data.add_user_data();}
          else if( choice == 2){
              List_user_data list_user_data = new List_user_data();
              list_user_data.list_user();}
          else if(choice == 3){
              Update_user update_user = new Update_user();
              Scanner s1 = new Scanner(System.in);
              String user_id = s1.next();
              String change = s1.next();
              int coloumn = s1.nextInt();

              update_user.update(user_id, change, coloumn);

          }
          else if (choice == 5){
              System.exit(0);
          }
          else{
              System.out.println("enter correct Input");
              menu();
          }
      }

}
