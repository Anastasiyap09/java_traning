package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    protected ChromeDriver wd;

    private SessionHelper sessionHelper;
    private  NavigationHelper navigationHelper;
    private  GroupsHelper groupsHelper;
    private  ContactHelper contactHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wolfs\\Nastya\\chromedriver.exe");
        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wd.get("http://localhost/addressbook/group.php");
        groupsHelper = new GroupsHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void logout() {
       wd.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        wd.quit();
    }


    public GroupsHelper getGroupsHelper() {
        return groupsHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }


    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
