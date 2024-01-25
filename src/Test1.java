import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static long findValuation(long reqArea, List<Long> area, List<Long> price) {
        // Check if the required square footage is within the range of available data.
        if (area.size() == 0) {
            return 1000;
        } else if (area.size() == 1) {
            return price.get(0);
        } else {
            long lowerPrice = -1;
            long upperPrice = -1;

            for (int i = 0; i < area.size(); i++) {
                long currentArea = area.get(i);
                long currentPrice = price.get(i);

                if (currentArea == reqArea) {
                    return currentPrice;
                } else if (currentArea < reqArea) {
                    lowerPrice = currentPrice;
                } else if (currentArea > reqArea) {
                    upperPrice = currentPrice;
                    break;
                }
            }

            // If reqArea is outside the range of available data, use linear extrapolation.
            if (lowerPrice == -1) {
                return Math.min(105, Math.max(103, upperPrice));
            } else if (upperPrice == -1) {
                return Math.min(105, Math.max(103, lowerPrice));
            }

            // Linear interpolation using the provided formula.
            double interpolatedPrice = lowerPrice + (reqArea - area.get(area.indexOf(reqArea) - 1)) * (upperPrice - lowerPrice) / (area.get(area.indexOf(reqArea)) - area.get(area.indexOf(reqArea) - 1));
            return Math.round(Math.min(105, Math.max(103, interpolatedPrice)));
        }
    }

    public static void main(String[] args) {
        List<Long> area = new ArrayList<>();
        List<Long> price = new ArrayList<>();
        area.add(1200L);
        area.add(1300L);
        area.add(1200L);
        area.add(1300L);
        area.add(1200L);
        area.add(2000L);

        price.add(12000L);
        price.add(24000L);
        price.add(14000L);
        price.add(22000L);
        price.add(13000L);
        price.add(30000L);
        // Populate the area and price lists with historical data.

        long reqArea = 1500; // Replace with the square footage of the candidate house.
        long valuation = findValuation(reqArea, area, price);
        System.out.println("Valuation: " + valuation);
    }
}
