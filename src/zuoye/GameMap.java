package zuoye;

import java.util.Random;

//class
//GameMap(object):
//def init (self, rows, cols): 
//"""地图将在逻辑模块进行初始化""" 
//pass
//def reset(self, life_ratio): 
//"""重置地图并按life_ratio随机地填充一些活细胞""" 
//pass
//def get_neighbor_count(self, row, col): 
//"""地图上一个方格周围活细胞数是游戏逻辑里的重要数据""" 
//pass
//def set(self, row, col, val): 
//"""当游戏进行中，需要常常更新地图上方格的状态""" 
//pass
//def get(self, row, col): 
//"""当需要将游戏状态呈现给用户时，就需要获取地图上方
//格的状态""" 
//pass
public class GameMap {
  public static int[][] map=new int[12][12];
  void init() {
	  for(int i=0;i<=11;i++)
		  for(int j=1;j<=11;j++)
		  {
			  map[i][j]=0;
		  }
	  System.out.println("棋盘创建成功");
	  return ;
  }
  void reset(int n) {
	  Random random = new Random();
	  for(int num=0;num<n;num++)
	  {
		  int i=random.nextInt(10);
		  int j= random.nextInt(10);
	  map[i][j]=1;
	   System.out.println("第"+i+"行"+"第"+j+"列"+"细胞变为活细胞");}
	  System.out.println("随机化初始成功");
  }
  int get_neighbor_count(int i,int j){
	  int num=0;
	  for(int a=i-1;a<=i+1;a++)
		  for(int b=j-1;b<=j+1;b++) {
			  if(map[a][b]==1) {
				  num++;
			  }
		  }
	  if(map[i][j]==1) num--;  
	  return num;
  }
  void set()
  {      int[][] ob=new int[12][12];
	  for(int i=1;i<=10;i++)
		  for(int j=1;j<=10;j++)
		  {
			  int num=get_neighbor_count(i,j);
			  if(num>=4) ob[i][j]=0;
			  else if(num==3) ob[i][j]=1;
			  else if(num==2) ob[i][j]=map[i][j];
			  else ob[i][j]=0;
		  }
	  for(int i=1;i<=10;i++)
		  for(int j=1;j<=10;j++)
			  map[i][j]=ob[i][j];
  }
  void get() {
	  for(int i=1;i<=10;i++)
	  {
		  for(int j=1;j<=10;j++)
		  {
			  System.out.print(map[i][j]+" ");
		  }
		  System.out.println(" ");
	  }
  }
}
