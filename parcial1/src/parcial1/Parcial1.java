
package parcial1;
import java.util.Scanner;

public class Parcial1 {


    public static void main(String[] args) {
       Parcial1 menu;
       menu=new Parcial1();
       menu.menu();
       
    }
    public void menu(){
        int n;
        System.out.println("menu");
        System.out.println("1.ingresar texto");
        System.out.println("2.cantidad vovcales y consonantes");
        System.out.println("3.letra especifica");
        Scanner lector = new Scanner(System.in);
        n=lector.nextInt();
        switch(n){
            case 1: System.out.println("hola");break;
               default: System.out.println("opcion no disponible");
                   
        }
            
    }
    
      }


