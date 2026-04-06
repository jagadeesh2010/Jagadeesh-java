package com.test;
import java.util.*;

	import jakarta.servlet.jsp.JspWriter;
	import jakarta.servlet.jsp.tagext.TagSupport;

	public class CustomTags extends TagSupport
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
			
			return SKIP_BODY;
		}

	}


