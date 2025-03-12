package online.christoffer.www.components;

import lattesite.html.elements.HTMLDivElement;
import lattesite.html.elements.HTMLElement;

public class CompSection extends HTMLDivElement {

    public CompSection(HTMLElement parent) {
        super(parent);
        this.addClass("section");
    }

}
