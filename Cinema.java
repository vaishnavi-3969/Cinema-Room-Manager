package cinema;
import java.util.Scanner;

public class Cinema {
    public static void printCinema(int seats,int rows,char[][] cinema){
        System.out.println("Cinema:");
        System.out.print(" ");
        for(int i =0; i < seats; i++){
            System.out.print(" ");
            System.out.print(i+1);
        }
        System.out.println();
        for(int i =0; i < rows; i++){
            System.out.print((i+1)+" ");
            for(int j=0; j < seats; j++){
                System.out.print(cinema[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void createCinema(int rows,int seats,char[][] cinema]){
//        cinema = new char[rows][seats];
        for(int i =0; i < rows; i++){
            for(int j=0; j < seats; j++){
                cinema[i][j]= 'S';
            }
        }
    }
    public static void printMenu(){
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        printMenu();
        int n = scan.nextInt();
        System.out.println("Enter the number of rows:");
        int rows = scan.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scan.nextInt();
        char[][] cinema = new char[rows][seats];
        createCinema(rows,seats,cinema);
        printCinema(seats,rows,cinema);
        System.out.println("Enter a row number:");
        int rowNo = scan.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNo = scan.nextInt();
        System.out.print("Ticket price:");
        int front;
        cinema[rowNo-1][seatNo-1]='B';
        if(seats*rows <= 60){
            System.out.println("$"+10);
        }else{
            if(rows%2 ==0 ){
                front = rows/2;
            }else{
                front = (rows-1)/2;
            }
            if(rowNo <= rows/2){
                System.out.println("$"+10);
            }else{
                System.out.println("$"+8);
            }
        }
        printCinema(seats,rows,cinema);
    }
}