import java.util.Scanner;

public class MainPersonas {

    //recopilar nombre apellido geneero y edad de 5 personas
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Persona[] personas = new Persona[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("PERSONA " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Apellido: ");
            String apellido = entrada.nextLine();

            System.out.print("Genero (Masculino/Femenino): ");
            String genero = entrada.nextLine();

            System.out.print("Edad: ");
            int edad = entrada.nextInt();

            entrada.nextLine();

            if (genero.equalsIgnoreCase("Masculino")) {

                personas[i] = new PersonaMasculina(
                        nombre,
                        apellido,
                        genero,
                        edad);

            } else {

                personas[i] = new PersonaFemenina(
                        nombre,
                        apellido,
                        genero,
                        edad);
            }

            System.out.println();
        }

    //llamar metodos
    mostrarNombreGenero(personas);

    System.out.println();

    System.out.println("Promedio de edades: "
                + promedioEdad(personas));

    System.out.println("Cantidad Masculinos: "
                + contarMasculinos(personas));

    System.out.println("Cantidad Femeninos: "
                + contarFemeninos(personas));

    }

    //metodo1 mostrar personas
    public static void mostrarNombreGenero(Persona[] personas) {

        System.out.println("\n***PERSONAS REGISTRADA***");

        for (Persona persona : personas) {

            System.out.println(
                    persona.getNombre()
                            + " - "
                            + persona.getGenero()
            );
        }
    }

    //metodo2 promedio de edades
    public static double promedioEdad(Persona[] personas) {

        int suma = 0;

        for (Persona persona : personas) {

            suma += persona.getEdad();

        }

        return (double) suma / personas.length;
    }

    //metodo3 cantidad de masculinos
    public static int contarMasculinos(Persona[] personas) {

        int contador = 0;

        for (Persona persona : personas) {

            if (persona.getGenero().equalsIgnoreCase("Masculino")) {

                contador++;

            }

        }

        return contador;
    }

    //metodo_cuatro cantidad de feneminos
    public static int contarFemeninos(Persona[] personas) {

        int contador = 0;

        for (Persona persona : personas) {

            if (persona.getGenero().equalsIgnoreCase("Femenino")) {

                contador++;

            }

        }

        return contador;
    }

}