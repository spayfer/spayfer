import java.util.ArrayList;
import java.util.Iterator;

public class java_array_print_names

{
public static void main(String[] args)

  {
//declaration and initialization of an array of Double type

ArrayList<String> names = new ArrayList<String>();
names.add("ron.burgundy");
names.add("leslie.nope");
names.add("mariah.carey");

//returns an iterator

Iterator<String> itr = names.iterator();

while(itr.hasNext()) //returns a boolean valude

    {
     System.out.println(itr.next());
    }
  }
}
