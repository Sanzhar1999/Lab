package javaapplication12;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class sancho extends Application{
  public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<Double>();

    Scanner input = new Scanner(System.in);   
    System.out.print("Enter integers (input ends with 0): ");
     double value;

    do {
      value = input.nextDouble(); 

      if (value != 0) 
        list.add(value); // Add the value if it is not in the list
    } while (value != 0);
     System.out.println("The maximum number is " + max(list));

     System.out.print("Enter five double values: ");
     for (int i = 0; i < 5; i++)
      list.add(input.nextDouble());

    System.out.println("The sum is " + sum(list));

  }

  public static Double max(ArrayList<Double> list) {
    if (list == null || list.size() == 0)
      return null;

    double result = list.get(0);
    for (int i = 1; i < list.size(); i++)
      if (result < list.get(i))
        result = list.get(i);
    
    return result;
  }

  public static double sum(ArrayList<Double> list){
    double sum = 0;
    for (int i = 0; i < list.size(); i++)
      sum += list.get(i);
    return sum;
  }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

