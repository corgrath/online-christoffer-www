package online.christoffer.www.data;

public enum Tag {

    LANG_JAVA(TagCategory.LANG, TagSkillLevel.ACTIVE, "Java"),
    LANG_C(TagCategory.LANG, TagSkillLevel.FORGOTTEN, "C"),
    LANG_PHP(TagCategory.LANG, TagSkillLevel.FORGOTTEN, "PHP"),
    LANG_SQL(TagCategory.LANG, TagSkillLevel.ACTIVE, "SQL"),
    LANG_LUA(TagCategory.LANG, TagSkillLevel.FORGOTTEN, "Lua"),
    LANG_CSS(TagCategory.LANG, TagSkillLevel.ACTIVE, "CSS"),
    LANG_JAVASCRIPT(TagCategory.LANG, TagSkillLevel.ACTIVE, "JavaScript"),
    LANG_TYPESCRIPT(TagCategory.LANG, TagSkillLevel.ACTIVE, "TypeScript"),
    LANG_DART(TagCategory.LANG, TagSkillLevel.FORGOTTEN, "Dart"),
    LANG_SCSS(TagCategory.LANG, TagSkillLevel.ACTIVE, "SCSS"),
    LANG_LESS(TagCategory.LANG, TagSkillLevel.ACTIVE, "Less"),
    LANG_HTML(TagCategory.LANG, TagSkillLevel.ACTIVE, "HTML"),
    LANG_CSHARP(TagCategory.LANG, TagSkillLevel.FORGOTTEN, "C#"),
    LANG_GOLANG(TagCategory.LANG, TagSkillLevel.ACTIVE, "Go"),
    LANG_JQUERY(TagCategory.LANG, TagSkillLevel.FORGOTTEN, "jQuery"),
    LANG_JSX(TagCategory.LANG, TagSkillLevel.ACTIVE, "JSX (JavaScript XML)"),
    LANG_OBJECT_PASCAL(TagCategory.LANG, TagSkillLevel.FORGOTTEN, "Delphi (Object Pascal)"),

    DATAFORMAT_JSON(TagCategory.DATAFORMAT, TagSkillLevel.ACTIVE, "JSON"),
    DATAFORMAT_YAML(TagCategory.DATAFORMAT, TagSkillLevel.ACTIVE, "YAML"),
    DATAFORMAT_CSV(TagCategory.DATAFORMAT, TagSkillLevel.ACTIVE, "CSV"),
    DATAFORMAT_XML(TagCategory.DATAFORMAT, TagSkillLevel.ACTIVE, "XML"),
    DATAFORMAT_PROTO_BUFFER(TagCategory.DATAFORMAT, TagSkillLevel.ACTIVE, "Proto Buffers"),
    DATAFORMAT_HESSIAN(TagCategory.DATAFORMAT, TagSkillLevel.FORGOTTEN, "Hessian"),

    DB_MSSQL(TagCategory.DB, TagSkillLevel.FORGOTTEN, "MSSQL"),
    DB_MYSQL(TagCategory.DB, TagSkillLevel.ACTIVE, "MySQL"),
    DB_ORACLE(TagCategory.DB, TagSkillLevel.FORGOTTEN, "Oracle Database"),
    DB_BIGTABLE(TagCategory.DB, TagSkillLevel.FORGOTTEN, "Google BigTable"),
    DB_MONGODB(TagCategory.DB, TagSkillLevel.FORGOTTEN, "MongoDB"),
    DB_POSTGRES(TagCategory.DB, TagSkillLevel.ACTIVE, "PostgreSQL"),
    DB_BIGQUERY(TagCategory.DB, TagSkillLevel.ACTIVE, "Google BigQuery"),
    DB_REDIS(TagCategory.DB, TagSkillLevel.ACTIVE, "Redis"),
    DB_EVENT_MESSAGING_SYSTEMS(TagCategory.FRAMEWORKS, TagSkillLevel.ACTIVE, "Event Messaging Systems (PubSub/NATS)"),

