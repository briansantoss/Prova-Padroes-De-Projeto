package strategies;

import java.util.HashMap;

public class StressTesting implements RiskMetric {
    @Override
    public void calculate(HashMap<String, Object> context) {
        System.out.println("Calculating using Stress Testing algorithm...");
    }
}
