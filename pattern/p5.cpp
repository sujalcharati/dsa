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
        while (col <= rows)
        {
            cout << rows << " ";
            col += 1;
        }
        cout << '\n';
        rows += 1;
    }
}

// output
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5