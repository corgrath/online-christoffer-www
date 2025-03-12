package online.christoffer.www.data;

public enum Event {

    MS_TWITTER(
            2010,
            "Mentioned by Microsoft’s Official Developer Twitter Account",
            new String[]{
                    "Microsoft Developer highlighted an article I wrote about day-to-day coding practices to follow."
            },
            new String[]{
                    "/images/events/msdev-twitter_small.webp"
            }
    ),

    ANDROID(
            2012,
            "Mentioned in the Google Android Source Code",
            new String[]{
                    "It's a great feeling you get when you notice that Google refers to your blog in their Android source code!"
            },
            new String[]{
                    "/images/events/android_small.webp"
            }
    ),

    SWEDISH_KING(
            2007,
            "Meeting the Swedish King",
            new String[]{
                    "I got the I got the opportunity meet the Swedish King Carl XVI Gustaf as a prize to winning a Swedish National Programming Contest back in 2007."
            },
            new String[0]
    ),

    FIRST_WEBSITE(
            1996,
            "My Very First Published Website Back in 1996 When I Was 12",
            new String[]{
                    "JavaScript & CSS wasn't a thing. Just pure HTML 3.2 code.",
                    "WCAG & color contrasting web accessibility wasn't really a thing back then, but using as much neo colors as possible was the name of the game!",
            },
            new String[]{
                    "/images/events/first-website.png"
            }
    );

    private final int year;
    private final String title;
    private final String[] description;
    private final String[] imageURLs;

    Event(
            int year,
            String title,
            String[] description,
            String[] imageURLs
    ) {
        this.year = year;
        this.title = title;
        this.description = description;
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

    public String[] getImageURLs() {
        return imageURLs;
    }
}