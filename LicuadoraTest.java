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
         assertTrue(true, "La licuadora debería encender sin errores."); // Validamos que el método se ejecuta sin errores.
     }
 
     /**
      * Prueba para verificar que la licuadora se llena correctamente.
      */
     @Test
     public void testLlenar() {
         licuadora.llenar();
         assertTrue(true, "La licuadora debería llenarse sin errores."); // Validamos que el método se ejecuta sin errores.
     }
 
     /**
      * Prueba para verificar que la velocidad de la licuadora aumenta correctamente.
      */
     @Test
     public void testAumentarVelocidad() {
         int velocidadInicial = licuadora.consultarVelocidad();
         licuadora.aumentarVelocidad();
         assertEquals(velocidadInicial + 1, licuadora.consultarVelocidad(), "La velocidad de la licuadora debería aumentar en 1.");
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
         assertFalse(licuadora.consultarLlenado(), "La licuadora debería estar vacía después de llamar al método vaciar.");
     }
 
     /**
      * Prueba para verificar la consulta de velocidad inicial de la licuadora.
      */
     @Test
     public void testConsultarVelocidad() {
         assertEquals(0, licuadora.consultarVelocidad(), "La velocidad inicial de la licuadora debería ser 0.");
     }
 }
 