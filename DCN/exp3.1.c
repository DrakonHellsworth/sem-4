// generate hamming code for 1110 with even parity and detect error in received code
#include <stdio.h>
#include <string.h>

int main(void)
{
    int data[4] = {1, 1, 1, 0};
    int code[8] = {0}; /* 1-based indexing, positions 1..7 */
    int i, j;

    /* place data bits: positions 3,5,6,7 */
    code[3] = data[0];
    code[5] = data[1];
    code[6] = data[2];
    code[7] = data[3];

    /* compute parity bits for even parity at positions 1,2,4 */
    for (i = 0; i < 3; i++)
    {
        int pos = 1 << i;
        int count = 0;
        for (j = 1; j <= 7; j++)
        {
            if (j & pos)
            {
                if (code[j] == 1)
                    count++;
            }
        }
        code[pos] = (count % 2 != 0) ? 1 : 0;
    }

    printf("Hamming code for data 1110 (even parity): ");
    for (i = 1; i <= 7; i++)
        printf("%d", code[i]);
    printf("\n");

    /* read received code and detect error */
    {
        char s[16];
        int rec[8] = {0};
        int syndrome = 0;

        printf("Enter received 7-bit code: ");
        if (scanf("%15s", s) != 1)
        {
            printf("Invalid input.\n");
            return 0;
        }
        if (strlen(s) != 7)
        {
            printf("Input must be exactly 7 bits.\n");
            return 0;
        }
        for (i = 0; i < 7; i++)
        {
            if (s[i] != '0' && s[i] != '1')
            {
                printf("Input must contain only 0 or 1.\n");
                return 0;
            }
            rec[i + 1] = s[i] - '0';
        }

        for (i = 0; i < 3; i++)
        {
            int pos = 1 << i;
            int count = 0;
            for (j = 1; j <= 7; j++)
            {
                if (j & pos)
                {
                    if (rec[j] == 1)
                        count++;
                }
            }
            if (count % 2 != 0)
                syndrome += pos;
        }

        if (syndrome == 0)
        {
            printf("No error detected.\n");
        }
        else
        {
            printf("Error detected at position %d.\n", syndrome);
            rec[syndrome] = (rec[syndrome] == 0) ? 1 : 0;
        }

        printf("Corrected code: ");
        for (i = 1; i <= 7; i++)
            printf("%d", rec[i]);
        printf("\n");
    }

    return 0;
}
