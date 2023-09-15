import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("selecione a operação:");
        System.out.println("1 - Calcular perímetro");
        System.out.println("2 - Calcular área");

        int operacao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a forma geométrica (quadrado, circulo, triangulo ou retangulo): ");
        String forma = scanner.nextLine();

        if (forma.equals("quadrado")) {
            Quadrado x = new Quadrado();
            System.out.print("Digite o tamanho do lado do quadrado:");
            x.lado = scanner.nextDouble();
            if (operacao == 2) {
                double resultado = x.area_quadrado(x.lado);
                System.out.println("A área do quadrado é " + resultado);
            } else {
                double resultado = x.perimetro_quadrado(x.lado);
                System.out.println("O perímetro do quadrado é " + resultado);
            }
        }

        else if (forma.equals("circulo")) {
            Circulo x = new Circulo();
            System.out.print("Digite o tamanho do raio do circulo:");
            x.raio = scanner.nextDouble();
            if (operacao == 2) {
                double resultado = x.area_circulo(x.raio);
                System.out.println("A área do círculo é " + resultado);
            } else {
                double resultado = x.perimetro_circulo(x.raio);
                System.out.println("O perímetro do circulo é " + resultado);
            }
        }

        else if (forma.equals("triangulo")) {
            Triangulo x = new Triangulo();
            System.out.print("Digite o tamanho do lado A do triângulo:");
            x.ladoA = scanner.nextDouble();
            System.out.print("Digite o tamanho do lado B do triângulo:");
            x.ladoB = scanner.nextDouble();
            System.out.print("Digite o tamanho da base do triângulo:");
            x.base = scanner.nextDouble();
            System.out.print("Digite o tamanho da altura do triângulo:");
            x.altura = scanner.nextDouble();
            if (operacao == 2) {
                double resultado = x.area_triangulo(x.altura, x.base);
                System.out.println("A área do triângulo é " + resultado);
            } else {
                double resultado = x.perimetro_triangulo(x.ladoA, x.ladoB, x.base);
                System.out.println("O perímetro do triângulo é " + resultado);
            }
        }

        else if (forma.equals("retangulo")) {
            Retangulo x = new Retangulo();
            System.out.print("Digite o tamanho da largura do retangulo:");
            x.largura = scanner.nextDouble();
            System.out.print("Digite o tamanho da altura do retangulo:");
            x.altura = scanner.nextDouble();
            if (operacao == 2) {
                double resultado = x.area_retangulo(x.altura, x.largura);
                System.out.println("A área do retangulo é " + resultado);
            } else {
                double resultado = x.perimetro_retangulo(x.altura, x.largura);
                System.out.println("O perímetro do retangulo é " + resultado);
            }
        }

    }
}