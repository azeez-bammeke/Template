package Composite_Lab_4_3;



public class HtmlLeaf extends HtmlTags{
    public String openTag;
	public String closeTag;
    public String text;
	
	
	public HtmlLeaf(String openTag, String text, String closeTag) {
		this.openTag = openTag;
		this.text = text;
		this.closeTag = closeTag;
	}
	
	
	@Override
	public String BuildPage() {
		
		return this.text;
	}


	@Override
	public void addTags() {
		
		
	}
}
