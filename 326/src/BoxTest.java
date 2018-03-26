class Box {
	int x;
	int y;
	int z;
	Boolean emt = false;

	private int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	private int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	private int getZ() {
		return z;
	}

	private void setZ(int z) {
		this.z = z;
	}

	private Boolean getEmt() {
		return emt;
	}

	private void setEmt(Boolean emt) {
		this.emt = emt;
	}

	public Box() {
		x = 0;
		y = 0;
		z = 0;
		emt = true;
	}

	public Box(int w, int l, int h) {
		x = w;
		l = y;
		h = z;
		emt = true;
	}

}