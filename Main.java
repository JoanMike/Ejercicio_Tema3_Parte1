public class Main {
  public static void main(String[] args) {
    // - Crear una función con tres parámetros que sean
    //   números que se suman entre sí.
    // - Llamar a la función en el main y darle valores.
    int resultado;
    resultado = suma(10, 30, 20);

    System.out.println(resultado);
  }

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }
}