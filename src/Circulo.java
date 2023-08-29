public class Circulo {
    double raio;

    double area_circulo(double raio)
    {
        double area;
        area = 3.14 * (raio*raio);
        return area;
    }

    double perimetro_circulo(double raio)
    {
        double perimetro;
        perimetro = 2 * 3.14 * raio;
        return perimetro;
    }


}
