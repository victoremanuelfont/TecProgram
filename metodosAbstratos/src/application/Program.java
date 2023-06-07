package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangule;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shape: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Shape #"+i+ " data: ");
			System.out.println();
			System.out.print("Rectangule or circle (r/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			String color = sc.nextLine();
			
			if(resp == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				Shape area = new Rectangule(Color.valueOf(color),width,height);
				list.add(area);
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add( new Circle(Color.valueOf(color),radius));
				
			}
		}
		
		System.out.println();
		System.out.print("Shape Areas:");
		System.out.println();
		
		for(Shape resp: list) {
			System.out.println(resp.area());
		}
		
		
		sc.close();
	}

}
