public enum Week {
    MONDAY("Дуйшомбу куну жава практикалык сабак"),
    TUESDAY("Шейшемби куну англис тил сабагы"),
    WEDNESDAY("Шаршемби куну Soft Skill  сабагы"),
    THURSDAY("Бейшемби куну жава практикалык сабак"),
    FRIDAY("Жума куну жава сабагы"),
    SATURDAY("Ишемби куну event"),
    SUNDAY("Жекшемби куну сабак жок)");

    private String infoTranslate;

    Week(String infoTranslate) {
        this.infoTranslate = infoTranslate;
    }

    public String getInfoTranslate() {
        return infoTranslate;
    }

    public void setInfoTranslate(String infoTranslate) {
        this.infoTranslate = infoTranslate;
    }
}
