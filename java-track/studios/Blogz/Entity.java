package Blogz;

public abstract class Entity {
	private final int uid;
	private static int idPos = 1;

	public Entity() {
		uid = idPos++;
	}

	public int getUid() {
		return uid;
	}
	
	
	
	
}
