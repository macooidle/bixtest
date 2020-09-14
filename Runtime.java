public class Main
{
    public static void main(String[] args) {
                
        int[][] mat = new int[3][3];
        int[] sumRows = new int[3];
        int[] sumCols = new int[3];
        int[] sumCross = new int[2];
        
        for(int i = 0; i < args.length; ++i) {
            String[] datas = args[i].split(" ");
            int x = Integer.valueOf(datas[0]).intValue();
            int y = Integer.valueOf(datas[1]).intValue();
            if (mat[x][y] != 0) {
                System.out.println("error input");
            
                return;
            }
            
            int value = -1;
            if ("X".equals(datas[2])) {
                value = 1;
            }
            
            mat[x][y] = value;
            
            sumRows[x] += value;
            sumCols[y] += value;
            if (x == y) {
                sumCross[0] += value;
                if (x == 1) {
                    sumCross[1] += value;
                }
            } else if ((x == 0 && y == 2) || (x == 2 && y == 0)) {
                sumCross[1] += value;
            }
            
            
            if (sumRows[x] == 3 || sumCols[y] == 3) {
                System.out.println("X WINS");
                return;
            } else if (sumRows[x] == -3 || sumCols[y] == -3) {
                System.out.println("O WINS");
                return;
            } else if (sumCross[0] == 3 || sumCross[1] == 3) {
                System.out.println("X WINS");
                return;
            } else if (sumCross[0] == -3 || sumCross[1] == -3) {
                System.out.println("O WINS");
                return;
            }
        }
        
    }
}