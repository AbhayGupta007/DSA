package J_4_Arrays;

public class Find_unique_element {
    public static int unique_element(int a[])
    {
        int b = a[0];
        for(int i = 1; i < a.length ; i++)
        {
            b = b ^ a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 1, 6, 3, 6, 2};
        System.out.println(unique_element(a));
    }
}