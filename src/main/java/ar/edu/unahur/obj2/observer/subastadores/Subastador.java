package ar.edu.unahur.obj2.observer.subastadores;

import ar.edu.unahur.obj2.observer.observer.IObservador;
import ar.edu.unahur.obj2.observer.ofertas.Oferta;
import ar.edu.unahur.obj2.observer.productos.ProductoSubastado;
import ar.edu.unahur.obj2.observer.subastadores.comportamientos.IComportamientoSubastador;

public class Subastador implements IObservador{
    private final String nombre;
    private  Oferta ultimaOferta = null;
    private IComportamientoSubastador comportamiento;

    

   public Subastador(String nombre, IComportamientoSubastador comportamiento) {
        this.nombre = nombre;
        this.comportamiento = comportamiento;
    }


    public void realizarOferta(ProductoSubastado producto){
        comportamiento.realizarOferta(this, producto);
    }

    @Override
    public void actualizar(Oferta oferta) {
        this.ultimaOferta = oferta;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void reset(){
        this.ultimaOferta = null;
    }

    public Oferta getUltimaOferta() {
        return ultimaOferta;
    }

    

    
}
