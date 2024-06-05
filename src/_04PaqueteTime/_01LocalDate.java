package _04PaqueteTime;

import java.time.LocalDate;
import java.time.Month;

public class _01LocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
        LocalDate fechaEspecifica = LocalDate.of(2024, 6, 4); // Año, mes, día
        System.out.println("Fecha específica: " + fechaEspecifica);
        LocalDate fechaParseada = LocalDate.parse("2024-06-04");
        System.out.println("Fecha parseada: " + fechaParseada);
        LocalDate fecha = LocalDate.of(2024, Month.AUGUST, 4);

        LocalDate fechaMasDias = fecha.plusDays(10);
        LocalDate fechaMasSemanas = fecha.plusWeeks(2);
        LocalDate fechaMasMeses = fecha.plusMonths(3);
        LocalDate fechaMasAnios = fecha.plusYears(1);

        System.out.println("Fecha original: " + fecha);
        System.out.println("Fecha más 10 días: " + fechaMasDias);
        System.out.println("Fecha más 2 semanas: " + fechaMasSemanas);
        System.out.println("Fecha más 3 meses: " + fechaMasMeses);
        System.out.println("Fecha más 1 año: " + fechaMasAnios);



        LocalDate fechaMenosDias = fecha.minusDays(10);
        LocalDate fechaMenosSemanas = fecha.minusWeeks(2);
        LocalDate fechaMenosMeses = fecha.minusMonths(3);
        LocalDate fechaMenosAnios = fecha.minusYears(1);

        System.out.println("Fecha original: " + fecha);
        System.out.println("Fecha menos 10 días: " + fechaMenosDias);
        System.out.println("Fecha menos 2 semanas: " + fechaMenosSemanas);
        System.out.println("Fecha menos 3 meses: " + fechaMenosMeses);
        System.out.println("Fecha menos 1 año: " + fechaMenosAnios);

        LocalDate fecha1 = LocalDate.of(2024, 6, 4);
        LocalDate fecha2 = LocalDate.of(2023, 12, 25);

        // Comparar fechas
        boolean esAntes = fecha1.isBefore(fecha2);
        boolean esDespues = fecha1.isAfter(fecha2);
        boolean esIgual = fecha1.isEqual(fecha2);

        // Obtener partes de la fecha
        int anio = fecha1.getYear();
        int mes = fecha1.getMonthValue();
        int dia = fecha1.getDayOfMonth();

        // Ajustar la fecha
        LocalDate nuevaFecha = fecha1.withDayOfMonth(15).withMonth(1).withYear(2023);
        System.out.println("Nueva Fecha ajustada: " + nuevaFecha);




    }
}
