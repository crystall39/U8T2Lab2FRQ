public class WarmUp
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Amy", 95);
        Student student2 = new Student("Brian", 90);
        Student student3 = new Student("Cathy", 97);
        Student student4 = new Student("Don", 89);
        Student student5 = new Student("Edgar", 91);
        Student student6 = new Student("Frank", 92);

        // a. write code to create a 2D array of Student objects
        //    named seatingChart such that students are arranged
        //    in 3 rows of 2, like this:
        //                    Amy     Brian
        //                    Cathy   Don
        //                    Edgar   Frank
        Student[][] seatingChart  = new Student[3][2];
        seatingChart[0][0] = student1;
        seatingChart[0][1] = student2;
        seatingChart[1][0] = student3;
        seatingChart[1][1] = student4;
        seatingChart[2][0] = student5;
        seatingChart[2][1] = student6;


        // b. write code to print out the seatingChart
        for (Student[] row : seatingChart)
        {
            for (Student col : row)
            {
                System.out.print(col.getName() + " ");
            }
            System.out.println();
        }

        // c. write code to calculate the class grade average
        //    and print it out
        int sum = 0;
        double students = 0;
        for (Student[] row : seatingChart)
        {
            for(Student col : row)
            {
                sum += col.getGrade();
                students++;
            }
        }
        System.out.println(sum / students);




    }
}