Given a NXM matrix as input. Sort the matrix elements column wise based on a weightage. 
Weightage is calculated by adding odd numbers separately and even numbers separately for each column.
If odd numbers are greater then make that column descending else ascending. 
If sum of both odd and even numbers are same then consider nature of the first element of that column. 
(If first number is Odd then descending else ascending)

Input Format

4 4

2 3 6 5

1 6 7 9

8 5 3 7

5 1 2 3

Constraints

no of rows and columns cannot be negative

Output Format

1 6 7 9

2 5 6 7

5 3 3 5

8 1 2 3


MatrixSortingBasedOnWeightage.java


import java.io.*;
import java.util.*;

public class MatrixSortingBasedOnWeightage {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt(),os=0,es=0,i,j,k,val=0;
        int a[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
        int ar[][]=new int[r][c];
        List<Integer> li=new ArrayList<Integer>();
        for(i=0;i<r;i++){
            os=0;
            es=0;
            val=0;
            for(j=0;j<c;j++){
                if(a[j][i]%2==0){
                    es+=a[j][i];
                }
                else{
                    os+=a[j][i];
                }
                li.add(a[j][i]);
            }
            Collections.sort(li);
            if(os>es){
                val=li.size()-1;
                for(k=0;k<c;k++){
                    ar[k][i]=li.get(val);
                    val--;
                }
            }
            else if(os<es){
                val=0;
                for(k=0;k<c;k++){
                    ar[k][i]=li.get(val);
                    val++;
                }
            }
            else if(os==es){
                k=0;
                if(a[k][i]%2==0){
                val=0;
                for(k=0;k<c;k++){
                    ar[k][i]=li.get(val);
                    val++;
                }
                }
                else{
                val=li.size()-1;
                for(k=0;k<c;k++){
                    ar[k][i]=li.get(val);
                    val--;
                }
                }  
            }
            li.clear();
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(ar[i][j]+" ");
            }        
            System.out.println();
        }
    }
}
