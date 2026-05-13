// TICKET 1 
public void guardarLogEficiente(String mensaje) {

 String ruta = "log_actividad.txt"; 
  
 // Usamos FileWriter para texto y BufferedWriter para eficiencia (la "carretilla")  
 // El 'true' activa el modo append (añadir al final) 
 try (BufferedWriter buffer = new BufferedWriter(new FileWriter(ruta, true))) {  
    buffer.write(mensaje); 
 buffer.newLine(); // Método nativo para salto de línea multiplataforma  // 
 Al usar try-with-resources, el close() es automático (regla del cierre)  } catch (IOException e) { 
 e.printStackTrace(); 
 } 
} 
