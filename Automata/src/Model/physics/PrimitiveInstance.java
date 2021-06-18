package Model.physics;

import java.awt.geom.AffineTransform;

import Model.physics.primitives.Primitive;

public class PrimitiveInstance {

	public Primitive prim;
	public AffineTransform transform;
	
	public PrimitiveInstance(Primitive p, AffineTransform t) {
		prim = p;
		this.transform = t;
	}
	
	public Primitive get_prim() {
		return prim;
	}
	
	public AffineTransform get_transform() {
		return transform;
	}
	
}
