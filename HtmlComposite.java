package Composite_Lab_4_3;

import java.util.ArrayList;
import java.util.List;

public class HtmlComposite extends HtmlTags{
	
	public String openTag;
	public String closeTag;
    public String text;
    
	List<HtmlTags> htmlTags = new ArrayList<>();
	
	public HtmlComposite(String openTag, String text, String closeTag) {
		//(htmlTags)htmlTags.add(text);
	}
	
	public String BuildPage() {
	String HTML= "<ul><li>";
	HTML+= this.htmlTags;
	HTML+="<ul>";
	for(HtmlTags htmlTag: this.htmlTags) {
		HTML+="<li>";
		HTML+=htmlTag.BuildPage();
		HTML+= "</li>";
		
	}
	HTML+="</ul></li></ul>";
	
	 return HTML;
	}

	@Override
	public void addTags() {
       
		htmlTags.add();
	}
	

}
