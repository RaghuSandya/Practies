
public class ListOfEvenMNumbers {

	public static void main(String[] args) {
		// difine number
		
		
		int limit=100;
		System.out.println("print even numbers between 1 and"+ limit);
		for (int i = 1;i<=limit;i++){
			
			//even Divisable by 2
			
			if(i%2==0){
				System.out.println(i+" ");
			}
			
		}
	}

}
