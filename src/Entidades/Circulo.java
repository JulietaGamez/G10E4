/*
  4. Se plantea desarrollar un programa que nos permita calcular el área y el 
perímetro de formas geométricas, en este caso un circulo y un rectángulo. 
Ya que este calculo se va a repetir en las dos formas geométricas, 
vamos a crear una Interfaz, llamada calculosFormas que tendrá, 
los dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz
y se calcule el área y el perímetro de los dos. En el main se crearán las formas y 
se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package Entidades;

import FormaInterface.calculosFormas;

/**
 *
 * @author julietagamez
 */
public class Circulo extends FormaGeometrica implements calculosFormas{
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Circulo(Double radio, Double area, Double perimetro) {
        super(area, perimetro);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public Double calcularArea() {
       this.area=PI*(Math.pow (this.radio, 2));
       return this.area;
    }

    @Override
    public Double calcularPerimetro() {
        this.perimetro= PI*(this.radio*2);
        return this.perimetro;
    }
    
}
