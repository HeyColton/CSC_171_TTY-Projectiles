/*Name:Xiaoyu Zheng
 * Project number:1
 * Lab Section: Mon 12:30
 * Lab TAs: Camllo, Jack Venuti
 * I did not work with anyone on this assignment
 */
import java.lang.Math;
public class Project {
	//set physical parameters for computation
private double g=9.8, Vx, Vy, Time, Angle, Distance,Vwind;
//constructor to start and there are two levels for the game: basic and advanced
public Project(){
	
}
//set Angle, velocity and get the values of physical parameters according to velocity and time
public void Angle(double x){
	Angle=Math.toRadians(x);
}
public void Velocity(double v){
	Vx=v*Math.cos(Angle);
	Vy=v*Math.sin(Angle);
    Time=2*Vy/g;
    Distance=Vx*Time;
}
//if there is wind, Vx and distance will be changed
public void Vwind(double w){
	Vx=Vx-Vwind;
	Distance=Vx*Time;
}
//return the distance
public double getDistance(){
	return Distance;
}

}
