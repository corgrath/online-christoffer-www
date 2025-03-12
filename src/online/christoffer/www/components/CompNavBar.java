package online.christoffer.www.components;

import lattesite.html.elements.HTMLDivElement;
import lattesite.html.elements.HTMLElement;

public class CompNavBar extends HTMLDivElement {

    public CompNavBar(HTMLElement parent) {
        super(parent);
        this.addClass("navbar");

        HTMLDivElement inner = new HTMLDivElement(this);
        inner.addClass("navbar__inner");
    }

}
