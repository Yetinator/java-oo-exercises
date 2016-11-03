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
	
	public Boolean equals(Entity other){
		if(this.getClass() != other.getClass())
			return false;
		
		if(this.getUid() == other.getUid())
			return true;
		else
			return false;
	}
	
	
	
}
