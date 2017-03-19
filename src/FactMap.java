import java.util.HashMap;


public class FactMap {

	public HashMap data = new HashMap<Integer, String>();
	
	public FactMap() {
		data.put(0, "carrots contain 0% fat");
		data.put(1, "a 1 minute kiss burns 26 calories");
		data.put(2, "tarantula spiders can survive 2 and a half years without food");
		data.put(3, "This is the number three");
		data.put(4, "there are only 4 words in the English language which end in 'dous' (they are: hazardous, horrendous, stupendous and tremendous)");
		data.put(5, "This is the number five");
		data.put(6, "All insects have 6 legs");
		data.put(7, "cats can jump up to 7 times their tail length");
		data.put(8, "In China the number 8 is believed to express the totality of the universe.");
		data.put(9, "when water freezes it expans by 9%");
		data.put(42, "A bear has 42 teeth");
		data.put(13, "The hawaiian alphabets has 13 letters");
		data.put(14, "Harambe sleeps 14 hours a day");
		data.put(56, "56% of typing is completed by your left hand");
		data.put(25, "an average person will spend 25 years asleep");
		data.put(18, "horses have 18 more bones than humans");
		data.put(19, "9 is a twin prime! Its twin is");
		data.put(20, "The Ancient Mayans used the number '20' as the base for their numeral system");
		data.put(21, "a composite number, its proper divisors being 1, 3 and 7.");
	}
	
	public String getFacts(int Integer) {
		return data.get(Integer).toString();
	}
}