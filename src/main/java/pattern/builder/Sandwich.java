package pattern.builder;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Sandwich {
    private String breadType;
    private String hamType;
    private boolean cheese;
    private boolean ketchup;
    private boolean vegetables;
}
