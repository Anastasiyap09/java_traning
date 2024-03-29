package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {


    @Test

    public void testContactModification() {
        app.getContactHelper().homeContact();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Anastasiya", "Volko", "Moskow", "89222323399"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnContactPage();


    }

}
