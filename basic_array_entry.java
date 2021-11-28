import java.util.Scanner;
public class basic_array_entry {

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    String[] array = new String[5];

    System.out.println("Please enter 5 names to sort");

    for (int i = 0; i < array.length; i++) {
        array[i] = s.nextLine();
    }
    System.out.println("The names you entered are:");
    //Just to test
    for (int i=0; i<array.length;i++)
        System.out.println(array[i]);
  }
}
