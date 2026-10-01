package domain;

public class NeoFlixException extends Exception {
    public static final String CONTENT_EMPTY = "El contenido no tiene elementos";
    public static final String VALUE_UNKNOWN = "El valor es desconocido";
    public static final String DATA_ERROR = "Los datos son inconsistentes";
    public static final String TO_BE_IMPLEMENTED = "Funcionalidad por implementar";
    
    /**
     * Constructor del mensaje para las excepciones
     */
    public NeoFlixException(String message) {
        super(message);
    }
}