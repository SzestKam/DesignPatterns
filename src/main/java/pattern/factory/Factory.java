package pattern.factory;

/**
 * @author Kamil Szestowicki
 */
abstract class Factory {

    abstract String getShape(String type);
    abstract String getColor(String type);
    
}
