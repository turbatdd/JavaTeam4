package Assignment4.Prob2;

public enum Location {
    GARDEN,
    LIVING_ROOM,
    KITCHEN,
    BEDROOM;

    @Override
    public String toString() {
        return switch (this) {
            case BEDROOM -> "Bedroom";
            case KITCHEN -> "Kitchen";
            case LIVING_ROOM -> "Living room";
            default -> "GARDEN";
        };
    }
}

