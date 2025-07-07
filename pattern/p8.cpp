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
        while (col <= n)
        {
            char ch = 'A'+rows-1 ;
            cout << ch << " ";
            col += 1;
        }
        cout << '\n';
        rows += 1;
    }
}

// output
// A A A A A
// B B B B B
// C C C C C
// D D D D D
// E E E E E