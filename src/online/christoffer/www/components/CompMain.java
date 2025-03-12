package online.christoffer.www.components;

import lattesite.html.elements.HTMLDivElement;
import lattesite.html.elements.HTMLElement;

public class CompMain extends HTMLDivElement {

    private final HTMLDivElement inner;

    public CompMain(HTMLElement parent) {
        super(parent);
        this.addClass("main");

        this.inner = new HTMLDivElement(this);
        this.inner.addClass("main__inner");
    }

    public HTMLDivElement getInner() {
        return this.inner;
    }

}
