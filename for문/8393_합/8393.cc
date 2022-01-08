#include <stdio.h>
int n, sum;
int main(void)
{
	scanf("%d", &n);
	for (int i = 1; i <= n; i++)
	{
		sum = sum + i;
	}
	printf("%d", sum);
	return 0;
}