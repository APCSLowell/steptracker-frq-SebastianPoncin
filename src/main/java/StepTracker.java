import java.util.ArrayList;
public class StepTracker
{
  private ArrayList<Integer> steps = new ArrayList<Integer>();
  private int minSteps;
  
  public StepTracker(int n) {
     minSteps = n;
  }
  
  public int activeDays() {
    int count = 0;
    for(int i = 0; i < steps.size(); i++) {
        if(steps.get(i) > minSteps) {
          count += 1;  
        }
    }
    return count;
  }
  
  public void addDailySteps(int n) {
    steps.add(n);
  }
  
  public double averageSteps() {
    if(steps.size() > 0) {
      int sum = 0;
      for(int i = 0; i < steps.size(); i++) {
        sum += steps.get(i);  
      }
      return (double)sum/((double)steps.size());
    }
    return 0;
  }
} 
