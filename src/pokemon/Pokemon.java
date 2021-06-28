/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author ricardo
 */
public class Pokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear pokemon 1
        Model podemon1 = new Model("pikachu", 55, 100);
        //Crear pokemon 2
        Model podemon2 = new Model("jiggypuff", 55, 100);
        
        //Iniciar dueño
        
        Model iniciarDuelo = new Model();
        iniciarDuelo.dueloPokemon("pikachu", podemon1, podemon2);
        
    }
    
}
