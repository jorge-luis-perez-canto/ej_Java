import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sumaPositvos=0, sumaNegativos=0;
    int contadorPos=0, contadorNeg=0;

    for (int i=0; i<10; i++) {
      System.out.println("Ingrese un numero");
      int num = sc.nextInt();

      if (num>0) {
        sumaPositvos += num;
        contadorPos++;
      } else {
        sumaNegativos += num;
        contadorNeg++;
      }
    }

    double promedioPos, promedioNeg;
    promedioPos = sumaPositvos/contadorPos;
    promedioNeg = sumaNegativos/contadorNeg;

    System.out.println("La media de positivos es "+promedioPos);
    System.out.println("La media de negativos es "+promedioNeg);

  }
}
