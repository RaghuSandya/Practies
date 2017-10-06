
public class FireFox implements Browsers {

	@Override
	public void navigate() {
		System.out.println("navigate to firefox...");
		
	}

	@Override
	public void get() {
		System.out.println("FireFox Image captured....");
		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Firefox url captured...");
		
	}

	@Override
	public void getTitle() {
		System.out.println("Firefox page title captured....");
		
	}
	

}
