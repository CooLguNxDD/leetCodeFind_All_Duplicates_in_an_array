import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by CooLguN on 2016/11/16.
 */
public class solution {

    public List<Integer> findDuplicates(int[] nums) {

        Set list = new HashSet<Integer>();
        List<Integer> checkedList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
            else {       //if(list.contains(nums[i]) && !checkedList.contains(nums[i])
                checkedList.add(nums[i]);
            }
        }
        return checkedList;
    }

}
