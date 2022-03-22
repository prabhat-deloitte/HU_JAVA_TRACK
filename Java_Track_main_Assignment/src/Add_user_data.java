import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Add_user_data {
     void add_user_data(){
         try{ String UserId,name,Age,Company_name,Designation,Salary,Address,phone_number;
              Scanner sc= new Scanner(System.in);
              UserId = sc.next();
              System.out.print("Enter name : ");
              name = sc.next();
              System.out.print("Enter Age : ");
              Age = sc.next();
              System.out.print("Enter Company_name : ");
              Company_name = sc.next();
              System.out.print("Enter designation : ");
              Designation = sc.next();
              System.out.print("Enter salary : ");
              Salary =sc.next();
              System.out.print("Enter Address : ");
              Address = sc.next();
              System.out.print("Enter phone_number : ");
              phone_number =sc.next();
              FileWriter fileWriter = new FileWriter("C:\\Users\\praparihar\\IdeaProjects\\Assignment 5\\HU_JAVA_TRACK\\Java_Track_main_Assignment\\src\\Databse.csv", true);
              BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
              StringBuilder sb = new StringBuilder();
              sb.append(UserId);
              sb.append(',');
              sb.append(name);
              sb.append(',');
              sb.append(Age);
              sb.append(",");
              sb.append(Company_name);
              sb.append(",");
              sb.append(Designation);
              sb.append(",");
              sb.append(Salary);
              sb.append(",");
              sb.append(Address);
              sb.append(",");
              sb.append(phone_number);
              sb.append('\n');
              bufferedWriter.write(sb.toString());
              bufferedWriter.close();
              main_menu me = new main_menu();
              me.menu();
         }
         catch(Exception e){
              System.out.println(e);
         }
     }

}
