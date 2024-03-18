public enum Csavarfej {

    EGYHORNYU,
    PHILLIPS,
    IMBUSZ;

    @Override
    public String toString() {
        switch (this) {
            case EGYHORNYU -> {
                return "egyhornyu";
            }
            case PHILLIPS -> {
                return "phillips";
            }
            case IMBUSZ -> {
                return "imbusz";
            }
            default -> {
                return "";
            }
        }
    }
}
