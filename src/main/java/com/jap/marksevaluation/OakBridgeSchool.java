package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
        int totalMarks[]=new int[math.length];
        for (int i=0; i<math.length;i++){
            totalMarks[i]=math[i]+science[i]+english[i];
        }
       return totalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        int averagemarks[]= new int[totalMarks.length];
        for(int i=0; i<totalMarks.length;i++){
            averagemarks[i]=totalMarks[i]/noOfSubjects;
        }
        return averagemarks;
    }
    public int calculateAverageScienceMarks (int[] science)
    {
        int totalsciencemarks=-0;
        for(int i=0; i<science.length;i++){
            totalsciencemarks=totalsciencemarks+science[i];
        }
        int averagesciencemarks=(totalsciencemarks/science.length);
       return averagesciencemarks;
    }
    public int calculateAverageEnglishMarks (int[] english)
    {
        int totalenglishmarks=-0;
        for(int i=0; i<english.length;i++){
            totalenglishmarks=totalenglishmarks+english[i];
        }
        int averageenglishmarks=(totalenglishmarks/english.length);
        return averageenglishmarks;
    }
    public int calculateAverageMathMarks (int[] math) {
        int totalmathmarks=-0;
        for(int i=0; i<math.length;i++){
            totalmathmarks=totalmathmarks+math[i];
        }
        int averagemathmarks=(totalmathmarks/math.length);
        return averagemathmarks;
    }

    public static void main(String[] args) {
        //Object of OakBridgeSchool class is created
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Initialize the arrays with 10 values of marks for each subject
        int[] math = {88, 89, 90, 78, 67, 56, 67, 89, 76, 75};
        int[] science = {98, 76, 56, 45, 56, 67, 78, 98, 34, 33};
        int[] english = {98, 45, 56, 78, 65, 45, 78, 89, 45, 35};
        int noOfSubjects = 3;

        // Declare and Initialize a string array for storing student names
        String[] Names = {"varsha", "bhavya", "harshitha", "romit", "harish", "pranay", "kavya", "sushmitha", "shiva", "shivansh"};

        // Declare and Initialize an int array for storing roll numbers
        int[] rollnum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Call the methods to calculate total marks and average marks
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);
        for (int i=0;i<totalMarks.length;i++){
            System.out.println("rollnumber is:" +rollnum);
            System.out.println("the totalmarks of student is :" +totalMarks[i]+"/300");
            System.out.println("the average marks of student is:" +averageMarks[i]);
        }
        // Display the marks and average marks of each student

        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);

        // Display the average marks scored by the class in subjects
 System.out.println("average science marks scored in class is :" +averageScienceMarks);
        System.out.println("average math marks scored in class is :" +averageMathMarks);
        System.out.println("average english marks scored in class is :" +averageEnglishMarks);
    }
}
