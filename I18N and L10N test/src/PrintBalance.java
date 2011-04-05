import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * TODO A simple class that needs to be localized
 * 
 * @author mohan. Created Mar 27, 2010.
 */
public class PrintBalance {

	private ResourceBundle messages;
	private Locale aLocale;
	private double debt = 9876543.21;

	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 */

	public PrintBalance(String language, String region) {
		setLocale(language, region);
	}

	public String getString(String name) {
		return messages.getString(name);
	}

	public void setLocale(String language, String region) {
		aLocale = new Locale(language, region);
		messages = ResourceBundle.getBundle("Translate", aLocale);
	}

	public String getDate() {
		return DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.SHORT, aLocale).format(new Date());
	}

	public String getDebtString() {
		return NumberFormat.getCurrencyInstance(aLocale).format(debt);
	}

	public Locale getLocale() {
		return aLocale;
	}

	public double getDebt() {
		return debt;
	}
}
