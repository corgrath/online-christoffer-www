package online.christoffer.www.components;

import lattesite.html.elements.HTMLDivElement;
import lattesite.html.elements.HTMLElement;

public class CompSectionSubText extends HTMLDivElement {

    public CompSectionSubText(HTMLElement parent, String text) {
        super(parent);
        this.addClass("section__sub-text");
        this.setText(text);
    }

}
