package mockito;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class mockAnotationconcept {

	@Mock
	List<String> mocklist;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void mocklistTest() {
		when(mocklist.get(0)).thenReturn("suraj");
		assertTrue("suraj",mocklist.size() == 0);
	}
	
}
