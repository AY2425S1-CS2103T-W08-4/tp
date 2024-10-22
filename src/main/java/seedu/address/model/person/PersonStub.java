package seedu.address.model.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import seedu.address.model.group.Group;
import seedu.address.model.tag.Tag;

/**
 * A stub class for {@code Person} used for testing purposes.
 * Contains fixed data for testing UI components and methods involving {@code Person}.
 */
public class PersonStub extends Person {

    private final Name name;
    private final Phone phone;
    private final StudentClass studentClass;
    private final Set<Tag> tags;
    private final Set<Group> groups;

    /**
     * Constructs a {@code PersonStub} with pre-defined values.
     * The person's name, phone, student class, tags, and groups are initialized
     * with fixed values.
     */
    public PersonStub() {
        // Call the parent constructor with name, class, phone, and tags
        super(new Name("John Doe"), new StudentClass("A1"), new Phone("98765432"),
                Set.of(new Tag("Friend"), new Tag("Teammate"))); // Passing an empty set of groups for the constructor

        this.name = new Name("John Doe");
        this.phone = new Phone("98765432");
        this.studentClass = new StudentClass("A1");
        this.tags = Set.of(new Tag("Friend"), new Tag("Teammate"));
        this.groups = Set.of(new Group("StudyGroup1", new ArrayList<>()),
                new Group("ProjectGroup", new ArrayList<>()));
    }

    /**
     * Returns the name of the person.
     * @return the person's name.
     */
    @Override
    public Name getName() {
        return name;
    }

    /**
     * Returns the phone number of the person.
     * @return the person's phone number.
     */
    @Override
    public Phone getPhone() {
        return phone;
    }

    /**
     * Returns the student's class of the person.
     * @return the person's student class.
     */
    @Override
    public StudentClass getStudentClass() {
        return studentClass;
    }

    /**
     * Returns the tags associated with the person.
     * @return an unmodifiable set of tags.
     */
    @Override
    public Set<Tag> getTags() {
        return tags;
    }

    /**
     * Returns the groups associated with the person.
     * @return an unmodifiable set of groups.
     */
    @Override
    public Set<Group> getGroups() {
        return Collections.unmodifiableSet(groups);
    }
}
