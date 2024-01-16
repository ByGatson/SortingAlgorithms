public class Main {

    public static void main(String[] args) {
        ISort sort = new MergeSort();
        sort.sort();
    }

    public static void addTest(TreeManager manager) {
        manager.add(8);
        manager.add(3);
        manager.add(10);
        manager.add(1);
        manager.add(6);
        manager.add(4);
        manager.add(7);
        manager.add(14);
        manager.add(13);

//        manager.pre_order();
//        manager.in_order();
//        manager.post_order();
        manager.level_order();
    }
}