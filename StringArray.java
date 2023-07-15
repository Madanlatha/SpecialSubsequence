package SubSequenceString;

import java.util.Scanner;

public class StringArray {
	public static int subsequence(String str) {
		int result=0,a_count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'A') {
				a_count++;
			}
			else if(str.charAt(i) == 'G') {
				result +=a_count;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int value=subsequence(str);
		System.out.println(value);

	}

}
