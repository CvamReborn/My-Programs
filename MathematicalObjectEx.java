package javaProgramming;
import java.util.*;
interface Methods
{
	void add();
	void multiply();
}
class Matrix implements Methods
{	
	private int matArr[][];
	private int row,col;
	Matrix(int row,int col)//Creating constructor for assigning values in 2D array
	{
		this.row=row;
		this.col=col;
		Scanner sc=new Scanner(System.in);
		matArr=new int[row][col];
		System.out.println(">>VALUES OF MATRIX<<");
		for(int i=0;i<row;i++)
		{
			System.out.println("->Enter values of Row-"+(i+1)+":-");
			for(int j=0;j<col;j++)
			{
				System.out.print("Matrix["+(i+1)+"]["+(j+1)+"]: ");
				matArr[i][j]=sc.nextInt();
			}
			System.out.println("");
		}
	}
	Matrix(){}//default matrix
	public void multiply()
	{
		//dummy method
	}
	public void multiply(Matrix m)//Creating method for multiplication
	{
		Matrix mulObj=new Matrix();
		mulObj.col=this.col;
		mulObj.row=this.row;
		mulObj.matArr=new int[row][col];
		if(this.col==m.row )
		{
			//int k=0;
			for(int i=0;i<m.row;i++)
			{
				for(int k=0;k<m.row;k++)
				{
					for(int j=0;j<col;j++)
					{
						mulObj.matArr[i][k]=mulObj.matArr[i][k]+this.matArr[i][j]*m.matArr[j][k];
					}
				}
			}
			//return mulObj;
			printMatrix(mulObj);
		}
		else {
			System.out.println(">>Error!!Multiplication is not possible.");
			//return null;
		}
	}
	public void add()
	{
		//dummy method
	}
	public void add(Matrix m)//Adding matrix
	{
		Matrix addObj=new Matrix();
		addObj.col=this.col;
		addObj.row=this.row;
		addObj.matArr=new int[row][col];
		if(this.row==m.row && this.col==m.col)
		{
			for(int i=0;i<m.row;i++)
			{
				for(int j=0;j<col;j++)
				{
					addObj.matArr[i][j]=this.matArr[i][j]+m.matArr[i][j];
				}
			}
			//return addObj;
			printMatrix(addObj);
		}
		else {
			System.out.println(">>Error!!Addition is not possible.");
			//return null;
		}
		
	}
	void printMatrix(Matrix m)//printMatrix is overloaded
	{
		if(row==0)
		{
			System.out.println(">>Error!!No values in Matrix.");
		}
		else
		{
			System.out.println(">>DISPLAY OF MATRIX<<");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(m.matArr[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("***********************");
		}
	}
	void printMatrix()//Printing Matrix
	{
		if(row==0)
		{
			System.out.println(">>Error!!No values in Matrix.");
		}
		else
		{
			System.out.println(">>DISPLAY OF MATRIX<<");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(this.matArr[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("***********************");
		}
	}
}
class Vector implements Methods
{
	
	private int x_axis_val;
	private int y_axis_val;
	private int z_axis_val;
	Vector(int x,int y,int z){
		this.x_axis_val=x;
		this.y_axis_val=y;
		this.z_axis_val=z;
	}
	Vector(){};
	void printVector(Vector v)
	{
		if(v.x_axis_val==0 && v.y_axis_val==0 && v.z_axis_val==0)
		{
			System.out.println("->Error!!Assign value to the vector");
		}
		else
		{
			if(v.y_axis_val>0)
			{
				if(v.z_axis_val>0)
				{
					System.out.println("Vector(v)="+v.x_axis_val+"i+"+v.y_axis_val+"j+"+v.z_axis_val+"z");
				}
				else
				{
					System.out.println("Vector(v)="+v.x_axis_val+"i+"+v.y_axis_val+"j"+v.z_axis_val+"z");
				}
			}
			else
			{
				System.out.println("Vector(v)="+v.x_axis_val+"i"+v.y_axis_val+"j"+v.z_axis_val+"z");
			}
			
		}
	}
	void printVector()
	{
		if(this.x_axis_val==0 && this.y_axis_val==0 && this.z_axis_val==0)
		{
			System.out.println("->Error!!Assign value to the vector");
		}
		else
		{
			if(this.y_axis_val>0)
			{
				if(this.z_axis_val>0)
				{
					System.out.println("Vector(v)="+this.x_axis_val+"i+"+this.y_axis_val+"j+"+this.z_axis_val+"z");
				}
				else
				{
					System.out.println("Vector(v)="+this.x_axis_val+"i+"+this.y_axis_val+"j"+this.z_axis_val+"z");
				}
			}
			else
			{
				System.out.println("Vector(v)="+this.x_axis_val+"i"+this.y_axis_val+"j"+this.z_axis_val+"z");
			}
			
		}
	}
	public void add()
	{
		//dummy method
	}
	public void add(Vector v)
	{
		Vector addObj=new Vector();
		addObj.x_axis_val=this.x_axis_val+v.x_axis_val;
		addObj.y_axis_val=this.y_axis_val+v.y_axis_val;
		addObj.z_axis_val=this.z_axis_val+v.z_axis_val;
		//return addObj;
		printVector(addObj);
	}
	public void multiply()
	{
		//This will do nothing
		//dummy method
	}
	public void multiply(Vector v)
	{
		 Vector mulObj=new Vector();
		mulObj.x_axis_val=v.x_axis_val*this.x_axis_val;
		mulObj.y_axis_val=v.y_axis_val*this.y_axis_val;
		mulObj.z_axis_val=v.z_axis_val*this.z_axis_val;
		//return mulObj;
		printVector(mulObj);
	}
}
public class MathematicalObjectEx {

	public static void main(String[] args) {
		//Matrix
		Matrix m1=new Matrix(2,2);
		Matrix m2=new Matrix(2,2);
		m1.multiply(m2);//Multiplying two matrix m1 and m2 and printing result
		m1.add(m2);//Adding matrix m1 and m2 and printing result
		//Vector
		Vector v1=new Vector(5,-6,-7);
		Vector v2=new Vector(6,2,5);
		v1.add(v2);//Adding v1 and v2 and printing its result
		v1.multiply(v2);//Multiplying v1 and v2 and printing result
		

	}

}
