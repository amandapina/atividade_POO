public class Retangulo {
    double largura;
    double altura;

    double area_retangulo(double altura, double largura)
    {
        double area;
        area = altura*largura;
        return area;
    }

    double perimetro_retangulo(double altura, double largura)
    {
        double perimetro;
        perimetro = (altura*2) + (largura*2);
        return perimetro;
    }


}
