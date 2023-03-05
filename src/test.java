import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test {
    public static void main(String[] args) {
        List<Integer> supermarket = new ArrayList(Arrays.asList(5,3,4));
        List<Integer> supermarket2 = new ArrayList(Arrays.asList(10,2,3,3));
        List<Integer> supermarket3 = new ArrayList(Arrays.asList(2,3,10));
        List<Integer> supermarket4 = new ArrayList(Arrays.asList(2,3,10,2,3,10,8,7,4,12,4,6));

        int result = Assorted.queueTime(supermarket, 1);
        int result2 = Assorted.queueTime(supermarket2, 2);
        int result3 = Assorted.queueTime(supermarket3, 2);
        int result4 = Assorted.queueTime(supermarket4, 3);

        System.out.println(result4);
//        for (int j = 0; j < list4.size(); j++){
//            System.out.println(list4.get(j));
//        }


//
//        for (int i = 0; i < listB.size(); i++){
//            if(listA.contains(listB.get(i))){
//                System.out.println("here " + i);
//                int j = 0;
//                while(j < listA.size()){
//                    if(listA.get(j)==listB.get(i)){
//                        System.out.println("here " + j);
//                        listA.remove(j);
//                        System.out.println(listA.get(j));
//                        System.out.println(listA.size());
//                    }else{
//                        j++;
//                    }
//                }
//            }
//        }

    }

}
