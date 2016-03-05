public class SameSimpleDataType {
    public static void main(String[] args) {
        char c = 'a';
        int n = 10;
        short s = 2;
        long l = 100L; // |\longremark{使用L声明long型数据是个好习惯}|
        System.out.println("c(char) = " + c + ",size of c = " + Character.SIZE/8);
        System.out.println("n(int) = " + n + ",size of n = " + Integer.SIZE/8);
        System.out.println("s(short) = " + s + ",size of s = " + Short.SIZE/8);
        System.out.println("l(long) = " + l + ",size of l = " + Long.SIZE/8);
    }
}

// |\showremarks|
