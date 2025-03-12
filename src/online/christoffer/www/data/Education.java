package online.christoffer.www.data;

public enum Education {

    UNIVERSITY(
            2003,
            2008,
            "Master of Information and Communication Engineering Technologies",
            "Lund University, Faculty of Engineering",
            "Lund, Sweden",
            new String[]{
                    "Five years of studies, 48 completed courses within the field of computer science and information and communication engineering.",
                    "Specialized towards computer science, software development and pedagogy and usability as my main focus areas."
            }
    ),

    GYMNASIUM(
            2000,
            2003,
            "Gymnasium Technology Program",
            "Österänggymnasiet",
            "Kristianstad, Sweden",
            new String[]{
                    "The technical program focused on mathematics, physics, English, chemistry, economics, design, technical design, software development and computer science in preparation for university studies.",
                    "Graduation project was developing my own Instant Instant Messaging (IM) service in Java. The solution included developing a graphical client and a dedicated server that used networking coding and a relational database."
            }
    );

    private final int yearStart;
    private final int yearEnd;
    private final String title;
    private final String schoolName;
    private final String location;
    private final String[] description;

    Education(
            int yearStart,
            int yearEnd,
            String title,
            String schoolName,
            String location,
            String[] description
    ) {
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.title = title;
        this.schoolName = schoolName;
        this.location = location;
        this.description = description;
    }

    public int getYearStart() {
        return yearStart;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public String getTitle() {
        return title;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getLocation() {
        return location;
    }

    public String[] getDescription() {
        return description;
    }
}