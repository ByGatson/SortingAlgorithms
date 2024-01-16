public abstract class Sort implements ISort{
    public int[] list;
    Sort(){
        list = new int[]{64, 25, 12, 22, 11};
    }

    public void showList() {
        for(int i : list){
            System.out.print(i+",");
        }
    }
}
