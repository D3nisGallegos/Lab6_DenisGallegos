/*Clase para el objeto PROGRAMAS.
 */
package lab7_denisgallegos;


public class Programas {
    
    private String nombre; 
    private int puntuacion; 
    private String tipo; 
    private String genero; 

    public Programas() {
    }

    public Programas(String nombre, int puntuacion, String tipo, String genero) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.tipo = tipo;
        this.genero = genero;
    }

    //MUTADORES: 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //MA: 
    public String toStringProgramas(){
        return "Nombre: "+nombre+", Puntos: "+puntuacion+", Tipo: "+tipo+", Genero: "+genero;
    }
    
    
    
    
    
    
}//Fin de la clase.
