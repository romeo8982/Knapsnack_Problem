import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Instance {
    /**
     * Default constructor of BruteForce
     */
    /**
     * Instance contains list of items and capacity
     */
    private List<Item> Items = new ArrayList<Item>();
    private int capacity;
    /**
     * Adds item to instance
     * @param item - object of Item
     */
    public void AddItem(Item item)
    {
        Items.add(item);
    };
    /**
     * Remove item from instance
     * @param index - index for remove
     */
    public void RemoveItem(int index)
    {
        Items.remove(index);
    };
    /**
     * Get capacity of backpack
     * @return Capacity of backpack
     */
    public int GetCapacity()
    {
        return capacity;
    }
    /**
     * Set capacity of backpack
     * @param capacity - capacity of knapsack
     */
    public void SetCapacity(int capacity)
    {
        this.capacity=capacity;
    }
    /**
     * Get size of list of items
     * @return size of list of items
     */
    public int GetSize()
    {
        return Items.size();
    }
    /**
     * @param index - index to get
     * @return Item specified by index
     */
    public Item GetItem(int index)
    {
        return Items.get(index);
    }
    /**
     * Change places two items in list by self
     * @param firstIndex - item in list
     * @param secondIndex - item in list
     */
    public void swap(int firstIndex, int secondIndex)
    {
        Collections.swap(Items, firstIndex, secondIndex);
    }
}
