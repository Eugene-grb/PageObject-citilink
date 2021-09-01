package pages;

public enum PageName {

    MAIN_PAGE("Стартовая страница"),
    SMARTPHONES_PAGE("Страница 'Смартфоны'"),
    SMARTPHONE_PRODUCT_PAGE("Страница 'Продукт. Смартфон'");

    private String pageName;

    private PageName(String pageName) {
        this.pageName = pageName;
    }

    // возврат константы по строковому значению константы
    public static PageName fromString(String pageName) {
        if (pageName != null) {
            for (PageName p : PageName.values()) {
                if (pageName.equalsIgnoreCase(p.pageName)) {
                    return p;
                }
            }
        }
        return null;
    }

    public String getPageName() {
        return this.pageName;
    }
}
