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
        
        
        
        /*arrays: son colecciones de datos, una lista de tamao fijo vaya.
        String hace que la array sea solo para letras, 
        para números susar por ejemplo int y recordar q int no usa comillas
        
        String[] p={"uno"/*este es el sitio cero*//*,"dos" /*este es el 
        sitio uno y así};
        System.out.println(p[0]);
        System.out.println(p[1]);
        */
        //calcular termino n de fibonacci con arraysnen vez de x1, x2 y suma
        /*
        int num = 5;
        int[] x={1,1,0};
        for (int i = 1; i <=num; i++) {
            x[2] = x[0] + x[1];
            x[0] = x[1];
            x[1] = x[2];
        }//for
        System.out.println(x[2]);
        */
        
        
        
        //calcular y guardar todos los terminos de fibonacci hasta el n
        /*
        int num = 20;
        int[] x=new int[num];
        x[0]=1;
        x[1]=1;
        
        for (int i = 2; i < num; i++) {
            x[i]=x[i-1] + x[i-2];
        }//for
        
        for(int i = 0; i<x.length; i++){
        System.out.println(x[i]);
        }//for
        */
        
        
        
        //Calculo que devuelva el menor de 2 números distintos
        /*
        double n1 = 6.7;
        double n2 = -48.23;
        double min;
        if(n1<n2){
            min=n1;
        }//if
        else {
            min=n2;
        }//else
        System.out.println("El número más pequeño es: "+ min);
        */
        
        
        
        //Calculo que devuelva el menor de 2 números distintos V.2
        /*
        int num = 5;
        double[] n=new double[num];
        n[0]=34.98;
        n[1]=76.4;
        n[2]=-33.67;
        n[3]=-76.234;
        n[4]=15.67;
        double min=0;
        for(int i=1; i <=num; i++){
            if(n[0]<n[1]){
                min=n[0];
                n[1]=n[2];
                n[2]=n[3];
                n[3]=n[4];
            }//if
            else{
                min=n[1];
                n[0]=n[2];
                n[2]=n[3];
                n[3]=n[4];
            }//else
        }//for
                System.out.println(min);
        */   
        
        
        
        //Calculo que devuelva el menor de x números
        /*
        double[] n={2.2, 683.5, -35.76, 89.25, -834.67};
        double min = n[0];
        for(int i=1; i < n.length; i++){
        if(min > n[i]){
            min = n[i];
        }
        else{
            min=min;
        }//if-else
        }//for
        System.out.println(min);
        */
        
        
        
        //Método que diga si un año es bisiesto
        /*
        int año=2004;
        if(año%4==0){
            System.out.println("SI es bisiesto");
        }//if
        if(año%4!=0){
            System.out.println("NO es bisiesto");
        }
        */
        
        
        
        //números capiúa
        /*
        int n=1551;
        int t=4;
        int tmp = n;
        int[]c = new int[t];
        for(int i=0; i<t; i++){
            c[i] = tmp%10;
            tmp = tmp/10;
        }//for
        double x=0;
        for(int i=0;i < t; i++){
           x = x + c[i]*Math.pow(10,t-(i+1));
        }//for
        System.out.println((int)x==n);
        */
        
        
        
        //Números capicúa V2.
        /*
        int n=1645425951;
        int tmp = n;
        int cifra;
        int r=0;
        while (tmp>0){
            cifra=tmp%10;
            r=r*10 + cifra;
            tmp = tmp/10;
        }//while
        System.out.println(r);
        */
        
        
        
        //Cálculo que calcule la media de x números(user input?)
        /*
        double[] n={1, 2, 3, 4};
        double alln=0;
        double media;
        for(int i = 0; i<n.length; i++){
            alln+=n[i];
        }//for
        media=alln/n.length;
        System.out.println(media);
        */
        
        
        
        //sacar el caracter del medio d una String  (String=array de palabras/letras)
        /*
        String p = "abcdefghijklmnñopqrstuvwxyz";
        int m;
        int k;
        k=p.length()%2;
        m = p.length()/2;
        if(k == 0){
            System.out.print(p.charAt(m-1) + "" + p.charAt(m));
        }
        else{
            System.out.println(p.charAt(m)); 
        }
        */
        
        
        
        //suma de digitos de un número entero
        /*
        int n=223;
        int tmp=n;
        int cifra;
        int r=0;
        while (tmp>0){
            cifra=tmp%10;
            r=r + cifra;
            tmp = tmp/10;
        }//while
        System.out.println(r);
        }
        */
        
        
        
        //contar las vocales que hay en una String
        /*
        String p="Abcdefghijklmnñopqrstuvwxyz";
        
        int c=0;
        for(int i=0; i < p.length(); i++){
            char tmp = Character.toLowerCase(p.charAt(i));
            if(tmp=='a'||tmp=='e'||tmp=='i'||tmp=='o'||tmp=='u'){
                c++;
            }//if
        }//for
        System.out.println(c);
        */
        
        
        
        //
        /**/
        /**/
    }//main
}//public class