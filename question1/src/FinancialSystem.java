import strategies.RiskMetric;

import java.util.HashMap;

public class FinancialSystem {
    RiskMetric riskMetric;

    public FinancialSystem(RiskMetric riskMetric) {
        this.riskMetric = riskMetric;
    }

    public void setRiskMetric(RiskMetric riskMetric) {
        this.riskMetric = riskMetric;
    }

    void calculateRiskMetric(HashMap<String, Object> context) {
        riskMetric.calculate(context);
    }
}
