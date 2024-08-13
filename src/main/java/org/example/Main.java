package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //NECESITO HACER UN LISTADO DE LOS PAISES SURAMERICANOS

        //PARA CADA PAIS NECESITO ALMACENAR EL NUMERO DE:
        //MEDALLAS DE ORO
        //MEDALLAS DE PLATA
        //MEDALLAS DE BRONCE

        //SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS

        //INFORMAR CUAL ES EL PAIS CON MAS MEDALLAS

        //INFORMAR CUAL ES EL PAIS CON MENOS MEDALLAS

        //TERMINAR SUMANDO EL TOTAL DE MEDALLAS DE LOS PAISES SURAMERICANOS

        ArrayList<String> paises = new ArrayList<>();
        ArrayList<Integer> medallas= new ArrayList<>();

        Scanner lea = new Scanner(System.in);
        System.out.println("OLIMPICOS 2024");
        for (int i = 0; i < 3; i++) {
            String pais;
            int sumatoriaMedallas=0;
            System.out.println("Ingrese un pais: ");
            pais = lea.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE CADA PAIS
            System.out.println("Digite el numero de medallas de oro de "+pais+": ");
            int medallasOro=lea.nextInt();
            System.out.println("Digite el numero de medallas de plata de "+pais+": ");
            int medallaPlata=lea.nextInt();
            System.out.println("Digite el numero de medallas de bronce de"+pais+": ");
            int medallaBronce=lea.nextInt();
            sumatoriaMedallas=medallasOro+medallaPlata+medallaBronce;
            System.out.println("Obtuvo en total: "+sumatoriaMedallas+" medallas en paris");

            lea.nextLine();
            medallas.add(sumatoriaMedallas);

        }
        //RECORRIENDO UN ARREGLO
        int paisMayor=medallas.get(0);
        System.out.println("El pais con mas medallas obtuvo un total de: "+paisMayor);
        for (Integer medalla:medallas) {
            if (medalla>paisMayor){
                paisMayor=medalla;
            }
        }
        System.out.println("El pais con mas medallas obtuvo un total de: "+paisMayor);
        //QUIERO PREGUNTAR CUAL ES EL CAJON (INDICE) DONDE SE GUARDO LA CANTIDAD MAYOR
        int indiceGanador=medallas.indexOf(paisMayor);
        System.out.println("El indice ganador es el: "+indiceGanador);
        System.out.println("El pais ganador fue "+paises.get(indiceGanador));

        int paisMenor=medallas.get(0);
        System.out.println("El pais con menos medallas obtuvo: "+paisMenor);
        for (Integer medalla:medallas){
            if ()
        }
        }
    }
