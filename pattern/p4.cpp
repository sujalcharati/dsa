 #include <iostream>
 using namespace std;

 int main(){
    int n;
    cout << " enter the number of rows";
    cin >> n;
    int rows =1;
    while(rows <=n){
        int col =1;
        while (col <=rows){
            cout << "*"<< " ";
            col+=1;
        }
         cout << '\n';
         rows+=1;
    }
 }

//  output 
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 