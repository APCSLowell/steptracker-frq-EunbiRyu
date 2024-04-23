import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 
 private ArrayList <Integer> myStepsList;
 private int active;
 
 public StepTracker(int steps){
  myStepsList = new ArrayList <Integer>();
  active = steps;
 }
 public void addDailySteps(int daily){
  myStepsList.add(daily);
 }
 public int activeDays(){
  int days = 0;
  for(int i=0; i<myStepsList.size(); i++){
   if(myStepsList.get(i) >= active){
    days++;
   }
  }
  return days;
 }
 public double averageSteps(){
  if(myStepsList.size() ==0){
   return 0;
  }
  double steps = 0;
  for(int i=0;i<myStepsList.size();i++){
   steps += myStepsList.get(i);
  }
  return steps/myStepsList.size();
 }
} 
