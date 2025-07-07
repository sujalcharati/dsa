
#include<stdio.h>

int  linearsearch(int target, int N, int arr[] ){
    for ( int i=0;i<N; i++){
        if (arr[i]==target)
               return i;
    }
    return -1;

}


int main(){
    int arr[] = {10, 20, 30, 40, 50};
    int target =30;
    int N =sizeof(arr) / sizeof(arr[0]);

     int ans = linearsearch(target, N ,arr);
     if (ans == -1) {
         printf("the targeted element is not there in array");
     } else {
         printf("the target element is present at index %d", ans);
     }

  return 0;

}