import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  String nome = "";
  float num1 = 0, num2 = 0, num3, num4 = 0, num5 = 0, notas;
  double total = 0, media = 0, maior = 0, menor = 10;
Scanner sc1 = new Scanner(System.in);

System.out.println("Vamos calcular sua média em matemática");
System.out.println("");
System.out.print("Digite o seu nome: ");
nome = sc1.nextLine();

  for (int i=0; i<5; i++) {
    System.out.print("Digite suas cinco notas: ");
      notas = sc1.nextFloat();
     total += notas;
     if (notas > maior) {
      maior = notas;
    } else if (notas < menor){
      menor = notas;
  }
}
  media = total/5;
  
  System.out.println (nome + " A sua média é: " + media);
  System.out.println(nome + " A sua maior nota é: " + maior + " e sua menor nota é: " + menor);
}
}