package edu.guillermo.garcia.sainz.utilidades;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

    private String REQUEST_OPTION = "Favor de elegir una opcion: ";

    private String NUM_TYPE_ERROR = "Error en los datos de entrada, por favor introduzca un numero";

    private String OUT_OF_RANGE_ERROR = "Opción fuera de rango, por favor, introduzca un numero valido";

    private ArrayList<String> optionList = new ArrayList<>();

    public menu addOption (String option){
        optionList.add(option);
        return this;
    }

    public void cleanMenu(){
        optionList.clear();
    }

    public void showMenu(){
        System.out.print("        Menu");
        for (int i = 0; i < optionList.size(); i++){
            System.out.printf("%d) %s.\n", i + 1, optionList.get(i));
        }

        System.out.printf("%d) %s.\n", optionList.size()+1,"Salir");
        System.out.println();
        System.out.print(REQUEST_OPTION);
    }

    public int readOption(){
        Scanner scanner = new Scanner(System.in);
        while (true){

            try {
                int numero = scanner.nextInt();
                if (numero < 1 || numero > optionList.size()+1){
                    System.out.print(OUT_OF_RANGE_ERROR);
                    continue;
                }
                return numero;

            }catch (InputMismatchException e){
                System.out.println(NUM_TYPE_ERROR);
            }
        }
    }
}
