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
        char ch =('A'+ n-rows);

        while (col <= rows)
        {   
            cout << ch << " ";
            ch=ch+1;
            col += 1;
        }
        cout << '\n';
        rows += 1;
    }
}

// output
// E
// D E
// C D E
// B C D E
// A B C D E