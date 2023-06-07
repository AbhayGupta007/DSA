package J_21_Hashmaps.HashMap_build;

public class Mapuse {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        for(int i = 1; i <= 20; i++)
        {
            map.insert("abc" + i, i);
            System.out.println(map.getloadfactor());
        }
        System.out.println("Removed key is : " + map.removekey("abc3"));
        System.out.println("Removed key is : " + map.removekey("abc7"));
        for(int i = 1; i <= 20; i++)
        {
            System.out.println("abc " + i + ": " + map.getvalue("abc" + i));
        }
    }
}