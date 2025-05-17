import java.util.ArrayList;

public class studentManager {
    private ArrayList<studentDetails> students;

    public studentManager() {
        students = new ArrayList<>();
    }

   public void addStudent(studentDetails s){
        students.add(s);

   }

    public void listAllStudents(){
        for (studentDetails s : students)
            System.out.println(s);
    }

    public studentDetails findStudentById(int id){
        for(studentDetails s: students){
            if(s.getId()== id){
                return s;
            }
        }
        return null;
    }

    public ArrayList<studentDetails> findStudentByCourse(String Course) {
        ArrayList<studentDetails> filtered = new ArrayList<>();
        for(studentDetails s: students){
            if(s.getCourse().equals(Course)){

            }
        }
        return filtered;
    }

  public boolean updateStudent(studentDetails updatedStudent){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == updatedStudent.getId()){
                students.set(i, updatedStudent);
                return true;
            }
        }
        return false;
  }

   public boolean removeStudent(int id){
        for(studentDetails s: students){
            if(s.getId() == id){
                students.remove(s);
                return true;
            }
        }
        return false;
   }

}
