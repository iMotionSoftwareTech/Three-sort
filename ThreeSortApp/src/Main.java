//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        args = new String[] { "30", "10", "60" };
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int min = Math.min(Math.min(num1, num2), num3);
        int max = Math.max(Math.min(num1, num2), num3);
        int mid = (num1+ num2 + num3) - min - max;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Sorted Order: " + min + " " + mid + " " + max);
    }
}