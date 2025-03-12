package online.christoffer.www.pages;

import lattesite.html.elements.*;
import lattesite.localization.Locale;
import lattesite.services.LinkService;
import online.christoffer.www.Main;
import online.christoffer.www.components.*;
import online.christoffer.www.components.utils.StringUtil;
import online.christoffer.www.data.*;

public class FrontPage implements lattesite.page.Page {

    private final LinkService linkService;

    public FrontPage(LinkService linkService) {
        this.linkService = linkService;
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public String getPathWithSlashes() {
        return "/";
    }

    @Override
    public void appendHeadElements(Locale locale, HTMLHeadElement head) {

        String canonicalPageURL = this.linkService.addBaseURL(locale, this.getPathWithSlashes());

        String siteName = Main.SITE_NAME;
        String title = "Hey there! I am Christoffer!";
        String description = "I am Christoffer - a software and a web developer. Welcome to my site!";
        String keywords = "software developer, web developer, cv, resume";

        String opengraphImageURL = this.linkService.addBaseURL(locale, "/images/opengraph.jpg");
        String opengraphImageType = "image/jpeg";

        new HTMLTitleElement(head, title);
        new HTMLMetaElement(head, "width=device-width, initial-scale=1").setName("viewport");
        new HTMLMetaElement(head, "text/html; charset=utf-8").setHttpEquiv("content-type");
        new HTMLMetaElement(head, description).setName("description");
        new HTMLMetaElement(head, keywords).setName("keywords");
        if (this.isHidden()) {
            new HTMLMetaElement(head, "noindex").setName("robots");
        }

        // Favicons
        new HTMLLinkElement(head, "shortcut icon", "/favicon.png");
        new HTMLLinkElement(head, "apple-touch-icon", "/favicon.png", "image/x-icon");

        // Opengraph tags
        new HTMLMetaElement(head, canonicalPageURL).setProperty("og:url");
        new HTMLMetaElement(head, "website").setProperty("og:type");
        new HTMLMetaElement(head, siteName).setProperty("og:site_name");
        new HTMLMetaElement(head, title).setProperty("og:title");
        new HTMLMetaElement(head, description).setProperty("og:description");
        new HTMLMetaElement(head, opengraphImageURL).setProperty("og:image");
        new HTMLMetaElement(head, opengraphImageType).setProperty("og:image:type");
        new HTMLMetaElement(head, description).setProperty("og:image:alt");
        new HTMLMetaElement(head, Integer.toString(1920)).setProperty("og:image:width");
        new HTMLMetaElement(head, Integer.toString(1080)).setProperty("og:image:height");

        // Twitter card tags
        new HTMLMetaElement(head, "summary_large_image").setName("twitter:card");
        new HTMLMetaElement(head, title).setName("twitter:title");
        new HTMLMetaElement(head, description).setName("twitter:description");
        new HTMLMetaElement(head, opengraphImageURL).setName("twitter:image");
        new HTMLMetaElement(head, opengraphImageType).setName("twitter:image:type");
        new HTMLMetaElement(head, description).setName("twitter:image:alt");

        // Link data
        new HTMLLinkElement(head, "canonical", canonicalPageURL);

        // CSS
        new HTMLLinkElement(head, "stylesheet", "/index.css");
    }

    @Override
    public void appendBodyElements(Locale locale, HTMLBodyElement parent) {

        /*
         * Wallpaper
         */
        new CompWallpaper(parent);

        /*
         * Header
         */
        HTMLHeaderElement elemSplash = new HTMLHeaderElement(parent);
        elemSplash.addClass("splash");

        HTMLDivElement elemHeader = new HTMLDivElement(elemSplash);
        elemHeader.addClass("splash__header");
        elemHeader.setText("“Any sufficiently advanced technology");

        elemHeader = new HTMLDivElement(elemSplash);
        elemHeader.addClass("splash__header");
        elemHeader.setText("is indistinguishable from magic.”");

        HTMLDivElement elemAuthor = new HTMLDivElement(elemSplash);
        elemAuthor.addClass("splash__author");
        elemAuthor.setText("Arthur C. Clarke");

        /*
         * Profile section
         */

        new CompProfileSection(parent);

        /*
         * Navbar
         */

        new CompNavBar(parent);

        /*
         * Main
         */

        CompMain main = new CompMain(parent);

        // Skills
        CompSection section = new CompSection(main.getInner());
        new CompHeader2(section, "My Strongest Skills & Abilities", "Skills", "active-skills");
        new CompSectionSubText(section, "Notable active skills and abilities right now.");
        new CompSkillContainer(section, TagSkillLevel.ACTIVE);

        // Old skills
        section = new CompSection(main.getInner());
        new CompHeader2(section, "But I've Also Worked With These at One Point");
        new CompSectionSubText(section, "Notable dormant skills and abilities that has currently taken the passenger seat for the time being");
        new CompSkillContainer(section, TagSkillLevel.FORGOTTEN);

        // Experiences
        section = new CompSection(main.getInner());
        new CompHeader2(section, "Workplace Experiences", "Experiences", "workspace-experiences");
        new CompSectionSubText(section, "Notable work experiences.");
        for (Experience experience : Experience.values()) {
            new CompCard(
                    section,
                    experience.getYearStart() + " - " + StringUtil.coalesce(experience.getYearEnd(), "Present"),
                    experience.getTitle(),
                    "At " + experience.getCompanyName() + " in " + experience.getLocation(),
                    experience.getBullets(),
                    experience.getTags(),
                    new String[0]
            );
        }

        // Educations
        section = new CompSection(main.getInner());
        new CompHeader2(section, "Educations", "Educations", "educations");
        new CompSectionSubText(section, "Notable educations that I have attended.");
        for (Education education : Education.values()) {
            new CompCard(
                    section,
                    education.getYearStart() + " - " + education.getYearEnd(),
                    education.getTitle(),
                    "At " + education.getSchoolName() + " in " + education.getLocation(),
                    education.getDescription(),
                    new Tag[0],
                    new String[0]
            );
        }

        // Awards
        section = new CompSection(main.getInner());
        new CompHeader2(section, "Awards", "Awards", "awards");
        new CompSectionSubText(section, "Notable awards that I have received.");
        for (Award award : Award.values()) {
            new CompCard(
                    section,
                    Integer.toString(award.getYearStart()),
                    award.getTitle(),
                    "Given by " + award.getContestHolder(),
                    award.getDescription(),
                    new Tag[0],
                    award.getImageURLs()
            );
        }

        // Certifications
        section = new CompSection(main.getInner());
        new CompHeader2(section, "Licenses & Certifications", "Certifications", "certifications");
        new CompSectionSubText(section, "Notable certifications & licenses that I have.");
        for (Certification certification : Certification.values()) {
            new CompCard(
                    section,
                    Integer.toString(certification.getYear()),
                    certification.getTitle(),
                    "Issued by " + certification.getIssuedBy(),
                    certification.getDescription(),
                    certification.getTags(),
                    new String[0]
            );
        }

        // Endorsements
        section = new CompSection(main.getInner());
        new CompHeader2(section, "Endorsements", "Endorsements", "endorsements");
        new CompSectionSubText(section, "Notable endorsements I have received on LinkedIn.");
        for (Endorsement endorsement : Endorsement.values()) {
            new CompCard(
                    section,
                    null,
                    "“" + endorsement.getSnippet() + "”",
                    "From " + endorsement.getAuthorFirstname() + ", " + endorsement.getAuthorTitle() + ", " + endorsement.getRelationship(),
                    endorsement.getTexts(),
                    new Tag[0],
                    new String[0]
            );
        }

        // Projects
        section = new CompSection(main.getInner());
        new CompHeader2(section, "Projects", "Projects", "projects");
        new CompSectionSubText(section, "Notable projects that I have either created or been a part of.");
        for (Project project : Project.values()) {
            new CompCard(
                    section,
                    Integer.toString(project.getYear()),
                    project.getTitle(),
                    "",
                    project.getDescription(),
                    project.getTags(),
                    project.getImageURLs()
            );
        }

        // memorable events
        section = new CompSection(main.getInner());
        new CompHeader2(section, "Memorable Events", "Events", "events");
        new CompSectionSubText(section, "Here are some notable memorable events that has happened regarding me!");
        for (Event event : Event.values()) {
            new CompCard(
                    section,
                    Integer.toString(event.getYear()),
                    event.getTitle(),
                    "",
                    event.getDescription(),
                    new Tag[0],
                    event.getImageURLs()
            );
        }

        // Organizations
        section = new CompSection(main.getInner());
        new CompHeader2(section, "Organizations", "Organizations", "organizations");
        new CompSectionSubText(section, "Notable organizations that I am a member of.");
        for (Organization organization : Organization.values()) {
            new CompCard(
                    section,
                    Integer.toString(organization.getYear()),
                    organization.getName(),
                    "",
                    organization.getDescription(),
                    organization.getTags(),
                    new String[0]
            );
        }

        /*
         * Footer
         */

        new CompFooter(main.getInner());

        /*
         * JavaScript
         */

        new HTMLScriptElement(parent).setSource("/index.js");

    }

}