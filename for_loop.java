class codex{
		public static void main(String args[]){

			int a,j;

		System.out.println("--Odd Numbers--");

		for(int i=1;i<=10;i++){
			if(i%2==1){
				System.out.println(i);
				}
					}

		System.out.println("--Even Numbers--");

		for(int i=1;i<=10;i++){
			if(i%2!=1){
				System.out.println(i);
				}
					}
		System.out.println("-- star Pattern using for loop--");
		
		System.out.println("Right angle triangle");
		for(int i=1;i<=5;i++){
			for(j=1;j<=i;j++){
			System.out.print("*");
					}
		System.out.println();
			}
		System.out.println("Rectangle");
		for(int i=1;i<4;i++){
		int count=4;
			for(j=1;j<=count;j++){

			System.out.print("*");
					}
		System.out.println();
			}
		
	
		System.out.println("Empty Rectangle using -3 star");
	int temp=3;
		for(int i=1;i<=3;i++){
			for(j=1;j<=temp;j++){
		if(i%2==1){
		if(i<=3 && j<=temp){
			System.out.print("*");
			}
				}
		else if(i%2==0){
			if(j%3==1){
				System.out.print("*");
				System.out.print(" ");
				}
			else if(j%3==0){
				System.out.print("*");
					}
			}

		}
	System.out.println();

	}
		
			
		}

	}