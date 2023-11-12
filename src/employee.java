
    public class employee {
        private  String name;
        private  int socialSecurityNumber;
        private  float Wage;
        private  int workingHours;

        public employee(String name, int socialSecurityNumber, float Wage, int workingHours) {
            this.name = name;
            this.socialSecurityNumber = socialSecurityNumber;
            this.Wage = Wage;
            this.workingHours = workingHours;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Social Security Number: " + socialSecurityNumber);
        }

        public void displaySalary() {
            float Salary = Wage * workingHours;
            System.out.println("Salary: " + Salary);
        }

    }









