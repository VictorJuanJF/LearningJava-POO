package com.example.practicas;

public class Main {
    public static void main(String[] args){
        int entero=3023;
        int entero2=4000;
        nuevoTema("Nombres");
        String[] nombres=new String[]{"Victor","Juan","Jimenez"};
       // System.out.print(entero2>entero? "Si es mayor":"No es mayor");

        for (String recorrido:nombres){
            System.out.print(recorrido+"\n");
        }
        nuevoTema("Temas Bruses");
    }

    public static void nuevoTema(String title){
        System.out.print("\n=======================>"+title + " : ");

    }
}
