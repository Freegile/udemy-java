package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord Of The Rings";
		
		if(bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word "+wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is equal to chrome");
		}
	}

}
