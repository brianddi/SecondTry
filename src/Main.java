import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Hello");
        System.out.println("Diana Andreea");

        int a = 5;
        int b = 7;
        System.out.println(a + b);
        System.out.println(5 + 7);

        float c = 1725;
        float d = 525;
        System.out.println(c / d);
        System.out.println(1725F / 525F); // Nu mai stiu cum sa fac ca nr sa fie citit ca
        //float aici, rezultatul e fara virgula. Am gasit :)
        int e = -5;
        int f = 8;
        int g = 6;
        System.out.println(e + f * g);
        System.out.println(48 + -5);

        float h = 55;
        float i = 9;
        System.out.println((h + i) % i);
        System.out.println((h + i) - (b * i));

        double j = 20;
        double k = -3;
        System.out.println(j + (k * e / f)); /*Nu stiu cum sa scriu codul ca sa operez cu numere negative si cu virgula in acelasi timp ca sa imi calculeze corect*/
        System.out.println(20 + -3 * 5 / 8D);

        int l = 15;
        int m = 2;
        int n = 3;
        System.out.println((a + (l / n * m) - f) - (m * n));
        System.out.println((5 + (15 / 3 * 2) - 8) - (2 * 3));

        /*Am scris in 2 variante pt ca nu stiu care e cea corecta, inca nu am inteles cum se foloseste Java*/


        int x = 2;
        int y = 5;

        float z = sum(x, y);
        System.out.println(z);

        float r = substract(x, y);
        System.out.println(r);

        int t = multiply(x, y);
        System.out.println(t);

        float s = divide(x, y);
        System.out.println(s);
    }

    public static float sum(int first, int second) {
        float result = first + second;
        return result;
    }

    public static float substract(float first, float second) {
        float result = first - second;
        return result;
    }

    public static int multiply(int first, int second) {
        int result = first * second;
        return result;
    }

    public static float divide(float first, float second) {
        float result = second / first;
        return result;
    }
}