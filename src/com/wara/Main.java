package com.wara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);
        //TODO instanciando
        Restaurante restaurante1=new Restaurante();
        //TODO metodos
        restaurante1.leer();
        restaurante1.mostrar();
        System.out.print("Ingrese nroPlatos a adicionar:");
        restaurante1.adicionarPlatos(lec.nextInt());
        System.out.print("Ingrese nombre de plato a actualizar:");
        restaurante1.actualizarPlato(lec.next());
        System.out.print("Ingrese nombre de plato a eliminar:");
        restaurante1.eliminarPlato(lec.next());
        System.out.print("Ingrese nroEmpleados a adicionar:");
        restaurante1.adicionarEmpledos(lec.nextInt());
        System.out.print("Ingrese nombre de empleado a actualizar:");
        restaurante1.actualizarEmpleado(lec.next());
        System.out.print("Ingrese nombre de empleado a eliminar:");
        restaurante1.eliminarEmpleado(lec.next());
        restaurante1.mostrar();
    }
}