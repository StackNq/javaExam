import java.util.*;

class StudentOp {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("For Roll no. = " + (i + 1) + " :");
            students[i] = new Student(i + 1);
        }
        
        // Manual sorting (Bubble Sort)
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].percent() > students[j + 1].percent()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nStudents sorted by Overall Percentage:");
        for (Student student : students) {
            student.display();
        }
    }
}

class Student {
    String name;
    int roll;
    double[] caMarks = new double[4];
    double[] pcaMarks = new double[2];

    public Student(int roll) {
        this.roll = roll;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        this.name = sc.nextLine();
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter CA%d marks: ", i + 1);
            caMarks[i] = sc.nextDouble();
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("Enter PCA%d marks: ", i + 1);
            pcaMarks[i] = sc.nextDouble();
        }
    }

    public double totalCA() {
        return Arrays.stream(caMarks).sum();
    }

    public double totalPCA() {
        return Arrays.stream(pcaMarks).sum();
    }

    public double totalAll() {
        return totalCA() + totalPCA();
    }

    public double percent() {
        return totalAll() * 100 / 180;
    }

    public void display() {
        System.out.printf("Roll no. = %d\tName -> %s\nTotal CA = %.2f\tTotal PCA = %.2f\tTotal = %.2f\tPercentage = %.2f%%\n\n",roll, name, totalCA(), totalPCA(), totalAll(), percent());
    }
}
