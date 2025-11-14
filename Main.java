import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create objects and test your classes in here
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the person's first name:");
    String a = sc.nextLine();
    System.out.println("Enter the person's last name:");
    String b = sc.nextLine();
    System.out.println("Enter the person's age:");
    int c = sc.nextInt();
    System.out.println("Enter the person's social security number:");
    int d = sc.nextInt();
    Person p1 = new Person("Andy", "Pham", 17, 123456789);
    Person p2 = new Person(a,b,c,d);
    System.out.println(p2);
    System.out.println(p1);
  }
}
