package online.christoffer.www;

import lattesite.LatteSite;
import lattesite.exceptions.LatteSiteException;
import lattesite.html.generator.ElementGenerator;
import lattesite.localization.Locale;
import lattesite.page.Page;
import lattesite.services.*;
import lattesite.settings.SiteSettings;
import online.christoffer.www.pages.FrontPage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String SITE_NAME = "christoffer.online";
    public static final String BASE_URL = "https://www.christoffer.online/";
    public static final String LINKED_IN_URL = "https://www.linkedin.com/in/i-am-christoffer/";

    public static void main(String[] args) throws LatteSiteException {

        SiteSettings settings = new SiteSettings(
                SITE_NAME,
                BASE_URL,
                List.of(new Locale("en"))
        );
        LogService logService = new LogService();
        LinkService linkService = new LinkService(settings);
        FileService fileService = new FileService(logService);
        SitemapService sitemapService = new SitemapService(settings, logService, linkService, fileService);
        ElementGenerator elementGenerator = new ElementGenerator();
        PageGeneratorService pageGeneratorService = new PageGeneratorService(settings, logService, elementGenerator, linkService, fileService);
        StaticWebServerService staticWebServerService = new StaticWebServerService(logService);

        LatteSite site = new LatteSite(
                settings,
                fileService,
                sitemapService,
                staticWebServerService
        );

        /*
         * List of pages
         */

        List<Page> pages = new ArrayList<>();

        pages.add(new FrontPage(linkService));

        /*
         * Generate
         */

        site.generate(pages);

        /*
         * Start a local webserver
         */

        site.serve(8123);

    }

}