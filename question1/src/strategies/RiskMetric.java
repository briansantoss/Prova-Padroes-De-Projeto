package strategies;

import java.util.HashMap;

public interface RiskMetric {
    void calculate(HashMap<String, Object> context);
}
