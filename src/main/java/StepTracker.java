import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 
 private ArrayList <Integer> arrList();
 public StepTracker(int steps){
  arrList = new ArrayList <Integer>();
  arrList.add(steps);
 }
 public double averageSteps(){
  int sum=0;
  for(int i=0;i<arrList.size();i++){
   sum += arrList.get(i);
  }
  return (double)sum/arrList.size();
 }
 public int activeDays(){
  return arrList.size();
 }
 public void addDailySteps(int daily){
  arrList.add(daily);
 }
 
} 
