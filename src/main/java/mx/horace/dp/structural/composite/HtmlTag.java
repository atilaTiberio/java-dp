package mx.horace.dp.structural.composite;

/*Component class defines a behavior for composite and leaf class*/

import java.util.List;

public abstract class HtmlTag {

    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);

    //Generic behavior
    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Current operation is not supported for this object");
    }

    //Generic behavior
    public void addChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not supported for this object");
    }

    public void removeChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not supported for this object");
    }

    public List<HtmlTag> getChildren(){
        throw new UnsupportedOperationException("Current operation is not supported for this object");
    }

    public abstract String generateHtml();
}
