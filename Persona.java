public class Persona extends Main{
    int numero = 5;
    long numeroLargo = 2134123;
    double numeroComa = 123.32;
    boolean condicional = true;
    String cadena = "Ejemplo String";

    @Override
    public String toString() {
        return "Persona{" +
                "numero=" + numero +
                ", numeroLargo=" + numeroLargo +
                ", numeroComa=" + numeroComa +
                ", condicional=" + condicional +
                ", cadena='" + cadena + '\'' +
                '}';
    }
}
