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
package g10e4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import Servicios.CirculoService;
import Servicios.RectanguloService;

public class G10E4 {

    public static void main(String[] args) {
      CirculoService cS= new CirculoService ();    
      Circulo c= cS.crearCirculo();
        
        System.out.println("El area del circulo es "+ c.calcularArea());
        System.out.println("El perimetro del circulo es "+c.calcularPerimetro());
        System.out.println("");
        RectanguloService rS=new RectanguloService();
        Rectangulo r= rS.crearRectangulo();
        
        System.out.println("El area del rectangulo es "+ r.calcularArea());
        System.out.println("El perimetro del rectangulo es "+r.calcularPerimetro());
    }
    
}
