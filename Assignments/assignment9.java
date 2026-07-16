/*
Create a superclass ‘Person’ and two subclasses ‘Student’ and ‘Staff’. The following are the instance variables 
and methods: 
    a. For ‘Person’ instance variables: name:String, address:String. Initiate variable through constructor, 
incorporate one method setPerson() that updates Person variables , another method tostring() that 
shows Person details as “Person[name=?,address=?]”. 

    b. For ‘Student’ sub class instance variables: program:String, year:String, fees:double. Initiate both 
‘Student’ and ‘Person’ variables through constructor, incorporate one method setStudent() that updates 
both student and ‘Person’ data, another method tostring() that shows ‘Person-Student’ details as 
“Person[name=?,address=?,Program=?,Year=?,Fees=?]”. 

    c. For ‘Staff’ subclass instance variables: school:String, pay:double. Initiate both ‘Staff’ and ‘Person’ 
variables through constructor, incorporate one method setStaff() that updates both ‘staff’ and ‘Person’ 
data, another method tostring() that shows ‘Person-Staff’ details as 
“Person[name=?,address=?,School=?,Pays=?”. 

Write the classes and a test driver main class to test all functions mentioned above.
*/

package Assignments;

public class assignment9 {

    // Superclass Person
    public static class Person {
        protected String name;
        protected String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public void setPerson(String name, String address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return String.format("Person[name=%s,address=%s]", name, address);
        }
    }

    // Subclass Student
    public static class Student extends Person {
        private String program;
        private String year;
        private double fees;

        public Student(String name, String address, String program, String year, double fees) {
            super(name, address);
            this.program = program;
            this.year = year;
            this.fees = fees;
        }

        public void setStudent(String name, String address, String program, String year, double fees) {
            // update person data too
            setPerson(name, address);
            this.program = program;
            this.year = year;
            this.fees = fees;
        }

        @Override
        public String toString() {
            return String.format("Person[name=%s,address=%s,Program=%s,Year=%s,Fees=%.2f]",
                    name, address, program, year, fees);
        }
    }

    // Subclass Staff
    public static class Staff extends Person {
        private String school;
        private double pay;

        public Staff(String name, String address, String school, double pay) {
            super(name, address);
            this.school = school;
            this.pay = pay;
        }

        public void setStaff(String name, String address, String school, double pay) {
            setPerson(name, address);
            this.school = school;
            this.pay = pay;
        }

        @Override
        public String toString() {
            return String.format("Person[name=%s,address=%s,School=%s,Pays=%.2f]",
                    name, address, school, pay);
        }
    }

    // Test driver
    public static void main(String[] args) {
        // Create Person
        Person p = new Person("Alice", "123 Main St");
        System.out.println(p);

        // Create Student
        Student s = new Student("Bob", "456 College Ave", "CS", "2", 15000.0);
        System.out.println(s);
        // update student and person data
        s.setStudent("Bob Jr.", "789 New Addr", "IT", "3", 16000.0);
        System.out.println("After setStudent: " + s);

        // Create Staff
        Staff st = new Staff("Carol", "12 School Rd", "HighSchool", 45000.0);
        System.out.println(st);
        // update staff and person data
        st.setStaff("Carol K", "99 Staff Ln", "University", 55000.0);
        System.out.println("After setStaff: " + st);
    }
}
