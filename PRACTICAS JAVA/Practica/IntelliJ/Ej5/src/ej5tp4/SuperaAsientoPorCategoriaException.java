package ej5tp4;

public class SuperaAsientoPorCategoriaException extends Exception {
    public SuperaAsientosPorCategoriaException() {
        super("Se supera la cantidad de asientos disponisbles para la categoria del vuelo.");
    }
}
