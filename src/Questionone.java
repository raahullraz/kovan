import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Questionone {
	public static void main(String[] args) {
		String string = readFile("C:\\Users\\rahul veeranki\\OneDrive\\Desktop\\file.txt");
		// System.out.println(string);
		String array[] = string.split(" ");
		List<String> list = new ArrayList<>();
		Collections.addAll(list, array);
		// list.forEach(i->System.out.println(i));
		String data = "";
		long starttime = System.nanoTime();
		for (String s : list) {
			if(s.equals("ProcessingTimeTook:"))
			{
				break;
			}
			else
				data = data+" "+s;
		}
		data = data+" ProcessingTimeTook:";		
//		System.out.println(data);
		System.out.println(System.currentTimeMillis()-starttime);
	}

	private static String readFile(String string) {
		String str = "";
		try {
			str = new String(Files.readAllBytes(Paths.get(string)));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return str;
	}

}
