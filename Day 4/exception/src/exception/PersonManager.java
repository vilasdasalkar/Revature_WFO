package exception;

public class PersonManager {
	public static void main(String[] args) {
		Person person=new Person() ;
		person.setName("Hello");
		person.setAge(12);
		String eligibility="Not Eligible";
		eligibility=person.eligibleToVote(person.getAge());
		
		 try { eligibility=person.eligibleToVote(person.getAge()) ;
		  }catch(InvalidAgeException e) { e.printStackTrace(); }
		 
		System.out.println("Eligibility to Vote :: "+eligibility);
	}

}
