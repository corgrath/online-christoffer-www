package online.christoffer.www.data;

public enum Organization {

    NATIONAL_GUARD(
            2024,
            "Swedish Armed Forces - Home Guard National Security Forces",
            new String[]{
                    "The Swedish Home Guard - National Security Forces is a military reserve force of the Swedish Armed Forces. The Home Guard consists mainly of local rapid response units, numbering 17,000 of the 22,000 total Home Guard strength, organized in 40 battalions, with 23 associated auxiliary defense organizations. Most soldiers maintain a civilian job while serving the army part-time.",
            },
            "",
            new Tag[]{Tag.MISC_MILITARY}
    ),

    SAMI(
            2024,
            "SAMI - Svenska Artisters och Musikers Intresseorganisation",
            new String[]{
                    "Member of the Swedish Artists and Musicians Interest Organisation for music artists that has officially published public music.",
            },
            "",
            new Tag[]{
                    Tag.ENGINEERING_INFOCOM,
                    Tag.SECURITY_CYBERSECURITY
            }
    ),

    FRO(
            2023,
            "Swedish Voluntary Radio Organisation",
            new String[]{
                    "Frivilliga Radioorganisationen, FRO (transl. the Voluntary Radio Organisation) is one of the 18 voluntary defence organisations in Sweden. These organisations play an important role in Sweden's total defence as they are responsible for preserving specialist competence within all different kinds of fields, thereby ensuring persistence during stressful times.",
            },
            "",
            new Tag[]{Tag.ENGINEERING_INFOCOM, Tag.SECURITY_CYBERSECURITY}
    ),

    STIM(
            2020,
            "STIM - Swedish Performing Rights Society",
            new String[]{
                    "Member of the Performing Rights Organization (PRO) Swedish Performing Rights Society (STIM) for music producers and songwriters that has officially published public music.",
            },
            "",
            new Tag[]{Tag.MISC_MUSIC_PRODUCTION, Tag.MISC_MUSIC_DISTRIBUTION, Tag.BUSINESS_MANAGEMENT}
    );

    private final int year;
    private final String name;
    private final String[] description;
    private final String imageURL;
    private final Tag[] tags;

    Organization(
            int year,
            String name,
            String[] description,
            String imageURL,
            Tag[] tags
    ) {
        this.year = year;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.tags = tags;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String[] getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Tag[] getTags() {
        return tags;
    }

}