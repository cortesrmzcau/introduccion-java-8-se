public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        lives--; // Decremento
        System.out.println(lives); // 3

        lives++; // Incremento
        System.out.println(lives); // 4

        // Prefija
        // Gana un regalo para ganar vida
        int gift = 100 + lives++;
        System.out.println(gift);
        System.out.println(lives);

        /* Notas del video */

        // Incremento postfijo:
        // int vidas = 5;
        // int regalo = 100 + vidas++;

        // System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
        // Regalo: 105, vidas: 6

        // Incremento prefijo:
        // int vidas = 5;
        // int regalo = 100 + ++vidas;

        // System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
        // Regalo: 106, vidas: 6
    }
}
