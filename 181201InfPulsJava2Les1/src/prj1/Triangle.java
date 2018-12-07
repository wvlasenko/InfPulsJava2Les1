package prj1;

public class Triangle extends Figure {
	Point apexA;
	Point apexB;
	Point apexC;
	private Line sideAB;
	private Line sideBC;
	private Line sideAC;

	public Triangle(Point apexA, Point apexB, Point apexC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
	
		 sideAB = new Line(apexA, apexB);
		 sideAC = new Line(apexA, apexC);
		 sideBC = new Line(apexB, apexC);
		
	}

	public Triangle(Line sideAB, Line sideBC, Line sideAC) {
		super();
		this.sideAB = sideAB;
		this.sideBC = sideBC;
		this.sideAC = sideAC;
	}

	public Line getSideAB() {
		if (sideAB == null)
			sideAB = new Line(apexA, apexB);
		return sideAB;
	}

	public Line getSideBC() {
		if (sideBC == null)
			sideBC = new Line(apexB, apexC);
		return sideBC;
	}

	public Line getSideAC() {
		if (sideAC == null)
			sideAC = new Line(apexA, apexC);
		return sideAC;
	}

	@Override
	public String toString() {
		return "Triangle [sideAB=" + sideAB + ", sideBC=" + sideBC + ", sideAC=" + sideAC + "]";
	}

	

	

	

	
	}

	

	


	
	

