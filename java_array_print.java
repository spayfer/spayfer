import java.util.Arrays;
import java.util.Iterator;
public class java_array_print

{
public static void main(String[] args)

  {
//declaration and initialization of an array of Double type

Double[] array = {1.5, 2.6, 3.7, 4.8, 5.9};

//returns an iterator

Iterator<Double> itr = Arrays.asList(array).iterator();

while(itr.hasNext()) //returns a boolean valude

    {
     System.out.println(itr.next());
    }
  }
}
