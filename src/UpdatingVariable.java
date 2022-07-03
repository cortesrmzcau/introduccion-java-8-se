public class UpdatingVariable {
    public static void main(String[] args) {
        // Actualizar datos númericos:
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary);

        salary += 300;
        System.out.println(salary);

        // Actualizar variables de tipo String
        String employeeName = "Anahí";
        employeeName = employeeName + " Salgado";
        System.out.println(employeeName);

        employeeName += " Díaz de la Vega";
        System.out.println(employeeName);

        employeeName = "Irene " + employeeName;
        System.out.println(employeeName);
    }
}
