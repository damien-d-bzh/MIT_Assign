import java.util.*;
import java.math.*;

class GravityCalculator1 {
    public static void main(String[] args){
        double a=9.81, v, x=-0.5, t=10.0;
        Scanner clavier=new Scanner(System.in);
        System.out.println("Entrer la vitesse initiale de l'objet (m/sec): ");
        v=clavier.nextFloat();
        while(x<0.0) {
            System.out.println("Entrer la hauteur initiale de l'objet (metres)(seul un nombre positif sera validé): ");
            x = clavier.nextFloat();
        }
        x=-(0.5*a*Math.pow(t, 2))-v*t+x;
        System.out.println("Hauteur à l'instant t "+t+" sec de l'objet: "+x+" metres.");
    }
}

