package org.server.region;

import java.awt.Point;
import java.awt.geom.Arc2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestDistance {
	public static void main(String[] args) {
		Point2D.Float p1 = new Point2D.Float(1, 2);
		List<Point> pl = new ArrayList<Point>(100000);
		Random r = new Random();
		for (int i = 0; i < 100000; i++) {
			pl.add(new Point(Math.abs(r.nextInt(100)), Math.abs(r.nextInt(100))));
		}

		long t1 = System.nanoTime();

		for (Point p : pl) {
			p1.distance(p);
			// System.out.println();
		}

		System.out.println((System.nanoTime() - t1) / 10000);

		Arc2D.Float arc2d = new Arc2D.Float(15, 20, 35, 35, 90, 30, 1);
		System.out.println(arc2d.contains(new Point(15, 18)));

	}
}
