package Model;

import java.util.Map.Entry;

import Model.automata.creation.KeyExtension;
import Model.entities.Entity;
import Model.map.Map;
import Model.physics.Newton;

import Utils.SafeMap;
import Utils.SafeMapElement;

import Controller.VirtualInput;

public class World {

	private SafeMap entities;

	private Entity player;
	private VirtualInput inputs;
	private long elapsed;
	private Newton newton;
	public Map map;
	public World(VirtualInput vi) {
		inputs = vi;
		entities = new SafeMap();
		elapsed = 0;
		newton = new Newton();

	}
	
	public void tick(long elapsed) {
		this.elapsed = elapsed;

		entities.update();
		newton.update();

		for(Entry<Long, SafeMapElement> e : entities) {
			((Entity)e.getValue()).step();
		}
		newton.tick(elapsed);
		if(map!=null) map.tick(elapsed);
	}
	public SafeMap getEntities(){
		return entities;
	}
	public long getElapsed() {
		return elapsed;
	}
	public boolean getKey(KeyExtension k) {
		return inputs.getKey(k);
	}
	public void addEntity(Entity entity) {

		long id = entities.add(entity);
		entity.setID(id);
		entity.setWorld(this);
		newton.add(entity.getBody());
	}
	public void removeEntity(long id) {
		Entity pb = ((Entity)entities.get(id));
		newton.remove(pb.getBody());
		entities.remove(id);
	}
	
	public void setPlayer(Entity p) {
		player = p;
	}
	public Entity getPlayer() {
		return player;
	}
	public void setMap(Map m) {
		map = m;
	}
	public VirtualInput getInputs() {
		return inputs;
	}

	public void setInputs(VirtualInput inputs) {
		this.inputs = inputs;
	}	
}
