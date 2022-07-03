package ClassRoom;

public class ClassRoom {

    public static void main(String[] args) {

        Pupil ex = new ExcelentPupil();
        Pupil good = new GoodPupil();
        Pupil bad = new BadPupil();

        Pupil[] array = {ex,good,bad};
        for (Pupil tmnt: array){
            tmnt.relax();
            tmnt.study();
            tmnt.read();
            tmnt.write();
        }
    }
}









