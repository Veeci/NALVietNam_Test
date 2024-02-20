import java.util.Scanner;

public class Main {
	public static int CountVNWords(String input) {
        String vneseChars = "aăâdeêoôơuưđ";
        int count = 0;
        int i = 0;
        while (i < input.length()) {
            // Kiểm tra ký tự hiện tại và ký tự tiếp theo có tạo thành 1 từ tiếng Việt hay không
            if (vneseChars.indexOf(input.charAt(i)) >= 0) {
                count++;
                while (i < input.length() && vneseChars.indexOf(input.charAt(i)) >= 0) {
                    i++;
                }
            } else {
                i++;
            }
        }
        
        //Kiểm tra 2 ký tự cuối có tạo thành 1 từ tiếng Việt hay không
        String lastChar = input.substring(input.length() - 2);
        if (vneseChars.indexOf(lastChar.charAt(0)) >= 0 && vneseChars.indexOf(lastChar.charAt(1)) >= 0) {
            count++;
        }
        return count;
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi kỹ tự cần kiểm tra: ");
        String input = scanner.nextLine();
        
        int count = CountVNWords(input);
        System.out.println("Số lượng từ tiếng Việt có thể tạo thành: " + count);
        scanner.close();
    }
}
