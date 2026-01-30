// bit stuffing and de-bit stuffing (fully dynamic)
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,i;
    char *s;
    int *in,*a,*b;
    printf("Enter no of bits: ");
    scanf("%d",&n);
    s=(char*)malloc((n+1)*sizeof(char));
    in=(int*)malloc(n*sizeof(int));
    a=(int*)malloc(2*n*sizeof(int));
    b=(int*)malloc(n*sizeof(int));
    if(s==NULL || in==NULL || a==NULL || b==NULL)
    {
        printf("Memory allocation failed");
        return 0;
    }
    printf("Enter bits: ");
    scanf("%s",s);
    for(i=0;i<n;i++)
        in[i]=s[i]-'0';
    int c=0,ns=0;
    for(i=0;i<n;i++)
    {
        a[ns]=in[i];
        ns++;
        if(in[i]==1)
            c++;
        else
            c=0;
        if(c==5)
        {
            a[ns]=0;
            ns++;
            c=0;
        }
    }
    printf("Stuffed bits: ");
    for(i=0;i<ns;i++)
        printf("%d",a[i]);
    printf("\n");
    c=0;
    int nd=0;
    for(i=0;i<ns;i++)
    {
        b[nd]=a[i];
        nd++;
        if(a[i]==1)
            c++;
        else
            c=0;
        if(c==5)
        {
            i++;
            c=0;
        }
    }
    printf("De-stuffed bits: ");
    for(i=0;i<nd;i++)
        printf("%d",b[i]);
    free(s);
    free(in);
    free(a);
    free(b);
    return 0;
}
