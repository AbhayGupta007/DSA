package J_9_Execptions;

public class exceptiondemo {
    
    public static int fact(int n) throws negativenumberexception{
        if(n<0)
        {
            throw new negativenumberexception();
        }
        int ans = 1 ;
        for (int i = 2; i<= n; i++)
        {
            ans = ans * i;
        }
        return ans;
    }

    public static int divide(int a, int b) throws dividebyzeroexception {
        if (b == 0) {
            throw new dividebyzeroexception();
        }
        return a / b;
    }

    public static void main(String[] args) /* throws dividebyzeroexception */{
        
        try {
            System.out.println(divide(8, 0));
            System.out.println(fact(2));
        } catch (dividebyzeroexception e) {
            
            System.out.println("Divide by zero exception raised.");
        }
        catch (negativenumberexception e)
        {
            System.out.println("Negative number exception.");
        }
        finally
        {
            System.out.println("This will always execute whether the error occur or not.");
        }
        System.out.println("Main");
    }
}