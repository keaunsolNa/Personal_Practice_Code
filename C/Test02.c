#include <stdio.h>
void func(int *i, int *j)               // #3
{                                       // #4
    *i *= 3;                            // #5
    *j /= 3;                            // #6
    printf("%d, %d\n", *i, *j);         // #7
}                                       // #8

main()                                  
{
    int a = 3, b = 12;                  // #1
    func(&a, &b);                       // #2
    printf("%d, %d\n", a, b);           // #9
}

