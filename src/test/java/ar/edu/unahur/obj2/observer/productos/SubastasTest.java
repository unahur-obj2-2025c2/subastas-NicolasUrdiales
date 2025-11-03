package ar.edu.unahur.obj2.observer.productos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import ar.edu.unahur.obj2.observer.excepciones.ErrorSubastador;
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
    @DisplayName("Dado el escenario 1, se verifica que los subastadores gonzager y martomau reciben correctamente la última oferta realizada")
    void test1(){
        setUp();
        assertEquals(s1.getUltimaOferta(), p1.getOfertas().getLast());
        assertEquals(s2.getUltimaOferta(), p1.getOfertas().getLast());
    }

    @Test
    void test2(){
        setUp();
        assertEquals("martomau", p1.getOfertas().getLast().getNombreSubastador());
    }


    @Test
    void test3(){
        setUp();
        assertEquals(Integer.valueOf(30) , s1.getUltimaOferta().getValor());
    }

    @Test
    void test4(){
        setUp();
        assertEquals(3, p1.getOfertas().size());
    }

    @Test
    void test5(){
        setUp();
        Subastador s3 = new Subastador("diazdan");

        String mensajeEsperado = "El subastador no participa en la subasta";

        RuntimeException exception = assertThrows(ErrorSubastador.class, () -> {
            s3.realizarOferta(p1);
        });

        assertEquals(mensajeEsperado, exception.getMessage());
    }

}


