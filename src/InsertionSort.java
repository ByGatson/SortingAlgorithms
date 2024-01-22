public class InsertionSort extends Sort {

    @Override
    public void sort() {
        for (int i = 0; i < list.length; i++) {
            int seperator = i;
            int keeper;
            for (int j = (seperator); j >= 0; j--) {
                if (list[seperator] < list[j]) {
                    keeper = list[j];
                    list[j] = list[seperator];
                    list[seperator] = keeper;
                }
            }

        }

        showList();
    }

}
