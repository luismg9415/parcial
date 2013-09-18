
package parcial1;
import java.util.Scanner;
import java.lang.String;
        

public class Parcial1 {

    String cadena;

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
            case 1: ingresar(); break;
               default: System.out.println("opcion no disponible");
                   
        }
        
          
       
        
        
    }
    
    void ingresar(){
     System.out.println("2.Ingrese un texto");
     String cadena = null;
     Scanner lector =new Scanner(System.in);
     cadena=lector.nextLine();
     
     
        
    }
    
     void comparar(){
       
     String vect[]=new String[100];
     String i;
       int x=0;
       int y=0;
        while(cadena[i]!='\0'){
           if((cadena[i]=='a')||(cadena[i]=='e')||(cadena[i]=='i')||(cadena[i]=='o')||(cadena[i]=='u')||(cadena[i]=='A')||(cadena[i]=='E')||(cadena[i]=='I')||(cadena[i]=='O')||(cadena[i]=='U'))
                x++;    
           else                
                y++;
           i++;
     
     }
     }
     
     
    }


