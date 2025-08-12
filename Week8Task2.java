import java.io.*;

/**
 * Lớp Week8Task2 chứa các phương thức để gây ra và xử lý 5 loại ngoại lệ phổ biến trong Java.
 * Mỗi loại ngoại lệ có một phương thức gây lỗi (void) và một phương thức xử lý lỗi (trả về String).
 */
public class Week8Task2 {

    /**
     * Gây ra lỗi NullPointerException bằng cách gọi phương thức trên đối tượng null.
     */
    public static void nullPointerEx() {
        String s = null;
        s.length(); // Gây lỗi
    }

    /**
     * Bắt lỗi NullPointerException từ phương thức nullPointerEx().
     *
     * @return Chuỗi thông báo lỗi hoặc "Không có lỗi" nếu không xảy ra lỗi.
     */
    public static String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Gây ra lỗi ArrayIndexOutOfBoundsException bằng cách truy cập phần tử ngoài giới hạn mảng.
     */
    public static void arrayIndexOutOfBoundsEx() {
        int[] arr = new int[3];
        int x = arr[5]; // Gây lỗi
    }

    /**
     * Bắt lỗi ArrayIndexOutOfBoundsException từ phương thức arrayIndexOutOfBoundsEx().
     *
     * @return Chuỗi thông báo lỗi hoặc "Không có lỗi" nếu không xảy ra lỗi.
     */
    public static String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * Gây ra lỗi ArithmeticException bằng cách chia cho 0.
     */
    public static void arithmeticEx() {
        int x = 10 / 0; // Gây lỗi
    }

    /**
     * Bắt lỗi ArithmeticException từ phương thức arithmeticEx().
     *
     * @return Chuỗi thông báo lỗi hoặc "Không có lỗi" nếu không xảy ra lỗi.
     */
    public static String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * Gây ra lỗi FileNotFoundException bằng cách mở một file không tồn tại.
     *
     * @throws FileNotFoundException nếu file không tồn tại.
     */
    public static void fileNotFoundEx() throws FileNotFoundException {
        FileReader reader = new FileReader("khong_ton_tai.txt"); // Gây lỗi
    }

    /**
     * Bắt lỗi FileNotFoundException từ phương thức fileNotFoundEx().
     *
     * @return Chuỗi thông báo lỗi hoặc "Không có lỗi" nếu không xảy ra lỗi.
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * Gây ra lỗi IOException bằng cách đọc file không tồn tại hoặc không thể đọc.
     *
     * @throws IOException nếu xảy ra lỗi khi đọc file.
     */
    public static void ioEx() throws IOException {
        FileReader reader = new FileReader("khong_ton_tai.txt");
        reader.read(); // Gây lỗi IOException nếu file không đọc được
    }

    /**
     * Bắt lỗi IOException từ phương thức ioEx().
     *
     * @return Chuỗi thông báo lỗi hoặc "Không có lỗi" nếu không xảy ra lỗi.
     */
    public static String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
