

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.construct.Flow;


import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.transport.sftp.SftpClient;
public class testAPI extends FunctionalTestCase {
	
	
/*	@Test
	public void testEntryPoint() throws MuleException{
		MuleClient muleClient=muleContext.getClient();		
		MuleMessage reply=muleClient.send("sftp://admin:admin@localhost/resources", null);
		assertNotNull(reply);
		ExceptionPayload exceptionPayload=reply.getExceptionPayload();
		Throwable throwable=exceptionPayload.getException();
		assertTrue(throwable instanceof Exception);
	}*/
	
/*		
	@Test
	public void skippingMessageSource() throws Exception
    {
		
        Flow flow = (Flow) getFlowConstruct("sftpFlow1");        
        
        MuleEvent event = getTestEvent("test", flow);
        MuleEvent result = flow.process(event);
        assertEquals("ExpectedMessage", result.getMessage().getPayloadAsString());
    }*/
	
	@Test
    public void sftpEndpoint() throws IOException
    {
       SftpClient sf = new SftpClient("localhost:995");       
       sf.login("admin", "admin");
       System.out.println(sf.listFiles());       
      assertTrue(sf.isConnected());
      
      
    }
	
		
	
	
	
	@Override
	protected String getConfigResources() {		
		System.out.println("INside Conf");
		return "src/main/app/sftp.xml";
	}

}
