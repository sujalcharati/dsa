 #include<stdio.h>

int binarysearch(int start, int end, int arr[], int target){

    while (start <= end)
    {
        
      int mid = start + (end - start) / 2;

      if (arr[mid] == target)
      {
        return mid;
      }

      else if (arr[mid] < target){
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
    
    return -1;
}

int main(){
  int arr[]= {10, 20, 30, 40, 50 , 60 ,70 , 80 ,90, 100};
  int target = 40 ;
  int N = sizeof(arr)/sizeof(arr[0]);

  int start =0;
  int end =N-1;
  int mid ;
  int ans = binarysearch(start, end, arr, target);
   if (ans ==-1){
    printf(" the target element is not present in the array");

   }
   else{ 
     printf("the element is present at index %d", ans);
   } 

   return 0 ;
}