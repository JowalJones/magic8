import java.util.Random;



public class Magic8 {
	int randomNumber;
	 String[] randomOptions= { "It is certain.",
			"It is decidedly so.",
			"Without a doubt.", 
			"Yes – definitely.",
			"You may rely on it.",
			 "As I see it, yes.",
			"Most likely.",
			" Outlook good.",
			" Yes.",
			"Signs point to yes.",
			" Reply hazy, try again.",
			"Ask again later.",
			" Better not tell you now.",
			"Cannot predict now.",
			" Concentrate and ask again.",
			"Don't count on it.",
			" My reply is no.",
			" My sources say no.",
			" Outlook not so good.",
			"Very doubtful"};
	 public Magic8() {
		 
	 }
	
	 public void randomGenerator() {
		 
		 Random rand=new Random();
		 randomNumber=rand.nextInt(20);
		 String option=randomOptions[randomNumber];
		 System.out.println(option);
	}
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Magic8 jeniffer=new Magic8();
		jeniffer.randomGenerator();
		

	}

}
