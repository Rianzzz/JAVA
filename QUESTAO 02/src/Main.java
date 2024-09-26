import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int num3 = sc.nextInt();
        int media = (num1 +num2 +num3) /3;
        System.out.println("A media é: " +media);


    }
}