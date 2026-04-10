class Assignment 
{
	
	static void Rect(int w,int h){
		System.out.println("Area of Rectangle");
		 int  areaofrect=w*h;
		 System.out.println(areaofrect);
	}
	
	static void square(int a){
		System.out.println("Area of square");
		int area=a*a;
		System.out.println(area);
	}
	static void triangle(int het, int bredth){
		System.out.println("area of Triangle");
		
		double areaoftri=het*0.5*bredth;
		System.out.println(areaoftri);
	}
	static void parllelogram(int b,
		int hei){
		System.out.println("area of Parllelogram");
		
		int arp=b*hei;
		System.out.println(arp);
	}
	static void trapizoid(int aside,
		int bside,
		int hside){
		System.out.println("area of Trapizoid");
		
		double areat=0.5*aside*bside*hside;
		System.out.println(areat);
	}
	static void circle(final double pi,
		int r){
		System.out.println("area of circle");
		
		double araofc=pi*r*r;
		System.out.println(araofc);
	}
	static void ellipse(int aa,
		int bb){
		System.out.println("area of ellipse");
		final double pi=3.142;
		
		double areaofellipse= pi*aa*bb;
		System.out.println(areaofellipse);
	}
	static void sector(int rr,
		double theta){
		System.out.println("area of Sector");
		
		double areaofSector=rr*rr*0.5*theta;
		System.out.println(areaofSector);
	}
	static void multi(int aha,int bha, float cha){
		System.out.println("Multiplication of 3 numbers");
		double multiplication= aha*bha*cha;
		System.out.println(multiplication);
	}
	public static void main(String[] args) 
	{
		
		Rect(3,5);
		square(4);
		triangle(56,2);
		parllelogram(7,12);
		trapizoid(2,4,6);
		circle( 3.142,5);
		ellipse(10,39);
		sector(12,33.4);
		multi(4,5,3.5f);
	}
}