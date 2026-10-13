public class CalculoAumentoEPA {

    public static void main(String[] args) {
        double consumo = Reutilizacion.ingresarRealD("Ingrese el consumo mensual en m³ de su casa: ");
        double valorActual = Reutilizacion.ingresarRealD("Ingrese el valor actual del servicio a pagar: ");

        double nuevoValor = calcularNuevoValor(consumo, valorActual);
        generarMensaje(nuevoValor);
    }

    public static double calcularNuevoValor(double consumoMensual, double valorActual) {
        double porcentaje = 0.0;

        if ((consumoMensual >= 1 && consumoMensual <= 9) || (consumoMensual >= 13 && consumoMensual <= 15)) {
            porcentaje = 0.15;
        } else if (consumoMensual >= 20 && consumoMensual <= 28) {
            porcentaje = 0.25;
        }

        return valorActual + (valorActual * porcentaje);
    }

    public static void generarMensaje(double nuevoValor) {
        String mensaje = "El nuevo valor a pagar por el servicio de agua es: $" + nuevoValor;
        System.out.println(mensaje);
    }
}