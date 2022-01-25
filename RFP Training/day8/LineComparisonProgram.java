/*Line Comparison Program */
package com.bridgelabz.demo;

public class LineComparisonProgram {
    Point p1, p2;
    LineComparisonProgram (Point point1, Point point2) {
        this.p1 = point1;
        this.p2 = point2;
    }
    public double getLength() {
        return Math.sqrt(
            (p1.getX() - p2.getX()) *  (p1.getX() - p2.getX()) + 
            (p1.getY() - p2.getY()) *  (p1.getY() - p2.getY())
        );
    }
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparsion Computation Program on Main Branch");
		Point p1 = new Point(2.0,2.0);
		Point p2 = new Point(5.0,6.0);
		LineComparisonProgram lcp1 = new LineComparisonProgram (p1,p2);
        double line1 = lcp1.getLength(); 
        System.out.println ("Length of first line   = " +line1);
        
        Point p3 = new Point(2.0,2.0);
		Point p4 = new Point(5.0,6.0);
		LineComparisonProgram lcp2 = new LineComparisonProgram (p3,p4);
        double line2 = lcp2.getLength();        
        System.out.println ("Length of second line   = " +line2);
        
        Point p5 = new Point(3.0,4.0);
		Point p6 = new Point(9.0,12.0);
		LineComparisonProgram lcp3 = new LineComparisonProgram (p5,p6);
        double line3 = lcp3.getLength();
        System.out.println ("Length of third line   = " +line3);
        
        Double length1 = Double.valueOf(line1);
        Double length2 = Double.valueOf(line2);
        Double length3 = Double.valueOf(line3);
        
        if(length1.equals(length2)) {
        	System.out.println("Lines 1 and 2 are Equal");
        }
        else {
        	System.out.println("Lines 1 and 2 are NOT Equal");
        }
        
        if(length2.equals(length3)) {
        	System.out.println("Line 2 and 3 are Equal");
        }
        else {
        	System.out.println("Line 2 and 3 are NOT Equal");
        }
        
		if(length1.compareTo(length3) == 0) {
			System.out.println("Line 1 and 3 are of the same length");
		}
		else if(length1.compareTo(length3) > 0) {
			System.out.println("Length of Line 1 is greater than Line 3");
		}
		else {
			System.out.println("Length of Line 1 is less than Line 3");
		}
	}
}


