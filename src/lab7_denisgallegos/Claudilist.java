/*Clase para el objeto CLAUDILIST.
 */
package lab7_denisgallegos;

import java.io.File;
import java.util.ArrayList;


public class Claudilist {
    
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
    
    //MA: 
    
    
    
}//Fin de la clase.
