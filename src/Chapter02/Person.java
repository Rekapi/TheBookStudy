package Chapter02;
// this class is ad class for DataArrayApp Class 

public class Person {
    	private String lastName;
        private String firstName;
        private int age;
        public Person(String last, String first, int a){
            lastName = last;
            firstName = first;
            age = a;
        }
        // display method 
        public void displayPerson(){
            System.out.print("  Last Name : " + lastName);
            System.out.print(",  First Name : " + firstName);
            System.out.println(", Age : " + age);
        }

                //get last name method 
                public String getLast(){
                    return lastName;
              }
}
