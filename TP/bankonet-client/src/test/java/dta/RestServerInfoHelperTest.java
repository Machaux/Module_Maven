package dta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RestServerInfoHelperTest {

	RestServerInfoHelper serverHelper;
	
	@Before
	public void testbefore(){
		serverHelper = new RestServerInfoHelper();
	}
	
	
	@Test
	public void testProtocol(){
		Assert.assertEquals("http", serverHelper.getRestServerInfo().getProtocol());
	}
	
	@Test
	public void testHost(){
		Assert.assertEquals("localhost", serverHelper.getRestServerInfo().getHost());
	}
	@Test
	public void testPort(){
		Assert.assertEquals("8085", serverHelper.getRestServerInfo().getPort());
	}
}
