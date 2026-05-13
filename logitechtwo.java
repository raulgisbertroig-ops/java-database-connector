// TICKET 2 
public String buscarPaqueteRapido(int idBusqueda) {

 String ruta = "inventario.dat"; 
 int tamanoRegistro = 100; // Dato fijo de arquitectura 
  
 // Modo "r" (read-only) porque solo vamos a consultar 
 try (RandomAccessFile raf = new RandomAccessFile(ruta, "r")) { 
 // Cálculo de la posición exacta: Matemáticas vs Fuerza bruta 
 long posicion = (long) idBusqueda * tamanoRegistro; 

  // Comprobamos si el ID está dentro de los límites del fichero 
 if (posicion >= raf.length()) return "ID no encontrado"; 
  
 // Salto dimensional directo al dato 
 raf.seek(posicion); 
  
 // Leemos el registro (asumiendo que los primeros bytes son el nombre/datos)  return "Paquete encontrado en posición: " + posicion; 
  
 } catch (IOException e) { 
 return "Error de lectura"; 
 } 
} 
