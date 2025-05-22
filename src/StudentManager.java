import java.util.ArrayList;

public class StudentManager {
    private ArrayList<StudentDetails> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

   public void addStudent(StudentDetails s){
        students.add(s);

   }

    public void listAllStudents(){
        for (StudentDetails s : students)
            System.out.println(s);
    }

    public StudentDetails findStudentById(int id){
        for(StudentDetails s: students){
            if(s.getId()== id){
                return s;
            }
        }
        return null;
    }

  public boolean updateStudent(StudentDetails updatedStudent){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == updatedStudent.getId()){
                students.set(i, updatedStudent);
                return true;
            }
        }
        return false;
  }

   public boolean removeStudent(int id){
        for(StudentDetails s: students){
            if(s.getId() == id){
                students.remove(s);
                return true;
            }
        }
        return false;
   }

}
