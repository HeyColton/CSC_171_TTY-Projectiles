/*Name:Xiaoyu Zheng
 * Project number:1
 * Lab Section: Mon 12:30
 * Lab TAs: Camllo, Jack Venuti
 * I did not work with anyone on this assignment
 */
import java.util.Scanner;
import java.util.Random;
public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//introduce the purpose of my game
		System.out.println("Welcome to the Game World! This is an artillery game!"
				+ " [enter] to continue...");
in.nextLine();
//state the rule
System.out.println("You need to determine the ANGLE and the SPEED of every launch from a catapult on the ground to hit the enemy! [enter] to continue...");
in.nextLine();
System.out.println("You have 10 initial scores. Every launch costs 1 score and you will get scores by hitting the target.  [enter] to continue...");
in.nextLine();
System.out.println("Let's do it! [enter] to continue...");
in.nextLine();
//set variables for whether the user wants to quit and passes the basic-level.
Boolean quit=true,truth=null;
//set the initial score
int score=10;
//Basic level: loop until the user quits or directly hits the target
do{score=score-1;
//prompt the user to enter the velocity and angle
System.out.println("Please enter the degree of the angle (0 to 90)");
Project a=new Project();
a.Angle(in.nextDouble());
System.out.println("Please enter a velocity");
a.Velocity(in.nextDouble());
//determine the distance is far or short to give scores and the truth value is true only if the user passes the basic level to move into the advanced level
System.out.println("the projectile travels for "+a.getDistance()+" miles!");
//get a blank line
System.out.println();
if(a.getDistance()-20<-3){
	System.out.println("You need more power!");truth=false;
}else if(a.getDistance()-20<-1){System.out.println("Good job! You almost get it!");score=score+1;truth=false;}
else if(a.getDistance()-20<=1){System.out.println("Perfect! Don't you consider to become an artilleryman?");score=score+5;truth=true;}
else if(a.getDistance()-20<=3){System.out.println("Good job! You almost get it!");score=score+1;truth=false;}
else{System.out.println("Sorry...that's too far...");truth=false;}
//show the score for each launch
System.out.println("Score: "+score);
//if the user passes, he can directly move into the next level. If not, he will be asked whether to launch.
if(truth==false){
System.out.println("Do you want to launch again? True to launch/ False to quit");
quit=in.nextBoolean();}
}while(truth==false&&quit==true);
//if it's the case that the user chooses to quit to end the last, the quit is false and skip the rest
//if the user passes the basic level, go on.
if(quit==true){
//state the background
System.out.println("Congratulation! You are the hero of our country! wait...[enter] to continue");
in.nextLine();
in.nextLine();
System.out.println("Oh, it's a dud! The situation becomes terrible! The enemy starts to escape and the wind hinders our cannonball... [enter] to continue");
in.nextLine();
System.out.println("Do you want launch again? True to continue with 10 score bonus/ False to quit");
quit=in.nextBoolean();
//quit to end, continue to go on
if(quit==true){score=score+10;
System.out.println("Score: "+score);
//set the initial distance as 20
int d=20;
//loop for the advanced level
do{score=score-1;
System.out.println("Please enter the degree of the Angle (0 to 90)");
//have to restart computation
Project b=new Project();
b.Angle(in.nextDouble());
System.out.println("Please enter a velocity");
b.Velocity(in.nextDouble());
Random random=new Random();
//wind velocity is a random number between 0 and 3.5 
b.Vwind(random.nextInt(350)/100.0);
//distance starts from 20 and increases by a random for each launch
d=d+random.nextInt(10);
//check the distance, determine the score bonus and decide whether to end for hitting the target
System.out.println("the projectile travels for "+b.getDistance()+" miles!");
//get a blank line
System.out.println();
if(b.getDistance()-d<-3){
	System.out.println("The enemy is farther and farther!");truth=false;
}else if(b.getDistance()-d<-1){System.out.println("Oh! It's near. Just several miles!");score=score+3;truth=false;}
else if(b.getDistance()-d<=1){System.out.println("Dud...[enter] to continue");score=score+7;truth=true;}
else if(b.getDistance()-d<=3){System.out.println("Oh! It's near. Just several miles!");score=score+7;truth=false;}
else{System.out.println("It goes too long!");truth=false;}
//If the user does not pass, he will be asked whether to launch.
if(truth==false){System.out.println("Score: "+score);
System.out.println("Do you want to launch again? True to launch/ False to quit");
quit=in.nextBoolean();}else{
//if the user passes, the program will end
in.nextLine();
in.nextLine();
System.out.println("I'm just kidding. Congratulation! You save the world again!");
System.out.println("Score: "+score);
}
}while(truth==false&&quit==true);}
}

	}//end of my project

}
