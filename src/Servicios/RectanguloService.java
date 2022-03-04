/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;




public class RectanguloService {

    Scanner leer= new Scanner(System.in);
public Rectangulo crearRectangulo(){
    System.out.println("---El rectangulo es :---");
    Rectangulo r= new Rectangulo();
    System.out.println("Ingrese la base ");
    r.setBase(leer.nextDouble());
    System.out.println("Ingrese la altura");
    r.setAltura(leer.nextDouble());
    return r;
}
    public Double calcularArea(Rectangulo r){
       Double area=  r.calcularArea();
        return area;
    }
    public Double calcularPerimetro(Rectangulo r){
        Double perimetro= r.calcularPerimetro();
        return perimetro;
    }
}
