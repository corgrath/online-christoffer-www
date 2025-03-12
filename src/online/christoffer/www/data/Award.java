package online.christoffer.www.data;

public enum Award {

    LINNE(
            2007,
            "Winner of Swedish National Programming Contest",
            "The Royal Swedish Academy Of Sciences",
            new String[]{
                    "Winner of the Swedish national programming contest 'Linnéspelen', where the contestants had to develop an educational computer game in a way to make general science fun and interested for the public.",
                    "Jury's motivation; \"A simple but brilliant idea, with a clear understanding of the knowledge contribution that is stimulating, educational and interesting in a learning-like manner. Challenging for both young and old.\".",
                    "Written as a Java Applet, the game had the player, under a time limit, to guess and place different animal species on a world map where they thought they lived.",
            },
            new String[]{
                    "/images/awards/linne1_small.webp",
                    "/images/awards/linne2_small.webp"
            }
    );

    private final int yearStart;
    private final String title;
    private final String contestHolder;
    private final String[] description;
    private final String[] imageURLs;

    Award(
            int yearStart,
            String title,
            String contestHolder,
            String[] description,
            String[] imageURLs
    ) {
        this.yearStart = yearStart;
        this.title = title;
        this.contestHolder = contestHolder;
        this.description = description;
        this.imageURLs = imageURLs;
    }

    public int getYearStart() {
        return yearStart;
    }

    public String getTitle() {
        return title;
    }

    public String getContestHolder() {
        return contestHolder;
    }

    public String[] getDescription() {
        return description;
    }

    public String[] getImageURLs() {
        return imageURLs;
    }

}