public class PersonaFemenina extends Persona {

    public PersonaFemenina(
            String nombre,
            String apellido,
            String genero,
            int edad) {

        super(nombre, apellido, genero, edad);
    }

    @Override
    public String mostrarTipo() {
        return "Femenino";
    }

}