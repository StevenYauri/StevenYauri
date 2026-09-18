public class MovimientoConversionesConsumo {
    public static void main(String[] args) {

        // 23. Distancia recorrida
        double velocidad = 85;
        double tiempo = 3.5;
        double distancia = velocidad * tiempo;
        System.out.println("23. Distancia recorrida = " + distancia + " km");

        // 24. Velocidad promedio
        double distancia2 = 540;
        double tiempo2 = 6;
        double velocidadPromedio = distancia2 / tiempo2;
        System.out.println("24. Velocidad promedio = " + velocidadPromedio + " km/h");

        // 25. Tiempo de viaje
        double distancia3 = 360;
        double velocidad2 = 80;
        double tiempoViaje = distancia3 / velocidad2;
        System.out.println("25. Tiempo de viaje = " + tiempoViaje + " horas");

        // 26. Conversión de horas
        double horas = 7.5;
        double minutos = horas * 60;
        double segundos = horas * 3600;
        System.out.println("26. 7.5 horas = " + minutos + " minutos");
        System.out.println("26. 7.5 horas = " + segundos + " segundos");

        // 27. Conversión de segundos
        int totalSegundos = 10000;
        int horasConv = totalSegundos / 3600;
        int minutosConv = (totalSegundos % 3600) / 60;
        int segundosRestantes = totalSegundos % 60;

        System.out.println("27. 10000 segundos = "
                + horasConv + " horas, "
                + minutosConv + " minutos y "
                + segundosRestantes + " segundos");

        // 28. Celsius a Fahrenheit
        double celsius = 28;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("28. 28 °C = " + fahrenheit + " °F");

        // 29. Fahrenheit a Celsius
        double fahrenheit2 = 95;
        double celsius2 = (fahrenheit2 - 32) * 5.0 / 9.0;
        System.out.println("29. 95 °F = " + celsius2 + " °C");

        // 30. Consumo de combustible
        double km = 525;
        double litros = 35;
        double rendimiento = km / litros;
        System.out.println("30. Rendimiento = " + rendimiento + " km/L");
    }
}