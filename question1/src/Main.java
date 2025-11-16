import strategies.ExpectedShortfall;
import strategies.StressTesting;
import strategies.ValueAtRisk;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ExpectedShortfall expectedShortfall = new ExpectedShortfall();
        StressTesting stressTesting = new StressTesting();
        ValueAtRisk valueAtRisk = new ValueAtRisk();

        HashMap<String, Object> context = new HashMap<String, Object>();
        FinancialSystem system = new FinancialSystem(expectedShortfall);
        int choice = 0;

        do {
            System.out.println("[1] - Expected Shortfall\n[2] - Stress Testing\n[3] - Value at risk\n[4] - Exit");
            System.out.print("\nChoice number: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    system.setRiskMetric(expectedShortfall);
                    system.calculateRiskMetric(context);
                    break;
                case 2:
                    system.setRiskMetric(stressTesting);
                    system.calculateRiskMetric(context);
                    break;
                case 3:
                    system.setRiskMetric(valueAtRisk);
                    system.calculateRiskMetric(context);
            }
        } while (choice != 4);
    }
}
