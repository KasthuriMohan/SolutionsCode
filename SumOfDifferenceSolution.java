String Number 
Step 1: Calculate the sum of difference between alphabetical positions of each letter in a word of given input 
Step 2: Repeat the process for all words in the input string 
Step 3: Concatenate the results obtained in above steps

Input:

world wide web

Output:

402326
Explanation:
WORLD = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]

WIDE = [W-E]+[I-D] = [23-5]+[9-4] = [18]+[5] = [23]

WEB = [W-B]+[E] = [23-2]+[5] = [21]+[5] = [26]

Concatenate the sums of each word to form the result

[40] [23] [26]

[402326]
 
 
SumOfDifferenceSolution.java


import java.io.*;
import java.util.*;

public class SumOfDifferenceSolution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String ar[]=a.split(" ");
        int i,j,k,sum=0,n1=0,n2=0;
        for(i=0;i<ar.length;i++){
            j=0;
            k=ar[i].length()-1;
            sum=0;
            while(j<k){
                if(j<k){
                    n1=(int)(Character.toLowerCase(ar[i].charAt(j)))-96;
                    n2=(int)(Character.toLowerCase(ar[i].charAt(k)))-96;
                }
                sum+=Math.abs(n1-n2);
                j++;
                k--;
            }
            if(j==k){
                n2=(int)(Character.toLowerCase(ar[i].charAt(k)))-96; 
                sum+=n2;
            }
            System.out.print(sum);
        }
    }
}
