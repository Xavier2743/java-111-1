public class Test0404 {
    public static void main(String[] avgs) {
        int grade = 0;
        String space = "";
        
        while (grade < 10) {
            System.out.printf(space);
            System.out.println(grade);
            grade ++;
            space += " ";
        }
    }
}
