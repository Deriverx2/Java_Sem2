package Que14;

class Employee {
    public static class DateOfBirth{
        private final int dd,mm,yy;

        public DateOfBirth(int dd, int mm, int yy) {
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
        }

        @Override
        public String toString() {
            return "\nDate of birth\t=\t"+dd+"\\"+mm+"\\"+yy;
        }
    }

    public static class DateOfJoining{
        private final int dd,mm,yy;

        public DateOfJoining(int dd, int mm, int yy) {
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
        }

        @Override
        public String toString() {
            return "\nDate of joining\t=\t"+dd+"\\"+mm+"\\"+yy;
        }
    }
    private String name;
    private final String id;
    private final DateOfBirth dob;
    private final DateOfJoining doj;
    private double salary;

    public Employee(String name, String id, DateOfBirth dob, DateOfJoining doj, double salary) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.doj = doj;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name\t=\t" + name +
                dob +
                "\nID\t=\t" + id +
                 doj +
                "\nSalary\t=\t" + salary;
    }
}
