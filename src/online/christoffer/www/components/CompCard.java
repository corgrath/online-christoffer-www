package online.christoffer.www.components;

import lattesite.html.elements.HTMLDivElement;
import lattesite.html.elements.HTMLElement;
import lattesite.html.elements.HTMLImageElement;
import online.christoffer.www.components.utils.StringUtil;
import online.christoffer.www.data.Tag;

public class CompCard extends HTMLDivElement {

    public CompCard(
            HTMLElement parent,
            String year,
            String header,
            String subText,
            String[] texts,
            Tag[] tags,
            String[] imageURLs
    ) {
        super(parent);
        this.addClass("card");

        HTMLDivElement elemYear = new HTMLDivElement(this);
        elemYear.addClass("card__year");
        elemYear.setText(StringUtil.coalesce(year, ""));

        HTMLDivElement elemHeader = new HTMLDivElement(this);
        elemHeader.addClass("card__header");
        elemHeader.setText(header);

        HTMLDivElement elemSubText = new HTMLDivElement(this);
        elemSubText.addClass("card__sub-text");
        elemSubText.setText(subText);

        for (String text : texts) {
            HTMLDivElement elemText = new HTMLDivElement(this);
            elemText.addClass("card__text");
            elemText.setText(text);
        }

        HTMLDivElement elemTagsContainer = new HTMLDivElement(this);
        elemTagsContainer.addClass("card__tags-container");
        for (Tag tag : tags) {
            new CompTag(elemTagsContainer, tag);
        }

        HTMLDivElement elemImagesContainer = new HTMLDivElement(this);
        elemImagesContainer.addClass("card__images-container");
        for (String imageURL : imageURLs) {
            new HTMLImageElement(
                    elemImagesContainer,
                    imageURL,
                    "Screenshot of " + header,
                    "Screenshot of " + header,
                    192,
                    110
            ).setLoading(HTMLImageElement.Loading.LAZY);
        }

    }

}
