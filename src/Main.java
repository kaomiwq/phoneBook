public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("IphoneXS", PhoneColors.Red, 15000, 25);

        System.out.println(phone);

        PhonesStore phonesStore = new PhonesStore();

        phonesStore.addPhone(new Phone("IphoneXS", PhoneColors.Red, 15000, 25));
        phonesStore.addPhone(new Phone("Iphone13", PhoneColors.SpaceGray, 25000, 39));
        phonesStore.addPhone(new Phone("Iphone15", PhoneColors.Yellow, 50000, 27));

        System.out.println(phonesStore.getPhonesInTableView());
    }
}