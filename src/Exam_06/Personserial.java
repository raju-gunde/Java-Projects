package Exam_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class Personserial {
	public static void main(String[] args) throws IOException, ClassNotFoundException   {
		var fout=new FileOutputStream("C:\\Users\\user\\OneDrive\\New\\arjun");
		var oos = new ObjectOutputStream(fout);
		
		try(fout;oos;) {
			
			Person p1=new Person("rahul", 30, "raju@9347");
			oos.writeObject(p1);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
		System.out.println("Object stored successfully");
		
		}
	}


