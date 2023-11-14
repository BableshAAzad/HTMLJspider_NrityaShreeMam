package JavaPractice;

import java.util.Arrays;

public class ReverseCharString {
    public static void reverseString(char[] s) {
        char[] ch = new char[s.length];
        int a = 0;
        for (int i = s.length-1; i >= 0; i--) {
            ch[a++] = s[i];
        }
        for (int i = 0; i < ch.length; i++) {
            s[i] = ch[i];
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        /*
         * Input: s = ["h","e","l","l","o"]
         * Output: ["o","l","l","e","h"]
         */
        char[] ch = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(ch);
    }
}
