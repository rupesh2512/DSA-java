#include<stdio.h>
int main(){
    static int y = 80;
    y=90;
    printf("%d\n",y);
    return 0;
}