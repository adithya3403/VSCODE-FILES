// 9a. Write a java Program to write a method fCount which takes a string as a
// parameter. The Method fCount should return the Map which has the frequency
// count of the given word. For example if the string passed is "hello" the map
// should return {h-1,e-1,l-2,o-1}. The order of the characters should be same
// as in the string.

import java.util.*;

public class q9a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        result = fCount(str);
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (result.get(x) != 0) {
                System.out.print(x + "-" + result.get(x) + " ");
                result.put(x, 0);
            }
        }
        System.out.println();
        sc.close();
    }

    public static Map<Character, Integer> fCount(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }
}

/*
EXPECTED OUTPUT

Run 1:
Enter a string:hello
h-1 e-1 l-2 o-1

Run 2:
Enter a string:kmit
k-1 m-1 i-1 t-1
*/