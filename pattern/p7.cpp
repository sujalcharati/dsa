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
        // int val = rows;
        while (col <= rows)
        {
            cout << rows-col+1 << " ";
            col += 1;
            // val-=1;
        }
        cout << '\n';
        rows += 1;
    }
}

// output
// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1