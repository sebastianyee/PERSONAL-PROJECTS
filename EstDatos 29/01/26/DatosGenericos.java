package EstDatos_29_01_26;
public class  DatosGenericos <T> {
    //indice: Variable para rastrear la próxima posición disponible
    private int indice = 0;
    private T [] arregloGenerico;

    public DatosGenericos() {
        this.arregloGenerico = new T[3];
        this.indice = 0;
    }

    public void agregarDato(T dato) {
        // Ver si hay espacio disponible
        if (indice < arregloGenerico.length) {
            arregloGenerico[indice] = dato;
            indice++;
        } else {
            System.out.println("El arreglo está lleno");
        }
    }

    public T retirarDato(int posicion) {
        if (posicion >= 0 && posicion < indice) {
            T dato = arregloGenerico[posicion];
            
            // Desplazar elementos hacia la izquierda
            for (int i = posicion; i < indice - 1; i++) {
                arregloGenerico[i] = arregloGenerico[i + 1];
            }
            
            arregloGenerico[indice - 1] = null;
            indice--;
            
            return dato;
        }
        return null;
    }
}
