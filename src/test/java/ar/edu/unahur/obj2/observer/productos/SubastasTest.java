package ar.edu.unahur.obj2.observer.productos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unahur.obj2.observer.subastadores.Subastador;

public class SubastasTest {
    private ProductoSubastado p1 = new ProductoSubastado();
    private Subastador s1 = new Subastador("martomau");
    private Subastador s2 = new Subastador("gonzager");



    @BeforeEach
    void setUp(){
        p1.reset();
        s1.reset();
        s2.reset();

        p1.agregarObservador(s1);
        p1.agregarObservador(s2);

        s1.realizarOferta(p1);
        s2.realizarOferta(p1);
        s1.realizarOferta(p1);
    }


    @Test
    void test1(){
        setUp();
        assertEquals(s1.getUltimaOferta(), p1.getOfertas().getLast());
        assertEquals(s2.getUltimaOferta(), p1.getOfertas().getLast());
    }
}


