package Model.monster_generator;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Model.World;
import Model.entities.Entity;
import Model.entities.enemies.Plane;
import Model.entities.weapon.*;
import Model.loader.AutomataLoader;
import Model.loader.TemplatesLoader;
import Model.physics.ColliderType;
import Model.physics.HitBox;
import Model.physics.PhysicsBody;
import Model.physics.PrimitiveInstance;
import Model.physics.primitives.Circle;
import Model.physics.primitives.Square;
import View.Avatar;
import View.Template;


public class Weapon_cover extends Entity {
	Weapon w;
	protected ArrayList<Integer> numeroArme;

	public Weapon_cover(int nb_weapon,World world,double x,double y) throws IOException {
	
		super(AutomataLoader.get("Dead"), 4);
		
	
		numeroArme = new ArrayList<Integer>();
		
		HitBox h = new HitBox();
		h.add(new PrimitiveInstance(new Square(), AffineTransform.getScaleInstance(5,5)));
		this.body = new PhysicsBody(h, ColliderType.Area, 15.0f, 40.0f, this);
		w = randomWeapon(); 
		Template tmpPlane = TemplatesLoader.get("WeaponCover");
		new Avatar(this, tmpPlane);
		this.getTransform().concatenate(AffineTransform.getTranslateInstance(x,y));
		world.addEntity(this);
	}

	private Weapon randomWeapon() {
		int nbItems = enum_weapon.values().length;
	    Random r = new Random();
        int random = r.nextInt(6);
        enum_weapon weaponSel = enum_weapon.values()[random];
        Weapon weaponToRet = WeaponInTheBox(weaponSel);
		//System.out.println("\n " + weaponToRet.toString());
		return weaponToRet;
	}

	private Weapon WeaponInTheBox(enum_weapon weaponSel) {
		Weapon toRet = null;
		switch (weaponSel) {
		case AssaultRifle :
			return new AssaultRifle("Bullet");
		case Halberd :
			return new Halberd();
		case MachineGun :
			return new MachineGun("Bullet");
		case Pistol :
			return new Pistol("Bullet");
		case Shotgun :
			return new Shotgun("Bullet");
		case Sniper :
			return new Sniper("Bullet");
		default:
			System.out.println("Erreur reconnaissance de l'arme al??atoire dans Weapon_cover");
			return null;
		}
	}

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}
	
	@Override
	public Color getColor() {
		return new Color(255, 180, 0);
	}

}
