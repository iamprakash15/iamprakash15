import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

	private String newpath;
	private String oldpath;

	@SuppressWarnings("resource")
	public TextFile(String oldpath, String newpath) throws IOException {

		File file = new File(this.oldpath);
		Scanner sc = new Scanner(file);
		String filecontent = "This new file: ";
		while (sc.hasNextLine()) {
			filecontent = filecontent.concat(sc.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter(this.newpath);
		writer.write(filecontent);
		writer.close();
		
	}

	public static void main(String[] args) throws IOException {

		new TextFile("C:\\Users\\choud\\OneDrive\\Desktop\\testingfile.txt" , "C:\\Users\\choud\\OneDrive\\Desktop\\newtestingFile.txt");
		
	}
}