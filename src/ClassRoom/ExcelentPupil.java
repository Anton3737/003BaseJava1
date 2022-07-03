package ClassRoom;

public class ExcelentPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("Michelangelo excelent studing");
    }

    @Override
    public void read() {
    }

    @Override
    public void write() {
    }

    @Override
    public void relax() {
        System.out.println("Michelangelo excelent relax");
        System.out.println("Donatello excelent relax");
        System.out.println("Leonardo excelent relax");
    }
}
