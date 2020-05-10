package mockito;



import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class mocklist {

	@Test
	public void mocklisttest() {
		List<String> mocklist =mock(List.class);
		when(mocklist.size()).thenReturn(5);
		assertTrue(mocklist.size() == 5);
		
	}
	
}
