Input: 3 
Output: **1 
        *3 2 
        6 5 4 
        6 5 4 
        *3 2 
        **1 
Explanation: Here N = 3, so the pattern contains 6 lines of output. 
            The first 3 lines are given below. 
            **1 
            *3 2 
            6 5 4 
            After printing the first 3 lines, the water image of the above 3 lines is printed. 
            Hence the output is 
            **1 
            *3 2 
            6 5 4 
            6 5 4 
            *3 2 
            **1
            
C Code:
#include<stdio.h>
#include <stdlib.h>
int main()
{
    int n,i,j,k,c,val;
    scanf("%d",&n);
    c=n;
    val=1;
    for(i=0;i<n;i++){
        c=val;
        for(j=0;j<n-i-1;j++){
            printf("*");
        }
        for(k=j;k<n;k++){
            printf("%d ",val);
            val--;
        }
        val=c+(i+2);
        printf("\n");
    }
    val=val-(i+1); 
    for(i=n-1;i>=0;i--){
        for(j=n-1;j>i;j--){
            printf("*");
        }
        for(k=j;k>=0;k--){
            printf("%d ",val);
            val--;
        }
        printf("\n");
    }
}
