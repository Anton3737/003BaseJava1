package ClassRoom1;

import java.util.Scanner;

public class ClassRoom1 extends Pupil1
{
    public static void main(String[] args) {
        System.out.println("Шкількний журнал");
        Scanner in = new Scanner(System.in);
        String studied = in.nextLine();
                
        Pupil1 pupil1 = null;
        
        if (studied.equals("bad")){
            pupil1 = new BadBupil1();
        }else if (studied.equals("good")){
            pupil1 = new GoogPupil1();
        }else if (studied.equals("excelent")){
            pupil1 = new ExcelentPupil1();
        }
      
        pupil1.relax();
        pupil1.study();
        pupil1.write();
        pupil1.read();
        
    }

}
