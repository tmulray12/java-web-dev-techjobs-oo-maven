package com.company.incomplete;

import com.company.*;
//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JobTests {
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    private static final Job jobOne = new Job();
    private static final Job jobTwo = new Job();
    private static final Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    private static final Job jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//    @Before
//    public void jobs(){
//        Job jobOne = new Job();
//        Job jobTwo = new Job();
//        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//    }
    @Test
    public void testSettingJobId() { Assertions.assertFalse(jobOne.equals(jobTwo));
        Assertions.assertEquals(jobOne.getId() + 1, jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assertions.assertTrue(jobThree.getName() instanceof String);
        Assertions.assertTrue(jobThree.getEmployer() instanceof Employer);
        Assertions.assertTrue(jobThree.getLocation() instanceof Location);
        Assertions.assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
        Assertions.assertTrue(jobThree.getPositionType() instanceof PositionType);
    }

    @Test
    public void testJobsForEquality() {
        Assertions.assertFalse(jobThree.equals(jobFour));
    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringIsFormattedProperly() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedToStringOutput = "\n" + "ID: 6\n" + "Name: Product tester\n" + "Employer: ACME\n" + "Location: Desert\n" + "Position Type: Quality control\n" + "Core Competency: Persistence\n";
        Assertions.assertEquals(expectedToStringOutput, testJob.toString());
    }

    @Test
    public void testToStringHasLabelsForEachField() {

    }

    @Test
    public void testToStringDataNotAvailable() {
        Job testJob = new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toStringOutput = "\n" + "ID: 5\n" + "Name: Product tester\n" + "Employer: Data not available\n" + "Location: Data not available\n" + "Position Type: Quality control\n" + "Core Competency: Persistence\n";
        Assertions.assertEquals(toStringOutput, testJob.toString());
    }
}
