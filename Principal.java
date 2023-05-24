package composite_java;

public class Principal {
    public static void main(String[] args) {
        EmployeeComposite CEO = new EmployeeComposite("Rich", "CEO");

        EmployeeComposite managerSales = new EmployeeComposite("João", "Head Sales");
        EmployeeComposite managerMarkenting = new EmployeeComposite("Maria", "Marketing");
        CEO.add(managerMarkenting);
        CEO.add(managerSales);

        EmployeeLeaf emp1 = new EmployeeLeaf("José", "Sales");
        EmployeeLeaf emp2 = new EmployeeLeaf("Pedro", "Sales");

        managerSales.add(emp1);
        managerSales.add(emp2);
        EmployeeLeaf emp3 = new EmployeeLeaf("Vasco da Gama", "Marketing");
        EmployeeLeaf emp4 = new EmployeeLeaf("Flamengo da Sousa", "Marketing");

        managerMarkenting.add(emp3);
        managerMarkenting.add(emp4);
    }
}
