import java.util.Scanner;

public class Staff {
    String education;
    String position;

    public void initialize(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter education");
        education = Scanner.nextLine();
        System.out.println("enter position");
        position = Scanner.nextLine();
    }
    public void print()
    {
        System.out.println("education :" + education);
        System.out.println("position :" + position);

    }
}
