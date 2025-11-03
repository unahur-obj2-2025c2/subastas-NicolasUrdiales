package ar.edu.unahur.obj2.observer.subastadores.comportamientos;

import ar.edu.unahur.obj2.observer.productos.ProductoSubastado;
import ar.edu.unahur.obj2.observer.subastadores.Subastador;

public interface IComportamientoSubastador {
    void realizarOferta(Subastador subastador ,ProductoSubastado producto);
}
