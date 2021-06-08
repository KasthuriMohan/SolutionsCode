import java.util.*;
public class SwapEveryTwoVowelInString{
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),v="aeiouAEIOU";
		int i,j;
		char ar[]=a.toCharArray();
		char first='*',second='*';
		for(i=0;i<a.length();i++){
		    first='*';
		    second='*';
		    if(v.contains(a.charAt(i)+"")){
		        first=a.charAt(i);
		        for(j=i+1;j<a.length();j++){
		            if(v.contains(a.charAt(j)+"")){
		                second=a.charAt(j);
		                break;
		            }
		        }
		        if(second!='*'){
		            ar[i]=second;
		            ar[j]=first;
		            i=j;
		        }
		    }
		}
		for(i=0;i<ar.length;i++){
		    System.out.print(ar[i]);
		}
	}
}


/**
*

THE VOWEL CHARACTER PRESENT IN STRING NEED TO SWAP WITH ANOTHER VOWEL CHARACTER, IF THE VOWELS COUNT IN STRING IS ODD MEANS THE LAST
VOWEL CHARACTER REMAIN SAME..


Input: Environment

Output: invErenmont

Input2: TOUCHPAD

Output2: TUOCHPAD

*
*
*
**
*/
