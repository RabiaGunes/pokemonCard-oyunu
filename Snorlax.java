/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author MONSTER
 */
public class Snorlax extends Pokemon{
   
     private int hasarPuani = 60;
    static private boolean kart_kullanildi_mi;
    private int PokemonID = 1;

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    public boolean isKart_kullanildi_mi() {
        return kart_kullanildi_mi;
    }

    public void setKart_kullanildi_mi(boolean kart_kullanildi_mi) {
        this.kart_kullanildi_mi = kart_kullanildi_mi;
    }

    public int getPokemonID() {
        return PokemonID;
    }

    public void setPokemonID(int PokemonID) {
        this.PokemonID = PokemonID;
    }
 
    public Snorlax(String PokemonAdi , String PokemonTip , int puan){
         
        super(PokemonAdi,PokemonTip,puan);
        kart_kullanildi_mi = true;
       
    
}

  
    @Override
    public void hasarPuaniGoster() {
       super.hasarPuaniGoster();
    }

    @Override
    public void ozellikGoster() {
        super.ozellikGoster();
    }

    public Snorlax() {
       
    }
}
