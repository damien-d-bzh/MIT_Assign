import java.util.*;
public class TableauTri_N_Float {

    public static void main(String[] args) {
        // write your code here
        Scanner clavier = new Scanner(System.in);
        int tailleTableau, i, j;
        float max, t = 0;
        System.out.print("Taille du tableau: ");
        tailleTableau = clavier.nextInt();
        float[] tab = new float[tailleTableau];
        //float[] tab1 = new float[tailleTableau];
        for (i = 0; i < tailleTableau; ++i) {
            System.out.print("tab[" + (i + 1) + "] :");
            tab[i] = clavier.nextFloat();
        }
        for (i = 0; i < tailleTableau; ++i) {
            System.out.print(tab[i] + " ");
        }
        System.out.print('\n');
        i = 0;
        j = 0;
        while (j < tailleTableau-1){
            i=j;
        while (i < tailleTableau-1) {
            if (tab[i] < tab[(i + 1)]) {
                i=i+1;
                t=tab[(i + 1)];
                //tab1[i]=tab[i];
            }
            tab[j]=t;
            ++i;
        }
        }

        for(i=0; i<tailleTableau; ++i) System.out.print(tab[i] + "\n");
    }
}


