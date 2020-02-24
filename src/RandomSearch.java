import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSearch extends Algorithm {
    /**
     * Default constructor of RandomSearch
     */
    /**
     * Get solution of problem using random search algorithm which choose one hundred times random solution and pick the best one.
     */
    @Override
    public Solution GetSolution() {
        Random rand= new Random();
        List<Integer> indexes = new ArrayList<Integer>();
        int Index=0;
        Solution opt = new Solution();
        opt.valueBackpack=0;
        Solution helper;
        int backpackSize=0;
        for(int i=0;i<100;i++)
        {
            helper = new Solution();
            backpackSize = instance.GetCapacity();
            indexes.clear();
            for(int j=0;j<instance.GetSize();j++)
            {
                do {
                    Index = rand.nextInt(instance.GetSize());
                }
                while(indexes.contains(Index));
                indexes.add(Index);

                if(backpackSize-instance.GetItem(Index).GetWeight()>=0) {
                    helper.Items.add(instance.GetItem(Index));
                    helper.valueBackpack += instance.GetItem(Index).GetValue();
                    backpackSize -= instance.GetItem(Index).GetWeight();
                }
            }
            if(helper.valueBackpack>opt.valueBackpack)
            {
                opt=helper;
                helper=new Solution();
            }
        }
        return opt;
    }
    /**
     * Get description of random search algorithm.
     */
    @Override
    public String GetDescription() {
        String description = "Get solution of problem using random search algorithm" +
                " which choose one hundred times random solution and pick the best one.";
        return  description;
    }
}
