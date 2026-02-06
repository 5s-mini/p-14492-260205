import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestUtilTest {

    @Test
    @DisplayName("TestUtil.genScanner()")
    void t1() {
        Scanner scanner = TestUtil.genScanner("""
               등록
               현재를 사랑하라.
               작자미상
               """);

        String cmd = scanner.nextLine();
        String quote = scanner.nextLine();
        String author = scanner.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(quote).isEqualTo("현재를 사랑하라.");
        assertThat(author).isEqualTo("작자미상");
    }

    @Test
    @DisplayName("TestUtil.setOutByteArray()")
    void t2() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutByteArray();

        System.out.println("안녕하세요");

        String rst = byteArrayOutputStream.toString();

        TestUtil.clearSetOutByteArray(byteArrayOutputStream);

        System.out.println(rst);

        assertThat(rst).contains("안녕하세요");
    }

//    @Test
//    @DisplayName("등록")
//    void t1() {
//        final String out = TestUtil.run("""
//                등록
//                현재를 사랑하라.
//                작자미상
//                """);
//
//        assertThat(out)
//                .contains("명언: ")
//                .contains("작가: ")
//                .contains("1번 명언이 등록되었습니다.");
//    }
}
