package Modelo;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Alquiler 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        Autobus a1 = new Autobus();
        Tractor t1 = new Tractor();
        a1.setPrecioKm(15);
        t1.setPrecioDia(20);
        
        System.out.println("Ingresa una opcion del menú o presiona -1 para salir");
        System.out.println("1: Rentar un Autorbus");
        System.out.println("2: Rentar un Tractor");
        System.out.println("3: Devolver un Autobus");
        System.out.println("4: Devolver un Tractor");
        int opcion = sc.nextInt();
        while (opcion != -1)
        {
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingresa el kilometraje inicial");
                    a1.setKmInicio(sc.nextInt());
                    System.out.println("Gracias, regresa pronto");
                    break;
                case 2:
                    System.out.println("Ingresa el dia de salida del Tractor");
                    int dia1 = sc.nextInt();
                    System.out.println("Ingresa el mes de salida del Tractor");
                    int mes1 = sc.nextInt();
                    System.out.println("Ingresa el año de salida del Tractor");
                    int anio1 = sc.nextInt();
                    t1.setfechaInicio(new GregorianCalendar(anio1,mes1,dia1));
                    System.out.println("Gracias, regresa pronto");
                    break;
                case 3:
                    System.out.println("Ingresa el kilometraje final");
                    a1.setKmFin(sc.nextInt());
                    System.out.println("La renta por el autobus es de: " + a1.CalculaRenta());
                    break;
                case 4:
                    System.out.println("Ingresa el dia de recepcion del Tractor");
                    int dia = sc.nextInt();
                    System.out.println("Ingresa el mes de recepcion del Tractor");
                    int mes = sc.nextInt();
                    System.out.println("Ingresa el año de recepcion del Tractor");
                    int anio = sc.nextInt();
                    t1.setFechaFin(new GregorianCalendar(anio,mes,dia));                    
                    System.out.println("La renta por el tractor es de: " + t1.CalculaRenta());
                    break;
            }
            System.out.println("\nIngresa una opcion del menú o presiona -1 para salir");
            System.out.println("1: Rentar un Autorbus");
            System.out.println("2: Rentar un Tractor");
            System.out.println("3: Devolver un Autobus");
            System.out.println("4: Devolver un Tractor");
            opcion = sc.nextInt();
        }        
    }    
}
