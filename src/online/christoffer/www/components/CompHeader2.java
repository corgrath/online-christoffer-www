package online.christoffer.www.components;

import lattesite.html.elements.HTMLElement;
import lattesite.html.elements.HTMLHeader2Element;

public class CompHeader2 extends HTMLHeader2Element {

    public CompHeader2(HTMLElement parent, String text) {
        this(parent, text, null, null);
    }

    public CompHeader2(HTMLElement parent, String text, String shortLabel, String id) {
        super(parent, text);
        if (shortLabel != null) {
            this.setAttribute("data-text", shortLabel);
        }
        if (id != null) {
            this.setID(id);
        }
    }

}
