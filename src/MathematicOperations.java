public class MathematicOperations {
    public static void main(String[] args) {
        // Valores enteros
        int a = 5;
        int b = 10;

        // Valores con decimales
        double x = 2.1;
        double y = 3;

        // Devuelve un enterio hacia arriba
        System.out.println(Math.ceil(x));

        // Devuelve un enterio hacia abajo
        System.out.println(Math.floor(y));

        // Devuelve un número elevado al otro
        System.out.println(Math.pow(x,y));

        // Devuelve el número mayor
        System.out.println(Math.max(x,y));

        // Devuelve raíz cuadrada
        System.out.println(Math.sqrt(y));

        // Area del circulo
        // pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        // Area de una esfera
        // 4 * PI * r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volumen de la esfera
        // (4/3) * pi * r3
        System.out.println((4/3) * Math.pow(y,3));
    }
}