    REVISION_CVS(TagCategory.VERSION_CONTROL_SYSTEM, TagSkillLevel.FORGOTTEN, "CVS (Concurrent Versioning System)"),
    REVISION_SVN(TagCategory.VERSION_CONTROL_SYSTEM, TagSkillLevel.FORGOTTEN, "SVN (Apache Subversion)"),
    REVISION_GIT(TagCategory.VERSION_CONTROL_SYSTEM, TagSkillLevel.ACTIVE, "Git"),
    REVISION_TFS(TagCategory.VERSION_CONTROL_SYSTEM, TagSkillLevel.FORGOTTEN, "TFS (Team Foundation Server)"),

    BUILD_TOOL_ANT(TagCategory.BUILD_TOOL, TagSkillLevel.FORGOTTEN, "Apache Ant"),
    BUILD_TOOL_MAVEN(TagCategory.BUILD_TOOL, TagSkillLevel.FORGOTTEN, "Maven"),
    BUILD_TOOL_GRADLE(TagCategory.BUILD_TOOL, TagSkillLevel.FORGOTTEN, "Gradle"),
    BUILD_TOOL_JENKINS(TagCategory.BUILD_TOOL, TagSkillLevel.FORGOTTEN, "Jenkins"),
    BUILD_DOCKER(TagCategory.BUILD_TOOL, TagSkillLevel.FORGOTTEN, "Docker"),
    BUILD_WEBPACK(TagCategory.BUILD_TOOL, TagSkillLevel.FORGOTTEN, "Webpack"),
    BUILD_TOOL_GULP(TagCategory.BUILD_TOOL, TagSkillLevel.FORGOTTEN, "Gulp.js"),
    BUILD_TOOL_GRUNT(TagCategory.BUILD_TOOL, TagSkillLevel.FORGOTTEN, "Grunt.js"),

    CODE_REVIEW_GERRIT(TagCategory.TEAM_COLLAB_TOOL, TagSkillLevel.FORGOTTEN, "Gerrit"),
    CODE_REVIEW_GITHUB(TagCategory.TEAM_COLLAB_TOOL, TagSkillLevel.ACTIVE, "GitHub"),
    CODE_REVIEW_JIRA(TagCategory.TEAM_COLLAB_TOOL, TagSkillLevel.ACTIVE, "JIRA"),
    CODE_REVIEW_ASANA(TagCategory.TEAM_COLLAB_TOOL, TagSkillLevel.FORGOTTEN, "Asana"),
    CODE_REVIEW_PHABRICATOR(TagCategory.TEAM_COLLAB_TOOL, TagSkillLevel.FORGOTTEN, "Phabricator"),

    CLOUD_DIGITAL_OCEAN(TagCategory.CLOUD_SERVICE_PROVIDER, TagSkillLevel.ACTIVE, "DigitalOcean"),
    CLOUD_AWS(TagCategory.CLOUD_SERVICE_PROVIDER, TagSkillLevel.ACTIVE, "Amazon Web Services"),
    CLOUD_STEAM(TagCategory.CLOUD_SERVICE_PROVIDER, TagSkillLevel.ACTIVE, "Steam"),
    CLOUD_GCP(TagCategory.CLOUD_SERVICE_PROVIDER, TagSkillLevel.ACTIVE, "Google Cloud Platform"),
    CLOUD_NETLIFY(TagCategory.CLOUD_SERVICE_PROVIDER, TagSkillLevel.ACTIVE, "Netlify"),
    CLOUD_GATSBY(TagCategory.CLOUD_SERVICE_PROVIDER, TagSkillLevel.FORGOTTEN, "Gatsby Cloud"),
    CLOUD_VERCEL(TagCategory.CLOUD_SERVICE_PROVIDER, TagSkillLevel.FORGOTTEN, "Vercel"),

    CDP_SEGMENT(TagCategory.CDP, TagSkillLevel.ACTIVE, "Segment"),

    CI_HUDSON(TagCategory.CONTINUOUS_INTEGRATION_TOOL, TagSkillLevel.FORGOTTEN, "Hudson"),
    CI_JENKINS(TagCategory.CONTINUOUS_INTEGRATION_TOOL, TagSkillLevel.FORGOTTEN, "Jenkins"),
    CI_CIRCLECI(TagCategory.CONTINUOUS_INTEGRATION_TOOL, TagSkillLevel.FORGOTTEN, "CircleCI"),

