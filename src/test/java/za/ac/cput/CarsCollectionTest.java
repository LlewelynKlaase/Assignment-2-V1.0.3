package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CarsCollectionTest {

    Collection<String> myCarCollectionTest = new Stack<>();

    @BeforeEach
    @Test
    void setUp() {
        myCarCollectionTest.add("Audi");
        myCarCollectionTest.add("BMW");
        myCarCollectionTest.add("Mercedes Benz");
        //System.out.println(myCarCollectionTest);
        assertEquals(3, 3);
    }

    @Test
    void addTest() {
        myCarCollectionTest.add("Volkswagen");
        //System.out.println(myCarCollectionTest);
        assertEquals(4, 4);
    }

    @Test
    void removeTest() {
        myCarCollectionTest.remove("Audi");
        //System.out.println(myCarCollectionTest);
        assertEquals(2, 2);
    }

    @Test
    void findTest() {
        assertSame(true, myCarCollectionTest.contains("Audi"));
    }

}