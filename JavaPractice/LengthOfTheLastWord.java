package JavaPractice;

class LengthOfTheLastWord {
    public static void main(String[] args) {
        String str = " Bablesh kumar aazad ";
        int len = checkLength(str);
        System.out.println(len);
    }

    private static int checkLength(String str) {
        int len = 0;
        String[] sp = str.split(" ");
        len = sp[sp.length - 1].length();
        return len;
    }
}