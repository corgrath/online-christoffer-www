package online.christoffer.www.components;

import lattesite.html.elements.HTMLDivElement;
import lattesite.html.elements.HTMLElement;
import online.christoffer.www.data.Tag;
import online.christoffer.www.data.TagCategory;
import online.christoffer.www.data.TagSkillLevel;

import java.util.ArrayList;
import java.util.List;

public class CompSkillContainer extends HTMLDivElement {

    public CompSkillContainer(HTMLElement parent, TagSkillLevel level) {
        super(parent);
        this.addClass("skills-super-container");

        for (TagCategory category : TagCategory.values()) {

            List<Tag> tags = new ArrayList<>();

            for (Tag tag : Tag.values()) {
                if (tag.getCategory().equals(category) && tag.getSkillLevel().equals(level)) {
                    tags.add(tag);
                }
            }

            // console.log(category, tags)

            if (!tags.isEmpty()) {

                HTMLDivElement skillsContainer = new HTMLDivElement(this);
                skillsContainer.addClass("skills-super-container__skills-container");

                HTMLDivElement elemHeader = new HTMLDivElement(skillsContainer);
                elemHeader.addClass("skills-super-container__skills-container__header");
                elemHeader.setText(category.getLabel());

                HTMLDivElement elemTags = new HTMLDivElement(skillsContainer);
                elemTags.addClass("skills-super-container__skills-container__tags");
                for (Tag tag : tags) {
                    new CompTag(elemTags, tag);
                }
            }

        }
    }

}
