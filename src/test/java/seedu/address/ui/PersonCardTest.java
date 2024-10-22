package seedu.address.ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import seedu.address.model.person.Person;
import seedu.address.model.person.PersonStub;

public class PersonCardTest extends ApplicationTest {

    private Person testPerson;

    @Override
    public void start(Stage stage) throws Exception {
        // Stubbed Person object for testing
        testPerson = new PersonStub(); // Assume PersonStub is a mock/stub class
        PersonCard personCard = new PersonCard(testPerson, 1);

        // Add PersonCard to a test scene
        Scene scene = new Scene(personCard.getRoot());
        stage.setScene(scene);
        stage.show();
    }

    @Test
    public void testPersonCard_displayFieldsCorrectly() {
        // Assuming you have initialized the PersonCard
        Label nameLabel = lookup("#name").query();
        Label phoneLabel = lookup("#phone").query();
        Label classLabel = lookup("#studentClass").query();
        FlowPane tagsPane = lookup("#tags").query();
        Label groupLabel = lookup("#groups").query();

        // Verify the fields display the correct values
        assertEquals(testPerson.getName().fullName, nameLabel.getText());
        assertEquals("Class: " + testPerson.getStudentClass().value, classLabel.getText());
        assertEquals(testPerson.getPhone().value, phoneLabel.getText());

        // Verify the groups field
        String expectedGroups = "Groups: " + testPerson.getGroups().stream()
                .map(group -> group.getGroupName().toString())
                .collect(Collectors.joining(", "));
        assertEquals(expectedGroups, groupLabel.getText());

        // Add other checks for tags or other UI elements
    }
}
