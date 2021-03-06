package Model.entities;

import java.awt.Color;
import java.awt.geom.AffineTransform;

import Controller.VirtualInput;
import Model.automata.creation.DirectionExtension;
import Model.entities.weapon.Dagger;
import Model.entities.weapon.Gun;
import Model.entities.weapon.Weapon;
import Model.loader.AutomataLoader;
import Model.physics.ColliderType;
import Model.physics.HitBox;
import Model.physics.PhysicsBody;
import Model.physics.PrimitiveInstance;
import Model.physics.primitives.Circle;
import Utils.Vector2;

public class Player extends LivingEntity {
	public Weapon armeCac;
	public Weapon armeDist;
	private double lastAttack;
	private double still;
	private double lastAttackFrequency;

	public Player() {
		super(AutomataLoader.get("Player"), 1);
		still = 0;
		this.acceleration = 100.0f;
		HitBox h = new HitBox();
		PrimitiveInstance prim = new PrimitiveInstance(new Circle(), AffineTransform.getScaleInstance(6.25f, 8.8f));
		prim.get_transform().translate(0.0f, 0.05f);
		h.add(prim);

		this.body = new PhysicsBody(h, ColliderType.Character, 15.0f, 47.0f, this);
		
		armeCac = new Dagger(); // to change please
		armeDist = new Gun("Bullet");

		lastAttack = System.currentTimeMillis();
		lastAttackFrequency = armeDist.getShot_frequency();

		this.life = 1000;
		//System.out.println("Dagger" + armeCac.toString());

	}

	public void setArmeCac(Weapon armeCac) {
		this.armeCac = armeCac;
	}

	public void setArmeDist(Weapon armeDist) {
		this.armeDist = armeDist;
	}

	public void tick(long elapsed) {
//		this.getBody().getTransform().rotate(0.002*elapsed);
		still += elapsed;
		if(still > 3000) {
			still = 0;
			this.life-= this.life/10+1;
		}
	}

	@Override
	public boolean step() {
		// Check to destroy dagger strick
		double now = System.currentTimeMillis();
		if (this.daggerStrike != null && now - lastAttack > 125) {
			//System.out.println("Remove daggerStrick from player: " );
			this.world.removeEntity(daggerStrike.getID());
			daggerStrike = null;
		}
		if (this.ShotStrike != null && now - lastAttack > 8000) {
			//System.out.println("Remove ShotStrick from player: " );
			this.world.removeEntity(ShotStrike.getID());
			ShotStrike = null;
		}
		rotate();
		return super.step();
	}

	protected void rotate() {
		VirtualInput keyboard = this.world.getInputs();

		try {
			// mouse angle relative to the player
			double relativeAngle = Math.atan2(-keyboard.getMousePlayer().y, -keyboard.getMousePlayer().x);

			// substract the players current angle and rotate
			relativeAngle -= Math.atan2(getTransform().getShearY(), getTransform().getScaleY());
			getTransform().rotate(relativeAngle + Math.PI / 2);

		} catch (NullPointerException e) {
		}
	}

	/**
	 * Hand to hand attack
	 */
	@Override

	public void Wizz(DirectionExtension dir) {
		double now = System.currentTimeMillis();
		if(now - lastAttack> armeCac.getShot_frequency()) {
			lastAttack = now;
			this.daggerStrike = armeCac.attack(this, new Vector2(0, 1));

		}
	}

	/**
	 * Distance attack
	 */
	@Override
	public void Pop(DirectionExtension dir) {
		// Distance attack
		double now = System.currentTimeMillis();
		
		if(now - lastAttack> armeDist.getShot_frequency()) {
			lastAttack = now;
			this.ShotStrike = armeDist.attack(this, new Vector2(0, 1));

		}
	}

	@Override
	public boolean GotPower() {

		double now = System.currentTimeMillis();
		if ((now - lastAttack) > lastAttackFrequency) {
			return true;
		}
		return false;
	}

	@Override
	public Color getColor() {
		return Color.blue;
	}

	@Override
	public void Egg(DirectionExtension dir) {
		new DeadEntity(this, AutomataLoader.get("Dead"), team, 350, "DeadExplosion");
		this.getWorld().removeEntity(getID());
	}

	@Override
	public boolean hasLifeBar() {
		return true;
	}
	
	public void Move(DirectionExtension dir) {
		still = 0;
		super.Move(dir);
	}

}
