package online.christoffer.www.data;

public enum Project {

    SIMPLE_PASSWORD_GENERATOR(
            2023,
            "Simple-Password-Generator",
            new String[]{
                    "Probably the easiest and most user-friendly way to generate strong and secure passwords instantly online with privacy and protection first in mind.",
                    "A password generator designed to enhance your online security effortlessly. This user-friendly tool is available instantly through web browsers, allowing you to create robust and secure passwords for your various online accounts.",
                    "It will generate complex passwords that are nearly impossible for hackers to decipher, by incorporating a mix of letters, numbers, and special characters, it constructs passwords that are resilient against common security threats.",
                    "Furthermore, since it operates entirely on the front-end, your generated passwords remain private and secure, minimizing the risk of interception."
            },
            new Tag[]{
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.LANG_TYPESCRIPT,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.LANG_JAVA,
                    Tag.ENGINEERING_DOMAIN_MANAGEMENT
            },
            new String[]{
                    "/images/projects/simplepasswordgenerator1.png",
            }
    ),

    CASE_1472(
            2022,
            "Case #1472",
            new String[]{
                    "A  mystery information digging interrogation thriller game developed for Windows.",
                    "Game developed in the Unity game engine using C#."
            },
            new Tag[]{
                    Tag.ENGINEERING_GAME_DEVELOPMENT,
                    Tag.LANG_CSHARP,
                    Tag.FRAMEWORK_UNITY
            },
            new String[]{
                    "/images/projects/case1472_1_small.webp",
                    "/images/projects/case1472_2_small.webp",
            }
    ),
    SIMPLE_VTUBING_APP(
            2022,
            "Simple VTubing App Desktop Application",
            new String[]{
                    "A simple VTubing app for virtual content creators that do not want the hassle of a camera for motion capturing, but still have voice monitoring, to be able visually represent themselves virtually with their avatar and accessories to their community!",
                    "The client was in TypeScript and shipped as en Electron application, while the backend was in Java using MySQL. Distributed via Steam it has been activated 21,000 times so far."
            },
            new Tag[]{
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.LANG_TYPESCRIPT,
                    Tag.LANG_JAVASCRIPT,
                    Tag.LANG_JAVA,
                    Tag.DB_MYSQL,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.CLOUD_AWS,
                    Tag.CLOUD_STEAM,
                    Tag.BUSINESS_MANAGEMENT,
                    Tag.TECH_FFMPEG
            },
            new String[]{
                    "/images/projects/simplevtubingapp1.png"
            }
    ),
    SIMPLE_VIDEO_CONVERTER(
            2022,
            "Simple Video Converter Desktop Application",
            new String[]{
                    "Easily edit and convert your gaming highlights, live stream moments and Twitch clips into Instagram Reels, TikTok videos, YouTube shorts or to any other social media platform format with only a few clicks!",
                    "The client was in TypeScript and shipped as en Electron application, while the backend was in Java using MySQL and FFmpeg. Distributed via Steam it has currently been activated 9000 times before it got discontinued."
            },
            new Tag[]{
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.LANG_TYPESCRIPT,
                    Tag.LANG_JAVASCRIPT,
                    Tag.LANG_JAVA,
                    Tag.DB_MYSQL,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.CLOUD_AWS,
                    Tag.CLOUD_STEAM,
                    Tag.BUSINESS_MANAGEMENT
            },
            new String[]{
                    "/images/projects/simplevideoconverter1_small.webp",
                    "/images/projects/simplevideoconverter2_small.webp",
                    "/images/projects/simplevideoconverter3_small.webp",
            }
    ),
    IAMHUMAN(
            2018,
            "I Am Human!",
            new String[]{
                    "I Am Human! is an intelligence gathering bluffing party game where one of the players is a disguised alien impostor that has infiltrated the group of humans for an upcoming alien invasion of Earth. Players take turns interrogating each other to try and unmask who among them is the alien impostor.",
                    "The client was in TypeScript and shipped as en Electron application, while the backend was in Java using MySQL . Distributed via Steam it was activated more than 15000 times before it got paused."
            },
            new Tag[]{
                    Tag.ENGINEERING_GAME_DEVELOPMENT,
                    Tag.BUSINESS_MANAGEMENT,
                    Tag.FRAMEWORK_ELECTRON,
                    Tag.LANG_TYPESCRIPT,
                    Tag.LANG_JAVASCRIPT,
                    Tag.LANG_HTML,
                    Tag.LANG_JAVA,
                    Tag.DB_MYSQL,
                    Tag.CLOUD_AWS,
            },
            new String[]{
                    "/images/projects/iamhuman1_small.webp",
                    "/images/projects/iamhuman2_small.webp",
                    "/images/projects/iamhuman3_small.webp",
                    "/images/projects/iamhuman4_small.webp",
                    "/images/projects/iamhuman5_small.webp",
            }
    ),
    PLAYER_GG(
            2018,
            "Player.GG Gaming Community",
            new String[]{
                    "Player.GG's goal was to create the most beneficial social gaming platform where gamers can interact with each other and discover new interesting gaming related content by creating useful services and products for everyone in the gaming community in order to collect and structure gaming related content into one convenient spot.",
                    "The site had over 10,000 monthly visitors thousands of registered users before being discontinued and sold off."
            },
            new Tag[]{
                    Tag.ENGINEERING_DOMAIN_MANAGEMENT,
                    Tag.LANG_HTML,
                    Tag.BUSINESS_MANAGEMENT,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.DB_MYSQL,
                    Tag.LANG_DART,
                    Tag.LANG_JAVASCRIPT,
                    Tag.LANG_TYPESCRIPT,
                    Tag.LANG_JAVA,
                    Tag.CLOUD_DIGITAL_OCEAN,
                    Tag.BUSINESS_ENTREPRENEURSHIP
            },
            new String[]{
                    "/images/projects/playergg1.png",
                    "/images/projects/playergg2.png",
                    "/images/projects/playergg3.png",
            }
    ),
    PLANEMO_CODE_ANALYSIS(
            2013,
            "Planemo Code Analysis Tool",
            new String[]{
                    "Planemo was an open source static code analysis tool that went through all the code in the repository (no matter the language) and asserted it towards coding conventions, rules and best practices. Written in Google's Dart language."
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT, Tag.ENGINEERING_FIELD_OPEN_SOURCE, Tag.TESTING_STATIC_CODE_ANALYSIS, Tag.LANG_DART
            },
            new String[0]
    ),

