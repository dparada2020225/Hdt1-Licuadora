/*
 * Universidad del Valle de Guatemala
 * Autor: Denil José Parada Cabrera
 * Fecha: 18/01/2025
 * Descripción: Archivo de pruebas unitarias para la clase Licuadora utilizando JUnit.
 */

 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;
 
 public class LicuadoraTest {
 
     private Licuadora licuadora;
 
     /**
      * Configuración inicial antes de cada prueba.
      */
     @BeforeEach
     public void setUp() {
         licuadora = new Licuadora(false, false, 0); // Inicializamos la licuadora en estado apagado, vacío y velocidad 0.
     }
 
     /**
      * Prueba para verificar que la licuadora se enciende correctamente.
      */
     @Test
     public void testEncender() {
         licuadora.encender();
         assertTrue(licuadora.getEncendido(), "La licuadora debería estar encendida.");
     }
 
     /**
      * Prueba para verificar que la licuadora se llena correctamente.
      */
     @Test
     public void testLlenar() {
         licuadora.llenar();
         assertTrue(licuadora.getLleno(), "La licuadora debería estar llena.");
     }
 
     /**
      * Prueba para verificar que la velocidad de la licuadora aumenta correctamente.
      */
     @Test
     public void testAumentarVelocidad() {
         int velocidadInicial = licuadora.getVelocidad();
         licuadora.aumentarVelocidad();
         assertEquals(velocidadInicial + 1, licuadora.getVelocidad(), "La velocidad de la licuadora debería aumentar en 1.");
     }
 
     /**
      * Prueba para verificar el estado del llenado de la licuadora.
      */
     @Test
     public void testConsultarLlenado() {
         assertFalse(licuadora.consultarLlenado(), "La licuadora debería estar inicialmente vacía.");
         licuadora.llenar();
         assertTrue(licuadora.consultarLlenado(), "La licuadora debería estar llena después de llamar al método llenar.");
     }
 
     /**
      * Prueba para verificar que la licuadora se vacía correctamente.
      */
     @Test
     public void testVaciar() {
         licuadora.llenar();
         licuadora.vaciar();
         assertFalse(licuadora.getLleno(), "La licuadora debería estar vacía después de llamar al método vaciar.");
     }
 
     /**
      * Prueba para verificar la consulta de velocidad inicial de la licuadora.
      */
     @Test
     public void testConsultarVelocidad() {
         assertEquals(0, licuadora.consultarVelocidad(), "La velocidad inicial de la licuadora debería ser 0.");
     }
 
     /**
      * Prueba para verificar los métodos Get y Set del atributo encendido.
      */
     @Test
     public void testGetSetEncendido() {
         licuadora.setEncendido(true);
         assertTrue(licuadora.getEncendido(), "El atributo encendido debería ser true después de usar setEncendido.");
     }
 
     /**
      * Prueba para verificar los métodos Get y Set del atributo lleno.
      */
     @Test
     public void testGetSetLleno() {
         licuadora.setLleno(true);
         assertTrue(licuadora.getLleno(), "El atributo lleno debería ser true después de usar setLleno.");
     }
 
     /**
      * Prueba para verificar los métodos Get y Set del atributo velocidad.
      */
     @Test
     public void testGetSetVelocidad() {
         licuadora.setVelocidad(5);
         assertEquals(5, licuadora.getVelocidad(), "La velocidad debería ser 5 después de usar setVelocidad.");
     }
 }
 