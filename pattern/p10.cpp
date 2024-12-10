#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "enter the number of rows";
    cin >> n;
    int rows = 1;
     char start ='A';

    while (rows <= n)
    {
        int col = 1;
        while (col <= rows)
        {   
            cout << start << " ";
            col += 1;
        }
        start+=1;
         cout << '\n';
        rows += 1;
    }
}

// output
// A
// B B
// C C C
// D D D D
// E E E E E