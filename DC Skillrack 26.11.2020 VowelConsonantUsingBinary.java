/** In this Daily Challange integer taken as input we need to convert the integer in binary format and then all 0's are replaced by lowercase vowels
and all 1's replaced by lowercase consonants and need to print the output string.**/

/* Sample input1:
integer bin=50    // binary format of 50 is 110010
output str="bcaedi"
*/




import java.util.*; 
public class VowelConsonantUsingBinary{     
public static void main(String[] args) { 		
Scanner s=new Scanner(System.in); 		
int i,j,a=s.nextInt(),vc=0,cc=0; 		
String bin=Integer.toBinaryString(a),vo="aeiou",co="bcdfghjklmnpqrstvwxyz",op=""; 		
for(i=0;i<bin.length();i++){ 		    
if(bin.charAt(i)=='0'){ 		        
op+=vo.charAt(vc); 		        
vc++; 		        
if(vc==vo.length()){ 		            
vc=0; 		        
} 		    
} 		    
else if(bin.charAt(i)=='1'){ 		        
op+=co.charAt(cc); 		        
cc++; 		        
if(cc==co.length()){ 		            
cc=0; 		        
} 		    
} 		
} 		
System.out.print(op); 	
}
}




/* Thank You Have a Nice Day..!*/
