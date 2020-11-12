// cette petit application permet de calculer la hauteur d'un objet en chute libre à partir
// d'une hauteur initiale et d'une vitesse initiale saisie préalablement.

import java.util.*;
import java.math.*;

class GravityCalculator {
    public static void main(String[] args){
        double a=9.81, v, x=-0.5, t=0.0;
        Scanner clavier=new Scanner(System.in);
        System.out.println("Entrer la vitesse initiale de l'objet (m/sec): ");
        v=clavier.nextFloat();
        while(x<0.0) {
            System.out.println("Entrer la hauteur initiale de l'objet (metres)(seul un nombre positif sera validé): ");
            x = clavier.nextFloat();
        }
        while (x>0.0){
            x=-(0.5*a*Math.pow(t, 2))-v*t+x;
            t+=0.01;
            System.out.println("Hauteur à l'instant t "+t+" sec de l'objet: "+x+" metres.");
        }
    }
}
