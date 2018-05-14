 import java.util.Scanner;
    public class Lista<T> {
        Elemento<T> pivote, inicio;
        int nelemento;

        public Lista() {
            inicio = pivote = null;
            nelemento = 0;
        }

        public Lista(Elemento<T> objeto) {
            inicio = pivote = objeto;
            nelemento = 1;
        }

        public void insertar(Elemento<T> objeto) {
            if (nelemento == 0) {
                inicio = pivote = objeto;
            } else {
                objeto.siguiente = inicio;
                inicio = pivote = objeto;
            }
            nelemento++;
        }

        public String recorrer() {
            String data = "";
            pivote = inicio;
            for (int i = 0; i < nelemento; i++) {
                data += pivote.attrG.toString();
                pivote = pivote.siguiente;
            }
            return data;
        }

        public String eleminar() {
            String data = "";
            pivote = inicio;
            for (int i = 1; i < nelemento; i++) {
                data = data + pivote.attrG.toString();
                pivote = pivote.siguiente;
            }
            return data;
        }

     }
