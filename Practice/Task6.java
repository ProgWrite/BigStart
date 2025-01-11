import java.util.*;

public class Task6 {
    public static boolean solution(int n){
        String s = String.valueOf(n);  // Преобразовали число в строку!
        int polovina = s.length() / 2;
        int count = 0;
        int total = 0;
        for(int i = 0; i < polovina; i++){
            count += Character.getNumericValue(s.charAt(i));  // Преобразуем char в int!!!
        }
        for(int i = polovina; i < s.length(); i++){
            total += Character.getNumericValue(s.charAt(i));
        }
        boolean b = count == total;
        return b;
        }

    public static void main(String[] args) {
        int i1 = 1230;
        int i2 = 7893;
        int i3 = 1515;
        int i4 = 1657;
        int i5 = 875965;
        System.out.println(solution(i1));
        System.out.println(solution(i2));
        System.out.println(solution(i3));
        System.out.println(solution(i4));
        System.out.println(solution(i5));

    }

}




