package baseFileHandling;

import java.io.File;
import java.io.IOException;
public class FileCreation {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\fileE.txt");
//		if(f1.mkdir()) {
//			System.out.println("File created");
//		}
//		else {
//			System.out.println("File not created");
//		}
//		if(f1.exists()) {
//			System.out.println("File exists");
//		}
//		else {
//			System.out.println("File is not exists");
//		}
		if(f1.delete()) {
			System.out.println("File deleted");
		}
		else {
			System.out.println("File not deleted");
		}
	}
}
