import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeReader {
    public static void main(String[] args) {
        ArrayList<String>employees=new ArrayList<>();
        String fileName = "employees.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) !=null){

                employees.add(line);
            }
        }
        catch(IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("Collection size:" +employees.size());

        for(String employee : employees){
            System.out.println(employee);
        }
    }
}
