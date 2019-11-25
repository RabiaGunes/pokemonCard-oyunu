
package proje;


public class Pokemon {
    
    private int PokemonID;
    private String PokemonAdi;
    private String PokemonTip;
    private int hasarPuani;

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }
    
    public Pokemon(){
        
    }
  public Pokemon(String PokemonAdi ,String PokemonTip , int puan){
        
        this.PokemonAdi = PokemonAdi;
        this.PokemonTip = PokemonTip;
        hasarPuani = puan;
    }
  
    public int getPokemonID() {
        return PokemonID;
    }

    public void setPokemonID(int PokemonID) {
        this.PokemonID = PokemonID;
    }

    public String getPokemonAdi() {
        return PokemonAdi;
    }

    public void setPokemonAdi(String PokemonAdi) {
        this.PokemonAdi = PokemonAdi;
    }

    public String getPokemonTip() {
        return PokemonTip;
    }

    public void setPokemonTip(String PokemonTip) {
        this.PokemonTip = PokemonTip;
    }
    
  
    
    public void hasarPuaniGoster(){
      
        System.out.println("hasar puani: "+hasarPuani);
        
    }
    
    public void ozellikGoster(){
        System.out.println("adi: "+PokemonAdi+"\ntipi: "+PokemonTip);
    }
}
