import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = sc.nextInt();
        int suc = num +1;
        int ant = num -1;
        System.out.println("O sucessor é :" +suc);
        System.out.println("O antecessor é :" +ant);
        }
    }
