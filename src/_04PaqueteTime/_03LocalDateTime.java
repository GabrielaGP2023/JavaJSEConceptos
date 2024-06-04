package _04PaqueteTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03LocalDateTime {
    public static void main(String[] args) {
                // Obtener la fecha y hora actual
                LocalDateTime fechaHoraActual = LocalDateTime.now();
                System.out.println("Fecha y hora actual: " + fechaHoraActual);

                // Crear una fecha y hora específica
                LocalDate fecha = LocalDate.of(2024, 6, 4);
                LocalTime hora = LocalTime.of(14, 30, 45);
                LocalDateTime fechaHoraEspecifica = LocalDateTime.of(fecha, hora);
                System.out.println("Fecha y hora específica: " + fechaHoraEspecifica);

                // Parsear una fecha y hora a partir de una cadena
                LocalDateTime fechaHoraParseada = LocalDateTime.parse("2024-06-04T14:30:45");
                System.out.println("Fecha y hora parseada: " + fechaHoraParseada);

                // Sumar horas, minutos, segundos, días, meses y años
                LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

                LocalDateTime fechaHoraMasHoras = fechaHora.plusHours(2);
                LocalDateTime fechaHoraMasMinutos = fechaHora.plusMinutes(45);
                LocalDateTime fechaHoraMasSegundos = fechaHora.plusSeconds(30);
                LocalDateTime fechaHoraMasDias = fechaHora.plusDays(10);
                LocalDateTime fechaHoraMasSemanas = fechaHora.plusWeeks(2);
                LocalDateTime fechaHoraMasMeses = fechaHora.plusMonths(3);
                LocalDateTime fechaHoraMasAnios = fechaHora.plusYears(1);

                System.out.println("Fecha y hora original: " + fechaHora);
                System.out.println("Fecha y hora más 2 horas: " + fechaHoraMasHoras);
                System.out.println("Fecha y hora más 45 minutos: " + fechaHoraMasMinutos);
                System.out.println("Fecha y hora más 30 segundos: " + fechaHoraMasSegundos);
                System.out.println("Fecha y hora más 10 días: " + fechaHoraMasDias);
                System.out.println("Fecha y hora más 2 semanas: " + fechaHoraMasSemanas);
                System.out.println("Fecha y hora más 3 meses: " + fechaHoraMasMeses);
                System.out.println("Fecha y hora más 1 año: " + fechaHoraMasAnios);

                // Restar horas, minutos, segundos, días, meses y años
                LocalDateTime fechaHoraMenosHoras = fechaHora.minusHours(2);
                LocalDateTime fechaHoraMenosMinutos = fechaHora.minusMinutes(45);
                LocalDateTime fechaHoraMenosSegundos = fechaHora.minusSeconds(30);
                LocalDateTime fechaHoraMenosDias = fechaHora.minusDays(10);
                LocalDateTime fechaHoraMenosSemanas = fechaHora.minusWeeks(2);
                LocalDateTime fechaHoraMenosMeses = fechaHora.minusMonths(3);
                LocalDateTime fechaHoraMenosAnios = fechaHora.minusYears(1);

                System.out.println("Fecha y hora menos 2 horas: " + fechaHoraMenosHoras);
                System.out.println("Fecha y hora menos 45 minutos: " + fechaHoraMenosMinutos);
                System.out.println("Fecha y hora menos 30 segundos: " + fechaHoraMenosSegundos);
                System.out.println("Fecha y hora menos 10 días: " + fechaHoraMenosDias);
                System.out.println("Fecha y hora menos 2 semanas: " + fechaHoraMenosSemanas);
                System.out.println("Fecha y hora menos 3 meses: " + fechaHoraMenosMeses);
                System.out.println("Fecha y hora menos 1 año: " + fechaHoraMenosAnios);

                // Comparar fechas y horas
                LocalDateTime fechaHora1 = LocalDateTime.of(2024, 6, 4, 14, 30, 45);
                LocalDateTime fechaHora2 = LocalDateTime.of(2023, 12, 25, 12, 25, 30);

                boolean esAntes = fechaHora1.isBefore(fechaHora2);
                boolean esDespues = fechaHora1.isAfter(fechaHora2);
                boolean esIgual = fechaHora1.equals(fechaHora2);

                System.out.println("Fecha y hora 1 es antes que Fecha y hora 2: " + esAntes);
                System.out.println("Fecha y hora 1 es después que Fecha y hora 2: " + esDespues);
                System.out.println("Fecha y hora 1 es igual a Fecha y hora 2: " + esIgual);

                // Obtener partes de la fecha y hora
                int anio = fechaHora1.getYear();
                int mes = fechaHora1.getMonthValue();
                int dia = fechaHora1.getDayOfMonth();
                int horaPart = fechaHora1.getHour();
                int minuto = fechaHora1.getMinute();
                int segundo = fechaHora1.getSecond();

                System.out.println("Año: " + anio);
                System.out.println("Mes: " + mes);
                System.out.println("Día: " + dia);
                System.out.println("Hora: " + horaPart);
                System.out.println("Minuto: " + minuto);
                System.out.println("Segundo: " + segundo);

                // Ajustar la fecha y hora
                LocalDateTime nuevaFechaHora = fechaHora1.withYear(2023).withMonth(1).withDayOfMonth(15).withHour(10).withMinute(15).withSecond(0);
                System.out.println("Nueva Fecha y Hora ajustada: " + nuevaFechaHora);
            }
        }

