public class Student implements Details {
  private final String name; // ім’я, прізвище
  private final String markBookIndex; // номер залікової книжки
  private double GPA; //середній бал
  private final Faculty faculty;

  public Student(String name, String recordBookIndex, double GPA, Faculty faculty) {
    this.name = name;
    this.markBookIndex = recordBookIndex;
    this.GPA = GPA;
    this.faculty = faculty;
    faculty.add(this);
  }


  public String getName() {
    return name;
  }

  public double getGPA() {
    return GPA;
  }

  public String getMarkBookIndex() {
    return markBookIndex;
  }

  public void setGPA(double GPA) {
    this.GPA = GPA;
  }

  public Faculty getFaculty() {
    return faculty;
  }

  @Override
  public void getDetails() {
    System.out.println(
      "Вся информация о студенте:" +
        "\nФИО: " +this.name +
        "\nИнститут: " + faculty.getInstitute().getName() +
        "\nФакультет: " + faculty.getName() +
        "\nНомер студенческого: " + this.markBookIndex +
        "\nСредний бал: " + this.GPA

    );
  }
}