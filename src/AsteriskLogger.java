
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String logIt) {
		System.out.println("***"+logIt+"***");
		
	}

	@Override
	public void Error(String err) {
		System.out.println("*******************");
		System.out.println("***Error: "+err+"***");
		System.out.println("*******************");
	}
}
