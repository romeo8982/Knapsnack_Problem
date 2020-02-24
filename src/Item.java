public class Item {
    private double value;
    private int weight;
    /**
     * Default constructor of item
     * @param value - double
     * @param weight - int
     */
    public Item(double value, int weight)
    {
        this.value=value;
        this.weight=weight;
    }
    /**
     * Get value of item
     * @return Double value
     */
    public double GetValue()
    {
        return value;
    }
    /**
     * Set value of item
     * @param value - to set
     */
    public void SetValue(double value)
    {
        this.value=value;
    }
    /**
     * Get weight of item
     * @return Integer weight
     */
    public int GetWeight()
    {
        return weight;
    }
    /**
     * Set weight of item
     * @param weight - to set
     */
    public void SetValue(int weight)
    {
        this.weight=weight;
    }
}

