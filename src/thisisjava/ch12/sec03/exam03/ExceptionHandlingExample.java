package thisisjava.ch12.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i <= array.length; i++) {
            try {
                System.out.println(array[i].length());
                int value = Integer.parseInt(array[i]);


            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없는 항목이 있습니다. 확인해 주세요.");
            }
             catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
                     System.out.println("문자열이 없거나 항목 수를 초과했습니다.");
            }
             catch (Exception e) {
                     System.out.println("예상치 못한 예외가 발생했습니다.");
            }

        }
    }
}
