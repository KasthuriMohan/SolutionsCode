/**
  The program must accept an integer matrix of size NxN as the input.
The prograrm mustfind the layer in the given matrix where the sum of integers in its four corners maximum among the other layers. 
Then the program must print the integers in that layer and print the asterisks instead of the integers in the inner layers.
The program must print the outermost layer among those layers as the output.

Sample input1:
9
5 7 8 9 9 1 4 3 3
1 5 2 3 4 7 7 6 5
3 9 4 5 1 1 9 7 9
8 7 9 1 2 3 1 8 1
3 9 3 8 6 1 1 9 9
3 4 4 9 7 6 5 1 2
1 9 1 7 0 7 8 3 2
1 2 3 4 5 7 5 7 6
5 2 0 7 1 5 4 6 1
Output:
4 5 1 1 9
9 * * * 1
3 * * * 1
4 * * * 5
1 7 0 7 8

Sample input2:
9
5 7 8 9 9 1 4 3 3
1 5 2 3 4 7 7 6 5
3 9 4 5 1 1 9 7 9
8 7 9 1 2 3 1 8 1
3 9 3 8 1000 1 1 9 9
3 4 4 9 7 6 5 1 2
1 9 1 7 0 7 8 3 2
1 2 3 4 5 7 5 7 6
5 2 0 7 1 5 4 6 1

output2:
1000
**
*/
import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int i,j,r=s.nextInt(),sum=0,max=0,val=0;
        int a[][]=new int[r][r];
        for(i=0;i<r;i++){
            for(j=0;j<r;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(i=0;i<r/2;i++){
            sum=0;
            for(j=0;j<r;j++){
                if(j==i||j==r-1-i){
                    sum+=a[i][j];
                    //System.out.print(a[i][j]+" ");
                }
            }
            sum+=a[r-i-1][i];
            sum+=a[r-i-1][r-1-i];
            //System.out.print(a[r-1-i][i]+" "+a[r-1-i][r-1-i]+" ");
            //System.out.println(sum+" ");
            if(max<sum){
                max=sum;
                val=i;
            }
        }
        if(max<a[r/2][r/2]){
            System.out.print(a[r/2][r/2]);
            //inner most element greater than other layer only in odd size matrix.
        }
        else if(val==0){
            for(i=0;i<r;i++){
                for(j=0;j<r;j++){
                    if(i==r-1||j==r-1||i==0||j==0){
                        System.out.print(a[i][j]+" ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        else if(val!=0){
            for(i=val;i<r-val;i++){
                for(j=val;j<r-val;j++){
                    if(i==val||j==val||i==r-val-1||j==r-val-1){
                        System.out.print(a[i][j]+" ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
	}
}
