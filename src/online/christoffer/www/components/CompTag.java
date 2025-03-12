package online.christoffer.www.components;

import lattesite.html.elements.HTMLDivElement;
import lattesite.html.elements.HTMLElement;
import online.christoffer.www.data.Tag;

public class CompTag extends HTMLDivElement {

    public CompTag(HTMLElement parent, Tag tag) {
        super(parent);
        this.addClass("tag");
        this.setText(tag.getLabel());
    }

}
