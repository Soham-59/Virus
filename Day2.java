class codex{

		public static void main(String args[]){

			//day-1 Assignment operator(=),relational operator(==,!=,>=,<=,>,<) ,logical operator(&&,||,!),Bitwise oerator(++a pre incremnet,a++ post increment )
		// assignment 
			int a=10;
			int b=20;
	System.out.println(a);
		// relational 
			int c=10;
			int d=20;
			boolean ans= c==d;
			System.out.println(ans);
			boolean greater= c>=d;
			System.out.println(greater);

		// logical
		boolean ans_1=true;
		boolean ans_2=false;
		boolean ans_final=(ans_1&&ans_2);
	System.out.println(ans_final);
		
		// Bitwise operator
			int val=10;
			int val_2=11;
			int total=(++val + val_2++ + val--);
			System.out.println(val);
			System.out.println(val_2);
			System.out.println(total);

					



		}


	}
