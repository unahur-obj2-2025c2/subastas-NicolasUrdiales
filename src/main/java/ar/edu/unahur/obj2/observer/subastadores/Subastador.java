package ar.edu.unahur.obj2.observer.subastadores;

import ar.edu.unahur.obj2.observer.observer.IObservador;
import ar.edu.unahur.obj2.observer.ofertas.Oferta;
import ar.edu.unahur.obj2.observer.productos.ProductoSubastado;

public class Subastador implements IObservador{
    private final String nombre;
    private  Oferta ultimaOferta = null;

    
    
    public Subastador(String nombre) {
        this.nombre = nombre;
    }

    public void realizarOferta(ProductoSubastado producto){
        Integer valor = ultimaOferta == null ? 10 : ultimaOferta.getValor() + 10;
        Oferta oferta = new Oferta(this, valor);
        producto.agregarOferta(oferta);
        producto.notificar(oferta);
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
