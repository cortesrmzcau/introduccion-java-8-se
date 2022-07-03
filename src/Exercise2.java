public class Exercise2 {
    public static void main(String[] args) {
        // char c = ‘z’; conviertelo a int
        char c = 'z';
        int cI = (int) c;
        System.out.println("Exactitud " + cI);

        // int i = 250; conviertelo a long y luego de long a short
        int i = 250;
        long iL = i;
        short iI = (short) iL;
        System.out.println("Exactitud: " + i + " " + iL + " " + iI);

        // double d = 301.067; conviertelo a long

        double d = 301.067;
        long dL = (long) d;
        System.out.println("Estimación: " + dL);

        // int i = 100; súmale 5000.66 y conviertelo a float
        int i100 = 100;
        i100 += 5000.66;
        float iF = i100;
        System.out.println("Estimación " + iF);

        // int i = 737; multiplícalo por 100 y conviertelo a byte

        int i737 = 737;
        i737 *= 100;
        byte i737B = (byte) i737;
        System.out.println("Exactitud " + i737B);

        // double d = 298.638; divídelo entre 25 y conviertelo a long
        double d298 = 298.638;
        d298 /= 25;
        long d298L = (long) d298;
        System.out.println("Exactitud " + d298L);
    }
}
