package mx.horace.dp.structural.composite;

import java.util.ArrayList;

/*The leaf class*/
public class HtmlElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.tagBody = "";
    }
    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag=tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag=tag;
    }

    @Override
    public void setTagBody(String tagBody){
        this.tagBody=tagBody;
    }

    @Override
    public String generateHtml() {
        return String.format("%s%s%s\n",startTag,tagBody,endTag);
    }
}
