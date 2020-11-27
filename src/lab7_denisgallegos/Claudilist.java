/*Clase para el objeto CLAUDILIST.
 */
package lab7_denisgallegos;

import java.io.File;
import java.util.ArrayList;


public class Claudilist {
    
    private String nombre; 
    private File archivo; 
    private ArrayList <Programas> programas = new ArrayList();

    public Claudilist(String path) {
        archivo = new File(path);
    }
    
    //MUTADORES: 

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Programas> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programas> programas) {
        this.programas = programas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //MA: 
    public String toStringClaudilist(){
        return "Nombre: "+nombre;
    }

    
    
    
}//Fin de la clase.
