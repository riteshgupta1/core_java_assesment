// this is  Parent class Bank
class Bank {

    void getDetails() {
        System.out.println("Bank details not available.");
    }
}

// Subclass SBI
class SBI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank: SBI");
        System.out.println("Rate of Interest: 6.5%");
        System.out.println("Headquarters: Mumbai");
        System.out.println("-----");
    }
}

// Subclass BOI
class BOI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank: BOI");
        System.out.println("Rate of Interest: 8%");
        System.out.println("Headquarters: Mumbai");
        System.out.println("----");
    }
}

// Subclass ICICI
class ICICI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank: ICICI");
        System.out.println("Rate of Interest: 7%");
        System.out.println("Headquarters: Mumbai");
        System.out.println("-----");
    }
}

// this is main class

public class Question2{
    public static void main(String[] args) {
        // Creating objects of each bank
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        // Calling getDetails() method on each bank
        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}

