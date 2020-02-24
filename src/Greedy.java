public class Greedy extends Algorithm {
    /**
     * Default constructor of Algorithm
     */
    /**
     * Method sort all items in list by profit in count value divided by weight.
     */
    private void sort() {
        for (int i = 0; i < instance.GetSize() - 1; i++) {
            for (int j = 0; j < instance.GetSize() - i - 1; j++) {
                if (instance.GetItem(j).GetValue() / instance.GetItem(j).GetWeight() <= instance.GetItem(j+1).GetValue() / instance.GetItem(j+1).GetWeight()) {
                    instance.swap(j, j+1);
                }
            }
        }
    }
    /**
     *  Get solution of problem using greedy algorithm which sort all items by profit and try to put in backpack the most profitable until end of items or capacity of backpack equal to zero.
     */
    @Override
    public Solution GetSolution() {
        Solution opt = new Solution();
        opt.valueBackpack=0;
        int BackpackSize = instance.GetCapacity();
        sort();
        for(int i=0;i<instance.GetSize();i++)
        {
            if(BackpackSize-instance.GetItem(i).GetWeight()>=0)
            {
                BackpackSize-=instance.GetItem(i).GetWeight();
                opt.valueBackpack+=instance.GetItem(i).GetValue();
                opt.Items.add(instance.GetItem(i));
            }
            if(BackpackSize==0)
            {
                return opt;
            }
        }
        return opt;
    }
    /**
     * Get description of Greedy algorithm.
     */
    @Override
    public String GetDescription() {
        String description = "Get solution of problem using greedy algorithm which" +
                " sort all items by profit and try to put in backpack the most profitable" +
                " until end of items or capacity of backpack equal to zero.";
        return  description;
    }
}
