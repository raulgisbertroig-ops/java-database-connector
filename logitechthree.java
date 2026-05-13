// TICKET 3 
import java.io.Serializable; 
// 1. Implementamos la interfaz "marca" 
public class logitechthree implements Serializable { 
  
 // 2. Etiqueta de versión para consistencia 
 private static final long serialVersionUID = 1L; 
  
 public String usuario; 
  
 // 3. 'transient' evita que este dato sensible se guarde en disco 
 public transient String password; 
  
 public int volumen; 
} 
