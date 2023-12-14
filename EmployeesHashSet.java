import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeesHashSet {
    public static void main(String[] args) {
        String data;
        HashSet<String> set= new HashSet<>();
         try(BufferedReader br = new BufferedReader(new FileReader("employees.txt"))){
             while((data = br.readLine()) != null){
         }
    }
         catch (IIOException e){
             System.out.println("Data loading error");
         }
         System.out.println("The list consists of "+" elements.");

        Iterator<String> iter = set.iterator();

        while(iter.hasNext()){
            String element= iter.next();
            System.out.println(element);

        }
        System.out.println(set.contains("Nyasha Pasipamire"));

}}
