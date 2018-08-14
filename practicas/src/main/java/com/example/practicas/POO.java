package com.example.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POO {
    public static void main(String[] args){
        Casa miCasa=new Casa("Independencia",'d',(short)34,30000,3000000,25000,40,false);
        Casa casaDeCin=new Casa("Breña",'d',(short)34,30000,35000,30000,40,true);
        System.out.println(miCasa);

        Main.nuevoTema("listas \n");
        List<Casa> casaList=new ArrayList<>();
        casaList.add(miCasa);
        casaList.add(casaDeCin);

        //casaList.remove(1);
        casaList.set(0,casaDeCin);
        casaList.add(miCasa);
        casaList.add(miCasa);

        for (Casa currentcasa:casaList){
            System.out.println(currentcasa);
        }

        Main.nuevoTema("Diccionarios: \n");
        Map<String,Casa> casaMap = new HashMap<>();
        casaMap.put("Casa de Victor",miCasa);
        casaMap.put("Casa de Cinthya",casaDeCin);
        casaMap.put("Casa de Cinthya",miCasa);
        System.out.println(casaMap.size());
       // casaMap.remove("Casa de Cinthya");
        System.out.println("La casa de Victor: "+casaMap.get("Casa de Victor")+"\nLa casa de Cinthya: "+casaMap.get("Casa de Cinthya"));

        Main.nuevoTema("Herencia: \n");
        Apartamento apartamentoPlaya=new Apartamento("Malecon",'d',(short)34,30000,3000000,25000,40,true,(short)5);
        System.out.println(apartamentoPlaya);

        Main.nuevoTema("Polimorfismo: \n");
        venderPropiedad(miCasa);
        venderPropiedad(apartamentoPlaya);

        Main.nuevoTema("Equals & Hascode: \n");
        Casa miSegundaCasa =new Casa("Independencia",'d',(short)34,30000,3000000,25000,40,false);
        System.out.println(miCasa.equals(miSegundaCasa) );
        Casa miTerceraCasa=new Casa();
        System.out.println(casaMap.containsValue(miCasa) );


    }

    private static void venderPropiedad(Casa casa) {
        if(casa.isHipotecada()){
            System.out.println("Imposible vender");
        } else {
            System.out.println("En venta");
        }
    }

}
