package mx.horace.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/*Composite class */
public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
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
    public void addChildTag(HtmlTag htmlTag){
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag){
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childrenTag;
    }

    @Override
    public String generateHtml() {
        StringBuilder sb= new StringBuilder(String.format("%s\n",startTag));
        for(HtmlTag tag: childrenTag){
            sb.append(String.format("%s",tag.generateHtml()));
        }
        sb.append(String.format("%s\n",endTag));
        return sb.toString();
    }
}
