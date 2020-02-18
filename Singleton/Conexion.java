public class Conexion {

  // Declaración
  private static Conexion instancia;
  // private static Conexion instancia = new Conexion();


  // Para evitar instancia mediante operador 'new'
  private Conexion(){

  }

  // Para obtener la instancia unicamente por este metodo
  // Nóótese la palabra reservada "static" hace posible el acceso mediante Clase.metodo

  public static Conexion getInstancia(){
   if(instancia == null){
     instancia = new Conexion();
   }

   return instancia;
  }

  // Méétodo de prueba
  public void conectar(){
    System.out.println("Conected to DB");
  }

  // Méétodo de prueba
  public void desconectar(){
    System.out.println("Disconected from DB");
  }
}