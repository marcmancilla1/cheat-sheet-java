




public class StringChuleta {
    public static void main(String[] args) {

        var nombre2 = new String("hola que tal");
        String nombre = "hola que tal";

        System.out.print(nombre == nombre2);
        System.out.println(nombre.length()); //longitud

        System.out.println(nombre.charAt(12 - 1)); //caracter

        System.out.println(nombre.substring(2, 8)); // de una parte a otra

        System.out.println(nombre.toUpperCase()); // mayusculas (Lower minusculas)

        System.out.println("Hola java".contains("Hola")); //contiene?

        System.out.println(nombre.equalsIgnoreCase("HOLA QUE tal"));

        System.out.println("hola me llamo marc          ".trim()); // espacios final y principios (elimina)

        //replace
        System.out.println(" hola me llamo    brais".replace(" m", "/"));

        // forrmat

        var age = 37;
        System.out.println(String.format("Hola %d mi nombre tengo 37 años", age));

    }
}
