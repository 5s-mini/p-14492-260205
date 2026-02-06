import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestUtil {

    private static PrintStream ORIGINAL_OUT = System.out;
    private static PrintStream CURRENT_OUT = System.out;

//    public static String run(String input) {
//
//        // 입력값
//        Scanner scan = new Scanner(input);
//
//        // 명언 프로그램 실행
//
//        //출력값
//    }

    public static Scanner genScanner(String input) {
        return new Scanner(input);
    }

    public static ByteArrayOutputStream setOutByteArray() {

        ORIGINAL_OUT = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        CURRENT_OUT = printStream;

        return outputStream;
    }

    public static void clearSetOutByteArray(ByteArrayOutputStream outputStream) throws Exception {
        System.setOut(ORIGINAL_OUT);
        outputStream.close();
        CURRENT_OUT.close();

    }
}