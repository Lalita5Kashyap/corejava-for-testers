package ch1_variables;

public class Pro_6_Calculate_Area_of_Circle {

	public static void main(String[] args) {
		//Take one variables radius and Calculate area of circle.
		
		int radius=3;
		double pi=3.14;//value of pi
		double area;
		//logic area = π * r * r
		 area=radius*radius*pi;
		 System.out.print("Area of circle: ");
		 System.out.println(area);
	}

}
