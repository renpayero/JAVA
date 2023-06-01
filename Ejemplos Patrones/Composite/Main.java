
public class Main
{
    public static void main(String[] args)
    {
        // Crear la carpeta principal e insertar archivos
        Carpeta c1 = new Carpeta("CARPETA_1");
        c1.insertarNodo( new Archivo("Archivo1.txt") );
        c1.insertarNodo( new Archivo("Archivo2.txt") );
        c1.insertarNodo( new Archivo("Archivo3.txt") );

        // Crear una subcarpeta e insertar archivos
        Carpeta c2 = new Carpeta("CARPETA_2");
        c2.insertarNodo( new Archivo("Archivo4.txt") );
        c2.insertarNodo( new Archivo("Archivo5.txt") );

        // Insertar la subcarpeta dentro de la principal
        c1.insertarNodo( c2 );

        // Insertar otro archivo dentro de la carpeta principal
        c1.insertarNodo( new Archivo("Archivo6.txt") );

        c1.mostrar();

        System.out.println("--------------------");

        // Eliminamos la subcarpeta (junto con su contenido)
        c1.eliminarNodo( c2 );
        c1.mostrar();
    }
}