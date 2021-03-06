package Model.monster_generator;

import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.World;
import Model.entities.enemies.Flamethrower;
import Model.entities.enemies.Mecha;
import Model.entities.enemies.Plane;
import Model.entities.enemies.Tank;
import Model.loader.TemplatesLoader;
import View.Avatar;
import View.Template;

public class Generator {
	int difficulty;
	World w;
	float dim;
	int nb_weapon;
	List<Integer> w_sort;
	
	
	public Generator(World w, float dim, int dif) {
		this.w = w;
		this.dim = dim;
		this.difficulty = dif;
		this.nb_weapon=15;
		w_sort = new ArrayList<Integer>();
		
	}
	
	public void spawn_cover() throws IOException {
		//weapon choice
		int nb;
		do {
			nb=(int)( Math.random()*this.nb_weapon);
		}
		while(w_sort.contains(nb));
		//System.out.println("New box with a weapon has appeared");
		//location choose
		
		double x, y;
		double x_p = w.getPlayer().getXRelatif();
		double y_p = w.getPlayer().getYRelatif();
		do {
			x = Math.random() * 2 * w.getGame_w() - w.getGame_w(); 
            y = Math.random() * 2 * w.getGame_h() - w.getGame_h();
		}
		// not spawn if it's to close
		while (!(x < x_p + 80 && x > x_p - 80) || (y < y_p + 80 && y > y_p - 80));
		Weapon_cover weapon=new Weapon_cover(nb,w, x, y);
	}
	
	public int new_wave(int level) throws IOException {
		//System.out.println("New enemy has appeared");

		int nb_monster = this.difficulty * level * 2;
		//int nb_monster = 0;
		double x, y;
		double x_p = w.getPlayer().getXRelatif();
		double y_p = w.getPlayer().getYRelatif();
		int toRet = nb_monster;
		spawn_cover();
		while (nb_monster > 0) {
			// get a random coordinate
			do {
				x = Math.random() * 2 * w.getGame_w() - w.getGame_w(); 
	            y = Math.random() * 2 * w.getGame_h() - w.getGame_h();
			}
			// not spawn if it's to close
			while (!(x < x_p + 90 && x > x_p - 90) || (y < y_p + 90 && y > y_p - 90));
			// spawn a ennemy her
			spawn(x, y, level);
			nb_monster--;

		}
		return toRet;

	}

	public void spawn(double x, double y, int level) throws IOException {
		
		// spawn probability of each enemy
		double p_plane = Math.log(level) * 0.1;
		double p_tank = 0.3 * (1 - p_plane);
		double p_snake = 0.4 * (1 - p_plane);
		double p_oie = 0.3 * (1 - p_plane);
		// somme proba=1
		double b1 = p_tank;
		double b2 = b1 + p_plane;
		double b3 = b2 + p_snake;
		double random_enemy = Math.random();

		if (random_enemy < b1) {
			Tank tank = new Tank("Tank");
			Template tmpTank = TemplatesLoader.get("Tank");
			new Avatar(tank, tmpTank);
			tank.getTransform().concatenate(AffineTransform.getTranslateInstance(x, y));
			w.addEntity(tank);
		} else if (random_enemy > b1 && random_enemy < b2) {
			Plane plane = new Plane("Plane");
			Template tmpPlane = TemplatesLoader.get("Plane");
			new Avatar(plane, tmpPlane);
			plane.getTransform().concatenate(AffineTransform.getTranslateInstance(x, y));
			w.addEntity(plane);
		} else if (random_enemy > b2 && random_enemy < b3) {
			Mecha mecha = new Mecha("Mecha");
			Template tmpSnake = TemplatesLoader.get("Mecha");
			new Avatar(mecha, tmpSnake);
			mecha.getTransform().concatenate(AffineTransform.getTranslateInstance(x, y));
			w.addEntity(mecha);
		} else if (random_enemy > b3) {
			Flamethrower flamethrower = new Flamethrower("Flamethrower");
			Template tmpDuck = TemplatesLoader.get("Flamethrower");
			new Avatar(flamethrower, tmpDuck);
			flamethrower.getTransform().concatenate(AffineTransform.getTranslateInstance(x, y));
			w.addEntity(flamethrower);
		}

	}

}

