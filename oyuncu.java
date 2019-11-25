
package proje;


public abstract class oyuncu {
    
    private int oyuncuID;
    private String oyuncuAdi;
    private int Skor;
    
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
 
    
    public oyuncu(int oyuncuID , String oyuncuAdi , int Skor){
        
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
        
    }
    public oyuncu(){
        
    }
    
    public abstract void kartSec();
    
    public void SkorGoster(){
        
    }   
    
    
}
