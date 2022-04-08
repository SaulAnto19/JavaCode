public class ArreglosUnidi {
    public static void main(String[] args) {
        
        int[] n = new int[10];
        //int[] temp = new int[100];
        for (int i = 0; i < 10; i++) {
            n[i] = (int) (Math.random() * 20 + 1);
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "  ");
        }
    }
}
