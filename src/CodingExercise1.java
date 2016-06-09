import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
String x=JOptionPane.showInputDialog("What color hint(blue/yellow)");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

 
   
   	Robot jack=new Robot();
   	 jack.penDown();
   	 for (int i = 0; i < 4; i++) {
   		if(x.equals("blue") ){
   			jack.setPenColor(0,0,300);
   		}
   	if(x.equals("yellow")){
   		jack.setPenColor(300,0,0);
   	}
   		 jack.setPenWidth(10);
   		 jack.move(100);
		jack.turn(90);
		
	}
    }

}
