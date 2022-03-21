public class Solution_Exception {
    public static void main(String[] args) {
        int a = 2;
        try{
            System.out.println(a/0);
        }

        catch (Exception e){

            System.out.println(e);
        }
        finally{
            System.out.println("thank you");
        }
    } }