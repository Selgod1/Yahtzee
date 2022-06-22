package org.example;

import java.util.Scanner;
public class main {
    public boolean mismo(int var1, int var2) {
        if(var1==var2) {
            return true;
        }
        else {
            return false;
        }
    }
    //variables de los 5 dados
    int dado1 = 0;
    int dado2 = 0;
    int dado3 = 0;
    int dado4 = 0;
    int dado5 = 0;

    public void yahtzee(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables de las caregorias
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;
        int trios = 0;
        int cuartetos = 0;
        int fullHouse = 0;
        int escaleraCorta = 0;
        int escaleraLarga = 0;
        int yahtzee = 0;
        int chance = 0;
        //variable para separar los 5 dados en cada turno
        int turno = 0;

        while (input.hasNext()) {
            for (turno = 0; turno <= 5; turno++) {
                dado1 = input.nextInt();
                dado2 = input.nextInt();
                dado3 = input.nextInt();
                dado4 = input.nextInt();
                dado5 = input.nextInt();
            }
        }
        //variable para ordenar los dados de mayor a menor, de manera
        //que sea mas facil verificar las combinaciones
        int extra;
        for (int i = 0; i < 5; i++) {
            if (dado2 < dado1) {
                extra = dado2;
                dado2 = dado1;
                dado1 = extra;
            }
            if (dado3 < dado2) {
                extra = dado3;
                dado3 = dado2;
                dado2 = extra;
            }
            if (dado4 < dado3) {
                extra = dado4;
                dado4 = dado3;
                dado3 = extra;
            }
            if (dado5 < dado4) {
                extra = dado5;
                dado5 = dado4;
                dado4 = extra;
            }
        }
        //creamos 2 ints para poder crear una variable booleana que retorne true or false

    }
    public int simulacion(){
        //variables booleanas para hacer pares con los dados y facilitar su verificacion;
        boolean par1, par2, par3, par4;
        //jutamos las variables en pares ordenados booleanos para hacer mas facil la verificacion
        par1 = mismo(dado1, dado2);
        par2 = mismo(dado2, dado3);
        par3 = mismo(dado3, dado4);
        par4 = mismo(dado4, dado5);



        //vamos a comenzar a hacer las verificaciones de las combinaciones

        
        //Verificacion para los trios
        if((par1 && par2) || (par2 && par3) || (par3 && par4)){
            System.out.println("trios");
            trios = ;
            return 4;
        }
        if((par1 && par2 && par3) || (par2 && par3 && par4)){
            System.out.println("Cuartetos");
            cuartetos = ;
            return 4;
        }
        if((par1 && par3 && par4) || (par1 && par2 && par4)){
            System.out.println("full House");
            fullHouse = 25;
            return 23;
        }
        if(((par1) && (dado3 - dado2 == 1) && (dado4 - dado3 == 1) && (dado5 - dado4 == 1)) ||
                ((par2) && (dado5 - dado4 == 1) && (dado4 - dado3 == 1) && (dado3 - dado1 == 1))||
                ((par3) && (dado5 - dado4 == 1) && (dado4 - dado2 == 1) && (dado2 - dado1 == 1))||
                ((par4) && (dado2 - dado1 == 1) && (dado3 - dado2 == 1) && (dado4 - dado3 == 1)) ||
                (((dado2 - dado1 == 1) && (dado3 - dado2 == 1) && (dado4 - dado3 == 1))||((dado5 - dado4 == 1) &&
                        (dado4 - dado3 == 1) && (dado3 - dado2 == 1)))){
            System.out.println("Escalera Corta");
            escaleraCorta = 30;
            return 41;
        }

        if((dado2 - dado1 == 1) && (dado3 - dado2 == 1) && (dado4 - dado3 == 1) && (dado5 - dado4 == 1)){
            System.out.println("Escalera Larga");
            escaleraLarga = 40;
            return 51;
        }
        if(par1 && par2 && par3 && par4){
            System.out.println("yahtzee");
            yahtzee = 50;
            return 5;
        }
        System.out.println("Combinacion  1  2  3  4  5  6 Tri Cua F-H E-4 E-5 Ytz Cha Mayor");
        System.out.println("----------- -- -- -- -- -- -- --- --- --- --- --- --- --- -----");


        System.out.println("----------- -- -- -- -- -- -- --- --- --- --- --- --- --- -----");
        System.out.println("----------- -- -- -- -- -- -- --- --- --- --- --- --- ---");
        return 0;
    }
}