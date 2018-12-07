package prj1;

public class ColorPoint extends Point {
	private int color;

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", toString()=" + super.toString() + "]";
	}

}
