import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

public class TestPrintBalance {
	@Test
	public void TestGreetingEN() {
		PrintBalance p = new PrintBalance("en", "US");
		Assert.assertEquals("Hello World", p.getString("greeting"));
	}

	@Test
	public void TestGreetingFR() {
		PrintBalance p = new PrintBalance("fr", "FR");
		Assert.assertEquals("Bonjour tout le monde", p.getString("greeting"));
	}

	@Test
	public void TestGreetingGR() {
		PrintBalance p = new PrintBalance("gr", "GR");
		Assert.assertEquals("Hallo Welt", p.getString("greeting"));
	}

	@Test
	public void TestNameRequestEN() {
		PrintBalance p = new PrintBalance("en", "US");
		Assert.assertEquals("Please enter your name",
				p.getString("nameRequest"));
	}

	@Test
	public void TestNameRequestFR() {
		PrintBalance p = new PrintBalance("fr", "FR");
		Assert.assertEquals("S'il vous plaît entrer votre nom",
				p.getString("nameRequest"));
	}

	@Test
	public void TestNameRequestGR() {
		PrintBalance p = new PrintBalance("gr", "GR");
		Assert.assertEquals("Bitte geben Sie Ihren Namen",
				p.getString("nameRequest"));
	}

	@Test
	public void TestThanksRequestEN() {
		PrintBalance p = new PrintBalance("en", "US");
		Assert.assertEquals("I am pleased to meet you ", p.getString("thanks"));
	}

	@Test
	public void TestThanksRequestFR() {
		PrintBalance p = new PrintBalance("fr", "FR");
		Assert.assertEquals("Je suis heureux de vous rencontrer ",
				p.getString("thanks"));
	}

	@Test
	public void TestThanksRequestGR() {
		PrintBalance p = new PrintBalance("gr", "GR");
		Assert.assertEquals("Ich freue mich, Sie kennen zu lernen ",
				p.getString("thanks"));
	}

	@Test
	public void TestDateRequestEN() {
		PrintBalance p = new PrintBalance("en", "US");
		String date = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.SHORT, p.getLocale()).format(new Date());
		Assert.assertEquals("As of : " + date,
				p.getString("dateDisplay") + p.getDate());
	}

	@Test
	public void TestDateRequestFR() {
		PrintBalance p = new PrintBalance("fr", "FR");
		String date = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.SHORT, p.getLocale()).format(new Date());
		Assert.assertEquals("En date du : " + date, p.getString("dateDisplay")
				+ p.getDate());
	}

	@Test
	public void TestDateRequestGR() {
		PrintBalance p = new PrintBalance("gr", "GR");
		String date = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.SHORT, p.getLocale()).format(new Date());
		Assert.assertEquals("Stand : " + date,
				p.getString("dateDisplay") + p.getDate());
	}

	@Test
	public void TestDebtRequestEN() {
		PrintBalance p = new PrintBalance("en", "US");
		String debt = NumberFormat.getCurrencyInstance(p.getLocale()).format(
				p.getDebt());
		Assert.assertEquals("You owe the school " + debt,
				p.getString("debtTitle") + p.getDebtString());
	}

	@Test
	public void TestDebtRequestFR() {
		PrintBalance p = new PrintBalance("fr", "FR");
		String debt = NumberFormat.getCurrencyInstance(p.getLocale()).format(
				p.getDebt());
		Assert.assertEquals("Vous devez l'école " + debt,
				p.getString("debtTitle") + p.getDebtString());
	}

	@Test
	public void TestDebtRequestGR() {
		PrintBalance p = new PrintBalance("gr", "GR");
		String debt = NumberFormat.getCurrencyInstance(p.getLocale()).format(
				p.getDebt());
		Assert.assertEquals("Du schuldest der Schule " + debt,
				p.getString("debtTitle") + p.getDebtString());
	}

	@Test
	public void TestByeRequestEN() {
		PrintBalance p = new PrintBalance("en", "US");
		Assert.assertEquals("Good Bye", p.getString("bye"));
	}
	
	@Test
	public void TestByeRequestFR() {
		PrintBalance p = new PrintBalance("fr", "FR");
		Assert.assertEquals("Au revoir", p.getString("bye"));
	}
	
	@Test
	public void TestByeRequestGR() {
		PrintBalance p = new PrintBalance("gr", "GR");
		Assert.assertEquals("Auf Wiedersehen", p.getString("bye"));
	}
}
