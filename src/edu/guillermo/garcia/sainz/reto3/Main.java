import java.util.Scanner;

/**
 *
 * esta clase contiene metodos para convertir numeros
 */
public class ConversorNumerico {

    /**
     * aqui se encuentras cada de las operaciones que se usaran en el CLI
     * para que el usuario tenga su resultado
     */
    public static String convertidorDecimalABinario(String DecimalABinario) {
        int decimal = Integer.parseInt(DecimalABinario);
        int residuo;
        String binario = "";

        while (decimal > 0) {

            residuo = (decimal % 2);
            binario = residuo + binario;
            decimal = (decimal / 2);
        }
        return binario;
    }

    public static String convertidorDecimalAOctal(int decimal) {
        String octal = "";
        String ranOctal = "12345670";

        while (decimal > 0) {

            int residuo = decimal % 8;
            octal = (ranOctal.charAt(residuo) + octal);
            decimal /= 8;

        }
        return octal;
    }

    public static String convertidorDecimalHexadecimal(int decimal) {
        String hexadecimal = "";
        String ranhexadeccimal = "1234567890ABCDEF";

        while (decimal > 0) {
            int residuo = decimal % 16;
            hexadecimal = (ranhexadeccimal.charAt(residuo) + hexadecimal);
            decimal /= 16;
        }
        return hexadecimal;
    }

    public static long convertidorBinarioADecimal(String binario) {
        long decimal = 0;
        int exponente = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            short digito = 1;
            if (binario.charAt(i) == '0') {
                digito = 0;
            }

            double multiplicador = Math.pow(2, exponente);
            decimal += digito * multiplicador;
            exponente++;
        }
        return decimal;
    }

    public static int convertidorOctalADecimal(String DecimalAOctal) {
        int octal = Integer.parseInt(DecimalAOctal);
        int exponente = 1;
        int decimal = 0;

        if (octal == 0) {
            decimal = 0;
        }

        while (octal > 0) {
            int residuo = (octal % 10);
            decimal = (decimal + (residuo * exponente));
            octal = octal / 10;
            exponente = exponente * 8;
        }
        return octal;
    }

    /**
     *
     * aqui la unica diferencia del resto, es que usa un switch para caracteres de char,
     * esto ya que el Hexadecimal contiene letras de la A hasta la F
     */
    public static int HexadecimalADecimal(char caracter) {
        switch (caracter) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return Integer.parseInt(String.valueOf(caracter));
        }
    }
    public static long convertidorHexadecimalADecimal(String HexadecimalDecimal) {
        long decimal = 0;
        int potencia = 0;

        for (int i = HexadecimalDecimal.length() - 1; i >= 0; i--){
            int valor = (HexadecimalDecimal.charAt(i));
            long elevar = (long) Math.pow(16, potencia) * valor;
            decimal += elevar;
            potencia++;
        }
        return decimal;
    }
}