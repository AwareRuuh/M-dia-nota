import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  String nome = "";
  float num1 = 0, num2 = 0, num3, num4 = 0;
  double total = 0, media = 0;
Scanner sc1 = new Scanner(System.in);

System.out.println("Vamos calcular sua média em matemática");
System.out.println("");
System.out.print("Digite o seu nome: ");
nome = sc1.nextLine();

System.out.print("Informe a 1° nota: ");
num1 = sc1.nextFloat();

System.out.print("Informe a 2° nota: ");
num2 = sc1.nextFloat();

System.out.print("Informe a 3° nota: ");
num3 = sc1.nextFloat();

System.out.print("Informe a 4° nota: ");
num4 = sc1.nextFloat();

total = num1 + num2  +num3 + num4;
media = total/4;
System.out.println(nome + " a sua media é: " + media);
}
}