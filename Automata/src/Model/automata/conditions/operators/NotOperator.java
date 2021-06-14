package Model.automata.conditions.operators;

import Model.Entity;
import Model.automata.conditions.Condition;

public class NotOperator extends Condition{
	public Condition elm;
	
	

	public NotOperator(Condition elm) {
		this.elm = elm;
	}



	@Override
	public boolean eval(Entity entity) {
		// TODO Auto-generated method stub
		return !elm.eval(entity);
	}

	
}
