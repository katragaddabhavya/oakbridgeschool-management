package com.jap.marksevaluation;
public class OakBridgeSchool {

    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
        int TotalMarks[] = new int[math.length];
        if(math.length==0 || science.length ==0 || english.length==0)
            return null;
        for (int i = 0; i < math.length; i++) {
            TotalMarks[i] = math[i] + science[i] + english[i];

        }

        return TotalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        int AverageMarks[] = new int[totalMarks.length];
        if(totalMarks.length==0 || noOfSubjects==0)
            return null;
        for (int i = 0; i < totalMarks.length; i++) {
            AverageMarks[i] = totalMarks[i] / noOfSubjects;
        }

        return AverageMarks;
    }

    // Write the logic inside the method to calculate the grade based on the math mark of the student
    public char findGradeInMath(int math) {

        char mathGrade = '\u0000';
        if (math >= 90) {
            mathGrade = 'A';
        } else if ((math >= 80) && (math <= 89)) {
            mathGrade = 'B';
        } else if ((math >= 70) && (math <= 79)) {
            mathGrade = 'C';
        } else if ((math >= 60) && (math <= 69)) {
            mathGrade = 'D';
        } else  {
            mathGrade = 'F';
        }

        return mathGrade;
    }
    // Write the logic inside the method to calculate the grade based on the science mark of the student
    public char findGradeInScience(int science){
        char scienceGrade = '\u0000';
        if (science>= 90) {
            scienceGrade='A';
        } else if ((science >= 80) && (science<= 89)) {
            scienceGrade = 'B';
        } else if ((science >= 70) && (science<=79)) {
            scienceGrade = 'C';
        } else if ((science >= 60) &&(science <= 69)) {
            scienceGrade= 'D';
        } else  {
            scienceGrade = 'F';
        }


        return scienceGrade;
    }
    // Write the logic inside the method to calculate the grade based on the english mark of the student
    public char findGradeInEnglish(int english){
        char englishGrade = '\u0000';
        if (english>= 90) {
            englishGrade = 'A';
        } else if ((english >= 80) && (english<= 89)) {
            englishGrade = 'B';
        } else if ((english>= 70) && (english<=79)) {
            englishGrade = 'C';
        } else if ((english >= 60) &&(english <= 69)) {
            englishGrade= 'D';
        } else  {
            englishGrade = 'F';
        }

        return englishGrade;
    }



    // Write the logic to sort the total marks of the students of the class, use insertion-sort

    public int[] sortByTotalMarks(int[] totalMarks){
        for (int i=1;i< totalMarks.length;i++) {
            int key = totalMarks[i];
            int j = i - 1;
            while (j >= 0 && totalMarks[j] > key) {
                totalMarks[j+1]=totalMarks[j];
                j=j-1;
            }
            totalMarks[j+1]=key;
        }
        return totalMarks;

    }

    //Display the details of the student
    public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade,String studentName, int rollNo ){
        System.out.println("......................................");
        System.out.println("Grading and Evaluation");
        System.out.println("......................................");
        System.out.println("student name :" +studentName);
        System.out.println("rollnum:"+rollNo);
        System.out.println("total marks:"+totalMark);
        System.out.println("average marks:"+ averageMark);
        System.out.println("......................................");
        System.out.println("grade in math:" +mathGrade);
        System.out.println("grade in science:" +scienceGrade);
        System.out.println("grade in english:" +englishGrade);
    }

    public static void main(String[] args) {

        // Declare and Initialize the object of OakBridgeSchool
        OakBridgeSchool oakBridgeschool = new OakBridgeSchool();

        // Declare and Initialize values to the arrays to store marks of math, science, english
        int[] math = {88, 89, 90, 78, 67, 56, 67, 89, 76, 75};
        int[] science = {98, 76, 56, 45, 56, 67, 78, 98, 34, 33};
        int[] english = {98, 45, 56, 78, 65, 45, 78, 89, 45, 35};
        int noofSubjects = 3;

        // Declare and Initialize a string array for storing student names
        String[] Names = {"varsha", "bhavya", "harshitha", "romit", "harish", "pranay", "kavya", "sushmitha", "shiva", "shivansh"};

        // Declare and Initialize an int array for storing roll numbers
        int[] rollnum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Call the appropriate methods and display the results
        int[] totalMarks = oakBridgeschool.calculateTotalMarks(math, science, english);
        int[] averageMarks = oakBridgeschool.calculateTotalAverageMarksForEachStudent(totalMarks, noofSubjects);
        for (int i = 0; i < averageMarks.length; i++) {
            char mathgrade = oakBridgeschool.findGradeInMath(math[i]);
            char sciencegrade = oakBridgeschool.findGradeInScience(science[i]);
            char englishgrade = oakBridgeschool.findGradeInEnglish(english[i]);
            oakBridgeschool.displayDetails(totalMarks[i], averageMarks[i], mathgrade, sciencegrade, englishgrade,Names[i],rollnum[i]);
        }
        int[] arrayoftotalmarks = oakBridgeschool.sortByTotalMarks(totalMarks);
        for (int i = 0; i < arrayoftotalmarks.length;i++)
            System.out.println(arrayoftotalmarks[i]);

        System.out.println("highest score" + arrayoftotalmarks[arrayoftotalmarks.length - 1]);
    }

}

