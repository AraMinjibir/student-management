public class StudentDetails {
   private int id;
    private String name;
    private int age;
    private String course;
    private double gpa;

    public StudentDetails(int id, String name, int age, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }
    private void setCourse(String course) {
        this.course = course;
    }

    private double getGpa() {
        return gpa;
    }
    private void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "studentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
