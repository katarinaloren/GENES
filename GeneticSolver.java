/**
Katherine Loren M. Tan
CMSC 170 U-3L
**/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;


public class GeneticSolver {
	public static double array1[];
	public static double array2[];
	public static double array3[];
	public static double array4[];
	public static double answers[];
	public static double list[];
	public static int positions[];
	public static ArrayList<double[]> array;
	int size = 3;
	int size3 = 5;
	int size4 = 30;
	int size5 = 2;
	double min =-5.12;
	double max =5.12; 
	public int randompoint;
	double min2 =-2.048;
	double max2 =2.048;
	double min4 =-1.28;
	double max4 =1.28;
	double min5 =-65.536;
	double max5 =65.536;
	public GeneticSolver(int gen){
		int count=0;
		System.out.println();
		System.out.println("1st number");
		do{
		createGene(size,min,max);
		insertUtility1(array1,array2,array3,array4, size);
		count++;
		}while(count!=gen);
		
		showAnswer(positions,size);
		
		//////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("2nd number");
		count=0;
		do{
		createGene(size,min2,max2);
		insertUtility2(array1,array2,array3,array4, size);
		count++;
		}while(count!=gen);
		
		showAnswer(positions,size);
		
		//////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("3rd number");
		count=0;
		do{
		createGene(size3,min,max);
		insertUtility3(array1,array2,array3,array4, size3);
		count++;
		}while(count!=gen);
		
		showAnswer(positions,size3);
		
		/////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("4th number");
		count=0;
		do{
		createGene(size4,min4,max4);
		insertUtility4(array1,array2,array3,array4, size4);
		count++;
		}while(count!=gen);
		
		showAnswer(positions,size4);
		 
		/////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("5th number");
		count=0;
		do{
		createGene(size5,min5,max5);
		insertUtility5(array1,array2,array3,array4, size5);
		count++;
		}while(count!=gen);
		showAnswer(positions,size5);
		
	}//end of geneticsolver
	
	
	public void showAnswer(int []positions, int size){
		switch(positions[2]){
		case 0: System.out.println("probable answers are: ");
				for(int i=0; i<size; i++){
				System.out.println(array1[i]);	
				}	
				break;
		case 1: System.out.println("probable answers are: ");
				for(int i=0; i<size; i++){
				System.out.println(array2[i]);	
				}	
				break;
		case 2: System.out.println("probable answers are: ");
				for(int i=0; i<size; i++){
				System.out.println(array3[i]);	
				}	
				break;
		case 3: System.out.println("probable answers are: ");
				for(int i=0; i<size; i++){
				System.out.println(array4[i]);	
				}	
				break;
		}
		
	}
	
	
		
	public void createGene(int size, double min, double max){
		int i=0;
		double random=0;
		array1 = new double[size];
		array2 = new double[size];
		array3 = new double[size];
		array4 = new double[size];
		
		do{
		random=randomizer(min, max);
		array1[i]=random;
		i++;
		}while(i!=size);
		
		i=0;
		do{
			random=randomizer(min, max);
			array2[i]=random;
			i++;
		}while(i!=size);
		
		i=0;
		do{
			random=randomizer(min, max);
			array3[i]=random;
			i++;
		}while(i!=size);
		
		i=0;
		do{
			random=randomizer(min, max);
			array4[i]=random;
			i++;
		}while(i!=size);
		
	} 
	
	public double randomizer(double min, double max){
		double randomized;
		randomized = min + (double)(Math.random()) *((max-min)+1);
		return randomized;
	}
	
	public void insertUtility1(double [] array1, double [] array2, double []array3, double[] array4, int size){
		double ans1;
		answers = new double[4];
		ans1=Math.pow(array1[0],2)+Math.pow(array1[1],2)+Math.pow(array1[2],2);
		answers[0]=ans1;
		ans1=Math.pow(array2[0],2)+Math.pow(array2[1],2)+Math.pow(array2[2],2);
		answers[1]=ans1;
		ans1=Math.pow(array3[0],2)+Math.pow(array3[1],2)+Math.pow(array3[2],2);
		answers[2]=ans1;
		ans1=Math.pow(array4[0],2)+Math.pow(array4[1],2)+Math.pow(array4[2],2);
		answers[3]=ans1;
		
		sortList(answers, size);
		
	}
	
