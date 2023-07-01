public  class TestCourse{
    public static void main (String[] args){
        Course course1 = new Course("Data Structures");

        course1.addStudent("Christos");
        course1.addStudent("Andreas");
        course1.addStudent("George");

        System.out.println("Course1 is: ");
        System.out.println(course1.getCourseName());
        String[] students1 = course1.getStudents();

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        System.out.println("The participants of course1 are: ");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students1[i] + ", ");
        }
    }

}