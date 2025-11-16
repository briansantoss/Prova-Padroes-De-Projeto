package strategies;

import java.util.HashMap;

public class ValueAtRisk implements RiskMetric {
    @Override
    public void calculate(HashMap<String, Object> context) {
        System.out.println("Calculating using Value at Risk algorithm...");
    }
}
