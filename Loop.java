package HU_JAVA_TRACK;



import java.util.*;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows you want to print: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blank = n-1;
        int star = 1;
        for (int i=1; i<= 2*n; i++){
            for(int j = 1; j<=blank;j++) {
                System.out.print(" ");
            }for(int j = 1; j<= star; j++){
                System.out.print("*");
            }
            if (i<=n-1){
                blank-=1;
                star+=1;

            }else{
                blank+=1;
                star-=1;
            }
            System.out.println();
        }}
}

