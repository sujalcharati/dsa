#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "enter the number of rows";
    cin >> n;
    int rows = 1;
    int count =1;
    while (rows <= n)
    {
        int col = 1;
        while (col <= n)
        {
            cout << count << " ";
            count+=1;
            col += 1;
        }
        cout << '\n';
        rows += 1;
    }
}

// output
// 1 2 3
// 4 5 6
// 7 8 9