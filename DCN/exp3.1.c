// generate hamming code for any number of bits with even or odd parity as a choice then detect the error in it
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int main()
{
    int m,i,j,p=0,pc=0;
    printf("Enter number of data bits: ");
    scanf("%d",&m);
    printf("Choose parity (0 = even, 1 = odd): ");
    scanf("%d",&pc);
    while((int)pow(2,p)<(m+p+1))
    {
        p++;
    }
    int r=m+p;
    int *code=(int*)malloc((r+1)*sizeof(int));
    if(code==NULL)
    {
        return 1;
    }
    for(i=0;i<=r;i++)
    {
        code[i]=0;
    }
    for(i=1,j=0;i<=r;i++)
    {
        int isP=0,k;
        for(k=0;k<p;k++)
        {
            if(i==(int)pow(2,k))
            {
                isP=1;
                break;
            }
        }
        if(isP)
        {
            code[i]=0;
        }
        else
        {
            int bit=0;
            printf("Enter data bit %d (0/1):",j+1);
            scanf("%d",&bit);
            code[i]=bit;
            j++;
        }
    }
    for(i=0;i<p;i++)
    {
        int pos=(int)pow(2,i);
        int cnt=0;
        for(j=1;j<=r;j++)
        {
            if(j&pos)
            {
                cnt+=code[j];
            }
        }
        if(pc==0)
        {
            code[pos]=cnt%2;
        }
        else
        {
            code[pos]=!(cnt%2);
        }
    }
    printf("Generated Hamming code: ");
    for(i=1;i<=r;i++)
    {
        printf("%d",code[i]);
    }
    printf("\n");
    char s[r+1];
    int *rec=(int*)malloc((r+1)*sizeof(int));
    int n=0;
    printf("Enter received code (%d bits): ",r);
    scanf("%s",s);
    for(i=0;i<r;i++)
    {
        rec[i+1]=s[i]-'0';
    }
    for(i=0;i<p;i++)
    {
        int pos=(int)pow(2,i);
        int cnt=0;
        for(j=1;j<=r;j++)
        {
            if(j&pos)
            {
                cnt+=rec[j];
            }
        }
        if(pc==0)
        {
            if(cnt%2!=0)
            {
                n+=pos;
            }
        }
        else
        {
            if(cnt%2==0)
            {
                n+=pos;
            }
        }
    }
    if(n==0)
    {
        printf("No error detected.\n");
    }
    else
    {
        printf("Error detected at position %d.\n",n);
        rec[n]^=1;
    }
    printf("Corrected code: ");
    for(i=1;i<=r;i++)
    {
        printf("%d",rec[i]);
    }
    printf("\n");
    free(code);
    free(rec);
    return 0;
}
