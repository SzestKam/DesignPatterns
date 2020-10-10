package pattern.factory;

/**
 * @author Kamil Szestowicki
 */
public class ColorFactory extends Factory{

    @Override
    String getShape(String type) {
        return "";
    }

    @Override
    String getColor(String type) {
        switch(type){
            case "B": return "BLACK";
            case "W" : return "WHITE";
            case "R" : return "RED";
            case "G" : return "GREEN";
            default: return "UNKNOWN";
        }
    }

}
