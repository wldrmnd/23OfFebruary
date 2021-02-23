import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    private List<Integer> list;

    @Test
    public void isArrayListFasterThanLinkedList() {
        fullArrayList();
        long arrayListBenchmark = getTimeThatListRun();

        fullLinkedList();
        long linkedListBenchmark = getTimeThatListRun();

        System.out.println(arrayListBenchmark);
        System.out.println(linkedListBenchmark);

        Assert.assertTrue(arrayListBenchmark > linkedListBenchmark);
    }

    private long getTimeThatListRun() {
        Date startTime = new Date();
        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    private void fullArrayList() {
        list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }

    private void fullLinkedList() {
        list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }
}
