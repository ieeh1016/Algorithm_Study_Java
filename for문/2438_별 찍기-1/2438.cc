#include <stdio.h>

int i, j, N;
int main(void)
{
	scanf("%d", &N);
	for (i = 1; i <= N; i++)
	{
		for (j = 1; j <= i; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}