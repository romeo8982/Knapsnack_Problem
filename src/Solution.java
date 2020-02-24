import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * Solution contains list of items and value of backpack
     */
    protected List<Item> Items = new ArrayList<Item>();
    protected double valueBackpack;
    /**
     * Print solution and value of backpack
     */
    public void print()
    {
        for(int i=0;i<Items.size();i++)
        {
            System.out.println("Wartosc:" + Items.get(i).GetValue() + " " + "Waga:" + Items.get(i).GetWeight() );
        }
        System.out.println("Wartosc plecaka:" + valueBackpack + System.getProperty("line.separator"));
    }
}