    TESTING_BDD(TagCategory.TESTING_PRACTICES, TagSkillLevel.ACTIVE, "BBD (Behavior-Driven Development)"),
    TESTING_TTD(TagCategory.TESTING_PRACTICES, TagSkillLevel.ACTIVE, "TTD (Test Driven Development"),
    TESTING_USABILITY(TagCategory.TESTING_PRACTICES, TagSkillLevel.FORGOTTEN, "Usability Testing"),
    TESTING_STATIC_CODE_ANALYSIS(TagCategory.TESTING_PRACTICES, TagSkillLevel.ACTIVE, "Static Code Analysis & Linting"),

    WORKFLOW_WATERFALL(TagCategory.PROJECT_MANAGEMENT_METHODOLOGIES, TagSkillLevel.FORGOTTEN, "Waterfall"),
    WORKFLOW_AGILE(TagCategory.PROJECT_MANAGEMENT_METHODOLOGIES, TagSkillLevel.ACTIVE, "Agile"),
    WORKFLOW_SCRUM(TagCategory.PROJECT_MANAGEMENT_METHODOLOGIES, TagSkillLevel.ACTIVE, "Scrum"),
    WORKFLOW_KANBAN(TagCategory.PROJECT_MANAGEMENT_METHODOLOGIES, TagSkillLevel.ACTIVE, "Kanban"),

    OS_UBUNTU(TagCategory.OPERATING_SYSTEM, TagSkillLevel.FORGOTTEN, "Ubuntu"),
    OS_WINDOWS(TagCategory.OPERATING_SYSTEM, TagSkillLevel.ACTIVE, "Windows"),
    OS_MACOS(TagCategory.OPERATING_SYSTEM, TagSkillLevel.ACTIVE, "macOS"),
    OS_SOLARIS(TagCategory.OPERATING_SYSTEM, TagSkillLevel.FORGOTTEN, "Unix Oracle Solaris"),
    OS_MSDOS(TagCategory.OPERATING_SYSTEM, TagSkillLevel.FORGOTTEN, "MS-DOS"),
    OS_LINUX(TagCategory.OPERATING_SYSTEM, TagSkillLevel.FORGOTTEN, "Linux"),

    FRAMEWORK_NODE(TagCategory.FRAMEWORKS, TagSkillLevel.ACTIVE, "Node.js"),
    FRAMEWORK_ANDROID(TagCategory.FRAMEWORKS, TagSkillLevel.FORGOTTEN, "Android"),
    FRAMEWORK_ELECTRON(TagCategory.FRAMEWORKS, TagSkillLevel.ACTIVE, "Electron"),
    FRAMEWORK_MUSTACHE(TagCategory.FRAMEWORKS, TagSkillLevel.FORGOTTEN, "Mustache"),
    FRAMEWORK_ANGULAR(TagCategory.FRAMEWORKS, TagSkillLevel.FORGOTTEN, "AngularJS"),
    FRAMEWORK_REACT(TagCategory.FRAMEWORKS, TagSkillLevel.ACTIVE, "React"),
    FRAMEWORK_GATSBY(TagCategory.FRAMEWORKS, TagSkillLevel.ACTIVE, "Gatsby SSG"),
    FRAMEWORK_UNITY(TagCategory.FRAMEWORKS, TagSkillLevel.FORGOTTEN, "Unity 3D"),
    FRAMEWORK_APACHE_WEBSERVER(TagCategory.FRAMEWORKS, TagSkillLevel.FORGOTTEN, "Apache Webserver"),
    FRAMEWORK_CHATGPT(TagCategory.FRAMEWORKS, TagSkillLevel.ACTIVE, "ChatGPT"),

    TECH_J2ME_MIDP(TagCategory.TECHNOLOGIES, TagSkillLevel.FORGOTTEN, "J2ME"),
    TECH_BLUETOOTH(TagCategory.TECHNOLOGIES, TagSkillLevel.FORGOTTEN, "Bluetooth"),
    TECH_FFMPEG(TagCategory.TECHNOLOGIES, TagSkillLevel.FORGOTTEN, "FFmpeg"),

