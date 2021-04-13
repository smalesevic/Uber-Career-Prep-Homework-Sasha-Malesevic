import java.util.HashMap;
public class Part1 {

    public static boolean isStringPermutation(String s1, String s2) {

        // Must be same length to be permutation
        if(s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (char ch: s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 1) + 1);
        }
        
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (char ch: s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 1) + 1);
        }
        
        if(map1.equals(map2)) {
            return true;
        }
        return false; 
    }
    public static void main(String[] args) {
        String s1 ="asdf";
        String s2 ="fsax";

        System.out.println("Test 1: s1=" + s1 + " s2=" + s2);
        System.out.println(isStringPermutation(s1, s2));
    }
    
}