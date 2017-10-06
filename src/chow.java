
public class chow implements GmailInter{

	@Override
	public void close() {
		System.out.println("browser closed...");
		
	}

	@Override
	public void getText() {
		System.out.println("gmail text captured...");
		
	}

}
