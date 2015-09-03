/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1;

import java.util.Scanner;

public class Libro {
    private Scanner keyb = new Scanner(System.in);
    private String name,autor,area,aux;
    private int ypub,cod=0,cant,cont,check,a,oka=0;
    
    public void ingreso(){
        System.out.println("Nombre: ");
        name=keyb.nextLine();
        System.out.println("Autor: ");
        autor=keyb.nextLine();
        System.out.println("Año de publicación: ");
        ypub=keyb.nextInt();
        //System.out.println("Código: ");
        //cod=keyb.nextInt();
        System.out.println("Cantidad: ");
        cant=keyb.nextInt();
        do{
        System.out.println("Área: \n(1)Química\t(2)Física\t(3)Tecnología\t(4)Cálculo\t(5)Programación");
        a=keyb.nextInt();
        
        switch(a){
            case 1:
                System.out.println("Química");
                area="Quimica";
                oka=1;
                break;
            case 2:
                System.out.println("Física");
                area="Fisica";
                oka=1;
                break;
            case 3:
                System.out.println("Tecnología");
                area="Tecnologia";
                oka=1;
                break;
            case 4:
                System.out.println("Cálculo");
                area="Calculo";
                oka=1;
                break;
            case 5:
                System.out.println("Programación");
                area="Programacion";
                oka=1;
                break;
            default :
                System.out.println("Incorrecto");
                break;
        }
        
        }while(oka!=1);
        oka=0;
        cont+=cant;
    }
    
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public int getCont() {
        return cont;
    }
    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    public void Actualizar(){
        /*System.out.println("Nombre: "+name+", Digite '1' para modificar ó cualquier tecla para continuar");
        check=keyb.nextInt();
        keyb.nextLine();
        if (check==1){
            System.out.println("Digite Nombre: ");
            name=keyb.nextLine();
            check=0;
        }*/
        System.out.println("Autor: "+autor+", Digite '1' para modificar ó cualquier tecla para continuar");
        check=keyb.nextInt();
        keyb.nextLine();
        if (check==1){
            System.out.println("Digite autor: ");
            autor=keyb.nextLine();
            check=0;
        }
        System.out.println("Año de publicación: "+ypub+", Digite '1' para modificar ó cualquier tecla para continuar");
        check=keyb.nextInt();
        keyb.nextLine();
        if (check==1){
            System.out.println("Año de publicación: ");
            ypub=keyb.nextInt();
            check=0;
        }
        System.out.println("Cantidad: "+cont+", Digite '1' para modificar ó cualquier tecla para continuar");
        check=keyb.nextInt();
        keyb.nextLine();
        if (check==1){
            System.out.println("Cantidad: ");
            cont=keyb.nextInt();
            check=0;
        }
        System.out.println("Área: "+area+", Digite '1' para modificar ó cualquier tecla para continuar");
        check=keyb.nextInt();
        keyb.nextLine();
        if (check==1){
            do{
            System.out.println("Área: \n(1)Química\t(2)Física\t(3)Tecnología\t(4)Cálculo\t(5)Programación");
            a=keyb.nextInt();

            switch(a){
                case 1:
                    System.out.println("Química");
                    area="Quimica";
                    oka=1;
                    break;
                case 2:
                    System.out.println("Física");
                    area="Fisica";
                    oka=1;
                    break;
                case 3:
                    System.out.println("Tecnología");
                    area="Tecnologia";
                    oka=1;
                    break;
                case 4:
                    System.out.println("Cálculo");
                    area="Calculo";
                    oka=1;
                    break;
                case 5:
                    System.out.println("Programación");
                    area="Programacion";
                    oka=1;
                    break;
                default :
                    System.out.println("Incorrecto");
                    break;
            }

            }while(oka!=1);
            oka=0;
            }
        
    }
    
    public void Eliminar(){
        
        name=null;
        autor=null;
        ypub=0;
        cant=0;
        cod=0;
        area=null;
    }
    public void Buscar(){
        System.out.println("Nombre: "+name);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+ypub);
        System.out.println("Cantidad: "+cont);
        System.out.println("Código: "+cod);
        System.out.println("Area: "+area);
    }
    
}
