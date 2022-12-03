#include <stdio.h>
  void func(int i, int j);          // #1


main()
{
    int a = 3, b = 12;              // #2
    func(a, b);                     // #3

    printf("%d, %d\n", a, b);       // #11
}

    void func(i, j)                 // #4

    int i, j;                       // #5
    {                               // #6
        i *= 3;                     // #7
        j /= 3;                     // #8
        printf("%d, %d\n", i, j);   // #9
    }                               // 10