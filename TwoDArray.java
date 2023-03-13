import java.util.*;
public class TwoDArray{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("1.Enter values in default Matrix object of 2x2");
        Matrix x=new Matrix();
        x.readMatrix();
        System.out.println("2.Enter number of rows and columns for paramaterized Matrix constructor");
        int r=in.nextInt();
        int c=in.nextInt();
        Matrix y=new Matrix(r,c);
        System.out.println("Enter values in para Matrix object of size "+r+"x"+c+" ");
        y.readMatrix();
        System.out.println("Copy of second Martix is being created into third para constructor object");
        Matrix z=new Matrix(y.mat);
        System.out.println("Displaying First Matrix created by default constructor of 2x2:");
        x.displayMatrix();
        System.out.println("Displaying Second Matrix created by para constructor input rows and columns");
        y.displayMatrix();
        System.out.println("Displaying third Matrix created by para constructor input Matrix");
        z.displayMatrix();
        System.out.println("Transpose of Matrix 2");
        y.displayMatrix(y.transpose());
        System.out.println("Multiplication of transpose of Matrix 2 and Matrix 3");
        x.displayMatrix(y.multi(z.transpose()));
        System.out.println("Maximum number in Matrix 2  :"+y.maximum_of_array());
        System.out.println("Average of Matrix 1 elements:"+x.average_of_array());
    }
}
class Matrix{
    int row,column;
    float mat[][];
    Matrix(){
        this.row=2;
        this.column=2;
        mat=new float[this.row][this.column];
    }
    Matrix(int x,int y){
        this.row=x;
        this.column=y;
        mat=new float[this.row][this.column];
    }
    Matrix(float[][] a){
        this.row=a.length;
        this.column=a[0].length;
        this.mat=new float[row][column];
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                this.mat[i][j]=(int)a[i][j];
            }
        }
    }
    void readMatrix(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Values In matrix for "+this.row+" rows and "+this.column+" columns");
        for(int i=0;i<this.row;i++)
        {
            for(int j=0;j<this.column;j++){
                mat[i][j]=s.nextFloat();
            }
        }
    }
    void displayMatrix(){
        for(float[] a:this.mat){
            System.out.println(Arrays.toString(a));
        }
    }
    void displayMatrix(float[][] matrix){
        for(float[] a:matrix){
            System.out.println(Arrays.toString(a));
        }
    }
    float[][] transpose(){
        float[][] ans=new float[this.column][this.row];
        for(int i=0;i<this.column;i++)
        {
            for(int j=0;j<this.row;j++){
                ans[i][j]=mat[j][i];
            }
        }
        return ans;
    }
    float[][] multi(float[][] matrix){
        System.out.println("Matrix Multiplication of: ");
        float[][] ans=new float[row][column];
        if((this.row==matrix.length)&&(this.column==matrix[0].length))
        {
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    ans[i][j]=0;
                    for(int k=0;k<column;k++){
                        ans[i][j]+=this.mat[i][k]*matrix[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Either of matrices is non square or not of same size as other!!");
        }
        return ans;
    }
    float maximum_of_array(){
        float ans=0;
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                if(ans<this.mat[i][j]){
                    ans=this.mat[i][j];
                }
            }
        }
        return ans;
    }
    float average_of_array(){
        float ans=0,n=this.row*this.column;
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                ans+=this.mat[i][j];
            }
        }
        ans/=n;
        return ans;
    }
}