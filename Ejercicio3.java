import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int dia=0, mes=0, anio=0;

    System.out.println("Ingrese los siguientes valores: ");
    System.out.print("Dia: ");
    dia = sc.nextInt();
    System.out.print("Mes: ");
    mes = sc.nextInt();
    System.out.print("Año: ");
    anio = sc.nextInt();

    int diaS=dia, mesS=mes, anioS=anio;

    if ((mes == 1) || (mes == 3) || (mes==5) || (mes==7) || (mes==8) || (mes == 10) || (mes == 12)) {
        if (dia < 31) {
            diaS = dia + 1;
        } else {
          // Nuevo Mes
            if (mes < 12) {
                diaS = 1;
                mesS = mes + 1;
            } else {
              // Nuevo año
              diaS = 1;
              mesS = 1;
              anioS = anio + 1;
            }
        }
    } else if ( (mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
        if (dia < 30) {
            diaS = dia + 1;
        } else {
          // Nuevo Mes
            if (mes < 12) {
                diaS = 1;
                mesS = mes + 1;
            } else {
              // Nuevo año
              diaS = 1;
              mesS = 1;
              anioS = anio + 1;
            }
        }
    } else if (mes == 2) {
        if (dia < 28) {
            diaS = dia + 1;
        } else {
          // Nuevo Mes
            if (mes < 12) {
                diaS = 1;
                mesS = mes + 1;
            } else {
              // Nuevo año
              diaS = 1;
              mesS = 1;
              anioS = anio + 1;
            }
        }
    }



    System.out.println("Dia siguiente: "+diaS+"/"+mesS+"/"+anioS);
  }
}
