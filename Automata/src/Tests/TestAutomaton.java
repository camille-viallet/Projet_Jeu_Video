package Tests;

import java.io.IOException;

import Model.automata.Automaton;
import Model.automata.AutomatonState;
import Model.automata.actions.Print;
import Model.automata.conditions.True;
import Model.entities.Entity;
import Utils.Vector2;
import View.Avatar;

public class TestAutomaton {

	public static void main(String[] args) {
		Automaton a = new Automaton();
		AutomatonState s = new AutomatonState("default");
		s.addTransition(s, s, new True(), new Print("a"));
		s.addTransition(s, s, new True(), new Print("b"));
		a.addState(s);
		
		
		Entity e;
		e = new Entity(0, a, null);
		e.step();
		e.step();
		e.step();
		e.step();
	}

}
