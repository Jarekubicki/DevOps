package tematyka8.excercises.Task8_6;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Student extends Person{

    int studentNumber;
    double averageMark;

    public Student(String name, int phoneNumber, String email, int studentNumber, double averageMark) {
        super(name, phoneNumber, email);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }


    @Override
    public void purchaseParkingPass() {
        super.purchaseParkingPass();
    }


    public boolean isEligibleToEnroll() {
        return true;
    }

    public void getSeminarsTaken() {

    }

}


