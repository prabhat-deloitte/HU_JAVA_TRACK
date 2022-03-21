import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Registration {
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter("C:\\Users\\praparihar\\IdeaProjects\\Assignment 5\\HU_JAVA_TRACK\\Java_Track_main_Assignment\\src\\Book1.csv")) {

            StringBuilder sb = new StringBuilder();
            sb.append("id");
            sb.append(',');
            sb.append("Name");
            sb.append('\n');

            sb.append("1");
            sb.append(',');
            sb.append("Prashant Ghimireghthsdhseg");
            sb.append('\n');

            writer.write(sb.toString());

            System.out.println(sb);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}


