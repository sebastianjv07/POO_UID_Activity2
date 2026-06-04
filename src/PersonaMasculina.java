public class PersonaMasculina extends Persona {

    public PersonaMasculina(
            String nombre,
            String apellido,
            String genero,
            int edad) {

        super(nombre, apellido, genero, edad);
    }

    @Override
    public String mostrarTipo() {
        return "Masculino";
    }

}