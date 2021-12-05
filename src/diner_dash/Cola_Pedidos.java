package diner_dash;

/**
 *
 * @author kleve
 */
public class Cola_Pedidos {
    private Nodo_Pedidos first;
    private Nodo_Pedidos last;
    
    Cola_Pedidos(){
    first = last = null;
    } 
    //Insertar al final de la cola
    public void enqueue (int salida_pedido) {
        Nodo_Pedidos nuevo = new Nodo_Pedidos();
        nuevo.salida_pedido = salida_pedido;
        nuevo.siguiente = null;
        if (first == null)
            first = last = nuevo;
        else {
            last.siguiente = nuevo;
            last = nuevo;
        }
    }
    
    //Borrar Inicio Cola
    public void dequeue () {
        if (first != null)
            first = first.siguiente;
    }
}