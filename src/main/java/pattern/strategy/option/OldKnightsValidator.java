package pattern.strategy.option;

import pattern.strategy.domain.Knight;

public class OldKnightsValidator implements KnightValidator{
	
	public boolean validate(Knight knight){
		
		return knight.getAge()>60;
	}
	
}