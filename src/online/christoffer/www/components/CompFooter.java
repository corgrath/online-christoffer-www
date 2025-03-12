package online.christoffer.www.components;

import lattesite.html.elements.HTMLDivElement;
import lattesite.html.elements.HTMLElement;

public class CompFooter extends HTMLDivElement {

    public CompFooter(HTMLElement parent) {
        super(parent);
        this.addClass("footer");

        this.setInnerHTML("""
                This page was last updated March 13, 2025.
                 Background photo by <a href=\"https://unsplash.com/@wsokolowskij?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash\">Wladislaw Sokolowskij</a> on <a href=\"https://unsplash.com/photos/0vw4InAC-yM?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash\">Unsplash</a>
                """);
    }

}
