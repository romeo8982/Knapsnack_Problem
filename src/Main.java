public class Main {

    public static void main(String[] args) {

        Item item[] = {
                new Item(4, 12),
                new Item(2, 1),
                new Item(10, 4),
                new Item(1, 1),
                new Item(2, 2)};
        Instance instance = new Instance();

        for (int i = 0; i < item.length; i++)
            instance.AddItem(item[i]);

        instance.SetCapacity(15);

        Algorithm algorithm = new Greedy();
        algorithm.AddInstance(instance);
        Solution solution = algorithm.GetSolution();
        solution.print();

        System.out.println(algorithm.GetDescription());

        algorithm = new BruteForce();
        algorithm.AddInstance(instance);
        solution = algorithm.GetSolution();
        solution.print();

        System.out.println(algorithm.GetDescription());

        algorithm = new RandomSearch();
        algorithm.AddInstance(instance);
        solution = algorithm.GetSolution();
        solution.print();

        System.out.println(algorithm.GetDescription());
    }

}