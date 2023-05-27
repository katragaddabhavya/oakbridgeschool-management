package com.jap.marksevaluation;

import com.jap.marksevaluation.OakBridgeSchool;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class OakBridgeSchoolTest
{
    int [] math;
    int [] science;
    int [] english;
    int noOfSubjects;
    String[] studentNames;
    int [] rollNos;
    OakBridgeSchool oakBridgeSchool;
    @Before
    public void setUp(){
        oakBridgeSchool = new OakBridgeSchool();
        math  = new int[]{88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        science = new int[]{80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        english = new int[]{90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        noOfSubjects = 3;
        studentNames = new String[]{"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
        rollNos = new int[]{102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
    }
    @After
    public void tearDown(){
        math  = null;
        science = null;
        english = null;
        noOfSubjects = 0;
        studentNames = null;
        rollNos = null;
        oakBridgeSchool = null;
    }

    @Test
    public  void givenMarksCalculateTotalAndReturnAnArraySuccess(){
        int[] expectedTotal = {258, 270, 299, 202, 170, 246, 113, 25, 102, 188};
        assertArrayEquals(expectedTotal,oakBridgeSchool.calculateTotalMarks(math,science,english));

    }
    @Test
    public  void givenMarksCalculateTotalAndReturnAnArrayFailure(){
        assertNull(oakBridgeSchool.calculateTotalMarks(new int[0],science,english));
        assertNull(oakBridgeSchool.calculateTotalMarks(math,science,new int[0]));
        assertNull(oakBridgeSchool.calculateTotalMarks(math,new int[0],english));
        assertNull(oakBridgeSchool.calculateTotalMarks(new int[0],new int[0],new int[0]));
    }

    @Test
    public  void givenTotalMarksArrayAndNumberOfSubjectsCalculateAverageReturnAnArraySuccess(){
        int[] totalArray = {258, 270, 299, 202, 170, 246, 113, 25, 102, 188};
        int[] expectedAverage = {86, 90, 99, 67, 56, 82, 37, 8, 34, 62};
        assertArrayEquals(expectedAverage,oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalArray,noOfSubjects));
    }

    @Test
    public  void givenTotalMarksArrayAndNumberOfSubjectsCalculateAverageReturnAnArrayFailure(){
        int[] totalArray = {258, 270, 299, 202, 170, 246, 113, 25, 102, 188};
        assertNull(oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalArray,0));
        assertNull(oakBridgeSchool.calculateTotalAverageMarksForEachStudent(new int[0],3));
        assertNull(oakBridgeSchool.calculateTotalAverageMarksForEachStudent(new int[0],0));
    }
    @Test
    public  void givenMathMarksArrayOfClassReturnAverageSuccess(){
        int expectedMathAverage = 60;
        assertEquals(expectedMathAverage,oakBridgeSchool.calculateAverageMathMarks(math));
    }
    @Test
    public  void givenMathMarksArrayOfClassReturnAverageFailure(){
        int expectedMathAverage = -1;
        assertEquals(expectedMathAverage,oakBridgeSchool.calculateAverageMathMarks(new int[0]));
    }
    @Test
    public  void givenScienceMarksArrayOfClassReturnAverageSuccess(){
        int expectedScienceAverage = 61;
        assertEquals(expectedScienceAverage,oakBridgeSchool.calculateAverageScienceMarks(science));
    }
    @Test
    public  void givenScienceMarksArrayOfClassReturnAverageFailure(){
        int expectedScienceAverage = -1;
        assertEquals(expectedScienceAverage,oakBridgeSchool.calculateAverageScienceMarks(new int[0]));
    }
    @Test
    public  void givenEnglishMarksArrayOfClassReturnAverageSuccess(){
        int expectedEnglishAverage = 65;
        assertEquals(expectedEnglishAverage,oakBridgeSchool.calculateAverageEnglishMarks(english));
    }
    @Test
    public  void givenEnglishMarksArrayOfClassReturnAverageFailure(){
        int expectedEnglishAverage = -1;
        assertEquals(expectedEnglishAverage,oakBridgeSchool.calculateAverageEnglishMarks(new int[0]));
    }

}



