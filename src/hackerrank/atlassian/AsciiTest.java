package hackerrank.atlassian;

/**
 * 
A third-party provider uses a custom data format to exchange information with us. 
We need to validate the input before we process it further.
The character encoding is US-ASCII. Valid characters are all the characters between 0x20 (space) and 0x7E (~).
All fields are delimited by '|', and '~' is the escape character. 
There are only three valid escape sequences:

    '~|' stands for '|'
    '~~' stands for '~'
    '~n' stands for new line

A line represents one record, it must start and end with '|'.

The first line contains the field names. The remaining lines contain the records. 
Names can't be empty and must be unique, there is no restriction on values.

If a record has more fields than there are names defined, the last name defined will be used and 
'_#' will be appended to the field name where # is the number of extra record starting at 1.

Here is a valid example:

|name|address|~n|Patrick|patrick@test.com|pat@test.com|~n|Annie||annie@test.com|~n

This represents the following data:

name       address             address_1
Patrick    patrick@test.com    pat@test.com
Annie                          annie@test.com
        
Valid input should output statistics about the data: 
number of records, number of fields, number of empty values and the name of the last field. 
For the previous example, the following output is expected: "2:3:1:address_1"

Invalid input (such as '~~~') should output the following message "0:0:0:format_error"

You have to write a validate function which verifies the input string conforms to the requirements 
and generates either the expected output or the error message.

function validate(input) {

}
 */


import java.util.Scanner;

public class AsciiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner in = new Scanner(System.in);
		System.out.println("Enter Valid Char:");
		String s = in.next();
		int c1 = 0x20;
		int  c2 = 0x7E;
		System.out.println("c1 : " + c1 + ",Char:"+(char)c1);
		System.out.println("c2 : " + c2 + ",Char:"+(char)c2);
		
		boolean flag = true;
		for(char c : s.toCharArray()){
			if(((int)c) < c1 && ((int)c) > c2){
				System.out.println("Contains invalid char : "+(int)c);
				flag = false;
				break;
			}
			System.out.println("Contains valid char : "+(int)c);
		}
		if(flag){
			System.out.println("Contains valid char");
		}
*/
		String inputString = "|name|address|~n|Patrick|patrick@test.com|pat@test.com|~n|Annie|annie@test.com|~n";
//		String inputString = "~~~";
		String[] nrecord = inputString.split("~n");
		String[][] nfields = new String[nrecord.length][];

		for(int i=0;i<nrecord.length;i++){
        	String[] abc = nrecord[i].split("\\|");
        	System.out.println("abc is :"+abc[1]);
        	nfields[i] = new String[abc.length];
            for(int j=1;j<abc.length;j++){
            	nfields[i][j] = abc[j];
                System.out.println(" i=" +i + ",j:" + j + ",nfield:" + nfields[i][j]);
            }
        }
		
		
		
		
/*		
		String[] nfields = nrecord[0].split("\\|");
		String[] nEmpty = inputString.split("\\|\\|");
		
		for(String s : nfields){
			System.out.println(s);
		}
		
		System.out.println("no of records : " + (nrecord.length - 1));
		System.out.println("no of fields : " + (nfields.length -1));
		System.out.println("no of Empty fields : " + (nEmpty.length -1));
		System.out.println("Name of Last Field : " + nfields[(nfields.length-1)]);
*/
	}
}
