public class Login {

    String check_user(String username) {
        Csv k = new Csv();
        int n = k.Csv_List().size();
        for (int i=0; i<n;i++) {
            if (username.equals(k.Csv_List().get(i).get(0))) {
                return "User_found ";
            }
        }
        return "User_not _found";
    }
}