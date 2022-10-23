
 class LoopsBasics {

	public static void main(String[] args) {
		//basicForLoop(0,10,2);
		//basicForLoop(0,100,5);
		basicWhileLoop(0,0,2);
		basicDoWhileLoop(0,0,2);
		basicForEachLoop();
	}
	
	/*
	 * for loop
	 * while loop
	 * do while loop
	 * for each
	 * */
	
	public static void basicForLoop(int start, int end, int increment) {
		System.out.println("Executing simple for loop");
		for(int i = start; i < end; i += increment) {
			System.out.println(i+" ");
		}		
	}
	
	
	public static void basicWhileLoop(int start, int end, int increment) {
		System.out.println("Executing while Loop");
		while(start < end) {
			System.out.println(start);
			start +=increment;
		}
		
	}
	
	public static void basicDoWhileLoop(int start, int end, int increment) {
		System.out.println("Executing DO while Loop");
		do {
			System.out.println(start);
			start += increment;
		}while(start < end);
		
	}
	
	public static void basicForEachLoop(){
		System.out.println("Executing for each loop");
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i: arr) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
}
