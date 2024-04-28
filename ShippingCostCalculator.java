public interface ShippingCostCalculator {
    public double calculateShippingCost(Chair chair);
    public double calculateShippingCost(Table table);
    public double calculateShippingCost(Sofa sofa);
}