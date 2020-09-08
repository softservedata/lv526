package chapter4;

public enum Breed {
    HASKI("Haski"), GOLD_RETRIEVER("Gold Retriever"), VIVCHARKA("Vivcharka");
    private String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
