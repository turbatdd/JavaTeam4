package Asignment2_Prob1;

public class Proj1 {

    void main() {
        Customer cus1 = new Customer("Turuu", "Davaakhishigt", "99122451");
        Customer cus2 = new Customer("Mohamed", "Elaraby", "88122451");
        Customer cus3 = new Customer("Joan", "Roa Mora", "66122451");

        cus1.setBillingAddress(new Address("Turuu Str", "Chicago", "Illiones", 88888));
        cus2.setBillingAddress(new Address("Mohamed Str", "Denver", "Colorado", 80237));
        cus2.setBillingAddress(new Address("Joan Str", "Fairfield", "Iowa", 52556));

        cus1.setShippingAddress(new Address("Turuu Str", "Chicago", "Illiones", 88888));
        cus2.setShippingAddress(new Address("Mohamed Str", "Denver", "Colorado", 80237));
        cus2.setShippingAddress(new Address("Joan Str", "Fairfield", "Iowa", 52556));

        Customer[] cusArr = {cus1, cus2, cus3};

        for (int i = 0; i < cusArr.length; i++) {
            Address rawAdd = cusArr[i].getBillingAddress();

            if (rawAdd != null) {
                String rawCity = rawAdd.getCity();

                if (!rawCity.isEmpty() && rawCity.toLowerCase().equals("chicago")) {
                    System.out.println(cusArr[i]);
                }
            }
        }
    }
}
