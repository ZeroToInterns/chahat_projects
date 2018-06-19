
public class ElectricCar {
 private int maxRange;
 private int curRange;
 private String make;
 
 public ElectricCar(String make, int maxRange)
 {
	 this.maxRange = maxRange;
	 this.make = make;
	 curRange = 0;
 }
 
 public void charge()
 {
	 curRange = maxRange;	 
 }
 
 public void drive(int miles)
 {
	 curRange = curRange - miles;
 }
 
 public String getMake()
 {
	 return make;
 }
 
 public int getCurrentRange()
 {
	 return curRange;
 }
 
 public int getMaxRange()
 {
	 return maxRange;
 }
 
}
