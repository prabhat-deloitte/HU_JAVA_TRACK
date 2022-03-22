import java.util.Scanner;

public class List_user_data {
void list_user() {
    Csvdata k = new Csvdata();
    int n = k.Csv_List_data().size();
    System.out.print("Enter User_ID: ");
    Scanner sc = new Scanner(System.in);
    String Userid = sc.next();

    for (int i = 0; i < n; i++) {
        System.out.println(k.Csv_List_data().get(i).get(i));
        if (Userid.equals(k.Csv_List_data().get(i).get(0))) {
            System.out.println(k.Csv_List_data().get(i));
        }
        main_menu me = new main_menu();
        me.menu();
    }

}
}

