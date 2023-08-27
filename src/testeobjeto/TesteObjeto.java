
package testeobjeto;

import X.Carro;


public class TesteObjeto {

    
    public static void main(String[] args) {
        
        
     /*Carro carro = new Carro();
      
      carro.setMarcaCarro("Hyundai");
      carro.setDonoCarro("joao");*/
     
     
      Carro carro = new Carro("Hyundai", "joao");
      Carro carro2 = new Carro("Hyundai", "joao");
      
      boolean iguais = carro.equals(carro2);
        System.out.println(carro);
      
      
      
      
     //João Victor
      
        
        
      
    }
    
}
