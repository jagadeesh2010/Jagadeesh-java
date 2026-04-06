


import jakarta.servlet.jsp.JsoWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class CustomTag extends TagSupport
{ 
	private static final long serialversionUID = 1L;
	
	public int doStartTag()
	{
		JspWriter out = null;
		
		try
		{
			out = pageContext.getOut();
			
			out.println("current Date: "+new Date());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		rett=urn SKIP_BODY;
	}

}
