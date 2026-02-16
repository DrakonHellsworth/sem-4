//crc-cyclic redundancy code used for error detection
//example: data=100100, polynomial=x^3+x^2+1 => generator=1101, 4-1=3 no. of zeros to be added
//100100 000/1101 using xor => q=111101,r=001 
//crc=100100 001 this is the crc code sent by senter
//for error checking at receiver end, 100100 001/1101 => q=111101,r=000 no error
// crc-cyclic redundancy code using polynomial generator input
#include <stdio.h>
#include <string.h>
int main()
{
    char d[50],p[50],g[50],t[50],r[50];
    int dl,gl,i,j,deg[10],dc=0,max=0,err=0;
    printf("Enter data bits: ");
    scanf("%s",d);
    printf("Enter generator polynomial (ex: x^3+x^2+1): ");
    scanf("%s",p);
    for(i=0;p[i]!='\0';i++)
    {
        if(p[i]=='x')
        {
            if(p[i+1]=='^')
            {
                int v=0;
                i+=2;
                while(p[i]>='0'&&p[i]<='9')
                {
                    v=v*10+(p[i]-'0');
                    i++;
                }
                deg[dc++]=v;
                if(v>max)
                {
                    max=v;
                }
                i--;
            }
            else
            {
                deg[dc++]=1;
                if(1>max)
                {
                    max=1;
                }
            }
        }
        else if(p[i]=='1')
        {
            deg[dc++]=0;
        }
    }
    for(i=0;i<=max;i++)
    {
        g[i]='0';
    }
    for(i=0;i<dc;i++)
    {
        g[max-deg[i]]='1';
    }
    g[max+1]='\0';
    dl=strlen(d);
    gl=strlen(g);
    for(i=0;i<dl;i++)
    {
        t[i]=d[i];
    }
    for(i=dl;i<dl+gl-1;i++)
    {
        t[i]='0';
    }
    t[dl+gl-1]='\0';
    for(i=0;i<dl;i++)
    {
        if(t[i]=='1')
        {
            for(j=0;j<gl;j++)
            {
                t[i+j]=(t[i+j]==g[j])?'0':'1';
            }
        }
    }
    printf("Binary generator: %s\n",g);
    printf("CRC bits: ");
    for(i=dl;i<dl+gl-1;i++)
    {
        printf("%c",t[i]);
    }
    printf("\nTransmitted code: %s",d);
    for(i=dl;i<dl+gl-1;i++)
    {
        printf("%c",t[i]);
    }
    printf("\n");
    printf("Enter received code: ");
    scanf("%s",r);
    for(i=0;i<strlen(r);i++)
    {
        t[i]=r[i];
    }
    for(i=0;i<strlen(r)-gl+1;i++)
    {
        if(t[i]=='1')
        {
            for(j=0;j<gl;j++)
            {
                t[i+j]=(t[i+j]==g[j])?'0':'1';
            }
        }
    }
    for(i=strlen(r)-gl+1;i<strlen(r);i++)
    {
        if(t[i]=='1')
        {
            err=1;
            break;
        }
    }
    if(err==0)
    {
        printf("No error detected\n");
    }
    else
    {
        printf("Error detected\n");
    }
    return 0;
}

