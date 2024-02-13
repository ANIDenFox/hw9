class StudentManager {
    Student[] students;
    Grade[][] grades;

    int stCount;

    public StudentManager(int maxSize) {
        students = new Student[maxSize];
        grades = new Grade[maxSize][];
        stCount = 0;
    }

    public void addStudent(Student student) {
        students[stCount] = student;
        grades[stCount] = new Grade[10];
        stCount++;
    }

    public void addGrade(Student student, String subject, double grade) {
        int ind = findIndex(student);
        if (ind != -1) {
            int grCount = grades[ind].length;
            for (int i = 0; i < grCount; i++) {
                if (grades[ind][i] == null) {
                    grades[ind][i] = new Grade(student, subject, grade);
                    break;
                }
            }
        }
    }

    private int findIndex(Student student) {
        for (int i = 0; i < stCount; i++) {
            if (students[i].id == student.id) {
                return i;
            }
        }
        return -1;
    }

    public double getAverageGrade(Student student) {
        int ind = findIndex(student);
        if (ind != -1) {
            double sum = 0;
            int gradeCount = grades[ind].length;
            int validGrades = 0;
            for (int i = 0; i < gradeCount; i++) {
                if (grades[ind][i] != null) {
                    sum += grades[ind][i].grade;
                    validGrades++;
                }
            }
            if (validGrades > 0) {
                return sum / validGrades;
            }
        }
        return 0.0;
    }
}