
public class Baseball {

	private String name;
	private int jersey;
	private boolean batRight;
	private boolean batLeft;
	private int hitsSeason;
	private int rBISeason;
	private int gamesThisSeason;

	
	
	
	/**
	 * @param name
	 * @param jersey
	 * @param batRight
	 * @param batLeft
	 * @param hitsSeason
	 * @param rBISeason
	 * @param gamesThisSeason
	 */
	public Baseball(String name, int jersey, boolean batRight, boolean batLeft) {
		super();
		this.name = name;
		this.jersey = jersey;
		this.batRight = batRight;
		this.batLeft = batLeft;
		this.hitsSeason = 0;
		this.rBISeason = 0;
		this.gamesThisSeason = 0;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the jersey
	 */
	public int getJersey() {
		return jersey;
	}


	/**
	 * @return the batRight
	 */
	public boolean isBatRight() {
		return batRight;
	}


	/**
	 * @return the batLeft
	 */
	public boolean isBatLeft() {
		return batLeft;
	}


	/**
	 * @return the hitsSeason
	 */
	public int getHitsSeason() {
		return hitsSeason;
	}


	/**
	 * @return the rBISeason
	 */
	public int getRBISeason() {
		return rBISeason;
	}


	/**
	 * @return the gamesThisSeason
	 */
	public int getGamesThisSeason() {
		return gamesThisSeason;
	}
	
	public void gameStats(int hits, int rbi) {
		this.gamesThisSeason += 1;
		this.hitsSeason += hits;
		this.rBISeason += rbi;
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Baseball [name=" + name + ", jersey=" + jersey + ", batRight=" + batRight + ", batLeft=" + batLeft
				+ ", hitsSeason=" + hitsSeason + ", rBISeason=" + rBISeason + ", gamesThisSeason=" + gamesThisSeason
				+ "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// name,  jersey,  batRight,  batLeft
		Baseball one = new Baseball("Ozzie", 1, true, false);
		System.out.println(one);
		one.gameStats(3, 1);
		System.out.println(one);

	}

}
