import java.util.Scanner;

public class Person {
        String name;
        String surname;
        String street;
                String zipcode;
                String city;
                public void initialize (){

                    Scanner Scanner = new Scanner(System.in);
                    System.out.println("enter name");
                    name = Scanner.nextLine();
                    System.out.println("enter surname");
                    surname = Scanner.nextLine();
                    System.out.println("enter street");
                    street = Scanner.nextLine();
                    System.out.println("enter zipcode");
                    zipcode = Scanner.nextLine();
                    System.out.println("enter city");
                    city = Scanner.nextLine();
                }
                public void print()
    {
        System.out.println("name :"+ name);
        System.out.println("surname :"+ surname);
        System.out.println("street :"+ street);
        System.out.println("zipcode :" +zipcode);
        System.out.println("city :" + city);


    }
}
