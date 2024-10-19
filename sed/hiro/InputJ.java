package hiro;
import java.util.Scanner;
public class InputJ {

	private void E() {
		String quit = new InputJ().InputJ();
		if(quit.equals(quit)) {
			System.out.println("終了します。");
			System.exit(0);
		}
		else{
			System.out.println("エラー");
		}
	}

	public String InputJ() {
		// TODO Auto-generated method stub
		Scanner scan_scan = new Scanner(System.in);
		String scaned_string = scan_scan.next();
		return scaned_string;
	}

}
