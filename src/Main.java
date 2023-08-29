
public class Main {
    public static void main(String[] args) {

        Retangulo a = new Retangulo();
        a.altura = 2;
        a.largura = 4;
        System.out.println("area do retângulo:" + a.area_retangulo(a.altura, a.largura));
        System.out.println("perimetro do retângulo:" + a.perimetro_retangulo(a.altura, a.largura));

        Quadrado b = new Quadrado();
        b.lado = 3;
        System.out.println("area do quadrado:" + b.area_quadrado(b.lado));
        System.out.println("perimetro do quadrado:" + b.perimetro_quadrado(b.lado));

        Triangulo c = new Triangulo();
        c.altura = 12;
        c.ladoB = 15;
        c.ladoA = 15;
        c.base = 18;
        System.out.println("area do triangulo:" + c.area_triangulo(c.altura, c.base));
        System.out.println("perimetro do triangulo:" + c.perimetro_triangulo(c.ladoA, c.ladoB, c.base));

        Circulo d = new Circulo();
        d.raio = 5;
        System.out.println("area do circulo:" + d.area_circulo(d.raio));
        System.out.println("perimetro:" + d.perimetro_circulo(d.raio));

    }
}