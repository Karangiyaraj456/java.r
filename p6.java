public class Student{
    public int enroll;
    public String name;
    public Student(String name , int enroll){
        this.enroll = enroll;
        this.name = name;
    }
    public static void main(String[] args) {
        Student s1 = new Student("raj", 31);
        Student s2 = new Student("parth", 25);
        Student s3 = new Student("veer", 52);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}
