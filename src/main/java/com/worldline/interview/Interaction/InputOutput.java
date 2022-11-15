package com.worldline.interview.Interaction;

import com.worldline.interview.EnumType.EngineType;
import com.worldline.interview.EnumType.FuelType;
import com.worldline.interview.Services.Engine;
import com.worldline.interview.Services.WidgetMachine;

import java.util.Scanner;

public class InputOutput {
    Scanner myObj = new Scanner(System.in);
    WidgetMachine widgetMachine = new WidgetMachine();

    public void main()
    {
        String cancel = "Y";
        int chooseFuel = 1;

        System.out.print("Quantity specified : ");
        int quantity = myObj.nextInt();
        System.out.println("Cost : "+widgetMachine.produceWidgets(quantity) +"£");

        loop : while(cancel.equals("Y"))
        {
            System.out.print("\nQuantity specified : ");
            quantity = myObj.nextInt();
            System.out.println("1 .COAL\n2. WOOD");
            System.out.print("Choose Your Fuel Type : ");
            chooseFuel = myObj.nextInt();

            switch (chooseFuel) {
                case 1 : widgetMachine = new WidgetMachine(FuelType.COAL);
                    break;
                case 2 : widgetMachine = new WidgetMachine(FuelType.WOOD);
                    break;
                default:
                    System.out.println("Fuel Type Not Exist");
                    break loop;
            }
            //Output
            System.out.println("Cost : "+widgetMachine.produceWidgets(quantity) +"£");

            //Cancel Program
            System.out.print("\nPress Y to Continue, N to Cancel : ");
            cancel = myObj.next();
        }
    }
}
