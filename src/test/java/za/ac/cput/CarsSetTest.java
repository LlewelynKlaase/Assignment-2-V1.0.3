package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CarsSetTest {

    Set<String> myCarsSet = new HashSet<>();

    @BeforeEach
    @Test
    void setUp() {
        myCarsSet.add("Audi");
        myCarsSet.add("BMW");
        myCarsSet.add("Mercedes Benz");
        //System.out.println(myCarsSet);
        assertEquals(3, 3);
    }

    @Test
    void addTest() {
        myCarsSet.add("Volkswagen");
        //System.out.println(myCarsSet);
        assertEquals(4, 4);
    }

    @Test
    void removeTest() {
        myCarsSet.remove("Audi");
        //System.out.println(myCarsSet);
        assertEquals(2, 2);
    }

    @Test
    void findTest() {
        assertSame(true, myCarsSet.contains("Audi"));
        //System.out.println(myCarsSet);
    }

}