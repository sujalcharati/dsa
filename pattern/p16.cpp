#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "enter the number of rows";
    cin >> n;
    int rows = 1;
    while (rows <= n)
    {
        int col = 1;
        int star =n-rows+1;
        while (star)
        {   
            cout << "*" << " ";
            star-=1;
            col += 1;
        }
        cout << '\n';
        rows += 1;
    }
}

// output
// * * * * *
// * * * *
// * * *
// * *
// *