	public void insertUtility2(double [] array1, double [] array2, double []array3, double[] array4, int size){
		double ans1;
		answers = new double[4];
		ans1=100*( Math.pow(((Math.pow(array1[1],2))-array1[2]),2))+Math.pow((1-array1[0]),2);
		answers[0]=ans1;
		ans1=100*( Math.pow(((Math.pow(array2[1],2))-array2[2]),2))+Math.pow((1-array2[0]),2);
		answers[1]=ans1;
		ans1=100*( Math.pow(((Math.pow(array3[1],2))-array3[2]),2))+Math.pow((1-array3[0]),2);
		answers[2]=ans1;
		ans1=100*( Math.pow(((Math.pow(array4[1],2))-array4[2]),2))+Math.pow((1-array4[0]),2);
		answers[3]=ans1;
		
		sortList(answers, size);
		
	}
	
	public void insertUtility3(double [] array1, double [] array2, double []array3, double[] array4, int size){
		double ans=0;
		answers = new double[4];
		
		for(int i=0; i<5 ; i++){
			ans+=Math.floor(array1[i]);
		}
		answers[0]=ans;
		for(int i=0; i<5 ; i++){
			ans+=Math.floor(array2[i]);
		}
		answers[1]=ans;
		for(int i=0; i<5 ; i++){
			ans+=Math.floor(array3[i]);
		}
		answers[2]=ans;
		for(int i=0; i<5 ; i++){
			ans+=Math.floor(array4[i]);
		}
		answers[3]=ans;
		
		sortList(answers, size);
		
	}
	
	public void insertUtility4(double [] array1, double [] array2, double []array3, double[] array4, int size){
		double ans=0;
		answers = new double[4];
		double ran;
		double mean=0.0f;
		double variance=1.0f;
		ran = randomGaussian(mean,variance);
		
		for(int i=0;i<size;i++){
		ans+= (i*Math.pow(array1[i],4))+ran;
		}
		answers[0]=ans;
		
		ran = randomGaussian(mean,variance);
		for(int i=0;i<size;i++){
			ans+= (i*Math.pow(array2[i],4))+ran;
			}
		answers[1]=ans;
		
		ran = randomGaussian(mean,variance);
		for(int i=0;i<size;i++){
			ans+= (i*Math.pow(array3[i],4))+ran;
			}
		answers[2]=ans;
		
		ran = randomGaussian(mean,variance);
		for(int i=0;i<size;i++){
			ans+= (i*Math.pow(array4[i],4))+ran;
			}
		answers[3]=ans;
		
		sortList(answers, size);
		
	}
	
	public void insertUtility5(double [] array1, double [] array2, double []array3, double[] array4, int size){
		double ans=0;
		int a[][] = new int[25][2];
		answers = new double[4];
		a=inserta(a);
		
		for(int i=0;i<25;i++){
			for(int j=0; j<2; j++){
				ans+=0.002+1/(i+Math.pow((array1[j]-a[i][j]),6));
			}
		}
		answers[0]=ans;
		
		for(int i=0;i<25;i++){
			for(int j=0; j<2; j++){
				ans+=0.002+1/(i+Math.pow((array2[j]-a[i][j]),6));
			}
		}
		answers[1]=ans;
		
		for(int i=0;i<25;i++){
			for(int j=0; j<2; j++){
				ans+=0.002+1/(i+Math.pow((array3[j]-a[i][j]),6));
			}
		}
		answers[2]=ans;
		
		for(int i=0;i<25;i++){
			for(int j=0; j<2; j++){
				ans+=0.002+1/(i+Math.pow((array4[j]-a[i][j]),6));
			}
		}
		answers[3]=ans;
				
		sortList(answers, size);
		
	}
	
