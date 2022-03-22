import java.util.Scanner;

public class main_menu {
      void menu(){
          System.out.println("******Welcome to User Database*******"+
          "1. Add User Data \n"+
          "2.List User Data \n"+
          "3.Update User Data\n"+
          "4.Delete User Data\n"+
          "5.Exit");
          Scanner sc = new Scanner(System.in);
          int choice = sc.nextInt();
          if (choice == 1){
              Add_user_data add_user_data = new Add_user_data();
              add_user_data.add_user_data();

          }
      }

}
