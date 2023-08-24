public class Aoperator {
    int a = 10;
    int b = 5;

    public static void main(String args[]) {
        Aoperator A = new Aoperator();
        System.out.println(A.a - A.b);
        System.out.println(A.a + A.b);
        System.out.println(A.a + A.b);
        System.out.println(-20 >>> 2);// if the value is negative return the msb value of -3;
        System.out.println(20 >>> 2);
        System.out.println(A.a << 2);
        System.out.println(A.b << 2); // second operend reacts like Root value;
    }
}