package online.christoffer.www.components;

import lattesite.html.elements.*;
import online.christoffer.www.Main;

public class CompProfileSection extends HTMLDivElement {

    public CompProfileSection(HTMLElement parent) {
        super(parent);
        this.addClass("profile-section");

        new HTMLImageElement(
                this,
                "/images/christoffer.png",
                "profile photo", "Christoffer",
                150,
                150
        ).addClass("profile-section__image");

        new HTMLHeader1Element(this, "Hey there!");

        HTMLDivElement elemName = new HTMLDivElement(this);
        elemName.addClass("profile-section__title");
        new HTMLSpanElement(elemName, "My name is Christoffer and I am a software developer.");
        new HTMLSpanElement(elemName, "_");

        HTMLDivElement elemReachOutText = new HTMLDivElement(this);
        elemReachOutText.addClass("profile-section__reach-out-text");

        new HTMLDivElement(elemReachOutText).setText("""
                I am a passionate developer with a rich history of crafting innovative solutions across diverse technologies.
                My journey began in my teenage years with QBasic, and since then, my love for software and web development has only grown.
                """);
        new HTMLDivElement(elemReachOutText).setText("""
                Over the years, I've consistently demonstrated leadership, taking full ownership to guarantee the delivery of top-notch";
                software and products. From the inception of the first line of code to the seamless release of a fully realized product,";
                I thrive in every aspect of the software development lifecycle!";
                """);
        new HTMLDivElement(elemReachOutText).setText("""
                    Please feel free to continue to read my profile and don't hesitate to reach out to me below!
                """);

        HTMLDivElement elemSocialLinks = new HTMLDivElement(this);
        HTMLAnchorElement link = new HTMLAnchorElement(
                elemSocialLinks,
                Main.LINKED_IN_URL,
                "LinkedIn"
        );
        new HTMLImageElement(
                link,
                "/images/icons/linkedin.webp",
                "LinkedIn",
                "LinkedIn",
                40,
                40
        );

    }

}
