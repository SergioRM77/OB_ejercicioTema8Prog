public class Encapsulacion {
    static class Persona{
        private String nombre;
        private int edad;
        private int telefono;


        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public int getTelefono() {
            return telefono;
        }
    }

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Pepe Perez");
        persona.setEdad(20);
        persona.setTelefono(66554411);
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());

    }
}
