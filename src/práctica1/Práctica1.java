/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1;

import java.util.Scanner;

public class Práctica1 {

    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int menu,ok=0,i=0,j,codflag=0,bflg=0,eflg=0,k=0,acflg=0,prflg=0;
        int [] bok={0,0,0,0,0,0,0,0,0,0,0,0,0};
        String act,err,busq;
        
        presta[] book;
        book = new presta[100];
       // presta[] pers;
        //pers = new presta[10];
        
        System.out.println("       Editorial los libros     ");
        
        
        do{
        System.out.println("*********Menú********");
        System.out.println("*1-Ingresar libro   *");
        System.out.println("*2-Actualizar libro *");
        System.out.println("*3-Eliminar libro   *");
        System.out.println("*4-Buscar libro     *");
        System.out.println("*5-Prestar          *");
        System.out.println("*6-Devolver         *");
        System.out.println("*7-Libros prestados *");
        System.out.println("*8-Salir            *");
        menu=keyb.nextInt();
        
        switch(menu){
            case 1:
                book[i] = new presta();
                book[i].ingreso();
                System.out.print(" Código: "+i+"\n");
                book[i].setCod(i);
                bok[i]=1;
                i++;
                break;
            case 2:
                System.out.println("Digite nombre de libro a actualizar");
                act=keyb.next();
                for(j=0;j<i;j++){
                if(act.equals(book[j].getName())){
                    book[j].Actualizar();
                    acflg=1;
                }
                }
                if(acflg!=1) System.out.println("No existe");
                acflg=0;
                break;
            case 3:
                System.out.println("Digite nombre de libro a eliminar");
                err=keyb.next();
                for(j=0;j<i;j++){
                eflg=1;
                    if(err.equals(book[j].getName())) {
                    book[j].Eliminar();
                    bok[j]=0;
                    eflg=0;
                }
                }
                if(bflg!=1) System.out.println("No existe");
                eflg=0;
                break;
            case 4:
                System.out.println("Digite nombre de libro a buscar");
                busq=keyb.next();
                for(j=0;j<i;j++){
                    if(bok[j]==0) j++;
                if(busq.equals(book[j].getName())) {
                    book[j].Buscar();
                    bflg=1;
                }
                }
                if(bflg!=1) System.out.println("No existe");
                bflg=0;
                break;
            case 5:
                System.out.println("Digite nombre de libro a Prestar");
                busq=keyb.next();
                for(j=0;j<i;j++){
                    if(bok[j]==0) j++;
                        if(busq.equals(book[j].getName())) {
                            book[j].prestarlib(busq);
                            bflg=1;
                }
                }
                if(bflg!=1) System.out.println("No existe");
                bflg=0;
                break;
            case 6:
                System.out.println("Digite nombre de libro a devolver");
                busq=keyb.next();
                for(j=0;j<i;j++){
                    if(bok[j]==0) j++;
                        if(busq.equals(book[j].getName())) {
                            book[j].devolver(busq);
                            bflg=1;
                }
                }
                if(bflg!=1) System.out.println("No existe");
                bflg=0;
                
                break;
            case 7:
                for(j=0;j<i;j++){
                    if(book[j].getPrestado()==1){
                        book[j].libprestado();
                        prflg=1;
                    }
                }
                if(prflg!=1) System.out.println("No hay liros prestados en el momento");
                prflg=0;
                break;
            case 8:
                ok=1;
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        
        }while(ok!=1);
    }
    
}
