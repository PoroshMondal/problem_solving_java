package LibraryManagementSystem.enums;

public enum Genre {
    FICTION("Fiction books involve imaginary events and characters."),
    NON_FICTION("Non-fiction books are based on real facts and information."),
    MYSTERY("Mystery books involve suspenseful and thrilling storylines."),
    BIOGRAPHY("Fantasy books contain magical and supernatural elements."),
    SCIENCE_FICTION("Biographies detail the lives of real people."),
    COMPUTER_SCIENCE("Computer Science books contains the study of computation system which deals with software and software system");

    private String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
