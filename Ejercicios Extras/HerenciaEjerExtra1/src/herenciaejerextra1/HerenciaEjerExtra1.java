package herenciaejerextra1;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.BarcoVelero;
import Entidades.Yate;
import Services.AlquilerService;
import Services.BarcoMotorService;
import Services.BarcoService;
import Services.BarcoVeleroService;
import Services.YateService;
import java.util.Scanner;

public class HerenciaEjerExtra1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        AlquilerService alqServ = new AlquilerService();
        
        
        BarcoService barcoServ = new BarcoService();
        Barco barco = barcoServ.crearBarco();
        
        BarcoVeleroService veleroServ = new BarcoVeleroService();
        BarcoVelero velero = veleroServ.crearVelero();
        
        BarcoMotorService motorServ = new BarcoMotorService();
        BarcoMotor barcoMotor = motorServ.crearBarcoMotor();
        
        YateService yateServ = new YateService();
        Yate yate = yateServ.crearYate();
        
//        System.out.println("--------- BARCO NORMAL -------------");
//        System.out.println(barco.toString());
//        System.out.println("El modulo del barco es " + barcoServ.calcModulo(barco));
//        
//        System.out.println("");
//        System.out.println("------------------- BARCO VELERO ----------------------");
//        System.out.println(velero.toString());
//        System.out.println("El modulo del Velero es = " + veleroServ.calcModulo(velero));
//        
//        System.out.println("");
//        System.out.println("-------------------- BARCO CON MOTOR -------------------");
//        System.out.println(barcoMotor.toString());
//        System.out.println("El modulo del barco con Motor es = " +motorServ.calcModulo(barcoMotor));
//        
//        
//        System.out.println("");
//        System.out.println("---------------------- YATE ------------------------------");
//        System.out.println(yate.toString());
//        System.out.println("El modulo del Yate es = " + yateServ.calculoModulo(yate));
        
        System.out.println("-------------- ALQUILER DE AMARRE PARA BORES ---------------");
        
        int tipoBarco;
        do {
            System.out.println("Eliga el tipo de bote que desea alquilar");
            System.out.println("1. Barco normal");
            System.out.println("2. Marco Velero");
            System.out.println("3. Barco con Motor");
            System.out.println("4. Yate");
            tipoBarco = scan.nextInt();
            if (tipoBarco > 4) {
                System.out.println("Opción inválida");
            }
        } while (tipoBarco > 4);
        
        switch(tipoBarco) {
            case 1:
                System.out.println("Elegiste la opción 1. Barco normal");
                System.out.println(barco.toString());
                int modulo = barcoServ.calcModulo(barco);
                Alquiler alq = alqServ.crearAlquiler(barco);
                alqServ.calcularPrecio(alq, modulo);
                System.out.println(alq.toString());
                break;
            case 2:
                System.out.println("Elegiste la opción 2. Marco Velero");
                System.out.println(velero.toString());
                modulo = veleroServ.calcModulo(velero);
                alq = alqServ.crearAlquiler(velero);
                alqServ.calcularPrecio(alq, modulo);
                System.out.println(alq.toString());
                break;
            case 3:
                System.out.println("Elegiste la opción 3. Barco con Motor");
                System.out.println(barcoMotor.toString());
                modulo = motorServ.calcModulo(barcoMotor);
                alq = alqServ.crearAlquiler(barcoMotor);
                alqServ.calcularPrecio(alq, modulo);
                System.out.println(alq.toString());
                break;
            case 4:
                System.out.println("Elegiste la opción 4. Yate");
                System.out.println(yate.toString());
                modulo = yateServ.calculoModulo(yate);
                alq = alqServ.crearAlquiler(yate);
                alqServ.calcularPrecio(alq, modulo);
                System.out.println(alq.toString());
                break;
        }
        
        
    }

}
