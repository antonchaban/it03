import java.util.ArrayList;

public class Faculty implements Details {
  private final String name;
  private final University university;
  private ArrayList<Student> students = new ArrayList<>();

  public Faculty(String name, University university, ArrayList<Student> students) {
    this.name = name;
    this.university = university;
    this.students = students;
    university.add(this);
  }

  public Faculty(String name, University institute) {
    this.name = name;
    this.university = institute;
    institute.add(this);
  }

  public void add(Student student) {
    if (students.contains(student)) {
      System.out.println("Ошибка этот студент уже учится на этом факультете");
    }
    else {
      students.add(student);
    }
  }
  public University getInstitute() {
    return university;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }
  public int countStudents() {
    int quantity = 0;
    for (Student student : students) {
      quantity++;
    }
    return quantity;
  }

  @Override
  public void getDetails() {
    System.out.println(
      "Вся информация о факультете:" +
        "\nНазвание: " + name +
        "\nКоличество учеников: " +countStudents()
    );

  }
}