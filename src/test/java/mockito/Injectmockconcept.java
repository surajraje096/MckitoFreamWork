package mockito;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
public class Injectmockconcept {
	
	@Mock
	List<String> mocklist;
	
	@InjectMocks
	Employ mockemploye;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void EmployMockTest() {
		
		when(mocklist.get(0)).thenReturn("suraj");
		
	/*	when(mocklist.get(1)).thenReturn("amit");
		when(mocklist.get(2)).thenReturn("rju");*/
		
		when(mocklist.size()).thenReturn(1);
		
		assertEquals("suraj",mocklist.get(0));
		assertEquals(1,mocklist.size());
		
		assertEquals("suraj",mockemploye.getEmpname().get(0));
		assertEquals(1,mockemploye.empname.size());
		
		mocklist.add(1,"patil");
		System.out.println(mocklist.get(0));
		
		/*System.out.println(mocklist.get(1));
		System.out.println(mocklist.get(2));*/
		
		/*for(int i=0;i<mocklist.size();i++) {
			System.out.println(mocklist.get(i));
		
		}*/
		
	}
	
	
	}

 class Employ{
	 List<String> empname;

	public List<String> getEmpname() {
		return empname;
	}

	public void setEmpname(List<String> empname) {
		this.empname = empname;
	}
	
}
