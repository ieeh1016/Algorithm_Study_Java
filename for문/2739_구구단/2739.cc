#include <stdio.h>


int main(void)
{
	int gu[10][10];
	int i, j;
		scanf("%d", &i);
		for (j = 1; j <= 9; j++)
		{
			gu[i][j] = i * j;
			printf("%d * %d = %d\n", i, j, gu[i][j]);
		}
		return 0;
}