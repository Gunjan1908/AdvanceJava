package mypack;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Convert extends SimpleTagSupport{
	StringWriter sw = new StringWriter();
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		
		getJspBody().invoke(sw);
		JspWriter out = getJspContext().getOut();
		out.println(sw.toString().toUpperCase());	
	}		
}





