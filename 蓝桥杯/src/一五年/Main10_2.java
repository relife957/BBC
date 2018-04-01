package 一五年;
import java.util.ArrayList;
import java.util.Scanner;

public class Main10_2 {
    //使用Prim算法，获取输入图的最小生成树
    public int[][] getPrim(int[][] value) {
        int[][] result = new int[value.length][value[0].length]; //存放最终最小生成树的边权值
        int[] used = new int[value.length];  //用于判断顶点是否被遍历  
        for(int i = 1, len = value.length;i < len;i++)
            used[i] = -1;   //初始化，所有顶点均未被遍历
        used[1] = 1;  //从顶点1开始遍历，表示顶点已经被遍历
        
        int count = 1;    //记录已经完成构造最小生成树的顶点
        int len = value.length;
        while(count < len) {  //当已经遍历的顶点个数达到图的顶点个数len时，退出循环
            int tempMax = Integer.MAX_VALUE;
            int tempi = 0;
            int tempj = 0;
            for(int i = 1;i < len;i++) {  //用于遍历已经构造的顶点
                if(used[i] == -1)  
                    continue;
                for(int j = 1;j < len;j++) {  //用于遍历未构造的顶点
                    if(used[j] == -1) {
                        if(value[i][j] != 0 && tempMax > value[i][j]) {
                            tempMax = value[i][j];
                            tempi = i;
                            tempj = j;
                        }
                    }
                }
            }
            result[tempi][tempj] = tempMax;
            result[tempj][tempi] = tempMax;
            used[tempj] = 1;
            count++;
        }
        return result;
    }
    //使用floyd算法获取所有顶点之间的最短路径的具体路径
    public void floyd(int[][] primTree, int[][] path) {
        int[][] tree = new int[primTree.length][primTree.length];
        for(int i = 1;i < primTree.length;i++) 
            for(int j = 1;j < primTree.length;j++)
                tree[i][j] = primTree[i][j];
        for(int k = 1;k < primTree.length;k++) {
            for(int i = 1;i < primTree.length;i++) {
                for(int j = 1;j < primTree[0].length;j++) {
                    if(tree[i][k] != 0 && tree[k][j] != 0) {
                        int temp = tree[i][k] + tree[k][j];
                        if(tree[i][j] == 0) {
                            tree[i][j] = temp;
                            path[i][j] = k;   //存放顶点i到顶点j之间的路径节点
                        }
                            
                    }
                }
            }
        }
    }
    //返回a与b之间的最大值
    public int max(int a, int b) {
        return a > b ? a : b;
    }
    //根据最短路径，返回顶点start~end之间的最大权值边
    public int dfsMax(int[][] primTree, int[][] path, int start, int end) {
        if(path[start][end] == 0)
            return primTree[start][end];
        int mid = path[start][end];  //start和end的中间顶点
        return max(dfsMax(primTree, path, start, mid), dfsMax(primTree, path, mid, end));
    }
    //根据最小生成树，返回各个顶点到其它顶点行走过程中，权值最大的一条边
    public int[][] getMaxValue(int[][] primTree) {
        int[][] path = new int[primTree.length][primTree[0].length];
        floyd(primTree, path);       //获取具体最短路径
        int[][] result = new int[primTree.length][primTree[0].length];
        for(int i = 1;i < primTree.length;i++) {
            for(int j = 1;j < primTree.length;j++) {
                if(j == i)
                    continue;
                int max = dfsMax(primTree, path, i, j);
                result[i][j] = max;
            }
        }
        return result;
    }
    //打印出题意结果
    public void printResult(int[][] value, int[][] result) {
        int[][] primTree = getPrim(value);      //获取输入图的最小生成树
        int[][] maxResult = getMaxValue(primTree);    //获取各个顶点到其它顶点最短路径中最大权值边
        for(int i = 0;i < result.length;i++) {
            int L = result[i][0];
            int R = result[i][1];
            int K = result[i][2];
            int C = result[i][3];
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = L;j <= R;j++) {
                if(j % K == C)
                    list.add(j);
            }
            int max = 0;
            for(int j = 0;j < list.size();j++) {
                for(int k = j + 1;k < list.size();k++) {
                    if(max < maxResult[list.get(j)][list.get(k)])
                        max = maxResult[list.get(j)][list.get(k)];
                }
            }
            System.out.println(max);
        }
        return;
    }
    
    public static void main(String[] args) {
        Main10_2 test = new Main10_2();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int Q = in.nextInt();
        int[][] value = new int[N + 1][N + 1];
        for(int i = 1;i <= M;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int tempV = in.nextInt();
            value[a][b] = tempV;
            value[b][a] = tempV;
        }
        int[][] result = new int[Q][4];
        for(int i = 0;i < Q;i++) {
            result[i][0] = in.nextInt();
            result[i][1] = in.nextInt();
            result[i][2] = in.nextInt();
            result[i][3] = in.nextInt();
        }
        test.printResult(value, result);
    }
}