import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args){
        ArrayList<String> ToDolist = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("===To-Do List===");
            for(int i = 0; i < ToDolist.size(); i++){
                System.out.println((i+1) + "." + ToDolist.get(i));
            }

            System.out.println();
            System.out.println("=================");
            System.out.println();
            System.out.println("1. Add item");
            System.out.println("2. Delete item");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                System.out.println("Enter item to add: ");
                String item = scanner.nextLine();
                ToDolist.add(item);
                System.out.println("Item added!");
            } else if(choice == 2){
                System.out.println("Enter item number to remove!: ");
                int itemNum = scanner.nextInt();
                scanner.nextLine();
                if(itemNum > 0 && itemNum <= ToDolist.size()){
                    ToDolist.remove(itemNum-1);
                    System.out.println("Item removed!");
                }else{
                    System.out.println("Invalid item number");
                }
            }else if( choice == 3){
                break;
            }else{
                System.out.println("Invalid choice, pleasew try again");
            }
        }
        System.out.println("Exiting To-Do list");
        scanner.close();
    }
}
