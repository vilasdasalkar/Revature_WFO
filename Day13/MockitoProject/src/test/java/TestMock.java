import java.util.List;

import org.junit.jupiter.api.Assertions;

import com.revature.mocks.PersonService;

public class TestMock {
  public PersonService personservice;
  
  public void testSort() {
	  this.personservice=new PersonService();
	  List<String> sortedNames=this.personservice.sort();
	  System.out.println(sortedNames);
	  Assertions.assertEquals("jasdhir", sortedNames.get(2));
  }
  
}
