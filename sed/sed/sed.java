package sed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

import hiro.*;

public class sed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sed().init();
	}
	private void init() {
			System.out.println("Start the sed command.");
			System.out.print("before file name : ");
			Scanner scan_before_file_name = new Scanner(System.in);
			String string_before_file_name = scan_before_file_name.next();
			System.out.print("send files : ");
			Scanner scan_after_file_name = new Scanner(System.in);
			String string_after_file_name = scan_after_file_name.next();
			System.out.print("fix before : ");
			Scanner scan_before = new Scanner(System.in);
			String string_before = scan_before.next();
			System.out.print("fix after : ");
			Scanner scan_after = new Scanner(System.in);
			String string_after = scan_after.next();
			new sed().sed(string_before_file_name, string_after_file_name, string_before, string_after);
			
	}
	private void sed(String string_before_file_name, String string_after_file_name, String string_before, String string_after) {
		try {
			File file_before = new File(string_before_file_name);
			BufferedReader br = new BufferedReader(new FileReader(file_before));
			String line = null;
			while((line = br.readLine()) != null) {
				String fixed = line.replace(string_before ,string_after);
				line = br.readLine();
				fixed(fixed, string_after_file_name);
			}
		}catch(Exception error) {
			System.out.println("file read error");
		}
	}
	private void fixed(String fixed, String string_after_file_name) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(string_after_file_name),true));
			bw.write(fixed);
			bw.close();
		}catch(Exception error) {
			System.out.println("write error");
		}
	}
}
