// Singleton class to store theme globally
class ThemeManager {
    private static ThemeManager instance;
    private String theme;

    private ThemeManager() {  // Private constructor
        this.theme = "light"; // Default theme
    }

    public static ThemeManager getInstance() {
        if (instance == null) {
            instance = new ThemeManager();
        }
        return instance;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}

// Example usage in different classes
public class Theme {
    public static void main(String[] args) {
        // Setting theme once
        ThemeManager.getInstance().setTheme("dark");

        // Accessing theme in different parts of the app
        System.out.println("Current Theme: " + ThemeManager.getInstance().getTheme());

        AnotherComponent.displayTheme();
    }
}

class AnotherComponent {
    static void displayTheme() {
        System.out.println("Theme inside AnotherComponent: " + ThemeManager.getInstance().getTheme());
    }
}
