class Teacher {
    public static void main(String[] args) {
        School teacher = new School();
        teacher.conduct_exams();
        teacher.publish_results(75);
        System.out.println(teacher.school_name);

        // System.out.println(teacher.salary);
        // error: java: salary has private access in School

    }
}