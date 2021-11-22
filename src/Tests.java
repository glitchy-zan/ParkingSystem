import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    Car car;
    Van van;
    ParkingGarage garage;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        car = new Car(90);
        van = new Van(210);
        garage = new ParkingGarage(3);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @RepeatedTest(2)
    @DisplayName("Park method")
    void testPark() {
        assertEquals(true, garage.canPark(car));
        assertEquals(false, garage.canPark(van));
    }

    @Test
    @DisplayName("DriveCar method")
    void testDrive() {
        car.drive();
        assertEquals("wrum", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    @DisplayName("DriveVan method")
    void testDrive1() {
        van.drive();
        assertEquals("wrum wrum", outputStreamCaptor.toString()
                .trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
