
public class App {

	public static void main(String[] args) {
		
		Logger aLog = new AsteriskLogger();
		aLog.Log("Howdy");
		
		System.out.println("");
		
		aLog.Error("Howder");
		
		System.out.println("");
		
		Logger sLog = new SpacedLogger();
		sLog.Log("Howdy");
		
		System.out.println("");
		
		sLog.Error("Howder");

	}

}
