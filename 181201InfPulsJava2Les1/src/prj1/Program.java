package prj1;

public class Program {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 6);
		Point p3 = new Point(8, 12);
		System.out.println(p1);
		System.out.println(p2);
		ColorPoint cp1 = new ColorPoint(2, 3, 333333);
		ColorPointAgr cp2 = new ColorPointAgr(p1, 444444);
		System.out.println(cp1);
		System.out.println(cp2);
		Line Ln1 = new Line(p1, p2);
		System.out.println(Ln1);
		Line Ln2 = new Line(1, 3, 8, 9);
		System.out.println(Ln2);
		Line Ln3 = new Line(new Point(8, 9), new Point(12, 3));
		Line Ln4 = new Line(Ln2.getBegin(), Ln3.getEnd());
		ColorLine cLn1 = new ColorLine(p1, p2, 333333);
		System.out.println(cLn1);
		Triangle t1 = new Triangle(new Point(1, 1), new Point(4, 2), new Point(1, 6));
		Line Ln5 = new Line(2, 1, 4, 3);
		Line Ln6 = new Line(4, 3, 2, 4);
		Line Ln7 = new Line(2, 1, 2, 4);
		Triangle t2 = new Triangle(Ln5, Ln6, Ln7);
		System.out.println(t2);
		Point[] pnArr = { p1, p2, cp1, new Point(8, 3) };
		PolyGon pg1 = new PolyGon(pnArr);
		// System.out.println(pg1);
		System.out.println("*******************************************************");
		Figure[] masObj = new Figure[6];
		masObj[0] = p1;
		masObj[1] = p2;
		masObj[2] = Ln1;
		masObj[3] = Ln4;
		masObj[4] = t1;
		masObj[5] = pg1;
		for (int i = 0; i < masObj.length; i++) {
			System.out.println(masObj[i]);
		}
	}
}
