package online.christoffer.www.data;

public enum Experience {

    MINDOKTOR_MARKETING(
            "2017",
            null,
            "Senior Developer Marketing Technologist",
            "Min Doktor",
            "Malmö, Sweden",
            new String[]{
                    "As Marketing Technologist I am responsible for everything related to technology for the Growth & Marketing department.",
                    "Internal and external tools investigation, configuration, integration and trouble shooting.",
                    "Full stack development, as I am required to develop solutions in all of the company's products",
                    "Product development in regards to Growth business requirements, such as analytics tracking and personal content product customizations.",
                    "Security work in regards to investigation, documentation and technical implementations of marketing and personal identified data, as well as being GDPR compliant.",
                    "Project management and lead in regards to coordinate with other internal and external technical teams in regards to Growth projects and product development.",
                    "Main technologies used: Really a lot of Growth tools and solutions, JavaScript / TypeScript, BigQuery Data Warehouse, Go.",
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.ENGINEERING_SOFTWARE_ARCHITECT,
                    Tag.BUSINESS_GROWTH,
                    Tag.BUSINESS_MARKETING,
                    Tag.SECURITY_GDPR,
                    Tag.SECURITY_INFORMATION_SECURITY,
                    Tag.DB_POSTGRES,
                    Tag.DB_REDIS,
                    Tag.DB_BIGQUERY,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.LANG_JAVASCRIPT,
                    Tag.LANG_TYPESCRIPT,
                    Tag.LANG_GOLANG,
                    Tag.CI_CIRCLECI,
                    Tag.CLOUD_GCP,
                    Tag.CLOUD_NETLIFY,
                    Tag.OS_MACOS,
                    Tag.BUILD_DOCKER,
                    Tag.FRAMEWORK_GATSBY,
                    Tag.FRAMEWORK_REACT,
                    Tag.LANG_JSX,
                    Tag.CLOUD_GATSBY,
                    Tag.CLOUD_VERCEL,
                    Tag.BUSINESS_OKR_KPI,
                    Tag.ACCESSIBILITY_PRACTICES,
                    Tag.DB_EVENT_MESSAGING_SYSTEMS,
                    Tag.CODE_REVIEW_JIRA,
                    Tag.CODE_REVIEW_ASANA,
                    Tag.CDP_SEGMENT,
                    Tag.FRAMEWORK_NODE,
                    Tag.BUSINESS_STRATEGIC_PLANING,
            }
    ),

    MINDOKTOR_FE(
            "2016",
            "2017",
            "Senior Front End Web Developer",
            "Min Doktor",
            "Malmö, Sweden",
            new String[]{
                    "Development of the company's web products and other web associated solutions.",
                    "Created a toolbox in order to stream line the production deployment process which involves dozen of different software tools and technologies, into single commands developers and build environments now utilize together.",
                    "Applied static code analysis tools on source code, fixed around hundreds of errors and improved the company's build and continuous integration tools so that it tests front- and backend unit, end-to-end and auto tests while also testing production deploy processes.",
                    "Worked on site and product analytics and metrics, especially implementing the Google Analytics Measurement Protocol.",
            },
            new Tag[]{
                    Tag.BUILD_WEBPACK,
                    Tag.BUSINESS_OKR_KPI,
                    Tag.CI_CIRCLECI,
                    Tag.CLOUD_GCP,
                    Tag.CODE_REVIEW_GITHUB,
                    Tag.CODE_REVIEW_PHABRICATOR,
                    Tag.DB_POSTGRES,
                    Tag.DB_REDIS,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.FRAMEWORK_ANGULAR,
                    Tag.LANG_CSS,
                    Tag.LANG_GOLANG,
                    Tag.LANG_HTML,
                    Tag.LANG_JAVA,
                    Tag.LANG_SCSS,
                    Tag.OS_MACOS,
                    Tag.SECURITY_PEN_TESTING,
                    Tag.WORKFLOW_KANBAN,
                    Tag.FRAMEWORK_NODE,
            }
    ),

