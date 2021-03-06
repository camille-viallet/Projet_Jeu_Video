package Utils;

import Model.automata.creation.DirectionExtension;

public class Functions {

	private static final Vector2[] movIdx = { new Vector2(0.0f, 1.0f), new Vector2(1.0f, 1.0f), new Vector2(1.0f, 0.0f),
			new Vector2(1.0f, -1.0f), new Vector2(0.0f, -1.0f), new Vector2(-1.0f, -1.0f), new Vector2(-1.0f, 0.0f),
			new Vector2(-1.0f, 1.0f) };

	public static Vector2 getAbsoluteDir(DirectionExtension dir) {
		return movIdx[dir.ordinal() - 4].normalize();
	}

	public static Vector2 getRelativeDir(DirectionExtension dir, Vector2 relativeDir) {
		Vector2 vect = movIdx[dir.ordinal() * 2 + 1];
		return new Vector2(vect.x * relativeDir.x, vect.y * relativeDir.y).normalize();
	}
	
	public static float pfmod(float x, float m) {
		return (((x % m) + m) % m);
	}
}
