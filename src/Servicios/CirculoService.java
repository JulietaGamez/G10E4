/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circulo;
import java.util.Scanner;

/**
 *
 * @author julietagamez
 */
public class CirculoService  {
    Scanner leer= new Scanner(System.in);
    public Circulo crearCirculo(){
        System.out.println("---El circulo es :---");
        Circulo c= new Circulo();
        System.out.println("Ingrese el radio");
        c.setRadio(leer.nextDouble());
        return c;
    }
    public Double calcularArea(Circulo c){
        Double area =c.calcularArea();
        return area;
    }
    public Double calcularPerimetro(Circulo c){
        Double perimetro= c.calcularPerimetro();
        return perimetro;
    }
}
