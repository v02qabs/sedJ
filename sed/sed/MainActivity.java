import java.io.*;

public class MainActivity{
	private String a1,a0,file_name_before, file_name_after;

	public static void main(String[] args)
	{
		try{
			new MainActivity().sed(args[0], args[1], args[2], args[3]);
		}
		catch(Exception error)
		{
		}

	}

	public MainActivity(){}
	private void sed(String a0,String a1, String file_name_before, String file_name_after){
		System.out.println("ファイルの内容を規定の設定に修正します。");
		try{
			File read_file = new File(file_name_before);
			BufferedReader br = new BufferedReader(new FileReader(read_file));
			String line ;
			while((line=br.readLine()) != null){
				String a2 = line.replaceAll(a0,a1);
				System.out.println(a2);
				write(a2, file_name_after);
				line = br.readLine();
			}
		}
		catch(Exception error){
			System.out.println(error.toString());
		}

	}
	private void write(String a2, String file_name_after)
	{
			System.out.println("ファイル：" + file_name_after + " に修正内容を書き込みます。");
	
		try{
			File f = new File(file_name_after);
			 BufferedWriter writer = new BufferedWriter(new FileWriter(f,true));
			writer.write(a2);
			writer.close();
		}
		catch(Exception error)
		{
			System.out.println(error.toString());
		}

			
	}

	
}


