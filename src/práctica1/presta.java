/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1;

import java.util.Scanner;

public class presta extends Libro{
    private Scanner keyb = new Scanner(System.in);
    private String cc,busq;
    private int j,bflg=0,n,prestado,np=0,dp;
    
    public void prestarlib(String lib){
        int lp;
        System.out.println("Digite cédula: ");
        cc=keyb.nextLine();
        System.out.println("Cantidad de libros a prestar: ");
        lp=keyb.nextInt();
        keyb.nextLine();
        n=super.getCont();
        if((n-lp)<0) System.out.println("No hay la cantidad requerida");
            else   {
        super.setCont(n-lp);
        np+=lp;
        System.out.println("Transacción exitosa: ");
        dp=0;
        prestado=1;
        }
}
    public int getPrestado() {
        return prestado;
    }
    public int getNp() {
        return np;
    }
    
    
    public void devolver(String i){
        //int dp;
        System.out.println("Cantidad de libros a devolver: ");
        dp=keyb.nextInt();
        keyb.nextLine();
        n=super.getCont();
        if((n+dp)>np) System.out.println("Cantidad de libros prestados excedida");
        else    {
            System.out.println("Libro devuelto");
            super.setCont(n+dp);
            np-=dp;
        }
        }
    public void libprestado(){
        System.out.println("Nombre: "+super.getName()+"   Cantidad: "+np);
    }
}
