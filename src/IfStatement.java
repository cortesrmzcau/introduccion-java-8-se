public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            fileSended--;
            System.out.println("Por favor enciente tu Bluetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
