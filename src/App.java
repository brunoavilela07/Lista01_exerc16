import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        // Faça um programa para uma loja de tintas
        double area;
        double litros;
        double quantidadeLatas;
        double valorfinal;
        // O programa deverá pedir o tamanho em metros quadrados da área a ser pintada
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho da área a ser pintada? ");
        area = input.nextDouble();
        // Calcular a quantidade de tintas e o valor
        litros = area / 3;
        quantidadeLatas = Math.ceil(litros / 18);
        valorfinal = quantidadeLatas * 18;

        // Mostrar a quantidade e o valor

        System.out.println("Foram necessárias " + quantidadeLatas + " latas");
        System.out.println("E custou ao todo R$" + valorfinal);
    }
}
