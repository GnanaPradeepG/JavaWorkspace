package serialisationAndDeSer;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisation extends  RuntimeException
{

	public static void main(String[] args) throws ClassNotFoundException 
	{
		File f1 = new File("D:/JavaWorkspace/Conceptual/src/serialisationAndDeSer/student.ser");
		try
		{
			FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s1 = (Student) ois.readObject();
			s1.display();
			ois.close();
			fis.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
