import java.util.Scanner;

public class IT24102513Lab4Q2 {
 public static void main(String[] args) {

     double exammarks, labmarks, exampercentage, labsubmissionpercentage, finalmarks;

     Scanner input= new Scanner(System.in);

     System.out.print("please enter exammarks (out of100): " );
     exammarks= input.nextDouble();

     if (exammarks < 0 || exammarks > 100.0) {
     System.out.print("Invalid input for exammarks. Terminating program.");
     return;                                 }

     System.out.print("please enter labmarks (out of100): " );
     labmarks = input.nextDouble();

     if (labmarks < 0 || labmarks > 100.0) {
     System.out.print("Invalid input for labmarks. Terminating program.");
     return;                               }

     System.out.print("Please enter the percentage given for the exampercentage: ");
     exampercentage = input.nextDouble();
 
     System.out.print("Please enter the percentage given for the labsubmissionpercentage:");
     labsubmissionpercentage = input.nextDouble();

     
     if(exampercentage + labsubmissionpercentage!=100){
     System.out.print("The percentages must add up to 100.Terminating program.");
     return;                                          javac }

     // If all validations are passed, calculate finalmarks
     finalmarks=(exammarks*exampercentage/100.0)+(labmarks*labsubmissionpercentage/100.0);
     System.out.println("Final Exam mark is :" +finalmarks);
  }
}
 