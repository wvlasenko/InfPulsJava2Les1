package prj1;

public class Program {

	public static void main(String[] args) {
		Point p = new Point(1, 2);
		Point p2 = new Point(3, 6);
		Point p3 = new Point(8, 12);
		// System.out.println(p);

		Line l1 = new Line(p, p2);
		// System.out.println(l1);
		Line l2 = new Line(1, 3, 8, 9);
		Line l3 = new Line(new Point(8, 9), new Point(12, 3));
		Line l4 = new Line(l2.getBegin(), l3.getEnd());
		Triangle t1 = new Triangle(new Point(1, 1), new Point(4, 2), new Point(1, 6));
		// System.out.println("t1 " + t1);
		Line l5 = new Line(2, 1, 4, 3);
		Line l6 = new Line(4, 3, 2, 4);
		Line l7 = new Line(2, 1, 2, 4);
		Triangle t2 = new Triangle(l5, l6, l7);
		// System.out.println("t2 "+ t2);
		Figure[] masObj = new Figure[5];
		masObj[0] = p;
		masObj[1] = p2;
		masObj[2] = l1;
		masObj[3] = l4;
		masObj[4] = t1;
		for (int i = 0; i < masObj.length; i++) {
			System.out.println(masObj[i]);
		}
	}
}
