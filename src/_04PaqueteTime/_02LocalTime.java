package _04PaqueteTime;

import java.time.LocalTime;

public class _02LocalTime {
    public static void main(String[] args) {


                // Obtener la hora actual
                LocalTime horaActual = LocalTime.now();
                System.out.println("Hora actual: " + horaActual);

                // Crear una hora específica
                LocalTime horaEspecifica = LocalTime.of(14, 30, 45); // Hora, minuto, segundo
                System.out.println("Hora específica: " + horaEspecifica);

                // Parsear una hora a partir de una cadena
                LocalTime horaParseada = LocalTime.parse("14:30:45.54");
                System.out.println("Hora parseada: " + horaParseada);

                LocalTime hora = LocalTime.of(14, 30, 45);

                // Sumar horas, minutos y segundos
                LocalTime horaMasHoras = hora.plusHours(2);
                LocalTime horaMasMinutos = hora.plusMinutes(45);
                LocalTime horaMasSegundos = hora.plusSeconds(30);

                System.out.println("Hora original: " + hora);
                System.out.println("Hora más 2 horas: " + horaMasHoras);
                System.out.println("Hora más 45 minutos: " + horaMasMinutos);
                System.out.println("Hora más 30 segundos: " + horaMasSegundos);

                // Restar horas, minutos y segundos
                LocalTime horaMenosHoras = hora.minusHours(2);
                LocalTime horaMenosMinutos = hora.minusMinutes(45);
                LocalTime horaMenosSegundos = hora.minusSeconds(30);

                System.out.println("Hora menos 2 horas: " + horaMenosHoras);
                System.out.println("Hora menos 45 minutos: " + horaMenosMinutos);
                System.out.println("Hora menos 30 segundos: " + horaMenosSegundos);

                // Comparar horas
                LocalTime hora1 = LocalTime.of(14, 30, 45);
                LocalTime hora2 = LocalTime.of(12, 25, 30);

                boolean esAntes = hora1.isBefore(hora2);
                boolean esDespues = hora1.isAfter(hora2);
                boolean esIgual = hora1.equals(hora2);

                System.out.println("Hora 1 es antes que Hora 2: " + esAntes);
                System.out.println("Hora 1 es después que Hora 2: " + esDespues);
                System.out.println("Hora 1 es igual a Hora 2: " + esIgual);

                // Obtener partes de la hora
                int horaPart = hora1.getHour();
                int minuto = hora1.getMinute();
                int segundo = hora1.getSecond();

                System.out.println("Hora: " + horaPart);
                System.out.println("Minuto: " + minuto);
                System.out.println("Segundo: " + segundo);

                // Ajustar la hora
                LocalTime nuevaHora = hora1.withHour(10).withMinute(15).withSecond(0);
                System.out.println("Nueva Hora ajustada: " + nuevaHora);
            }
        }



