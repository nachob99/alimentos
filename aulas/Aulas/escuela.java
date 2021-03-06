import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class escuela here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class escuela
{
    // instance variables - replace the example below with your own
    private ArrayList<Aula> listaAula;
    private ArrayList<Aula> listaAulaOrdenada;
    private int numIdentificacion;
    /**
     * Constructor for objects of class escuela
     */
    public escuela(String nombreArchivo)
    {

        listaAula = new ArrayList<Aula>();
        int numIdentificacion = 1;

        try {
            File archivo = new File("nombreArchivo.txt");
            Scanner sc = new Scanner(archivo);
            
            while (sc.hasNextLine()) {
                String [] objeto = sc.nextLine().split(" # ");
                String nombre = objeto[0];
                int numeroClase = Integer.parseInt(objeto[1]);
                int alumnos = Integer.parseInt(objeto[2]);
                añadirAula(nombre,numeroClase,alumnos);
                

            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void añadirAula(String nombre,int numeroClase,int alumnos)
    {
        Aula aulas = new Aula(nombre,numeroClase,alumnos,numIdentificacion);
        listaAula.add(aulas);
        numIdentificacion ++;
    }

    public void listarAulas(){
        int posicionAulas = 0;
        while(posicionAulas < listaAula.size()){
            System.out.println((posicionAulas+1) + "-" + listaAula.get(posicionAulas).detallesAula());
            posicionAulas++;
        }
    }

    public void eliminarClase(int numeroClase){
        int cont=0;
        while (cont < listaAula.size()) {
            Aula numeroC = listaAula.get(cont);
            if(numeroC.getAula()<numeroClase){
                listaAula.remove(numeroClase);
                cont--;
            }
            cont++;
        }

    }

    public void modificarAlumnos(int numIdentificacion ,int nuevosAlumnos){
        int cont=0;
        Aula aulaActual = listaAula.get(numIdentificacion);
        while(numIdentificacion>=0 && cont<listaAula.size()){
            if(numIdentificacion== aulaActual.getnumeroIndentificativo()){
                aulaActual.setAlumnos(nuevosAlumnos);
                cont++;
            }
        }
    }

    public void listadoPorNumeroAlumnos(){
        listaAulaOrdenada = (ArrayList<Aula>) listaAula.clone();
        while(listaAulaOrdenada.size() !=0 ){
            Aula aulaConMasAlumnos = listaAulaOrdenada.get(0);
            if(listaAulaOrdenada.size() >0){
                for(Aula listaAula : listaAulaOrdenada){
                    if(listaAula.getAlumnos() >= aulaConMasAlumnos.getAlumnos()){
                        aulaConMasAlumnos=listaAula;

                    }
                    System.out.println(aulaConMasAlumnos.detallesAula());
                    listaAulaOrdenada.remove(aulaConMasAlumnos);
                }

            }    

        }

    }

    public void imprimirPorNombre(){
        listaAulaOrdenada = (ArrayList<Aula>) listaAula.clone();
        while(listaAulaOrdenada.size() != 0){

            Aula aulasPorNombre = listaAulaOrdenada.get(0);
            for(Aula listaAula : listaAulaOrdenada) {
                if (listaAula.getNombreAula().length() <= listaAula.getNombreAula().length()){
                    aulasPorNombre = listaAula;
                }
            }
            System.out.println(aulasPorNombre.detallesAula());
            listaAulaOrdenada.remove(aulasPorNombre);

        }

    }

}
