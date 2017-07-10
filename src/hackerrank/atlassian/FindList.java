package hackerrank.atlassian;

import java.util.Arrays;
import java.util.List;

public class FindList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1 = Arrays.asList(1,2,3,4,5);
		List l2 = Arrays.asList(2,3,4,5);
		System.out.println(find(l1,l2));
	}

/*    static int find(LinkedListNode list, LinkedListNode sublist) {
        String listStr = nodeToString(list);
        String sublistStr = nodeToString(sublist);
        return listStr.indexOf(sublistStr);        
    }
    static String nodeToString(LinkedListNode list){
        StringBuilder sb = new StringBuilder();
        while(list != null){
            sb.append(list.val);
            list = list.next;
        }
        return sb.toString();
    }
 */  
    	    
	    private static int find (List list, List subList){
	        String list1 = list.toString().replace("[","").replace("]","");
	        String list2 = subList.toString().replace("[","").replace("]","");
	        int index = list1.indexOf(list2);
	        System.out.println("index is:"+index);
	        return list1.contains(list2)?index:-1;
	    }
}
