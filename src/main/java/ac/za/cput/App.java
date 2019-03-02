package ac.za.cput;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    static HashMap<String, Boolean> map = new HashMap<>();
    public static void main( String[] args )
    {
      String[] names = {"Matthew","Mark","Luke","John","Matthew"};
      List<String>list = Arrays.asList(names);
      System.out.printf("%s ", list);
      System.out.println();

      Set<String> set = new HashSet<String>(list);
      System.out.printf("%s ", set);
      System.out.println();


      map.put("Matthew", true);
      map.put("Mark", false);
      System.out.println(map.get("Matthew"));




        //add array item to list
        //for(String x: things)
          //  list.add(x);
    }
}
