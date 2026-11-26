package ie.atu.oop.demo;

public class CustomerTest
{
    public static void main(String[] args)
    {
        Customer first = new Customer("Okiki", "Naija", "1234565", 1, false);

        Customer second = new Customer();

        second.setName("Daniel");
        second.setAddress("Glass");
        second.setMailingList(true);
        second.setCustomerNumber(2);
        second.setPhoneNumber("2345423");
        System.out.println(first);
        System.out.println(second);
    }
}
