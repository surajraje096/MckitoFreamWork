package mockito;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class test {
	
	@Test
	public void mock() {
		
		myservices obj=Mockito.mock(myservices.class);
		Mockito.when(obj.add(10, 20)).thenReturn(30);
		assertEquals(30,obj.add(10,20));
	}
	

}
