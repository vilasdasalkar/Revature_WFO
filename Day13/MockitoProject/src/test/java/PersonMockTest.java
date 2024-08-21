
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.mocks.PersonRepository;
import com.revature.mocks.PersonService;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.times;

public class PersonMockTest {
   
    @InjectMocks
    public PersonService service;
    @Mock
    public PersonRepository repository;

@BeforeEach
public void setUp(){
    MockitoAnnotations.openMocks(this);
}

    @Test
    public void unitTestSort(){
        Mockito.when(this.repository.findAll()).thenReturn(
                Arrays.asList("vilas", "jasdhir", "alex", "sonu"));
        List<String> sortedNames=this.service.sort();
        Mockito.verify(this.repository, times(1)).findAll();
        System.out.println(sortedNames);
    }
}
