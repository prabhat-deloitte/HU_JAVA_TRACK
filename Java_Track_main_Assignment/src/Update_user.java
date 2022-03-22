package Java_Track_main_Assignment.src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Update_user {

    public void update(String user_id,String change, int coloumn){
        Csvdata k = new Csvdata();
       ArrayList<ArrayList<String>> Local_data =  k.Csv_List_data();
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i<Local_data.size(); i++){
           if (Local_data.get(i).get(0).equals(user_id)){
               Local_data.get(i).set(coloumn, change);
               break;
           }
       }try {
            String file_path = "C:\\Users\\praparihar\\IdeaProjects\\MIn_assignment\\HU_JAVA_TRACK\\Java_Track_main_Assignment\\src\\temp1.csv";
            File temp = new File(file_path);

            FileWriter fileWriter = new FileWriter("C:\\Users\\praparihar\\IdeaProjects\\MIn_assignment\\HU_JAVA_TRACK\\Java_Track_main_Assignment\\src\\temp.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder sb1 = new StringBuilder();
            System.out.println(k.Csv_List_data());
            for (int i = 0; i < Local_data.size(); i++) {

                for (int j=0; j<8; j++){
                    sb1.append(k.Csv_List_data().get(i).get(j));
                    if (j<7){
                        sb1.append(",");
                    }
                }sb1.append("\n");
                bufferedWriter.write(sb1.toString());

            }bufferedWriter.close();

        }

       catch(Exception e){

       }
    }

}
