public class report_card {
    public static void main(String[] args) {
        String name="John";
        int rollNo=101;
        String subject1="Maths";
        int marks1=95;
        String subject2="Science";
        int marks2=90;
        String subject3="English";
        int marks3=85;

        // Calculate total and average
        int totalMarks=marks1+marks2+marks3;
        double averageMarks=(double)totalMarks/3;

        // Display report card
        System.out.println("----------------------------");
        System.out.println("REPORT CARDS");
        System.out.println("----------------------------");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("----------------------------");
        System.out.println(subject1 + ": " + marks1);
        System.out.println(subject2 + ": " + marks2);
        System.out.println(subject3 + ": " + marks3);
        System.out.println("----------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("----------------------------");
    }
}
