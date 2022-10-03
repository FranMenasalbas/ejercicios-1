package com.tiernoparla.proyectos_esenciales;

import java.util.Scanner;
        
        
public class proyectos_esenciales {
    
    public static void main(String[] args) {

        
        //números pares del 1 al 10
        /*
        //números del 1 al 10 pero de otra forma
        for(int n = 1; n <=10; n++){
            if(n%2==0){
                System.out.println(n);
            }//if
        }//for
        */
        
        
        //división pero le da el usuario los datos
        /*
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("dame un número entero para que sea dividido: ");
        n = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int d;
        System.out.println("dame un número entero para dividir el anterior: ");
        d = sc2.nextInt();
        int r=n;
        int q=0;
        while (r>=d){
            r = r-d;
            q++;
        }//while
        System.out.println(q);
        System.out.println(n == d*q+r);
        */
        
        
        //Números de fibonach (machacar variables.
        /*
        int num = 55;//cuantos números quiero que saque el código
        int x1 =1, x2 = 1;
        int suma = 1;
        for (int n = 1; n < num; n++) {
            suma = x1 + x2;
            x1 = x2;
            x2 = suma;
        }//for
        System.out.println(suma);
        */
        
        //arrays: son colecciones de datos, una lista de tamao fijo vaya
        /*string hace que la array sea solo para letras, 
        para números susar por ejemplo int y recordar q int no usa comillas*/
        /*
        String[] p={"uno"/*este es el sitio cero*//*,"dos" /*este es el 
        sitio uno y así};
        System.out.println(p[0]);
        System.out.println(p[1]);
        */
        //calcular termino n de fibonacci con arraysnen vez de x1, x2 y suma
        //calcular y guardar todos los terminos de fibonacci hasta el n
        /*
        int num = 5;
        int[] x={1,1,0};
        for (int i = 1; i < num; i++) {
            x[2] = x[0] + x[1];
            x[0] = x[1];
            x[1] = x[2];
        }//for
        System.out.println(x[2]);
        */
        
    }//main
}//public class