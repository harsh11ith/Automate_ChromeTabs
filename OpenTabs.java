import java.awt.Desktop;
import java.net.URI;

public class OpenTabs {
    public static void main(String[] args) {
        String[] urls = {
                "https://mail.google.com/mail/u/0/#inbox",
                "https://leetcode.com/problemset/",
                "https://chatgpt.com/",
                "https://www.w3schools.com/",
                "https://www.youtube.com/"
        };

        try {
            Desktop desktop = Desktop.getDesktop();
            for (String url : urls) {
                desktop.browse(new URI(url));
                Thread.sleep(1000); // Pause for 1 second between opening tabs
            }
            System.out.println("All tabs opened successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}