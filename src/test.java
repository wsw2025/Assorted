import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test {
    public static void main(String[] args) {
//        List<String> directions = new ArrayList(Arrays.asList("NORTH", "SOUTH", "EAST", "WEST"));
//        List<String> directions = new ArrayList(Arrays.asList("NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"));
//        List<String> directions = new ArrayList(Arrays.asList("NORTH", "NORTH", "EAST", "EAST", "NORTH", "WEST", "SOUTH", "WEST", "WEST"));
        List<Integer> returnList = new ArrayList<>();
        for (int i = 1; i <= 200;i++) {
            String s = "" + i;
            int num = 0;
            for (int j = 0; j < s.length(); j++) {
                num += Math.pow(Character.getNumericValue(s.charAt(j)), j + 1);
//                System.out.println(s.charAt(j));
//                System.out.println(Math.pow(Character.getNumericValue(s.charAt(j)), j + 1));
            }
            if (num == i){
//                System.out.println("here");
                returnList.add(i);
            }

        }
        System.out.println(returnList.size());
        for (int i = 0; i < returnList.size(); i++){
            System.out.println(returnList.get(i));
        }
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
