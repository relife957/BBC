package 一五年;

import java.util.Scanner;
import java.util.Stack;

class CloseEdge{
	int adjVex ;
	int lowCost ;
	public CloseEdge(int adjVex ,int lowCost) {
		this.adjVex = adjVex ;
		this.lowCost = lowCost ;
	}
}
public class Main10 {
	public static int[][] prim(int[][] mGraph){
		int[][] tree = new int[mGraph.length-1][2] ; //创建返回数组,该二维数组第一位是与原邻接矩阵i处相连的结点
		//第二位是原邻接矩阵i处的结点
		CloseEdge[] closeEdge = new CloseEdge[mGraph.length] ;   //辅助矩阵,adjVex是最小生成树中与该结点距离最短的点 
		//lowcost是最小生成树与该节点的距离
		int count = 0 ;
		for(int i = 1 ; i < mGraph.length ;i++) {
			closeEdge[i] = new CloseEdge(0,mGraph[0][i]) ; //初始化closeedge
		}
		closeEdge[0] = new CloseEdge(0,0);
		for(int i = 1 ; i < mGraph.length ; i++) {
			int k = getMin(closeEdge);//获得距离最小生成树最短的结点编号
			tree[count][0] = closeEdge[k].adjVex ;
			tree[count][1] = k ;
			count++ ;
			closeEdge[k].lowCost = 0 ;  //表示该结点加入最小生成树
			for(int j = 0 ; j < mGraph.length ;j++) {
				if(mGraph[k][j]<closeEdge[j].lowCost) {
					closeEdge[j] = new CloseEdge(k,mGraph[k][j]) ;  //更新closeedge数组的信息
				}
			}
		}
		return tree ;
	}
	public static int getMin(CloseEdge[] closeEdge) {
		int min = Integer.MAX_VALUE ;
		int res = -1 ;
		for(int i = 0 ; i < closeEdge.length ; i++) {
			if(closeEdge[i].lowCost!=0 && closeEdge[i].lowCost<min) {
				min = closeEdge[i].lowCost ;
				res = i ;
			}
		}
		return res ;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt() ;
		int M = scan.nextInt() ;
		int Q = scan.nextInt() ;
		int[][] mGraph = new int[N][N] ;
		for(int i = 0 ; i < N ;i++) {
			for(int j = 0 ; j < N ;j++) {
				mGraph[i][j] = Integer.MAX_VALUE ;
			}
		}
		for(int i = 0 ; i < M ; i++) {
			int begin = scan.nextInt() ;
			int end = scan.nextInt() ;
			int len = scan.nextInt() ;
			mGraph[end-1][begin-1] = len ;
			mGraph[begin-1][end-1] = len ;
		}
		int[][] tree = prim(mGraph) ;
		for(int i = 0 ; i < Q ;i++) {
			int begin = scan.nextInt() ;
			int end = scan.nextInt() ;
			int k = scan.nextInt() ;
			int c = scan.nextInt() ;
			Stack<Integer> s = new Stack<>();
			for(int j = begin ; j <= end ; j++) {
				if(j%k == c) {
					s.push(j) ;
				}
			}
			int max = -1 ;
			while(!s.isEmpty()) {
				for(int k1 = 0 ; k1 < tree.length ;k1++) {
					if(tree[k1][0] == s.peek()) {
						max = Math.max(max, mGraph[tree[k1][0]][tree[k1][1]]);
						s.pop();
						if(tree[k1][1]!=s.peek()) {
							s.push(tree[k1][1]);
						}
					}else if(tree[k1][1] == s.peek()) {
						max = Math.max(max, mGraph[tree[k1][0]][tree[k1][1]]);
						s.pop();
						if(tree[k1][0]!=s.peek()) {
							s.push(tree[k1][0]);
						}
					}
				}
			}
			System.out.println(max);
		}
		scan.close();
		
	}
	
}