    TWO_DOT_OH(
            "2007",
            null,
            "Web & Software Development House - Sole proprietorship",
            "Two-Dot-Oh",
            "Malmö, Sweden",
            new String[]{
                    "A small computer software and web development studio based in Sweden building stuff from scratch.",
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT,
                    Tag.ENGINEERING_SOFTWARE_CONSULTING,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.BUSINESS_ENTREPRENEURSHIP,
                    Tag.BUSINESS_MANAGEMENT,
                    Tag.LANG_TYPESCRIPT,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.LANG_LESS,
                    Tag.ENGINEERING_DOMAIN_MANAGEMENT,
                    Tag.CLOUD_AWS,
                    Tag.CLOUD_DIGITAL_OCEAN,
                    Tag.CLOUD_GCP,
                    Tag.FRAMEWORK_NODE,
                    Tag.BUSINESS_STRATEGIC_PLANING,
                    Tag.FRAMEWORK_CHATGPT,
            }
    ),

    BROKEN_AT_RELEASE(
            "2020",
            null,
            "Gaming Studio - Sole proprietorship",
            "Broken At Release Game Studio",
            "Malmö, Sweden",
            new String[]{
                    "Game development and publishing studio focusing on original IPs.",
            },
            new Tag[]{
                    Tag.ENGINEERING_GAME_DEVELOPMENT,
                    Tag.FRAMEWORK_UNITY,
                    Tag.LANG_CSHARP,
                    Tag.BUSINESS_ENTREPRENEURSHIP,
                    Tag.FRAMEWORK_NODE,
                    Tag.BUSINESS_STRATEGIC_PLANING,
                    Tag.FRAMEWORK_CHATGPT,
            }
    ),

    NETSET_2015(
            "2013",
            "2016",
            "Front End Web Engineer",
            "Netset AB",
            "Malmö, Sweden",
            new String[]{
                    "Helped migrating Atea's e-commerce web shop (Europe's third largest provider of IT-infrastructure) to a fully responsive website, which should support phone, tablets, desktop (IE9+).",
                    "Helped streamline the front end development process by structuring and organizing the project's toolbox and best practices, including updating build process and writing own open source tools.",
                    "Helped creating the project's component library, which includes both HTML, CSS and JavaScript implementation of reusable and scalable components.",
                    "Lead developer of the AngularJS part of the project",
                    "Helped the Java backend development.",
            },
            new Tag[]{
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.LANG_JAVASCRIPT,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.LANG_LESS,
                    Tag.FRAMEWORK_ANGULAR,
                    Tag.CI_HUDSON,
                    Tag.WORKFLOW_KANBAN,
                    Tag.REVISION_GIT,
                    Tag.CODE_REVIEW_GERRIT,
                    Tag.DB_MSSQL,
                    Tag.DB_MONGODB,
                    Tag.LANG_JAVA,
                    Tag.BUSINESS_ECOMMERCE,
                    Tag.BUILD_TOOL_GRADLE,
                    Tag.BUILD_TOOL_JENKINS,
                    Tag.CI_JENKINS,
                    Tag.OS_WINDOWS,
            }
    ),
    QLIK(
            "2013",
            "2015",
            "JavaScript Web Developer",
            "Qlik",
            "Lund, Sweden",
            new String[]{
                    "Qlik is the company behind QlikView and QlikSense, the leading Business Discovery platform that delivers user-driven business intelligence (BI) with over 29,000 customers in more than 100 countries and over 1,500 employees worldwide.",
                    "Working as a JavaScript Web Developer on the QlikSense product at the Research & Development department in Lund in a small unit in responsible for the Data Load Editor and the Data Model Viewer parts of the product which performs ETL (Extract, Transform and Load) concerning BI data.",
                    "Rewrote and is currently the sole and primary developer of the Data Model Viewer product part.",
                    "Helped RnD by (among other things) pushing front-end unit testing, upgraded web development tools, built product wide GUI-component library, static code analysis tool (that is currently used in all builds), helped enforce coding conventions, rules, best practices, adopting git SCM tool and code review.",
                    "Been personally thanked and appreciated multiple times by my developer manager and by members of the Executive Team, including the CTO and Senior Vice President of Products, located in Qlik HQ in USA, for my hard work, ambition and product deliveries.",
            },
            new Tag[]{
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.LANG_JAVASCRIPT,
                    Tag.FRAMEWORK_ANGULAR,
                    Tag.TESTING_TTD,
                    Tag.REVISION_TFS,
                    Tag.WORKFLOW_AGILE,
                    Tag.WORKFLOW_SCRUM,
                    Tag.BUSINESS_BIG_DATA,
                    Tag.BUSINESS_BUSINESS_INTELLIGENCE,
                    Tag.DB_BIGTABLE,
                    Tag.OS_WINDOWS,
                    Tag.BUILD_TOOL_GULP,
                    Tag.BUILD_TOOL_GRUNT,
            }
    ),

