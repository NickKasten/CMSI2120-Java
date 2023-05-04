public class SpeakerTest{

	public static void main(String[] args){
		System.out.println("\n");
		
		Teacher teacher = new Teacher();
		teacher.speak();
		teacher.announce("Nick");
		
		TrainNav nytrain = new TrainNav();
		nytrain.speak();
		nytrain.announce("Next");
		nytrain.announce("Grand Central");
		nytrain.announce("Times Square");
		System.out.println("\n");

		MoodWeatherMan man = new MoodWeatherMan();
		man.speak();
		System.out.println("\n");
		man.announce("Excited");
		man.announce("Moody");
		man.announce("Calm");
		System.out.println("\n");
		
		Parrot parrot = new Parrot();
		parrot.speak();
		parrot.announce("Name");
		parrot.announce("Age");	
		
		

	}
}