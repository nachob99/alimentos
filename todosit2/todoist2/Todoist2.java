import java.util.ArrayList;
import java.time.LocalDate;
/** 
 * Cabecera: luis
 * Atributos: Gian carlo
 * Constructor: Aitor
 * mostrarTareasNumeradas: Samuel
 * agregarTarea: Omar
 * marcarTareaComoCompletada: Cristian
 **/

public class Todoist2{

    private ArrayList<Tarea> listaDeTareas; 

    /**
     * Constructor de la clase Todoist2
     */
    public Todoist2(){
        listaDeTareas = new ArrayList<Tarea>();
    }

    /**
     * Mostrar tareas numeradasif
     */
    public void mostrarTareasNumeradas()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < listaDeTareas.size()) {
            System.out.println((posicionTareaActual+1) + ". " + listaDeTareas.get(posicionTareaActual).getDatosTarea());
            posicionTareaActual++;
        }
    }

    /**
     * Añade una tarea
     */
    public void addTarea(String tarea)
    {
        Tarea nuevaTarea = new Tarea(tarea);
        listaDeTareas.add(nuevaTarea);

    }

    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        Tarea tareaActual = listaDeTareas.get(indiceTarea);
        tareaActual.tareaCompletada();
    }

    /**
     * Cambia la prioridad de la tarea indicada.Por ejemplo,
     * si el parámetro es 0 cambia la prioridad de la primera tarea, si es 1 la
     * segunda, etc. Si el usuario indica una posicion no válida, el metodo no
     * hace nada.
     */
    public void cambiarPrioridad(int indiceTarea,int nuevaPrioridad)
    {
        if(indiceTarea>=0 && indiceTarea<listaDeTareas.size()) {
            Tarea tareaActual = listaDeTareas.get(indiceTarea);
            tareaActual.setPrioridad(nuevaPrioridad);
        }
    }

    /**
     * Imprime todos los datos de la tarea con mayor prioridad. Si hay empate,
     * imprime la última encontrada. Si no hay tareas no imprime nada.
     */
    public void imprimirTareaMasPrioritaria(){
        if(listaDeTareas.size()>0) {
            Tarea tareaPrioridadMaxima = listaDeTareas.get(0);

            for(Tarea tareaActual : listaDeTareas) {
                if(tareaActual.getPrioridad() >= tareaPrioridadMaxima.getPrioridad()){
                    tareaPrioridadMaxima = tareaActual;

                }
            }
            System.out.println(tareaPrioridadMaxima.getDatosTarea());
        }
    }

    /**
     * Imprime todos los datos de la tarea con menor prioridad. Si hay empate,
     * imprime por pantalla los datos de la última encontrada. Si no hay tareas,
     * no imprime nada
     */

    public void imprimirTareaMenosPrioritaria(){
        if(listaDeTareas.size()<0) {
            Tarea tareaPrioridadMaxima = listaDeTareas.get(0);
            for(Tarea tareaActual : listaDeTareas) {
                if(tareaActual.getPrioridad() <= tareaPrioridadMaxima.getPrioridad()){
                    tareaPrioridadMaxima = tareaActual;
                }
            }
            System.out.println(tareaPrioridadMaxima.getDatosTarea());
        }
    }

    public void fijarLimite(int indice,int dia,int mes,int ano ){
        Tarea tareaActual = listaDeTareas.get(indice);
        tareaActual.fijarFechaVencimiento(dia,mes,ano);   

    }

    /**
     * Muestra la tarea con la fecha tope más inminente. Si hay empate,
     * muestra todas las empatadas. Si no hay ninguna con fecha tope no muestra nada.
     * Evidentemente no tendremos en cuenta tareas con fecha tope ya pasada.
     */

    public void vencimientoMasInminente()
    {
        ArrayList<Tarea> coleccionFinal = new ArrayList<>();
        LocalDate fechaTopeMasInminente = LocalDate.of(9999,12,31);
        for (Tarea tareaActual : listaDeTareas){
            if(tareaActual.getFechaTope() != null ){
                if(!tareaActual.getFechaTope().isBefore(LocalDate.now())){
                    if (tareaActual.getFechaTope().isBefore(fechaTopeMasInminente)){
                        coleccionFinal.clear();
                        coleccionFinal.add(tareaActual);
                        fechaTopeMasInminente = tareaActual.getFechaTope();
                    }
                    else if(tareaActual.getFechaTope().isEqual(fechaTopeMasInminente)){
                        coleccionFinal.add(tareaActual);
                    }
                }
            }
        }
        for (Tarea tareaActual : coleccionFinal){
            System.out.println(tareaActual.getDatosTarea());
        }
    }

    /**
     * Muestra la tarea con la fecha tope más lejana. Si hay empate,
     * muestra todas las empatadas. Si no hay ninguna con fecha tope no muestra nada.
     * Evidentemente no tendremos en cuenta tareas con fecha tope ya pasada.
     */    
    public void vencimientoLejano()
    {
        ArrayList<Tarea> coleccionFinal = new ArrayList<>();
        LocalDate fechaTopeMasLejana = LocalDate.now();
        for (Tarea tareaActual : listaDeTareas){
            if(tareaActual.getFechaTope() != null ){
                if (tareaActual.getFechaTope().isAfter(fechaTopeMasLejana)){
                    coleccionFinal.clear();
                    coleccionFinal.add(tareaActual);
                    fechaTopeMasLejana = tareaActual.getFechaTope();
                }
                else if(tareaActual.getFechaTope().isEqual(fechaTopeMasLejana)){
                    coleccionFinal.add(tareaActual);
                }
            }
        }
        for (Tarea tareaActual : coleccionFinal){
            System.out.println(tareaActual.getDatosTarea());
        }
    }

    /**
     * Elimina todas las tareas con fecha tope previa a la fecha actual
     */
    public void olvidaTareasYaPasadas() 
    {
        int cont = 0;
        while(cont < listaDeTareas.size()){
            Tarea tareaActual = listaDeTareas.get(cont); 
            if(tareaActual.getFechaTope() != null){
                if(tareaActual.getFechaTope().isBefore(LocalDate.now())){
                    listaDeTareas.remove(cont);
                    cont--;
                }
                cont++;
            }
        }
    }
}