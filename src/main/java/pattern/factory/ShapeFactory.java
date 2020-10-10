package pattern.factory;

/**
 * @author Kamil Szestowicki
 */
public class ShapeFactory extends Factory{

    @Override
    String getShape(String type) {
        switch(type){
            case "C" : return "CIRCLE";
            case "R" : return "RECTANGLE";
            case "S" : return "SQUARE";
            default: return "UNKNOWN";
        }
    }

    @Override
    String getColor(String type) {
        return "";
    }
    
}
