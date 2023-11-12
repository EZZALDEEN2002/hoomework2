import java.util.Scanner;

    class employee {

        public employee(String johnDoe, float v, int i1) {
        }

        public static void main(String[] args) {

            employee employee2 = new employee("John Doe",123456789,15.0f,40);


            employee2.displayInfo();
            employee2.displaySalary();


            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the social security number: ");
            int socialSecurityNumber = scanner.nextInt();

            System.out.print("Enter the wage: ");
            float wage = scanner.nextFloat();

            System.out.print("Enter the working hours: ");
            int workingHours = scanner.nextInt();

            employee employee5 = new employee( name, socialSecurityNumber, wage, workingHours);

            employee5.displayInfo();
            employee5.displaySalary();

            scanner.close();
        }

        private void displayInfo() {
        }
    }

