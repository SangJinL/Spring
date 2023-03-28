package kr.ac.poly.ex2.repository;

import kr.ac.poly.ex2.entity.Memo;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemoReositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass(){
        System.out.println(memoRepository.getClass().getName());
    }
//    @Test
//    public void testInsertDummies(){
//        IntStream.rangeClosed(1, 100).forEach(i -> {
//            Memo memo = Memo.builder().memoText("Sample..."+i).build();
//            memoRepository.save(memo);
//        });
//    }
}
