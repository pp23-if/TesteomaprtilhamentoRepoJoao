
package X;

import java.util.Objects;


public class Carro {
    
   private String marcaCarro;
   private String donoCarro;

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getDonoCarro() {
        return donoCarro;
    }

    public void setDonoCarro(String donoCarro) {
        this.donoCarro = donoCarro;
        
       
    }

    public Carro(String marcaCarro, String donoCarro) {
        this.marcaCarro = marcaCarro;
        this.donoCarro = donoCarro;
    }

    public Carro() {
    }

    

    
   
   
   
}