    OSBCP_CSS_PARSER(
            2011,
            "OSBCP CSS Parser",
            new String[]{
                    "A CSS parser written in Java that also acted like a very strict linter. Open Sourced under the Apache 2.0 license and has so far received community 73 stars and has been forked 45 times."
            },
            new Tag[]{
                    Tag.LANG_JAVA,
                    Tag.ENGINEERING_FIELD_OPEN_SOURCE,
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT,
                    Tag.LANG_CSS
            },
            new String[0]
    ),
    EASY_PRESENTATION_CONTROLLER(
            2010,
            "Easy Presentation Controller",
            new String[]{
                    "An Android application that allowed the user to control a presentation held by another computer by sending commands over the network to the " +
                            "computer by doing as different hand motions, such as a single tap, double tap and swift left or right on the Android device screen."
            },
            new Tag[]{
                    Tag.ENGINEERING_APP_DEVELOPMENT, Tag.LANG_JAVA, Tag.FRAMEWORK_ANDROID
            },
            new String[0]
    ),

    ALLAHYRFILMER(
            2010,
            "Allahyrfilmer.se (All Rental Movies)",
            new String[]{
                    "A service that scraped information of all rental movies offered by the biggest rental movie sites in Sweden.",
                    "Visitors could then browser and search for specific movies, view detailed movie information and compare rental prices.",
                    "Website was sold to a third party."
            },
            new Tag[]{
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.ENGINEERING_DOMAIN_MANAGEMENT,
                    Tag.BUSINESS_MANAGEMENT,
                    Tag.LANG_PHP,
                    Tag.FRAMEWORK_APACHE_WEBSERVER,
                    Tag.DB_MYSQL,
                    Tag.ENGINEERING_DEVOPS,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
            },
            new String[0]
    ),

    CEASYHEALER(
            2010,
            "cEasyHealer",
            new String[]{
                    "A World of Warcraft addon extension written in Lua with more than 1000 downloads and got forked into even better addons that still lives on today."
            },
            new Tag[]{Tag.ENGINEERING_GAME_DEVELOPMENT, Tag.LANG_LUA, Tag.ENGINEERING_FIELD_OPEN_SOURCE, Tag.BUSINESS_ENTREPRENEURSHIP
            },
            new String[]{
                    "/images/projects/ceasyhealer1.png",
                    "/images/projects/ceasyhealer2.png",
            }
    ),

    MIRROR_AND_ME(
            2008,
            "Mirror & Me",
            new String[]{
                    "Joined a collaboration of other student entrepreneurs in order to build and release a product for clothing retailers that would their customers to create a digital wardrobe.",
                    "Developed a Java application that was embedded in a Windows kiosk computer with a touch screen and camera.",
            },
            new Tag[]{
                    Tag.LANG_JAVA,
                    Tag.TECH_BLUETOOTH,
                    Tag.BUSINESS_ENTREPRENEURSHIP,
                    Tag.ENGINEERING_KIOSK_DEVELOPMENT
            },
            new String[]{
                    "/images/projects/mirrorandme1.png"
            }
    ),

