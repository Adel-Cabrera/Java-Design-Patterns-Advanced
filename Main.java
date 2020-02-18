class Main {
  public static void main(String[] args) {

    // Instanciacióón por constructor prohibido por ser "private"
    // Conexion c = new Conexion();
    Conexion c = Conexion.getInstancia();
    c.conectar();
    c.desconectar();

    boolean respuesta = c instanceof Conexion;
    System.out.println(respuesta);
  }
}