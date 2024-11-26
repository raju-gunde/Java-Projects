package collection_demos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerealzeandDesereal {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<String> data = new ArrayList<>();
		data.add("raju");
		data.add("ganesh");
		data.add("ragu");
		data.add("praveen");
		var fout = new FileOutputStream("C:\\Users\\user\\OneDrive\\New\\arraydemos");

		var oos = new ObjectOutputStream(fout);
		try (fout; oos) {
			oos.writeObject(data);
			System.out.println("data succesfully added");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		var fin = new FileInputStream("C:\\Users\\user\\OneDrive\\New\\arraydemos");
		var ios = new ObjectInputStream(fin);
		try (fin; ios) {
			
			ArrayList<String> values=(ArrayList<String>)ios.readObject();
			System.out.println(values);
			System.out.println("data printed sussefully");

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
