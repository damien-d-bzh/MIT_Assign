import java.util.*;
public class SapinTronc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner clavier=new Scanner(System.in);
        int i=1, height, blank, l, width;
        System.out.println("entrer la taille du sapin: ");
        height=clavier.nextInt();
        while (i<=height) {
            blank=height-i;
            l=1;
            while(l<=blank) {
                System.out.print(' ');
                l+=1;
            }
            width=i+(i-1);
            l=1;
            while (l<=width) {
                System.out.print('*');
            }
            System.out.println();
            ++i;
        }
        clavier.close();

    }

}