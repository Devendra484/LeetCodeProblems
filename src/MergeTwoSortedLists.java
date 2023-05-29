import java.util.*;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1=new LinkedList<>();
        List<Integer> list2=new LinkedList<>();

        list1= Arrays.asList(1,2,4);
        list2=Arrays.asList(1,3,4);

        List<Integer> mainList=new ArrayList<>();
        mainList.addAll(list1);
        mainList.addAll(list2);
        Collections.sort(mainList);
        System.out.println(mainList);
    }
}
