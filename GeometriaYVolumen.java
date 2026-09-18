public class GeometriaYVolumen {
    public static void main(String[] args) {

        // 11. Área de un cuadrado
        double lado1 = 9;
        double areaCuadrado = lado1 * lado1;
        System.out.println("11. Área de un cuadrado = " + areaCuadrado + " m²");

        // 12. Perímetro de un cuadrado
        double lado2 = 12;
        double perimetroCuadrado = 4 * lado2;
        System.out.println("12. Perímetro de un cuadrado = " + perimetroCuadrado + " m");

        // 13. Área de un rectángulo
        double base = 18;
        double alturaRect = 7;
        double areaRectangulo = base * alturaRect;
        System.out.println("13. Área de un rectángulo = " + areaRectangulo + " m²");

        // 14. Perímetro de un rectángulo
        double largo = 22;
        double ancho = 9;
        double perimetroRectangulo = 2 * (largo + ancho);
        System.out.println("14. Perímetro de un rectángulo = " + perimetroRectangulo + " m");

        // 15. Área de un triángulo
        double baseTri = 16;
        double alturaTri = 11;
        double areaTriangulo = (baseTri * alturaTri) / 2;
        System.out.println("15. Área de un triángulo = " + areaTriangulo + " m²");

        // 16. Área de un trapecio
        double B = 20;
        double b = 12;
        double h = 8;
        double areaTrapecio = ((B + b) * h) / 2;
        System.out.println("16. Área de un trapecio = " + areaTrapecio + " m²");

        // 17. Área de un rombo
        double D = 18;
        double d = 10;
        double areaRombo = (D * d) / 2;
        System.out.println("17. Área de un rombo = " + areaRombo + " m²");

        // 18. Área de un círculo
        double radio1 = 6;
        double areaCirculo = Math.PI * radio1 * radio1;
        System.out.println("18. Área de un círculo = " + areaCirculo + " m²");

        // 19. Longitud de circunferencia
        double radio2 = 8;
        double longitudCircunferencia = 2 * Math.PI * radio2;
        System.out.println("19. Longitud de circunferencia = " + longitudCircunferencia + " m");

        // 20. Volumen de un cubo
        double arista = 5;
        double volumenCubo = arista * arista * arista;
        System.out.println("20. Volumen de un cubo = " + volumenCubo + " m³");

        // 21. Volumen de un prisma rectangular
        double largoPrisma = 12;
        double anchoPrisma = 6;
        double alturaPrisma = 4;
        double volumenPrisma = largoPrisma * anchoPrisma * alturaPrisma;
        System.out.println("21. Volumen de un prisma rectangular = " + volumenPrisma + " m³");

        // 22. Volumen de un cilindro
        double radioCilindro = 4;
        double alturaCilindro = 10;
        double volumenCilindro = Math.PI * radioCilindro * radioCilindro * alturaCilindro;
        System.out.println("22. Volumen de un cilindro = " + volumenCilindro + " m³");
    }
}