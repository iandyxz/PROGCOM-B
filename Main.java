public class Main {
    public static void main(String[] args) {
        //Crear una variable tipo String y almacenar sus nombres
        String name = "Andrés Felipe";
        //Crear una variable tipo String y almacenar sus apellidos
        String lastname = "Jaime Lizcano";
        //Crear una variable tipo char y almacenar la primera letra de su nombre
        char letter = name.charAt(0);
        //Imprimir "Mi nombre es: "(nombres)(apellidos)
        System.out.println("Mi nombre es: "+name+" "+lastname);
        //Crear una variable tipo int y almacenar la edad
        int age = 18;
        //Crear una variable tipo double y almacenar la estatura
        double height = 1.75;
        //Imprimir "Tengo: "(edad) " años, y mido: "(estatura)
        System.out.println("Tengo: "+age+" años, y mido: "+height+" metros");
        //Crear una variable tipo boolean que almacene y diga si eres mayor o menor de edad
        boolean mayor_edad = true;
        //Si la variable es "true" imprimir que eres mayor de edad, de lo contrario, imprimir que eres menor de edad
        System.out.print("Soy mayor de edad");
    }
}