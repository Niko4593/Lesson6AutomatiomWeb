//package org.example.Lesson4;
//
//import org.example.Lesson4.Triangle;
//import org.example.Lesson4.MyException;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//
//public class TriangleTest {
//
//    @Test
//    void test() throws MyException {
//        Triangle triangle = new Triangle();
//        Assertions.assertEquals(24,triangle.AreaOfTriangle(10,8,6));
//        Assertions.assertThrows(MyException.class,()-> triangle.AreaOfTriangle(-12,2,4));
//    }
//    @ParameterizedTest
//    @CsvSource({ "10, 20, 30, 40","100, 200, 300, 400","1, 2, 3, 4"})
//    void testWithCsvSource(int a, int b, int c, int result) throws MyException {
//        Triangle triangle = new Triangle();
//        Assertions.assertEquals(result,triangle.AreaOfTriangle(a,b,c));
//
//    }
//
//    @ParameterizedTest
//    @CsvSource({ "-10, 20, 30","-100, 200, -300","1, -2, 3"})
//    void testWithCsvSourceN(int a, int b, int c) throws MyException {
//        Triangle triangle = new Triangle();
//        Assertions.assertThrows(MyException.class,()-> triangle.AreaOfTriangle(a,b,c));
//
//    }
//}
