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
public class Model {

    private String nombre;
    private Integer ataque;
    private Integer vida;

    public Model() {
    }

    public Model(String nombre, Integer ataque, Integer vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public void dueloPokemon(String pokemonInicia, Model pokemon1, Model pokemon2) {
        Integer turno = validarExisteNombrePokemos(pokemonInicia, pokemon1.getNombre(), pokemon2.getNombre());
        if (turno != null) {
            for (int i = 0; i < 100; i++) {
                if (pokemon1.getVida() > 0 && pokemon2.getVida() > 0) {
                    if (turno == 1) {
                        pokemon2.setVida(pokemon2.getVida() - pokemon1.getAtaque());
                        System.out.println(pokemon2.getNombre()+" ahora tiene "+ pokemon2.getVida()+" de vida");
                        turno = 0;
                    } else if (turno == 0) {
                        pokemon1.setVida(pokemon1.getVida() - pokemon2.getAtaque());
                        System.out.println(pokemon1.getNombre()+" ahora tiene "+ pokemon1.getVida()+" de vida");
                        turno = 1;
                    }
                } else {
                    break;
                }
            }
            if (pokemon1.getVida() <= 0) {
                System.out.println(pokemon2.getNombre()+" fue el ganador del duelo");
            }else {
                System.out.println(pokemon1.getNombre()+" fue el ganador del duelo");
            }
        }

    }

    public Integer validarExisteNombrePokemos(String nombreInicial, String nombrePokemon1, String nombrePokemon2) {
        if (nombreInicial.equals(nombrePokemon1)) {
            return 1;
        } else if (nombreInicial.equals(nombrePokemon2)) {
            return 0;
        }
        System.out.println("El nombre del pokemos que ingreso no coincide con los 2 pokemon existentes");
        return null;
    }

}
