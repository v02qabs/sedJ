package libopt;

public class libopt{
	public String arg;
	public int i;
	public static void main(String[] args){
		new libopt().init_opt(args.length, "--add"  ,args);
		System.out.println("引数の個数:" + args.length);
	}
	public int where_options_position(int i){
		System.out.println("Where is 'add' option is " + i);
		return this.i = i;
	}
	public String init_opt(int length,String options, String...  args){
		for(int i=0;i<args.length; i++){
			System.out.println("データの個数：" + args[i]);
			if(args[i].equals(options)){

				System.out.println("hit");
				System.out.println("options [" + options + "]  のオプション：" + args[i+1]);
				return args[i+1];
			}
		}
		return args[i+1];
	}

}


		
