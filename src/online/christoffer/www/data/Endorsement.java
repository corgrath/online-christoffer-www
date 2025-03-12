package online.christoffer.www.data;

public enum Endorsement {

    RICKARD(
            "Rickard",
            "PH Persson",
            "Agile Test Engineer",
            "worked together in the same team",
            "He's a great asset.",
            new String[]{
                    "Christoffer is a man who constantly surprise you with his deep passion for his work, his brilliant coding skills and his ability to place the User in focus of his solutions. He brings in new technologies, methods and tools of great help.",
                    "He is also a great team member who brings any team together, a good listener and not afraid to speak his mind. Yet, he's a very humble and considerate guy.",
                    "If you are thinking of taking Christoffer into your team - don't even hesitate. He's a great asset."
            }
    ),

    JOHAN(
            "Johan",
            "Rödd",
            "Medical Engineer",
            "studied together",
            "This guy didn't became a developer by education. He was born as one.",
            new String[]{
                    "I have known Christoffer since childhood and he's always had this glow of cunning intelligence surrounding him. When we were around 14 years old we played a online text-based RPG known as MUD (Multi User Dungeon).",
                    "As a part of the game you had to cast spells to increase your knowledge of the school from which the spell was cast. A very boring and time consuming part of the game to max out. ",
                    "Christoffer however developed a program called \"cMUD\" from which you could connect to the game, choose which spells you wanted to practice and simply click \"Start\" and it would manage it for you.",
                    "While botting might be considered questionable in terms to the rules of the game, we were nothing but kids, but already back then Christoffer showed a natural talent for developing.",
                    "A fun anecdote however great example to show that this guy didn't became a developer by education. He was born as one."
            }
    );

    private final String authorFirstname;
    private final String authorSurname;
    private final String authorTitle;
    private final String relationship;
    private final String snippet;
    private final String[] texts;

    Endorsement(
            String authorFirstname,
            String authorSurname,
            String authorTitle,
            String relationship,
            String snippet,
            String[] texts
    ) {
        this.authorFirstname = authorFirstname;
        this.authorSurname = authorSurname;
        this.authorTitle = authorTitle;
        this.relationship = relationship;
        this.snippet = snippet;
        this.texts = texts;
    }

    public String getAuthorFirstname() {
        return authorFirstname;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String getAuthorTitle() {
        return authorTitle;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getSnippet() {
        return snippet;
    }

    public String[] getTexts() {
        return texts;
    }
}