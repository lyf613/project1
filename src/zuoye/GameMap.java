package zuoye;

import java.util.Random;

//class
//GameMap(object):
//def init (self, rows, cols): 
//"""��ͼ�����߼�ģ����г�ʼ��""" 
//pass
//def reset(self, life_ratio): 
//"""���õ�ͼ����life_ratio��������һЩ��ϸ��""" 
//pass
//def get_neighbor_count(self, row, col): 
//"""��ͼ��һ��������Χ��ϸ��������Ϸ�߼������Ҫ����""" 
//pass
//def set(self, row, col, val): 
//"""����Ϸ�����У���Ҫ�������µ�ͼ�Ϸ����״̬""" 
//pass
//def get(self, row, col): 
//"""����Ҫ����Ϸ״̬���ָ��û�ʱ������Ҫ��ȡ��ͼ�Ϸ�
//���״̬""" 
//pass
public class GameMap {
  public static int[][] map=new int[12][12];
  void init() {
	  for(int i=0;i<=11;i++)
		  for(int j=1;j<=11;j++)
		  {
			  map[i][j]=0;
		  }
	  System.out.println("���̴����ɹ�");
	  return ;
  }
  void reset(int n) {
	  Random random = new Random();
	  for(int num=0;num<n;num++)
	  {
		  int i=random.nextInt(10);
		  int j= random.nextInt(10);
	  map[i][j]=1;
	   System.out.println("��"+i+"��"+"��"+j+"��"+"ϸ����Ϊ��ϸ��");}
	  System.out.println("�������ʼ�ɹ�");
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
