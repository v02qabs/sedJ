package sed2;

import sed2.Input.Input;
import com.hiro.liboptions.sample;

class sed2{
	public static void main(String[] args){
		System.out.println("よこそsed2へ。");
		new sample().init_opt(args.length, "--overwrite" ,args);
		new sed2();
	}
	public void sed2(){
		System.out.println("編集前のファイル名：");
		Input input_input_file = new Input();
		String input_file_name = input_input_file.Input();
		System.out.println("編集後のファイル名");
		Input output_file = new Input();
		String out_put_file_name = output_file.Input();
		System.out.println("編集前の単語");
		Input before_words = new Input();
	}


}

