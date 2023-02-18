package edu.GuillermoGarciaS.reto3.ui;

        import java.sql.SQLOutput;
        import java.util.Scanner;

        import edu.GuillermoGarciaS.reto3.process.ConversorNumerico;
public class CLI {
    public static void Main() {
        String DecimalABinario = "";
        int DecimalAOctal = 0;
        int DecimalAHexadecimal = 0;
        String BinarioADecimal = "";
        String OctalADecimal = "";
        String HexadecimalADecimal = "";
        int salir = 0;
        salida:
        do {
            System.out.println("Bienvenido! seleccione que tipo de opccion usara");
            System.out.println("/1/ Decimal a Binario");
            System.out.println("/2/ Decimal a Octal");
            System.out.println("/3/ Decimal a Hexadecimal");
            System.out.println("/4/ Binario a Decimal");
            System.out.println("/5/ Octal a Decimal");
            System.out.println("/6/ Hexadecimal a Decimal");
            System.out.println("/7/ Salir");

            Scanner scanner1 = new Scanner(System.in);
            int opccion = scanner1.nextInt();

            while (opccion > 7 && opccion < 1) {
                System.out.println("Digito invalido, porfavor intente de nuevo");
                opccion = scanner1.nextInt();
            }

            if (opccion == 7) {
                System.out.println("Tenga un buen día");
                break salida;

                /**
                 *
                 * aqui el switch traera las operaciones usadas en "Process", despues usando
                 * un break para terminarla
                 */
            }
            switch (opccion) {
                case 1:
                    ConversorNumerico.convertidorDecimalABinario(DecimalABinario);
                    break;
                case 2:
                    ConversorNumerico.convertidorDecimalAOctal(DecimalAOctal);
                    break;
                case 3:
                    ConversorNumerico.convertidorDecimalHexadecimal((DecimalAHexadecimal));
                    break;
                case 4:
                    ConversorNumerico.convertidorBinarioADecimal(BinarioADecimal);
                    break;
                case 5:
                    ConversorNumerico.convertidorOctalADecimal(OctalADecimal);
                    break;
                case 6:
                    ConversorNumerico.convertidorHexadecimalADecimal(HexadecimalADecimal);
                    break;
                case 7:
                    salir++;
                    break;
            }
        }
        while (salir == 0);
    }
}