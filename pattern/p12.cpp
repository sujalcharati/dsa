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
            char ch =('A'+ rows + col - 2);
            cout << ch << " ";
            col += 1;
        }
        cout << '\n';
        rows += 1;
    }
}

// output
// A
// B C
// C D E
// D E F G
// E F G H I