package Exam_06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class PersonDeserial {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		var fin=new FileInputStream("C:\\Users\\user\\OneDrive\\New\\arjun");
        var ios=new ObjectInputStream(fin);
        try(fin;ios){
        	Person p=(Person)ios.readObject();
        	System.out.println(p);
        }
        catch(IOException e) {
        	System.out.println(e.getMessage());
        	
        }

	}

}
