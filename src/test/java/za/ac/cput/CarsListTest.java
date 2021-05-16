package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarsListTest {

    List<String> myCarsListTest = new ArrayList<>();

    @BeforeEach
    @Test
    void setUp() {
        myCarsListTest.add("Audi");
        myCarsListTest.add("BMW");
        myCarsListTest.add("Mercedes Benz");
        //System.out.println(myCarsListTest);
        assertEquals(3, 3);
    }

    @Test
    void addTest() {
        myCarsListTest.add("Volkswagen");
        //System.out.println(myCarsListTest);
        assertEquals(4, 4);
    }

    @Test
    void removeTest(){
        myCarsListTest.remove(1);
        //System.out.println(myCarsListTest);
        assertEquals(2, 2);
    }

    @Test
    void findTest() {
        assertSame("Audi", myCarsListTest.get(0));
    }

}