	public int[][] inserta(int[][] a){
		int i;
		for(i=0;i<25;i=i+5){
			a[i][0]=-32;
			a[i+1][0]=-16;
			a[i+2][0]=0;
			a[i+3][0]=16;
			a[i+4][0]=32;
		}
		
		for(i=0;i<25;i++){
			if(i>=0 && i<5){
				a[i][1]=-32;
			}
			else if(i>=5 && i<10){
				a[i][1]=-16;
			}
			else if(i>=10 && i<15){
				a[i][1]=0;
			}
			else if(i>=15 && i<20){
				a[i][1]=16;
			}
			else if(i>=20 && i<15){
				a[i][1]=32;
			}
		}
		
		return a;
	}
	
	
	
	
	public double randomGaussian(double mean, double variance){
		double num;
		Random fRandom = new Random();
		num=mean + fRandom.nextGaussian() * variance;
		return num;
	}
	
	
	public void sortList(double []answers, int size){
		double list[] = new double[4];
		
		for(int i=0;i<4;i++){
			list[i]=answers[i];
		}
		Arrays.sort(list);
		findBiggest(list, answers, size);
	}
	
	public void findBiggest(double[]list, double answers[], int size){
		positions = new int[3];
		int k=0;
		int ran;
		for(int i=1; i<4; i++){
			for(int j=0;j<4;j++){
				if(list[i]==answers[j]){
					if(k!=3){
					positions[k]=j;
					k++;
					}
					else{ k=0;}
				}
			}
		}
		ran=randomizepoint(size);
		createNewGen(ran, positions,size);
	}
	
	public int randomizepoint(int size){
		int randomized;
		int minimum = 1;
		int maximum = size-1;
		randomized = minimum + (int)(Math.random()) *((maximum-minimum)+1);
		return randomized;
	}
	
