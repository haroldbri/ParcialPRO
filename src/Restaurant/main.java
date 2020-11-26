package Restaurant;

import java.util.Scanner;

public class main {
     public static void main(String [] args){
        Scanner leer = new Scanner (System.in);
        int Salir=3;
            do {
               System.out.println("-----BIENVENIDO AL ESTAURANTE LA PARRILLA-----");
            System.out.println("--MENU DEL DIA.");
            System.out.println("-1.PLATO 1");
            System.out.println("-2.PLATO 2");
            Salir=leer.nextInt();
            switch (Salir) {        
                case 1: 
                    System.out.println("---PLATO 2---");
                    Plato1 p1 = new Plato1("Bandeja paisa","$25.000","Doble porcion","Salsa fruco","Coca cola");
                    p1.MostrarDatos();
                    p1.CaracEspeciales1pla1();
                    Plato1 p2 = new Plato1("Arros con pollo","$30.000","Mediano","Mayonesa","Gaseosa Colombiana");
                    p2.MostrarDatos();
                    p2.CaracEspeciales1pla2();
                    break;
                case 2:    
                    System.out.println("---PLATO 2---");
                    Plato2 pla1 = new Plato2("Costillas de cerdo","$40.000","Pequeño","Maracuya","Fresa");
                    pla1.MostrarDatos2();
                    pla1.CaracEspecialesPla1();
                    Plato2 pla2 = new Plato2("Pescado frito","$35.000","extra grande","Almendras","Chocolate");
                    pla2.MostrarDatos2();
                    pla2.CaracEspecialesPla2();
                    break;
            }
        }   while (Salir!=3);
        System.out.println("-GRACIAS POR UTILIZAR ESTE PROGRAMA.");
    }
}


