public class TestArray2 {
    public static void main(String[] args) {
    // Q. 아래 char[] 배열에 APPLE이라는 문자가 저장되어 있다. 대문자로 된 APPLE을 소문자 apple로 출력하세요.

    char[] c = {'A','P','P','L','E'};

        System.out.println((char)(c[0]+32)); // A -> a
        System.out.println((char)(c[1]+32)); // P -> p
        System.out.println((char)(c[2]+32)); // P -> p
        System.out.println((char)(c[3]+32)); // L - l
        System.out.println((char)(c[4]+32)); // E - e

        System.out.println((char)(c[0]+32)+"\t"+(char)(c[1]+32)+"\t"+(char)(c[2]+32)+"\t"+(char)(c[3]+32)+"\t"+(char)(c[4]+32));
    }
}