	public void createNewGen(int ran, int positions[], int size){
		double  temp[] = new double[size];
		double temp1[] = new double[size];
		double temp2[] = new double[size];
		double temp3[] = new double[size];
		double temp4[] = new double[size];
		double temp5[] = new double[size];
		double temp6[] = new double[size];
		double temp7[] = new double[size];
		
		int i=0;
		double var;
		
		for(i=0;i<size;i++){
			temp1[i]=array1[i];
			temp[i]=array1[i];
		}
		
		for(i=0;i<size;i++){
			temp2[i]=array2[i];
			temp5[i]=array2[i];
		}
		
		for(i=0;i<size;i++){
			temp3[i]=array3[i];
			temp6[i]=array3[i];
		}
		
		for(i=0;i<size;i++){
			temp4[i]=array3[i];
			temp7[i]=array3[i];
		}
		
		switch(positions[2]){
			case 0: if(positions[1]==1){
						for(int j=ran;j<size;j++){
							var=temp[j];
							temp[j]=temp5[j];
							temp5[j]=var;
							}
							array3=temp;
							array4=temp5;
						}
					else if(positions[1]==2){
						for(int j=ran;j<size;j++){
							var=temp[j];
							temp[j]=temp6[j];
							temp6[j]=var;
							}
							array3=temp;
							array4=temp6;
						}
						
					else if(positions[1]==3){
						for(int j=ran;j<size;j++){
							var=temp[j];
							temp[j]=temp7[j];
							temp7[j]=var;
							}
							array3=temp;
							array4=temp7;
						}
					break;
					
			case 1: if(positions[1]==0){
					  for(int j=ran;j<size;j++){
						var=temp5[j];
						temp5[j]=temp[j];
						temp[j]=var;
						}
						array3=temp2;
						array4=temp;
					}
					else if(positions[1]==2){
					  for(int j=ran;j<size;j++){
						var=temp5[j];
						temp5[j]=temp6[j];
						temp6[j]=var;
						}
						array3=temp5;
						array4=temp6;
					}
					
					else if(positions[1]==3){
					  for(int j=ran;j<size;j++){
						var=temp5[j];
						temp5[j]=temp7[j];
						temp7[j]=var;
						}
						array3=temp5;
						array4=temp7;
					}
							
					break;
					
			case 2: if(positions[1]==0){
					for(int j=ran;j<size;j++){
						var=temp6[j];
						temp6[j]=temp[j];
						temp[j]=var;
					}
					array3=temp6;
					array4=temp;
				}
				else if(positions[1]==1){
					for(int j=ran;j<size;j++){
						var=temp6[j];
						temp6[j]=temp5[j];
						temp5[j]=var;
				}
					array3=temp6;
					array4=temp5;
				}
			
				else if(positions[1]==3){
					for(int j=ran;j<size;j++){
						var=temp6[j];
						temp6[j]=temp7[j];
						temp7[j]=var;
					}
					array3=temp6;
					array4=temp7;
				}
		
					break;
			case 3: 
				if(positions[1]==0){
					for(int j=ran;j<size;j++){
						var=temp7[j];
						temp7[j]=temp[j];
						temp[j]=var;
					}
					array3=temp7;
					array4=temp;
				}
				else if(positions[1]==1){
					for(int j=ran;j<size;j++){
						var=temp7[j];
						temp7[j]=temp5[j];
						temp5[j]=var;
				}
					array3=temp7;
					array4=temp5;
				}
			
				else if(positions[1]==2){
					for(int j=ran;j<size;j++){
						var=temp7[j];
						temp7[j]=temp6[j];
						temp6[j]=var;
					}
					array3=temp7;
					array4=temp6;
				}
				
				break;
		}//end of switch
		
		
		switch(positions[2]){
		case 0: if(positions[0]==1){
				for(int j=ran;j<size;j++){
					var=temp1[j];
					temp1[j]=temp2[j];
					temp2[j]=var;
					}
					array1=temp1;
					array2=temp2;
				}
				else if(positions[0]==2){
					for(int j=ran;j<size;j++){
						var=temp1[j];
						temp1[j]=temp3[j];
						temp3[j]=var;
						}
					array1=temp1;
					array2=temp3;
				}
				
				else if(positions[0]==3){
					for(int j=ran;j<size;j++){
						var=temp1[j];
						temp1[j]=temp4[j];
						temp4[j]=var;
						}
					array1=temp1;
					array2=temp4;
				}
				
				break;
				
		case 1: if(positions[0]==0){
					for(int j=ran;j<size;j++){
					var=temp2[j];
					temp2[j]=temp1[j];
					temp1[j]=var;
					}
					array1=temp2;
					array2=temp1;
					}
			
				else if(positions[0]==2){
				  for(int j=ran;j<size;j++){
					var=temp2[j];
					temp2[j]=temp3[j];
					temp3[j]=var;
					}
				array1=temp2;
				array2=temp3;
				}
			
				else if(positions[0]==3){
				  for(int j=ran;j<size;j++){
					var=temp2[j];
					temp2[j]=temp4[j];
					temp4[j]=var;
					}
				array1=temp2;
				array2=temp4;
				}
			
				break;
		case 2: if(positions[0]==0){
				for(int j=ran;j<size;j++){
					var=temp3[j];
					temp3[j]=temp1[j];
					temp1[j]=var;
					}
					array1=temp3;
					array2=temp1;
				}
	
			else if(positions[0]==1){
				for(int j=ran;j<size;j++){
					var=temp3[j];
					temp3[j]=temp2[j];
					temp2[j]=var;
				}
				array1=temp3;
				array2=temp2;
				}
	
			else if(positions[0]==3){
				for(int j=ran;j<size;j++){
					var=temp3[j];
					temp3[j]=temp4[j];
					temp4[j]=var;
				}
				array1=temp3;
				array2=temp4;
			}
				break;
		case 3: 
			if(positions[0]==0){
				for(int j=ran;j<size;j++){
					var=temp4[j];
					temp4[j]=temp1[j];
					temp1[j]=var;
					}
					array1=temp4;
					array2=temp1;
				}
	
			else if(positions[0]==1){
				for(int j=ran;j<size;j++){
					var=temp4[j];
					temp4[j]=temp2[j];
					temp2[j]=var;
				}
				array1=temp4;
				array2=temp2;
				}
	
			else if(positions[0]==2){
				for(int j=ran;j<size;j++){
					var=temp4[j];
					temp4[j]=temp3[j];
					temp3[j]=var;
				}
				array1=temp4;
				array2=temp3;
			}
	
			break;
	}//end of switch
	}
	
	
}
