// TICKET 3 
import java.io.Serializable; 
// 1. Implementamos la interfaz "marca" 
public class logitechthree implements Serializable { 
  
 // 2. Etiqueta de versión para consistencia 
 private static final long serialVersionUID = 1L; 
  
 private String usuario; 
  
 // 3. 'transient' prevents this field from being included in standard Java serialization.
 private transient String password; 
  
 private int volumen; 
} 
