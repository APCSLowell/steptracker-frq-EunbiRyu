import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 
 private ArrayList <Integer> myStepsList();
 public StepTracker(int steps){
  myStepsList = new ArrayList <Integer>();
  myStepsList.add(steps);
 }
 public double averageSteps(){
  int sum=0;
  for(int i=0;i<myStepsList.size();i++){
   sum += myStepsList.get(i);
  }
  return (double)sum/myStepsList.size();
 }
 public int activeDays(){
  return myStepsList.size();
 }
 public void addDailySteps(int daily){
  myStepsList.add(daily);
 }
 
} 
