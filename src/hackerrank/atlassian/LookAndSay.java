package hackerrank.atlassian;

public class LookAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LookAndSay is : "+LookAndSay("114", 15));

	}
	
	public static String lookAndSay(String start, int n){
		System.out.println("n:"+n+",start:"+start);
		String result="";
		String s = start;
		String s1 = "";
		for(int i=0;i<s.length();i++){
			
			if(!"".equals(s1) && s.charAt(i) != s1.charAt(0)){
//				System.out.println("one S1:"+s1 + ", s:"+s);
				result += ""+s1.length() + s1.charAt(0);
				s1 = "";
//				System.out.println("two result:"+result);
			}
			s1 += s.charAt(i);
//			System.out.println("three S1:"+s1 );
		}
		
		result += ""+s1.length() + s1.charAt(0);
//		System.out.println("four now result:"+result + ", s1:"+s1 + ",s1.length():"+s1.length() + ",s1.charAt(0):"+s1.charAt(0));
		
		if(n == 1){
//			System.out.println("five return:"+ result );	
			return result;
		}else{
//			System.out.println("six recurring return:"+ result );
			return lookAndSay(result,n-1);
		}
	}

	static String LookAndSay(String start, int n) {
		System.out.println("n:"+n+",start:"+start);
        StringBuilder result = new StringBuilder();
        String tempStr = "";
        for(int i =0;i<start.length();i++){
            if(!"".equals(tempStr) && tempStr.charAt(0) != start.charAt(i)){
                result.append(tempStr.length() + "" + tempStr.charAt(0));
                tempStr = "";
            }
            tempStr += start.charAt(i);
        }
        result.append(tempStr.length() + "" + tempStr.charAt(0));

        if(n == 1){
            return result.toString();
        }else{
            return LookAndSay(result.toString(),n-1);
        }
    }

}
