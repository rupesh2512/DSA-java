#include<stdio.h>

int main() {
    int a, b;

    // Input the dimensions of the array
    printf("Enter the number of rows: ");
    scanf("%d", &a);
    printf("Enter the number of columns: ");
    scanf("%d", &b);

    // Input elements into the array
    int c[a][b];
    for(int i = 0; i < a; i++) {
        for(int j = 0; j < b; j++) {
            printf("Enter element at c[%d][%d]: ", i, j);
            scanf("%d", &c[i][j]);
        }
    }

    // Display the entered elements
    printf("Entered elements:\n");
    for(int i = 0; i < a; i++) {
        for(int j = 0; j < b; j++) {
            printf("%d ", c[i][j]);
        }
        printf("\n");
    }

    // Diagonal Traversal
    int i = 0, j = 0;
    for(int z = 0; z < (a * b); z++) {
        printf("%d ", c[i][j]);

        // Move to the next element in the diagonal
        if ((i == 0 && j < b - 1) || (i < a - 1 && j == b - 1)) {
            i++;
            j = (j == b - 1) ? j : j + 1;
        } else if ((i < a - 1 && j == 0) || (i == a - 1 && j < b - 1)) {
            i = (i == a - 1) ? i : i + 1;
            j++;
        }
    }

    return 0;
}
