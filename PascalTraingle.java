
/* Pascal Traingle with asterisks */


import java.util.*;
public class PascalTraingle{
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j,val=0;
		long coef=1;
		for(i=0;i<n;i++){
		        for(val=i;val<n-1;val++){
		            System.out.print("- ");
		        }
		        for(j=0;j<=i;j++){
		            if(j==0||i==0){
		                coef=1;
		            }
		            else{
		                coef=coef*(i-j+1)/j;
		            }
		            if(j<i){
		            System.out.print(coef+" * ");
		            }
		            else{
		                System.out.print(coef);
		            }
		        }
		        System.out.println();
		    }
		}
	}
