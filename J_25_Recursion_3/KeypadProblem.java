package J_25_Recursion_3;

public class KeypadProblem {
    public static String[] keypad(int num) {
        if (num == 0 || num == 1) {
            String s[] = { "" };
            return s;
        }
        String temp[] = keypad(num / 10);
        String s[] = helper(num % 10);
        String ans[] = new String[temp.length * s.length];
        int k = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                ans[k] = temp[j] + s[i];
                k++;
            }
        }
        return ans;
    }

    public static void printkeypad(int input, String stringsofar) {
        if(input == 0)
        {
            System.out.print(stringsofar+" ");
            return;
        }
        String options[] = helper(input % 10);
        for(int i = 0 ; i< options.length; i++)
        {
            printkeypad(input/10, options[i] + stringsofar);
        }
    }

    public static String[] helper(int n) {
        if (n == 2) {
            String s[] = { "a", "b", "c" };
            return s;
        } else if (n == 3) {
            String s[] = { "d", "e", "f" };
            return s;
        } else if (n == 4) {
            String s[] = { "g", "h", "i" };
            return s;
        } else if (n == 5) {
            String s[] = { "j", "k", "l" };
            return s;
        } else if (n == 6) {
            String s[] = { "m", "n", "o" };
            return s;
        } else if (n == 7) {
            String s[] = { "p", "q", "r", "s" };
            return s;
        } else if (n == 8) {
            String s[] = { "t", "u", "v" };
            return s;
        } else if (n == 9) {
            String s[] = { "w", "x", "y", "z" };
            return s;
        } else {
            String s[] = { "" };
            return s;
        }
    }

    public static void main(String[] args) {
        String[] set = keypad(23);
        System.out.print("{ ");
        for (String i : set) {
            System.out.print(i + " ,");
        }
        System.out.print(" }\n");
        printkeypad(23, "");
    }
}