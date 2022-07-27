#include <stdio.h>

int main(void)
{
	int T;
	scanf("%d", &T);
	while(T--)
	{
		int i, j;
		scanf("%d %d", &i, &j);
		printf("%d\n", i + j);
	}
	return 0;
}