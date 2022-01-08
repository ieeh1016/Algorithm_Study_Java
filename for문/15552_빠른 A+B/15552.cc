#include <stdio.h>
int T, i, j;
int main(void)
{
	scanf("%d", &T);
	while(T--)
	{
		scanf("%d %d", &i, &j);
		printf("%d\n", i + j);
	}
	return 0;
}