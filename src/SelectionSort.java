public class SelectionSort extends Sort {

    public SelectionSort() {
        super();
    }

    public void sort() {
        list = new int[]{64, 25, 12, 22, 11, 100, 200, 50, 1, 3, 4, 2};
        showList();
        int helperIndex = 0;
        for (int i = 0; i < list.length; i++) {
            int helper = list[i];
            for (int j = i; j < list.length; j++) {
                if (list[j] <= helper) {
                    helper = list[j];
                    helperIndex = j;
                }
            }
            int keeper = list[i];
            list[i] = helper;
            list[helperIndex] = keeper;
        }
        showList();
    }
}
