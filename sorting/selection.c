#include<stdio.h>

void selectionSort(int arr[], int n){
    int i;
    int min;
    for ( i=0;i<n-1;i++){
         min = i;
        for (int j = i+1; j < n; j++)
        {
            if(arr[j]< arr[min]){
                min = j;
            }
        }

    int temp = arr[i];
     arr[i] = arr [min];
     arr [min] = temp;
}
}
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = {7, 3, 4, 2, 1 };
    int n = sizeof(arr) / sizeof(arr[0]);
    
    printf("Original array: ");
    printArray(arr, n);
    
    selectionSort(arr, n);
    
    printf("Sorted array: ");
    printArray(arr, n);
    
    return 0;
}