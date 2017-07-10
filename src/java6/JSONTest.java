package java6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class JSONTest {

   public static void main(String[] args){
      JSONObject obj = new JSONObject();

      String[] s = {"abc","def","xyz"};
//      obj.put("searchtext",Arrays.asList(s));
      
      Map<String,Integer> m = new HashMap<>();
      m.put("abc", 2);
      m.put("def", 3);
      m.put("ghi", 4);
      m.put("jkl", 5);
      
      obj.put("counter",m);
      
/*      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));
*/
      System.out.print(obj);
   }
}