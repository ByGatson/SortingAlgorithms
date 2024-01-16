public class SelectionSort extends Sort {
    private int helperIndex = 0;
    private boolean canIContinue = true;

    public SelectionSort() {
        super();
    }

    public void sort() {
        for (int i = 0; i < list.length; i++) {
            int helper = list[i];
            for (int j = i; j < list.length; j++) {
                if (helper > list[j]) {
                    helper = list[j];
                    helperIndex = j;
                    canIContinue = true;
                }
            }
            if (canIContinue) {
                list[helperIndex] = list[i];
                list[i] = helper;
                canIContinue = false;
            }
        }
        showList();
    }
}
