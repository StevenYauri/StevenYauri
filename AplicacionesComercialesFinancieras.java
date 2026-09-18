public class AplicacionesComercialesFinancieras {
    public static void main(String[] args) {

        // 31. Sueldo semanal
        double pagoHora = 22.50;
        int horasTrabajadas = 44;
        double sueldo = pagoHora * horasTrabajadas;
        System.out.println("31. Sueldo semanal = S/ " + sueldo);

        // 32. Importe de una compra
        int cuadernos = 18;
        double precioCuaderno = 7.80;
        double importeTotal = cuadernos * precioCuaderno;
        System.out.println("32. Importe total = S/ " + importeTotal);

        // 33. Descuento comercial
        double precio = 1200;
        double descuento = precio * 0.15;
        double precioFinal = precio - descuento;
        System.out.println("33. Descuento = S/ " + descuento);
        System.out.println("33. Precio final = S/ " + precioFinal);

        // 34. Precio con IGV
        double valorVenta = 850;
        double igv = valorVenta * 0.18;
        double precioTotal = valorVenta + igv;
        System.out.println("34. IGV = S/ " + igv);
        System.out.println("34. Precio total = S/ " + precioTotal);

        // 35. Descuento e IGV
        double precioOriginal = 1600;
        double descuento10 = precioOriginal * 0.10;
        double precioConDescuento = precioOriginal - descuento10;
        double igv18 = precioConDescuento * 0.18;
        double totalPagar = precioConDescuento + igv18;

        System.out.println("35. Descuento = S/ " + descuento10);
        System.out.println("35. Precio con descuento = S/ " + precioConDescuento);
        System.out.println("35. IGV = S/ " + igv18);
        System.out.println("35. Total a pagar = S/ " + totalPagar);

        // 36. Comisión de venta
        double venta = 12500;
        double comision = venta * 0.06;
        double sueldoBase = 1400;
        double ingresoTotal = sueldoBase + comision;

        System.out.println("36. Comisión = S/ " + comision);
        System.out.println("36. Ingreso total = S/ " + ingresoTotal);

        // 37. Interés simple
        double capital = 5000;
        double tasa = 0.08;
        int tiempo = 3;

        double interes = capital * tasa * tiempo;
        double monto = capital + interes;

        System.out.println("37. Interés = S/ " + interes);
        System.out.println("37. Monto final = S/ " + monto);

        // 38. Reparto porcentual
        double total = 9000;

        double participante1 = total * 0.40;
        double participante2 = total * 0.35;
        double participante3 = total * 0.25;

        System.out.println("38. 40% = S/ " + participante1);
        System.out.println("38. 35% = S/ " + participante2);
        System.out.println("38. 25% = S/ " + participante3);

        // 39. Costo de producción
        int unidades = 250;
        double costoUnidad = 18.50;
        double costoTotal = unidades * costoUnidad;

        System.out.println("39. Costo total = S/ " + costoTotal);

        // 40. Precio de venta
        double costo = 4625;
        double ganancia = costo * 0.25;
        double precioVenta = costo + ganancia;

        System.out.println("40. Ganancia = S/ " + ganancia);
        System.out.println("40. Precio de venta = S/ " + precioVenta);
    }
}