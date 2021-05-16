package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CarsMapTest {

    Map myCarsMap = new HashMap();

    @BeforeEach
    @Test
    void setUp() {
        myCarsMap.put(1,"Audi");
        myCarsMap.put(2, "BMW");
        myCarsMap.put(3, "Mercedes Benz");
        //System.out.println(myCarsMap);
        assertEquals(3, 3);
    }

    @Test
    void addTest() {
        myCarsMap.put(4, "Volkswagen");
        //System.out.println(myCarsMap);
        assertEquals(4, 4);
    }

    @Test
    void removeTest() {
        myCarsMap.remove(2);
        //System.out.println(myCarsMap);
        assertEquals(2,2);
    }

    @Test
    void findTest() {
        assertSame("Audi", myCarsMap.get(1));
    }
}