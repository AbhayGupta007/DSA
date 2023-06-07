package J_4_Arrays;

public class Array_equilibrium_index 
{
    public static int equilibrium_index(int a[])
    {
        if(a.length <= 1)
        {
            return -1;
        }

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 1; i<a.length ; i++)
        {
            sum2 += a[i];
        }
        return equi_index(a, sum1, sum2, 0);
    }

    public static int equi_index(int a[], int sum1, int sum2, int index)
    {
        if(sum1 == sum2)
        {
            return index;
        }
        if(index == a.length - 1)
        {
            return -1;
        }
        else
        {
            return equi_index(a, (sum1 + a[index]), (sum2 - a[index + 1]), index + 1);
        }
    } 

    public static void main(String[] args) {
        int a[] = {1,4,6};
        System.out.println(equilibrium_index(a));
    }
}