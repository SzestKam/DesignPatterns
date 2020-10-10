package pattern.strategy.option;

import pattern.strategy.domain.Knight;

public class MaleKnightsValidator implements KnightValidator{
	
	public boolean validate(Knight knight){
		String name = knight.getName();
		return name.charAt(name.length()-1)!='a';
	}
	
}