    VIIBE(
            2007,
            "Viibe",
            new String[]{
                    "Joined a collaboration of developers and grapic designers to develop a dating service called Viibe. The goal of Viibe was to find and hook people up by Bluetooth, based on personal criterias such as age, hair color and personality traits.",
                    "I developed the Java MIDlet-client in J2ME MIDP 2.0 which used Bluetooth to communicate with other clients.",
                    "A brief preview of the solution is still available at http://www.youtube.com/user/feeltheviibe/",
            },
            new Tag[]{
                    Tag.ENGINEERING_APP_DEVELOPMENT, Tag.TECH_J2ME_MIDP, Tag.LANG_JAVA, Tag.TECH_BLUETOOTH, Tag.BUSINESS_ENTREPRENEURSHIP
            },
            new String[]{
                    "/images/projects/viibe.png",
            }
    ),

    MINAFILER(
            2005,
            "Minafiler.org (My Files)",
            new String[]{
                    "A service that allowed it's members to upload and store files online and make them available over the internet. An international version was created called TempBox. Website was sold to a third party.",
            },
            new Tag[]{Tag.ENGINEERING_DOMAIN_MANAGEMENT,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.ENGINEERING_DEVOPS,
                    Tag.LANG_PHP,
                    Tag.FRAMEWORK_APACHE_WEBSERVER,
                    Tag.DB_MYSQL,
                    Tag.BUSINESS_MANAGEMENT,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.BUSINESS_ENTREPRENEURSHIP
            },
            new String[]{
                    "/images/projects/minafiler1.png",
                    "/images/projects/minafiler2.png",
                    "/images/projects/minafiler3.png",
                    "/images/projects/minafiler4.png",
            }
    ),

    WEBHOTELLSGUIDEN(
            2003,
            "Webhotellsguiden.net (The Web Hosting Guide)",
            new String[]{
                    "A service for both private persons and companies to read information concerning running web hosting services.",
                    "Web hosting companies could register their service and submit their packet solution. Visitors could search and compare the different solutions, check domain name availability.",
                    "Also included an in-house advertisement solution. Website was eventually sold to a third party.",
            },
            new Tag[]{
                    Tag.ENGINEERING_DOMAIN_MANAGEMENT,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.ENGINEERING_DEVOPS,
                    Tag.LANG_PHP,
                    Tag.FRAMEWORK_APACHE_WEBSERVER,
                    Tag.DB_MYSQL,
                    Tag.BUSINESS_MANAGEMENT,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.BUSINESS_ENTREPRENEURSHIP
            },
            new String[0]
    ),

    GODWARS(
            2007,
            "The GodWars: Shadows of the Past MUD",
            new String[]{
                    "GodWars was a MUD (Multi-User Dungeon) engine, meaning an online text-based multiplayer real-time virtual world that you connected to via Telnet (a specific network application protocol).",
                    "Did both basic C coding development on the engine and creating an international gaming community website in PHP with more than 2000 registered users with features such as forums, private messaging and displaying ads.",
            },
            new Tag[]{
                    Tag.ENGINEERING_GAME_DEVELOPMENT,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT,
                    Tag.LANG_C,
                    Tag.LANG_PHP,
                    Tag.FRAMEWORK_APACHE_WEBSERVER,
                    Tag.LANG_SQL,
                    Tag.DB_MYSQL,
                    Tag.ENGINEERING_NETWORK_CODING,
                    Tag.ENGINEERING_DEVOPS,
                    Tag.OS_LINUX,
            },
            new String[0]
    ),

    CMUD(
            2002,
            "cMUD Desktop Network Client",
            new String[]{
                    "cMUD was a distributed Windows Desktop application with the goal to connect to an online MUD server and act as a bot.",
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT,
                    Tag.ENGINEER_DESKTOP_DEVELOPMENT,
                    Tag.ENGINEERING_NETWORK_CODING,
                    Tag.LANG_OBJECT_PASCAL,
            },
            new String[]{
                    "/images/projects/cmud.png"
            }
    );

    private final int year;
    private final String title;
    private final String[] description;
    private final Tag[] tags;
    private final String[] imageURLs;

    Project(
            int year,
            String title,
            String[] description,
            Tag[] tags,
            String[] imageURLs
    ) {
        this.year = year;
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.imageURLs = imageURLs;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String[] getDescription() {
        return description;
    }

    public Tag[] getTags() {
        return tags;
    }

    public String[] getImageURLs() {
        return imageURLs;
    }
}