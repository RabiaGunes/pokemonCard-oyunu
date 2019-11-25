
package proje;
import java.util.Random;


import java.util.Scanner;



public class Proje {

    
    public static void main(String[] args) {
       
       sinif_olustur();
       kart_dagıt();
        
      Scanner isim = new Scanner(System.in);
      
        System.out.println("lutfen kim oynayacak secim yapiniz(bilgisayar:0 , insan:1 ):");
        
        int secim = isim.nextInt();
        
        if(secim == 1){
             oyuncu oyuncuInsan = new insan(1,"insan",0); 
             bilgisayar oyuncuBilgisayar = new bilgisayar(0,"bilgisayar",0);
             
        }
        if(secim == 0){
             bilgisayar oyuncuBilgisayar = new bilgisayar(0,"bilgisayar",0);
             bilgisayar oyuncuBilgisayar1 = new bilgisayar(0,"bilgisayar1",0);
        } 
        
        
      
      
    }
    
   public static void sinif_olustur(){
       
        Pokemon Pokemon1 = new Pikachu("Pikachu","Elektrik",40);
        Pokemon1.ozellikGoster();
        Pokemon1.hasarPuaniGoster();
        
   } 

    private static void kart_dagıt() {
       
        Random r = new Random();
        
        int a = 1+r.nextInt(10);
        
        
    }

   
    
}