    NETSET_2009(
            "2009",
            "2013",
            "Java Web Developer",
            "Netset AB",
            "Malmö, Sweden",
            new String[]{
                    "A part of an eight man team to maintain one of Nordics biggest infrastructure solutions and services company’s webshop.",
                    "Web and system developer, responsible of providing and maintaining solutions in both back- and front-end (everything from the web server to implementing fade effects in JavaScript).",
                    "Continuous focus on security, optimization and scalability, by using having several development environments, local, testing, qa and production/live.",
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.REVISION_CVS,
                    Tag.REVISION_SVN,
                    Tag.REVISION_GIT,
                    Tag.CODE_REVIEW_GERRIT,
                    Tag.LANG_JAVASCRIPT,
                    Tag.DB_MSSQL,
                    Tag.DB_ORACLE,
                    Tag.LANG_HTML,
                    Tag.LANG_CSS,
                    Tag.LANG_JAVASCRIPT,
                    Tag.DATAFORMAT_XML,
                    Tag.DATAFORMAT_HESSIAN,
                    Tag.BUSINESS_ECOMMERCE,
                    Tag.LANG_JQUERY,
                    Tag.CI_HUDSON,
                    Tag.FRAMEWORK_MUSTACHE,
                    Tag.TESTING_BDD,
                    Tag.BUILD_TOOL_ANT,
                    Tag.WORKFLOW_WATERFALL,
                    Tag.BUILD_TOOL_MAVEN,
                    Tag.OS_UBUNTU,
            }
    ),

    WEHEGA_2(
            "2009",
            "2009",
            "Software Developer Consultant",
            "Wehega AB",
            "Lund, Sweden",
            new String[]{
                    "Consulting software engineer, responsible to data mine information from various websites, transform the data and export it to the client's system."
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_CONSULTING,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
            }
    ),

    TETRAPAK(
            "2008",
            "2008",
            "Web Consultant",
            "Tetra Pak",
            "Lund, Sweden",
            new String[]{
                    "Employed as a consultant at the IT-department of Tetra Pak to deliver into their web solution."
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_CONSULTING,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
            }
    ),

    SPLITSPORTS_MIRRORANDME(
            "2008",
            "2008",
            "Web and System Developer",
            "Splitsports AB",
            "Helsingborg, Sweden",
            new String[]{
                    "Consulting software engineer, responsible to help the company creating their new solution named Mirror & Me.",
                    "Unfortunately details of the solution and my work is still restricted by a Non-Disclosure Agreement (NDA)."
            },
            new Tag[]{
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.BUSINESS_ENTREPRENEURSHIP,
                    Tag.ENGINEERING_KIOSK_DEVELOPMENT,
                    Tag.LANG_JAVA,
            }
    ),

