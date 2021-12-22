#include<stdio.h>
#include<string.h>

int main ()
{
	char str1[]="Software";
	char str2[] = "Vulnerability";
	char str3[40];
	char str4[40];
	char str5[] = "ANMOL";
	// Insecure Copys
	strcpy(str2, str1);
	strcpy(str3, "Copy successful");
	strcpy(str4, str5);
	printf ("str1: %s\nstr2: %s\nstr3: %s\nstr4:%s\n", str1, str2, str3, str4);
	return 0;
}
