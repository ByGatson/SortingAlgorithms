public class InsertionSort extends Sort{
    private int indexToChange = 0;
    private int valueToChange = 0;
    private int keeper;

    @Override
    public void sort() {
        for(int i = 1;i<list.length;i++){
            for(int j = 0;j<list.length;j++){
                if(list[i] < list[j]){
                    slideList(i,j);
                    break;
                }
            }
        }

        showList();
    }
    private void slideList(int i,int limit){
        int keeper;
        while(i != limit){
            keeper = list[(i-1)];
            list[(i-1)] = list[i];
            list[i] = keeper;
            i--;
        }
    }
}
