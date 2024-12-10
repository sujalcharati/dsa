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
        while (col <= n)
        {   
            cout << start << " ";
            col += 1;
            start+=1;
        }
        cout << '\n';
        rows += 1;
    }
}

// output
// A B C D E
// F G H I J
// K L M N O 
// P Q R S T 
// U V W X Y