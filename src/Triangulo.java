public class Triangulo {
    double ladoA;
    double ladoB;
    double base;
    double altura;

    double area_triangulo(double altura, double base)
    {
        double area;
        area = (base*altura)/2;
        return area;
    }

    double perimetro_triangulo(double ladoA, double ladoB, double base)
    {
        double perimetro;
        perimetro = ladoA + ladoB + base;
        return perimetro;
    }


}
