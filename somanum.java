import java.util.Scanner;

public class somanum{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1;
        int n2;
        int soma;

        System.out.print("Digite um número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite um número: ");
        n2 = teclado.nextInt();
        
        soma = n1 + n2;

        System.out.printf("%d + %d = %d", n1, n2, soma);

        teclado.close();
    }



}