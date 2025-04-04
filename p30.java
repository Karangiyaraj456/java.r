import java.util.Hashmap;

public class studentHashmap{
  public static void main(String[] args){
    HashMap<String> students=new HashMap<String>();
    students.put("ENROO1","Alice jonson");
    students.put("ENROO2","Bob smith");
    students.put("ENROO3","Charile Brown");
    students.put("ENROO4","David williams");
    students.put("ENROO5","Emma Davis");

    System.out.println("Student Records :")

    for(String key:students.keyset()){
      System.out.println("Enrollment No :"+key+"Name :"+Student.get(key));
    }
    String enrolmentNo="ENR003";
    student.out.println("Retrieing student with Enrollment No :"+enrolmentNo);

    if(students.containkey(enrolmentNo)){
      System.out.println("Student Name :"+student.get(enrolmentNo));
    }else{
      Systme.out.println("Student with Enrollment No :"+enrolmentNo+"not found");
    }
  }
}
