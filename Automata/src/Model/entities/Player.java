package Model.entities;

import Controller.VirtualInput;
import Model.World;
import Model.automata.creation.DirectionExtension;
import Model.automata.weapon.Weapon;
import Model.automata.weapon.dagger;
import Model.automata.weapon.gun;

public class Player extends Entity{
	public Weapon armeCac;
	public Weapon armeDist;

	
	public Player(World w) {
		super(Tests.TestParseur.loadAutomata("Bots/Player.gal").get(0), w);
		armeCac = new dagger(500000); //to change please
		armeDist = new gun(5000);
	}

	
	public void setArmeCac(Weapon armeCac) {
		this.armeCac = armeCac;
	}

	public void setArmeDist(Weapon armeDist) {
		this.armeDist = armeDist;
	}

	

	@Override
	public void Hit(DirectionExtension dir) {
		// attaque corp à corps
		System.out.println("Hit");
		super.Hit(dir);
		VirtualInput christianClavier = this.world.getInputs();
		armeCac.attack(this, christianClavier.getMouseX(), christianClavier.getMouseY());
		
	}


	@Override
	public void Pop(DirectionExtension dir) {
		// tir arme distance
		System.out.println("Pop" + dir);
		super.Pop(dir);
		VirtualInput christianClavier = this.world.getInputs();
		armeDist.attack(this, christianClavier.getMouseX(), christianClavier.getMouseY());
	}
	
	
	

}
