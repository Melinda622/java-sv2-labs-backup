package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum=new NumbersSum();
    int[] numbers={1,4,5};
    int[] numbers2=null;
    String[] numbersString={"1","4","5"};
    String[] numbersString2=null;


    @Test
    void testGetSumWithIntegerParameter(){
        assertEquals(10,numbersSum.getSum(numbers));
    }

    @Test
    void testGetSumWithIntegerParameterException(){
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class,()->numbersSum.getSum(numbers2));
        assertEquals("The numbers array cannot be null",iae.getMessage());
    }

    @Test
    void testGetSumWithStringParameter(){
        assertEquals(10,numbersSum.getSum(numbersString));
    }

    @Test
    void testGetSumWithStringParameterException(){
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class,()->numbersSum.getSum(numbersString2));
        assertEquals("The numbers array cannot be null",iae.getMessage());
    }

    @Test
    void testGetSumWithStringParameterException2(){
        String[] numbersString3={"1","@","5"};
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class,()->numbersSum.getSum(numbersString3));
        assertEquals("One of the array items is not a number",iae.getMessage());
    }
}