package sed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import hiro.InputJ;

public class sed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sed().init();
	}
	private void init() {
			System.out.println("Start the sed command.");
			//編集前の開くファイル
			System.out.print("編集前の開くファイル:");
			String string_before_file_name = new InputJ().InputJ();
			System.out.print("編集後の保存先ファイル：");
			String string_after_file_name = new InputJ().InputJ();
			System.out.print("編集前の単語");
			String string_before = new InputJ().InputJ();
			System.out.print("編集後の単語");
			String string_after = new InputJ().InputJ();
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
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(string_after_file_name)));
			bw.write(fixed);
			bw.close();
		}catch(Exception error) {
			System.out.println("write error");
		}
	}
}
