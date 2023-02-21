import java.util.*;
class Array{
	int data[];
	Array(){
		this.data=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			this.data[i]=s.nextInt();
		}
	}
	Array(int Size){
		this.data=new int[Size];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<Size;i++){
			this.data[i]=s.nextInt();
		}
	}
	Array(int[] data){
		this.data=new int[data.length];
		for(int i=0;i<data.length;i++){
			this.data[i]=data[i];
		}
	}
	void Reverse_an_array(){
		int begin=0,end=this.data.length-1;
		while(begin<end){
			int temp=data[begin];
			data[begin]=data[end];
			data[end]=temp;
			begin++;
			end--;
		}
		System.out.print("Reversed ");
	}
	int Maximum_of_array(){
		int x=0;
		for(int i=0;i<this.data.length;i++)
		{
			if(this.data[i]>x)
			{
				x=this.data[i];
			}
		}
		System.out.print("Maximum Value in array: ");
		return x;
	}
	int Average_of_array(){
		int x=0;
		for(int i=0;i<this.data.length;i++)
		{
			x+=this.data[i];
		}
		x/=this.data.length;
		System.out.print("Average of array elements: ");
		return x;
	}
	void sorting(){
		System.out.print("sorted assending: ");
		for(int i=0;i<this.data.length;i++)
		{
			for(int j=i+1;j<this.data.length;j++)
			{
				int temp=0;
				if(this.data[i]>this.data[j]){
					temp=this.data[i];
					this.data[i]=this.data[j];
					this.data[j]=temp;
				}
			}
		}
		for(int i:this.data)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("sorted decending: ");
		for(int j=this.data.length-1;j>=0;j--)
		{
			System.out.print(this.data[j]+" ");
		}
		System.out.println("");
	}
	void display(){
		System.out.print("Array of length "+this.data.length+" is: ");
		for(int i:this.data)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	int size(){
		return this.data.length;
	}
	int search(int x){
		for(int i=0;i<this.data.length;i++){
			if(this.data[i]==x)
			return i;
		}
		return -1;
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Array[] arr=new Array[3];
		System.out.println("Enter 5 Values in array created by default constructor:");
		arr[0]=new Array();
		System.out.println("Enter size for array to be created by parameterized constructor:");
		int x=in.nextInt();
		System.out.println("Enter "+x+" Values in array created by Parameterized constructor:");
		arr[1]=new Array(x);
		System.out.println("Copy of array created by Parametreized constructor being created:");
		arr[2]=new Array(arr[1].data);
		System.out.println("Displaying Default Array object");
		arr[0].display();
		System.out.println();
		System.out.println("Displaying Parameterized Array object");
		arr[1].display();
		System.out.println();
		System.out.println("Default construcor object:");
		System.out.println();
		arr[0].Reverse_an_array();
		arr[0].display();
		System.out.println(arr[0].Maximum_of_array());
		System.out.println(arr[0].Average_of_array());
		arr[0].sorting();
		System.out.println("Size of para array object is :"+arr[1].size()); 
		System.out.print("Enter the element to search in copy array object : ");
		int s=in.nextInt();
		if(arr[2].search(s)==-1)
		System.out.println("Element Not Found");
		else
		System.out.println("Element is at : "+arr[2].search(s)+" Index");
		arr[1].Reverse_an_array();
		arr[1].display();
		in.close();
	}
}


	