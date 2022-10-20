package com.tiernoparla.proyectos_esenciales;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
        
public class proyectos_esenciales {
    
    
    public static boolean isPrime(int P){
    
    for(int i = 2; i< P; i++){
            if(P % i == 0){
                return false;
            }//if
        }//for
    return true;
    }//isPrime
    
    public static void printPrimosGemelos(int lim){
        for(int i = 0; i < lim; i++){
            if((i+2)<=lim){
                if(isPrime(i) != false & (isPrime(i+2) != false)){
                    System.out.println(i + " y " + (i+2) + " son números primos gemelos");
                }//if 2
            }//if 1
        }//for
    }
    public static void isConsecutive(int[] n){
    
        if(n[0]+1==n[1] & n[0]+2==n[2]){
            System.out.println("SI son consecutivos");
        }//if
        else{
            System.out.println("NO son consecutivos");
        }//else
    }//psv
    
    public static void isPar(int N){
        int cap = 200;//capacidas del array
        int[] S = new int[cap];//array que guarda los digitos de N por separado
        for(int i = 0; i < cap; i++){
            S[i] = N % 10;
            N = N / 10;
            if(S[i]%2!=0){
                System.out.println("El digito "+ S[i] +" NO es par");
                break;
            }//if 1
            if(N==0){
                break;
            }//if 2
        }//for
        System.out.println("d");
    }//psv
    
    
    public static void main(String[] args) {

                
        
        
        //números pares del 1 al 10
        /*
        //números pares del 1 al 10
        for(int i = 1; i <=10; i++){
            if(i%2==0){
                System.out.println(i);
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
        
        
        
        //Números de fibonach (machacar variables).
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
        
        
        
        //calcular termino n de fibonacci con arrays en vez de x1, x2 y suma
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
        double[] n = {1, 2, 3, 4};
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
        
        
        
        //contar las vocales que hay en una String
        /*
        String p="Abcdefghijklmnñopqrstuvwxyz";
        int c=0;
        for(int i=0; i < p.length(); i++){
            char tmp = Character.toLowerCase(p.charAt(i));//asi tambien se cuentan las mayusculas
            if(tmp=='a'||tmp=='e'||tmp=='i'||tmp=='o'||tmp=='u'){
                c++;
            }//if
        }//for
        System.out.println(c);
        */
        
        
        
        //Contar palabras de una string
        /*
        String p="Salimos a las ocho";
        p = p.trim();
        String[] palabras = p.split("\\s+");
            System.out.println(palabras.length);
        */
        
        
        
        //suma de digitos de un número entero
        /*
        int n=123456789;
        int cifra;
        int r=0;
        while (n>0){
            cifra = n%10;
            r=r + cifra;
            n = n/10;
        }//while
        System.out.println(r);
        }
        */
        
        
        //método que calcule valor que da un interés durante X años
        /*
        double x = 100;  //inicio
        double I = 100;  //interes
        double y = 5;  //años
        for(int i=0; i<y; i++){
            x = x + x * (I/100);
        }
        System.out.println((double)Math.round(x * 100) / 100);        
        */
        
        
        
        //Calculo que diga si un año es bisiesto
        /*
        int año=2024;
        if(año%4==0 & año%100!=0 || año%400==0){
            System.out.println("SI es bisiesto");
        }//if
        else{
            System.out.println("NO es bisiesto");
        }
        */
        
        
        
        //Password de 10 caracteres con solo letras y minimo dos números
        /*
        String pass="espanya2313";
        boolean pass_ok = true;
        if(pass.length() < 10){
            pass_ok = false;
        }//if
        if(!pass.matches("[a-zA-Z0-9]*")){
            pass_ok = false;
        }//if
        int counter=0;
        for(char c: pass.toCharArray()){
            if(Character.isDigit(c)){
                counter++;
            }
        }
        if(counter < 2){
            pass_ok = false;
        }
        if(pass_ok){
            System.out.println("el password está ok");
        }
        else{
            System.out.println("el password está mal");
        }
        */
        
        
        //ejemplo de una matriz de strings.
        /*
        String[][] str_matrix = {
            {"sdgsds", "gdknbfb"},
            {"eokboovf", "ehnbeiknb", "fbwsbt"},
            {"grenvifn", "nbkfob"}
        };
        String[][]  str_II = new String[5][6];
        System.out.println(str_matrix[2][2]);
        */
        
        
        
        //metodo que le das un N, y dibuja por pantalla una matriz NxN de 0's y 1's aleatorios.
        /*
        int n = 5;
        int[][] matrix = new int[n][n];
        
        Random rnd = new Random();
        for(int i = 0; i < matrix.length; i++){   
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (rnd.nextBoolean()) ? 1 : 0;
            }//for j
        }//for i
        for(int[] arr: matrix){
            System.out.println(Arrays.toString(arr));
        }//for
        */
        
        //metodo que calcule todos los numeros primos gemelos hasta un N dado
        /*
        int lim= 50;
        printPrimosGemelos(lim);
        */
        
        
        
        //método que le metes N númeors y te dice si son consecutivos o no
        /*
        int[] n={1, 2, 3};
        isConsecutive(n);
        */
        
        
        
        //método que diga si todos los dígitos de un número son pares
        /*
        int N = 256446;
        isPar(N);
        */
        
        //
        /*
        */
    }//main
}//public class