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
            int val = rows;

        while (col <= rows)
        {
            cout << val << " ";
            col += 1;
            val +=1;
        }
        cout << '\n';
        rows+=1;
    }
}

// output
// 1 
// 2 3 
// 3 4 5 
// 4 5 6 7 
// 5 6 7 8 9 