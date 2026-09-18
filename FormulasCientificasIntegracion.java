public class FormulasCientificasIntegracion {
    public static void main(String[] args) {

        // 41. Densidad
        double masa = 540;
        double volumen = 60;
        double densidad = masa / volumen;
        System.out.println("41. Densidad = " + densidad + " g/cm³");

        // 42. Presión
        double fuerza = 720;
        double area = 24;
        double presion = fuerza / area;
        System.out.println("42. Presión = " + presion + " N/m²");

        // 43. Trabajo mecánico
        double fuerzaTrabajo = 150;
        double distancia = 18;
        double trabajo = fuerzaTrabajo * distancia;
        System.out.println("43. Trabajo mecánico = " + trabajo + " J");

        // 44. Ley de Ohm
        double voltaje = 220;
        double resistencia = 44;
        double corriente = voltaje / resistencia;
        System.out.println("44. Corriente = " + corriente + " A");

        // 45. Potencia eléctrica
        double voltajePot = 220;
        double corrientePot = 5;
        double potencia = voltajePot * corrientePot;
        System.out.println("45. Potencia eléctrica = " + potencia + " W");

        // 46. Energía eléctrica
        double potenciaEnergia = 1200;
        double tiempoHoras = 6;
        double energiaWh = potenciaEnergia * tiempoHoras;
        double energiakWh = energiaWh / 1000;

        System.out.println("46. Energía = " + energiaWh + " Wh");
        System.out.println("46. Energía = " + energiakWh + " kWh");

        // 47. Índice de Masa Corporal
        double peso = 72;
        double altura = 1.74;
        double imc = peso / (altura * altura);

        System.out.println("47. IMC = " + imc);

        // 48. Hipotenusa
        double a = 9;
        double b = 12;
        double hipotenusa = Math.sqrt(a * a + b * b);

        System.out.println("48. Hipotenusa = " + hipotenusa + " m");

        // 49. Descomposición de tres cifras
        int numero = 748;

        int centenas = numero / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;
        int sumaCifras = centenas + decenas + unidades;

        System.out.println("49. Centenas = " + centenas);
        System.out.println("49. Decenas = " + decenas);
        System.out.println("49. Unidades = " + unidades);
        System.out.println("49. Suma de cifras = " + sumaCifras);

        // 50. Problema integrador
        int unidadesProducidas = 300;
        double costoUnitario = 16.80;

        double costoTotal = unidadesProducidas * costoUnitario;
        double ganancia = costoTotal * 0.30;
        double valorVenta = costoTotal + ganancia;
        double igv = valorVenta * 0.18;
        double precioTotal = valorVenta + igv;
        double precioFinalUnidad = precioTotal / unidadesProducidas;

        System.out.println("50. Costo total = S/ " + costoTotal);
        System.out.println("50. Ganancia = S/ " + ganancia);
        System.out.println("50. Valor de venta = S/ " + valorVenta);
        System.out.println("50. IGV = S/ " + igv);
        System.out.println("50. Precio total = S/ " + precioTotal);
        System.out.println("50. Precio final por unidad = S/ " + precioFinalUnidad);
    }
}