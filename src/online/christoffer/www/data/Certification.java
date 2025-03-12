package online.christoffer.www.data;

public enum Certification {

    JAVA(
            2008,
            "Sun Certified Java Associate developer",
            "Sun Microsystems, Inc",
//            "Malmö, Sweden",
            new String[]{
                    "Sun Certified Associate Certified for the Java Standard Edition platform"
            },
            new Tag[]{
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT, Tag.LANG_JAVA}
    ),

    FA(
            2007,
            "Swedish FA-Tax Certificate",
            "Swedish Tax Agency",
//            "Sweden",
            new String[]{
                    "Approved FA-tax certification for sole proprietors."
            },
            new Tag[]{
                    Tag.BUSINESS_MANAGEMENT
            }
    ),

    LEADER(
            2005,
            "Applied University Pedagogy for Exercise and Laboratory Leader",
            "Lund University, Faculty of Engineering",
//            "Lund, Sweden",
            new String[]{
                    "Employed by the Department of Computer Science, Lund University as certified exercise and laboratory leader at Lund University in order to help the university with teaching and holding my own various computer science exercise and laboratory classes."
            },
            new Tag[]{
                    Tag.MISC_PEDAGOGY,
                    Tag.ENGINEERING_COMPUTER_SCIENCE,
                    Tag.ENGINEERING_SOFTWARE_DEVELOPMENT,
                    Tag.OS_SOLARIS,
            }
    );

    private final int year;
    private final String title;
    private final String issuedBy;
    private final String[] description;
    private final Tag[] tags;

    Certification(
            int year,
            String title,
            String issuedBy,
            String[] description,
            Tag[] tags
    ) {
        this.year = year;
        this.title = title;
        this.issuedBy = issuedBy;
        this.description = description;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public String[] getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public Tag[] getTags() {
        return tags;
    }
}