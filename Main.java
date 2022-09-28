import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Este programa coge tu nombre y edad y lo muestra por pantalla
        String nombre;
        int edad;

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Hola mundo");

        System.out.print("Dime tu nombre: ");
        nombre = entradaTeclado.nextLine();
        System.out.println("Dime tu edad: ");
        edad = entradaTeclado.nextInt();

        System.out.print("Hola "+nombre+", tu edad es: "+edad);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatter);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println(String.format("%d años, %d meses y %d días",
                edad.getYears(),
                edad.getMonths(),
                edad.getDays()));
        
    }

}