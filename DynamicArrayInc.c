#include <stdio.h>
#include <stdlib.h>
int main() {
    int *p=calloc(5,sizeof(int));

    p=realloc(p,10*sizeof(int));
    printf("\n");
    for(int i=5;i<10;i++)
    {
        p[i]=i+1;
    }
    for(int i=0;i<10;i++)
    {
        printf("%d",p[i]);
    }

    return 0;
}