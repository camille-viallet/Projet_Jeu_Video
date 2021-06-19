package Model.entities;

import java.awt.geom.AffineTransform;

import Model.World;
import Model.automata.Automaton;
import Model.automata.creation.CategoryExtension;
import Model.automata.creation.DirectionExtension;
import Model.loader.AutomataLoader;
import Model.map.Map;
import Model.physics.HitBox;
import Model.physics.PhysicsBody;
import Model.physics.PrimitiveInstance;
import Model.physics.primitives.Circle;

public class Wall extends Entity{
	
	private boolean alive;

	public Wall() {
		super(AutomataLoader.get("Wall"));
		this.acceleration = 80.0f;
		HitBox h = new HitBox();
		h.add(new PrimitiveInstance(new Circle(), AffineTransform.getScaleInstance(3.1f, 5.2f)));
		this.body = new PhysicsBody(h, 0.0f, 0.0f);
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	public boolean GotPower(Map map, int i, int j) {
		int cmpt = 0;

		for (int k = -1 ; k <= 1 ; k++) {
			for (int l = -1 ; l <= 1 ; l ++) {
				if (k==0 && l==0 && ((Wall)map.get(i+k, j+l)).getAlive()) {
					if (++cmpt == 4) 
						return true;
				}
			}
		}
		return false;
	}
	
	public void Throw(DirectionExtension dir, CategoryExtension categorie) {
		if (categorie == CategoryExtension.O) {
			setAlive(true);
		}
		else setAlive(false);
	}
	
	public void setAlive(boolean state) {
		alive = state;
	}
	
	
}
