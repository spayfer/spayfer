import java.util.*;
public class list_java {

  public static void main (String[] args) {
    List a1 = new ArrayList();
    a1.add("Rocco");
    a1.add("Bella");
    a1.add("Lilly");
    System.out.println(" ArrayList Elements");
    System.out.print("\t" + a1);

    List l1 = new LinkedList();
    l1.add("Rocco");
    l1.add("Bella");
    l1.add("Lilly");
    System.out.println();
    System.out.println(" LinkedList Elements");
    System.out.print("\t" + l1);
  }
}