    WEHEGA(
            "2007",
            "2007",
            "Web Consultant",
            "Wehega AB",
            "Lund, Sweden",
            new String[]{
                    "Consulting web developer, responsible for developing various parts of their new home interior site.",
                    "Work included developing and improving session management, live searching and international localization solutions."
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_CONSULTING,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.BUSINESS_ENTREPRENEURSHIP,
                    Tag.ACCESSIBILITY_LOCALIZATION
            }
    ),
    SPLITSPORTS(
            "2007",
            "2008",
            "Software Solution Consultant",
            "Splitsports AB",
            "Helsingborg, Sweden",
            new String[]{
                    "Consulting software engineer, responsible for developing of a solution that would stream a live video feed over the Internet that should be viewable on a website.",
                    "Work also included to create a small web based community website for schools."
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_CONSULTING,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.BUSINESS_ENTREPRENEURSHIP
            }
    ),
    LUND_UNIVERSITY_LAB_LEADER(
            "2005",
            "2007",
            "Java and Computer Laboratory Leader",
            "Lunds Universitet",
            "Lund, Sweden",
            new String[]{
                    "Employed by the Department of Computer Science, Lund University, as a laboratory leader in a computer, Java and computer usage and computer science courses.",
                    "Main tasks involved teaching the basics of Unix, computer hardware, Internet and low level programming.",
                    "Main tasks involved teaching and helping new students using the university's computer systems, Unix Solaris, Debian Linux and Microsoft Windows.",
                    "Main responsibility was to help teach students Java, object oriented programming and other software development patterns and anti-patterns."
            },
            new Tag[]{
                    Tag.MISC_PEDAGOGY,
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT,
                    Tag.ENGINEERING_COMPUTER_SCIENCE,
                    Tag.LANG_JAVA,
                    Tag.OS_SOLARIS
            }
    ),

    SONY_ERICSSON(
            "2006",
            "2006",
            "Software Developer",
            "Sony Ericsson",
            "Lund, Sweden",
            new String[]{
                    "Seasonal job at the User Interface Design department at Sony Ericsson Mobile Communications.",
                    "Main tasks involved developing J2ME MIDlets for graphical interfaces, which were later used as prototypes during usability evaluations.",
                    "The work also demanded a close collaboration with other departments within Sony Ericsson Mobile Communications."
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_CONSULTING,
                    Tag.LANG_JAVA,
                    Tag.TECH_J2ME_MIDP,
                    Tag.ACCESSIBILITY_UI_UX_DEVELOPMENT,
            }
    ),

    BONDENARA(
            "2006",
            "2006",
            "Webmaster and Software Developer",
            "Bondenära AB",
            "Lund, Sweden",
            new String[]{
                    "Employed by Bondenära AB to develop a new business system for a new Swedish ecological brand.",
                    "Development involved development user, invoice administrative systems and database optimizations."
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_CONSULTING,
                    Tag.ENGINEERING_WEB_DEVELOPMENT,
                    Tag.BUSINESS_MANAGEMENT,
                    Tag.DB_MYSQL,
                    Tag.LANG_PHP,
                    Tag.ENGINEERING_SOFTWARE_ARCHITECT,
                    Tag.ACCESSIBILITY_UI_UX_DEVELOPMENT,
            }
    );

    private final String yearStart;
    private final String yearEnd;
    private final String title;
    private final String companyName;
    private final String location;
    private final String[] bullets;
    private final Tag[] tags;

    Experience(
            String yearStart,
            String yearEnd,
            String title,
            String companyName,
            String location,
            String[] bullets,
            Tag[] tags
    ) {
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.title = title;
        this.companyName = companyName;
        this.location = location;
        this.bullets = bullets;
        this.tags = tags;
    }

    public String getYearStart() {
        return this.yearStart;
    }

    public String getYearEnd() {
        return this.yearEnd;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getLocation() {
        return this.location;
    }

    public String[] getBullets() {
        return this.bullets;
    }

    public Tag[] getTags() {
        return this.tags;
    }
}