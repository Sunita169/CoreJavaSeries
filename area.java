import java.util.*;
class Area{
static void areaTriangle(){
	int base=6;
	int height=8;
	double resOfTri=(0.5*base*height);
	System.out.println("The area of triangle is " + resOfTri);
 }
 static void areaSquare(){
	int a=5;
	double resOfSq=a*a;
	System.out.println("The area of square is " + resOfSq);
 }
 static void areaRectangle(){
	int length=6;
	int breadth=12;
	double resOfRect=length*breadth;
	System.out.println("The area of rectangle is " + resOfRect);
 }
 static void areaParallelogram(){
	int bp=6;
	int hp=8;
	double resOfPar=bp*hp;
	System.out.println("The area of parallelogram is " + resOfPar);
 }
 static void areaTrapezoid(){
	int bt=6;
	int ht=8;
	int at=4;
	double resOfTrap=(0.5*(at+bt)*ht);
	System.out.println("The area of Trapezoid is " + resOfTrap);
 }
 static void areaCircle(){
	double rad=6;
	final double pi=3.142;
	double resOfCir=(pi*rad*rad);
	System.out.println("The area of circle is " + resOfCir);
 }
 static void areaEclipse(){
	final double pi=3.142;
	int be=6;
	int ae=8;
	double resOfEcl=(pi*be*ae);
 System.out.println("The area of triangle is " + resOfEcl);
 }
 static void areaSector(){
	 final double pi=3.142;
 double angle=60.0;
 double radius=8;
 double resOfSec=(pi*radius*radius*angle)/360.0;
 System.out.println("The area of Sector is " + resOfSec);
 }
 public static void main(String[] args){
  areaTriangle();
  areaSquare();
  areaRectangle();
  areaParallelogram();
  areaTrapezoid();
  areaCircle();
  areaEclipse();
  areaSector();
  }
  }