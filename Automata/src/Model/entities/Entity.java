package Model.entities;

import Model.World;
import Model.automata.Automaton;
import Model.automata.creation.StateExtension;
import Utils.Vector2;

public class Entity {
	protected StateExtension state;
	protected Automaton automaton;
	protected World world;
	protected int id;
	protected Vector2 pos;
	protected Vector2 velocity;
	
	public Entity(int id, Automaton a, World w, Vector2 p) {
		this.id = id;
		automaton = a;
		world = w;
		pos = p;
		
	}
	public int getID() {
		return id;
	}
	public StateExtension getState() {
		return state;
	}
	public void setState(StateExtension state) {
		this.state = state;
	}
	public boolean step() {
		return automaton.step(this);
	}
}
