import java.util.Scanner;

class BasicPrograms{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(checkAnagram(s));
		System.out.println(checkAnagramUsingForLoop(s));
	}
	
	
	public static boolean checkAnagram(String s){
		
		int startIndex = 0;
		int endIndex = s.length()-1;
		
		while(startIndex < endIndex){
			if(s.charAt(startIndex) != s.charAt(endIndex)){
				return false;
			}
			startIndex++;
			endIndex--;
		}
		
		return true;
	}
	
	public static boolean checkAnagramUsingForLoop(String s){
		
		for(int i = 0; i < s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1)){
				return false;
			}
		}
		
		return true;
	}
}