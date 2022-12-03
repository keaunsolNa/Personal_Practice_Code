#include <stdio.h>

main()
{
    int a[5];

    int i;
    int *p;                     // 1
    for(i = 0; i < 5; i++)
        a[i] = i + 10;          // 2
    p = a;                      // 3
    for(i = 0; i < 5; i++)

    printf("%d", *(p+i));       // 4
}