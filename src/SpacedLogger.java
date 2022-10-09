
public class SpacedLogger implements Logger {

	@Override
	public void Log(String logIt) {
		StringBuilder toLog = new StringBuilder();
		toLog.append(logIt);
		String spacedStr = "";
		for(int i=0; i<toLog.length(); i++) {
			spacedStr += toLog.charAt(i);
			spacedStr += " ";
		}
		System.out.println(spacedStr);
		
	}

	@Override
	public void Error(String err) {
		StringBuilder toLog = new StringBuilder();
		toLog.append(err);
		String spacedStr = "ERROR: ";
		for(int i=0; i<toLog.length(); i++) {
			spacedStr += toLog.charAt(i);
			spacedStr += " ";
		}
		System.out.println(spacedStr);
	}

}
