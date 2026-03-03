package Assignment4.Prob1;

public enum Material {
    WOOD,
    PLASTIC,
    STEEL;


    @Override
    public String toString() {
        return switch (this) {
            case WOOD -> "Wood";
            case PLASTIC -> "Plastic";
            case STEEL -> "Steel";
            default -> "Wood";
        };
    }

}
