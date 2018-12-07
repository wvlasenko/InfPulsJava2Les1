package prj1;

import java.util.Arrays;

public class PolyGon extends Figure {
private Point [] points;
private Line[]lines;
public PolyGon(Point[]points) {
	this.points=points;
}
@Override
public String toString() {
	return "PolyGon [points=" + Arrays.toString(points) + ", lines=" + Arrays.toString(lines) + "]";
}
}
