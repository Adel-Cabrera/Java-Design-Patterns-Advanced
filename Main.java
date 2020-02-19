class Main {
  public static void main(String[] args) {


    // Singleton

      // Instanciacióón por constructor prohibido por ser "private"
      // Conexion c = new Conexion();
    Conexion c = Conexion.getInstancia();
    c.conectar();
    c.desconectar();

    boolean respuesta = c instanceof Conexion;
    System.out.println(respuesta);

    // Factory

    ConexionFabrica fabrica = new ConexionFabrica();

		IConexion cx1 = fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		IConexion cx2 = fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		IConexion cx3 = fabrica.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();

  }
}