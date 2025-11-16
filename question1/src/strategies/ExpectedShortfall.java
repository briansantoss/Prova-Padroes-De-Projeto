package strategies;

import java.util.HashMap;

public class ExpectedShortfall implements RiskMetric {
    @Override
    public void calculate(HashMap<String, Object> context) {
        System.out.println("Calculating using Expected Shortfall algorithm...");
    }
}
