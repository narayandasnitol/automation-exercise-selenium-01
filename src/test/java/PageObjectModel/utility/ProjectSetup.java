package PageObjectModel.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProjectSetup {
    public static ChromeOptions options;
    public static WebDriver driver;
    public static JavascriptExecutor jse;
    public WebDriverWait wait;

    public void projectSetup() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        jse = (JavascriptExecutor) driver;

        System.out.println("** Automation test has been started..!!! **\n");

        try {
            File script1 = new File("Scripts/remove_allure_results.bat");
            File script2 = new File("Scripts/remove_old_screenshots.bat");
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", script1.getAbsolutePath());
            Process process = processBuilder.start();

            ProcessBuilder processBuilder2 = new ProcessBuilder("cmd.exe", "/c", script2.getAbsolutePath());
            Process process2 = processBuilder2.start();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }
}