    ENGINEERING_COMPUTER_SCIENCE(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Computer Science"),
    ENGINEERING_SOFTWARE_DEVELOPMENT(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Software Development"),
    ENGINEERING_GAME_DEVELOPMENT(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Game Development"),
    ENGINEERING_WEB_DEVELOPMENT(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Web Development"),
    ENGINEERING_NETWORK_CODING(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Network Coding"),
    ENGINEERING_APP_DEVELOPMENT(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.FORGOTTEN, "Mobile App Development"),
    ENGINEERING_KIOSK_DEVELOPMENT(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.FORGOTTEN, "Kiosk Computer Development"),
    ENGINEERING_DEVOPS(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "DevOps"),
    ENGINEERING_DOMAIN_MANAGEMENT(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Domain Management"),
    ENGINEERING_SOFTWARE_CONSULTING(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Software Consulting"),
    ENGINEERING_SOFTWARE_ARCHITECT(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Software Architect"),
    ENGINEERING_INFOCOM(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.FORGOTTEN, "Information and Communication Engineering"),
    ENGINEERING_FIELD_OPEN_SOURCE(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Open Source Development"),
    ENGINEER_DESKTOP_DEVELOPMENT(TagCategory.ENGINEERING_PROCESSES, TagSkillLevel.ACTIVE, "Desktop Development"),

    SECURITY_GDPR(TagCategory.SECURITY_PRACTICES, TagSkillLevel.ACTIVE, "Data Protection Principles (GDPR)"),
    SECURITY_CYBERSECURITY(TagCategory.SECURITY_PRACTICES, TagSkillLevel.ACTIVE, "Cyber Security"),
    SECURITY_INFORMATION_SECURITY(TagCategory.SECURITY_PRACTICES, TagSkillLevel.ACTIVE, "Information Security"),
    SECURITY_PEN_TESTING(TagCategory.SECURITY_PRACTICES, TagSkillLevel.ACTIVE, "Penetration Testing"),

    BUSINESS_STRATEGIC_PLANING(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "Strategic Planing"),
    BUSINESS_MANAGEMENT(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "Business Management"),
    BUSINESS_BUSINESS_INTELLIGENCE(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "Business Intelligence"),
    BUSINESS_GROWTH(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "Growth, SEO & ASO"),
    BUSINESS_MARKETING(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "Marketing"),
    BUSINESS_OKR_KPI(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "OKR & KPI"),
    BUSINESS_ECOMMERCE(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "Ecommerce"),
    BUSINESS_BIG_DATA(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "Big Data"),
    BUSINESS_ENTREPRENEURSHIP(TagCategory.BUSINESS_PRACTICES, TagSkillLevel.ACTIVE, "Entrepreneurship"),

    ACCESSIBILITY_UI_UX_DEVELOPMENT(TagCategory.ACCESSIBILITY_PRACTICES, TagSkillLevel.ACTIVE, "UX & UI Development"),
    ACCESSIBILITY_LOCALIZATION(TagCategory.ACCESSIBILITY_PRACTICES, TagSkillLevel.ACTIVE, "i18n (Internationalization and localization)"),
    ACCESSIBILITY_PRACTICES(TagCategory.ACCESSIBILITY_PRACTICES, TagSkillLevel.ACTIVE, "WSCG (Web Content Accessibility Guidelines"),

    MISC_PEDAGOGY(TagCategory.MISC, TagSkillLevel.ACTIVE, "Pedagogy"),
    MISC_MILITARY(TagCategory.MISC, TagSkillLevel.ACTIVE, "Military"),
    MISC_MUSIC_PRODUCTION(TagCategory.MISC, TagSkillLevel.ACTIVE, "Music Production"),
    MISC_MUSIC_DISTRIBUTION(TagCategory.MISC, TagSkillLevel.ACTIVE, "Music Distribution");

    private final TagCategory category;
    private final TagSkillLevel level;
    private final String label;

    Tag(TagCategory category, TagSkillLevel level, String label) {
        this.category = category;
        this.level = level;
        this.label = label;
    }

    public TagCategory getCategory() {
        return this.category;
    }

    public TagSkillLevel getSkillLevel() {
        return this.level;
    }

    public String getLabel() {
        return this.label;
    }

}
