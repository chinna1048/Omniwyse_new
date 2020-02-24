import java.util.*;  
//solved by Pushpa kumar
public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        // your code
        double averageGPA;
        double[] GPA = new double[studentIdList.length];
        for (int i = 0 ; i < studentsGrades.length ; i++) {
                averageGPA = 0.0;
                for (char sub_grade: studentsGrades[i]){
                    if (sub_grade == 'A'){
                        averageGPA +=4.0;
                    }else if (sub_grade == 'B'){
                        averageGPA +=3.0;
                    }else {
                        averageGPA += 2.0;
                    }
                }
                GPA[i] = averageGPA / studentsGrades[i].length;
            }
        return GPA;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
        if (higher < lower){
            return null;
        }else if (higher < 0 || lower < 0){
            return null;
        }
        // invoke calculateGPA
        double[] GPA = calculateGPA(studentIdList, studentsGrades);
        int studentsByGPA_length = 0;
        for (int i = 0 ; i < GPA.length ; i++){
            if (GPA[i] >= lower && higher <=GPA[i] ){
                studentsByGPA_length++;          }
        }
     
        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
        int[] studentsByGPA = new int[studentsByGPA_length];
        int Counter = 0;
        for (int i = 0 ; i < GPA.length ; i++){
            if (GPA[i] >= lower && higher >= GPA[i] ){
                // studentsByGPA[Counter] = studentIdList[i];
                System.out.println(studentIdList[i]);
                Counter++;
            }
        }
        // for(int k=0;k<studentsByGPA.length;k++){
        //     System.out.println(studentsByGPA[k]);
        // }
        return studentsByGPA;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num =  scan.nextInt();
        int[] studentIdList = new int[num];
        int i,j;
        for(i=0;i<num;i++)
        {
            studentIdList[i]=scan.nextInt();
        }
        char[][] studentsGrades = new char[num][4];
        for(i=0;i<num;i++)
        {
            int size=scan.nextInt();
            for(j=0;j<size;j++)
            {
                studentsGrades[i][j]=scan.next().charAt(0);
            }
        }
        System.out.println("Enter Lower and Higher Values");
        float lower =  scan.nextFloat();
        float higher =  scan.nextFloat();
		StudentUtil student =new StudentUtil();
        System.out.println(student.getStudentsByGPA(lower,higher,studentIdList,studentsGrades));
        // for (Object number : getStudentsByGPA(lower,higher,studentIdList,studentsGrades)) {
        //     System.out.println(number);
        // }
		
    }
}

/*
Output:-
2
1001
1002
4
A
B
A
A
4
A
B
B
A
Enter Lower and Higher Values
3.2
3.5
1002
[I@4563e9ab*/