package pattern.singleton;

/**
 *
 * @author Kamil Szestowicki
 */
public enum SingletonEnum {
    GREEN("Green"),
    BLUE("Blue"),
    BLACK("Black"),
    RED("Red");
    
    private String color;

    private SingletonEnum(String color) {
        this.color = color;
    }
    
    public void getInfo(){
        System.out.println("Eyes color: "+ color.toLowerCase());
    }

}
